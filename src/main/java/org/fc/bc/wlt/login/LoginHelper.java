package org.fc.bc.wlt.login;

import java.util.Date;
import java.util.List;

import org.apache.felix.ipojo.annotations.Provides;
import org.fc.bc.ordbgens.wlt.entity.BCWltUser;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserLog;
import org.fc.bc.wlt.dao.Daos;
import org.fc.bc.wlt.enums.StatusTypeEnum;
import org.fc.bc.wlt.filter.SessionManager;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import onight.osgi.annotation.iPojoBean;
import onight.tfw.ntrans.api.ActorService;
import onight.tfw.ntrans.api.annotation.ActorRequire;
import onight.tfw.otransio.api.beans.FramePacket;
import onight.tfw.outils.serialize.UUIDGenerator;


@iPojoBean
@Provides(specifications = { ActorService.class }, strategy = "SINGLETON")
@Slf4j
@Data
public class LoginHelper implements  ActorService{
	
	@ActorRequire
	SessionManager sessionManager;

	@ActorRequire
	Daos daos;
	
	/**
	 * 登录成功之后,设置session、user等相关信息
	 * @param pack
	 * @param gasSysUser
	 * @param lsRole
	 */
    public void loginSetting(FramePacket pack, BCWltUser bcWltUser, List<String> lsRole) {
//		String smid =new  SessionIDGenerator("node1").generate(bcWltUser.getUserName());		
//		pack.putHeader(ExtHeader.SESSIONID, smid);
//		pack.putHeader(ExtHeader.PACK_SESSION, smid);	
//		
//		pack.getExtHead().append(SessionFilter.STR_SESSION_SMID, smid);
//		pack.getExtHead().append(SessionFilter.STR_RECEIVE_TIME, new Date());
//		
//		SMSession smsession =  new SMSession();
//		//设置userinfo
//		smsession.setBcWltUser(bcWltUser);
//		//设置logintime
//		smsession.setLoginTime(new Date());
//		smsession.setLastTime(new Date());
//		
//		//设置smid对应的session相关信息
//		sessionManager.setSMSesion(smid, smsession);
//
//		// 记录登录在线日志
//		insertOnlineLog(smid,bcWltUser);
	}
      
    /**
     * 记录登录用户上线日志
     * @param smid
     * @param gasSysUser
     */
    private void insertOnlineLog(String smid,BCWltUser bcWltUser) {
    	BCWltUserLog userLog = new BCWltUserLog();
    	userLog.setLogId(UUIDGenerator.generate());
    	userLog.setUserId(bcWltUser.getUserId());
    	userLog.setLoginName(bcWltUser.getUserName());
    	userLog.setLoginTime(new Date());
    	userLog.setSessionId(smid);
    	userLog.setStatus(StatusTypeEnum.ENABLED.getValue());
    	userLog.setCreatedTime(new Date());
    	userLog.setCreatedBy("system");
    	userLog.setModifiedTime(new Date());
    	userLog.setModifiedBy("system");
    	
    	daos.bcWltUserLogDao.insert(userLog);
    }

}
