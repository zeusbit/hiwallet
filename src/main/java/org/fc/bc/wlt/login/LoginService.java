package org.fc.bc.wlt.login;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.fc.bc.ordbgens.wlt.entity.BCWltAccessLog;
import org.fc.bc.ordbgens.wlt.entity.BCWltUser;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserAddress;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserAddressExample;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserExample;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserLog;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserLogExample;
import org.fc.bc.wlt.dao.Daos;
import org.fc.bc.wlt.enums.PlatformTypeEnum;
import org.fc.bc.wlt.enums.ReturnCodeTypeEnum;
import org.fc.bc.wlt.enums.StatusTypeEnum;
import org.fc.bc.wlt.gens.Asset.PASTCommand;
import org.fc.bc.wlt.gens.Register.PREGCommand;
import org.fc.bc.wlt.gens.Register.PRetUserLogin;
import org.fc.bc.wlt.gens.Register.PSUserLogin;
import org.fc.bc.wlt.gens.Register.PUSRModule;
import org.fc.bc.wlt.service.CommonService;
import org.fc.bc.wlt.util.LoginedException;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import onight.oapi.scala.commons.SessionModules;
import onight.osgi.annotation.NActorProvider;
import onight.tfw.async.CompleteHandler;
import onight.tfw.ntrans.api.annotation.ActorRequire;
import onight.tfw.otransio.api.IPacketSender;
import onight.tfw.otransio.api.PacketHelper;
import onight.tfw.otransio.api.beans.FramePacket;
import onight.tfw.outils.conf.PropHelper;
import onight.tfw.outils.serialize.JsonSerializer;
import onight.tfw.outils.serialize.UUIDGenerator;

// http://localhost:8000/usr/pblin.do?fh=LINUSR0000000J00&resp=bd&bd={"userName":"aaa","passwd":"1111","orderNo":"111","ledgerId":"1231"}
@NActorProvider
@Slf4j
@Data
public class LoginService extends SessionModules<PSUserLogin>{
	@ActorRequire
	Daos daos;
	@ActorRequire
	CommonService commonService;
	
	private PropHelper props=new PropHelper(null);

	@ActorRequire(name = "http", scope = "global")
	IPacketSender sender;
	
	@Override
	public String[] getCmds() {		
		return new String[] { PREGCommand.LIN.name() };
	}

	@Override
	public String getModule() {
		return PUSRModule.USR.name();
	}
	public String toString(){
		return "PSUsrLIN";
	}
	
	private BCWltAccessLog accessLog;
	@Override
	public void onPBPacket(final FramePacket pack, PSUserLogin pbo, final CompleteHandler handler) {
		final PRetUserLogin.Builder ret = PRetUserLogin.newBuilder();
		try{
			checkNull(pbo);
		} catch (IllegalArgumentException e){
			ret.setErrorCode(ReturnCodeTypeEnum.FAIL.getValue());
			ret.setErrorDesc(e.getMessage());
			handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
			return;
		}
		//判断orderno是否存在
		Map<String, String> map = commonService.checkOrderNo(pbo.getOrderNo());
		if(map.get("errorCode").equals(ReturnCodeTypeEnum.FAIL.getValue())){
			ret.setErrorCode(ReturnCodeTypeEnum.FAIL.getValue());
			ret.setErrorDesc(map.get("errorDesc"));
			handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
			return;
		}
		//组装操作日志
		accessLog = new BCWltAccessLog();
		String agent = pack.getHttpServerletRequest().getHeader("user-agent"); 
		int beginIndex = agent.indexOf("(");
		int endIndex = agent.indexOf(")");
		String ovname = "";
		if(beginIndex!=-1&&endIndex!=-1){
			ovname = agent.substring(beginIndex, endIndex+1);
		}
		accessLog.setProxyTime(new Date());
		accessLog.setAccessLogId(UUIDGenerator.generate());
		accessLog.setClientOsver(ovname);
		accessLog.setOrderNo(pbo.getOrderNo());
		accessLog.setPbAction(this.getModule() + PASTCommand.CRT.name());
		accessLog.setPlatform(PlatformTypeEnum.PC.getValue());
		accessLog.setUserCookies(pack.getHttpServerletRequest().getSession().getId());
		accessLog.setUserIp(pack.getHttpServerletRequest().getRemoteAddr());
		accessLog.setReqStr(JsonSerializer.formatToString(pbo.toBuilder().build().toString()));
		accessLog.setReqTime(new Date());
		
		String retMessage = "success";
		log.debug("getBody:" + pbo);	
		try {
			//检查用户的账户名或密码正确性
			BCWltUser user = usrLoginCheck(pbo.getPasswd(),pbo.getUserName());	
			ret.setUserId(user.getUserId());//记录登录状态前先往ret中塞值
			accessLog.setUserId(user.getUserId());
			//记录用户的登录状态
			makeLogin(user, pack);
			
			//查询用户的公钥
			BCWltUserAddressExample useraddrExample = new BCWltUserAddressExample();
			useraddrExample.createCriteria().andUserIdEqualTo(user.getUserId()).andDefaultAddrEqualTo(StatusTypeEnum.ENABLED.getValue());
			
			BCWltUserAddress useraddress = (BCWltUserAddress) daos.bcWltUserAddressDao.selectOneByExample(useraddrExample);
			ret.setUserKey(useraddress.getPub());
			ret.setErrorCode(ReturnCodeTypeEnum.SUCCESS.getValue());
			ret.setErrorDesc(retMessage);
		} catch(LoginedException e){
			ret.setErrorCode(ReturnCodeTypeEnum.LOGINED.getValue()).setErrorDesc(e.getMessage());
		} catch (Exception e) {
//			e.printStackTrace();
			ret.setErrorCode(ReturnCodeTypeEnum.FAIL.getValue()).setErrorDesc(e.getMessage()+"");
		} finally {
			ret.setOrderNo(pbo.getOrderNo());
			accessLog.setResStr(JsonSerializer.formatToString(ret.toString()));
			accessLog.setResTime(new Date());
			accessLog.setRetCode(ret.getErrorCode());
			accessLog.setRetMsg(ret.getErrorDesc());
			accessLog.setCostMs(new BigDecimal(accessLog.getResTime().getTime()-accessLog.getReqTime().getTime()));
			accessLog.setInsertTime(new Date());
			try{
				daos.bcWltAccessLogDao.insertSelective(accessLog);
			}catch(Exception e){
				
			}
		}
		
		handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
	}

	/**
	 * 检查用户名、密码是否匹配
	 * @param password
	 * @param userName
	 * @return
	 */
	public BCWltUser usrLoginCheck(String password, String userName){
		BCWltUserExample userExample = new BCWltUserExample();
		userExample.createCriteria().andUserNameEqualTo(userName).andStatusEqualTo(StatusTypeEnum.ENABLED.getValue());
		List<Object> userObjs = daos.bcWltUserDao.selectByExample(userExample);
		if(userObjs == null){
			throw new NullPointerException("用户名或密码错误");
		}
		
		//校验密码
		Boolean flag = false;
		BCWltUser user = null;
		for (Object object : userObjs) {
			BCWltUser userTemp = (BCWltUser)object;
			if(userTemp.getPasswd().equals(password)){
				flag = true;
				user = userTemp;
			}
		}
		if(!flag){
			throw new IllegalArgumentException("用户名或密码错误");
		}
		
		return user;
	}	
	
	/**
	 * 记录用户的登录状态
	 * @param user
	 * @throws LoginedException 
	 */
	@SuppressWarnings("unused")
	public void makeLogin(BCWltUser user, FramePacket pack) throws LoginedException{
		BCWltUserLogExample userLogExample = new BCWltUserLogExample();
		userLogExample.createCriteria().andUserIdEqualTo(user.getUserId()).andStatusEqualTo(StatusTypeEnum.ENABLED.getValue());
		Object userLogObj = daos.bcWltUserLogDao.selectOneByExample(userLogExample);
		
		//先判断session是否失效，
		if(true){//未失效
			
		}else{//已失效
			//更新数据库，用户状态改为未登录状态
			if(userLogObj != null){
				BCWltUserLog oldUserLog = (BCWltUserLog)userLogObj;

				BCWltUserLog userLog = new BCWltUserLog();
				userLog.setLogId(oldUserLog.getLogId());
				userLog.setStatus(StatusTypeEnum.DISABLED.getValue());
				userLog.setLogoutTime(new Date());
				userLog.setModifiedBy("system");
				userLog.setModifiedTime(new Date());
				daos.bcWltUserLogDao.updateByPrimaryKeySelective(userLog);
			}
		}
		/**
		 * 判断用户是否已经登录
		 * 用户已经登录再次登录的话会先将旧的登录日志记录为登出状态，再插入一条新的登录日志
		 */
		
		if(userLogObj != null){
			BCWltUserLog oldUserLog = (BCWltUserLog) userLogObj;
			BCWltUserLog oldUserLog1 = new BCWltUserLog(); 
			oldUserLog1.setLogId(oldUserLog.getLogId());
			oldUserLog1.setModifiedBy("system");
			oldUserLog1.setModifiedTime(new Date());
			oldUserLog1.setLogoutTime(new Date());
			oldUserLog1.setStatus(StatusTypeEnum.DISABLED.getValue());
			daos.bcWltUserLogDao.updateByPrimaryKeySelective(oldUserLog1);
//			throw new LoginedException("用户已经登录过");
		}
		
		BCWltUserLog userLog = new BCWltUserLog();
		userLog.setBanForbidden(StatusTypeEnum.NO.getValue());
		userLog.setClientIp(pack.getHttpServerletRequest().getRemoteAddr());
		userLog.setCreatedBy("system");
		userLog.setCreatedTime(new Date());
		userLog.setLogId(UUIDGenerator.generate());
		userLog.setLoginName(user.getUserName());
		userLog.setLoginTime(new Date());
		userLog.setModifiedBy("system");
		userLog.setModifiedTime(new Date());
		userLog.setPps("");
		userLog.setRemark("");
		userLog.setResourceId("");
		userLog.setServerIp(pack.getHttpServerletRequest().getLocalAddr());
		userLog.setSessionId(pack.getHttpServerletRequest().getSession().getId());
		userLog.setStatus(StatusTypeEnum.ENABLED.getValue());
		userLog.setUserId(user.getUserId());
		
		daos.bcWltUserLogDao.insert(userLog);
		
		//将用户的信息缓存到session中
//		loginHelper.loginSetting(pack, gasSysUser, lsUserRole);
	}
	public void checkNull(PSUserLogin pb){
		if(pb == null){
			throw new IllegalArgumentException("无请求参数");
		}
		if(StringUtils.isBlank(pb.getUserName())){
			throw new IllegalArgumentException("username不能为空");
		}		
		
		if(StringUtils.isBlank(pb.getPasswd())){
			throw new IllegalArgumentException("password不能为空");
		}
		
		if(StringUtils.isBlank(pb.getOrderNo())){
			throw new IllegalArgumentException("orderNo不能为空");
		}
		
		if(StringUtils.isBlank(pb.getLedgerId())){
			throw new IllegalArgumentException("账本编号不能为空");
		}
	}
}