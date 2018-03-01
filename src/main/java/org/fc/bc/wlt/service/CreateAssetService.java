package org.fc.bc.wlt.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import lombok.Data;
import lombok.val;
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

import org.apache.commons.lang3.StringUtils;
import org.fc.bc.ordbgens.wlt.entity.BCWltAccessLog;
import org.fc.bc.ordbgens.wlt.entity.BCWltAsset;
import org.fc.bc.ordbgens.wlt.entity.BCWltFund;
import org.fc.bc.ordbgens.wlt.entity.BCWltUser;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserAddress;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserAddressExample;
import org.fc.bc.ordbgens.wlt.entity.BCWltUserExample;
import org.fc.bc.wlt.dao.Daos;
import org.fc.bc.wlt.entity.BrewChainCRTASTReq;
import org.fc.bc.wlt.entity.BrewChainCRTASTRet;
import org.fc.bc.wlt.entity.PMFundInfo;
import org.fc.bc.wlt.entity.PMFundInfoR;
import org.fc.bc.wlt.entity.PMSignAddressR;
import org.fc.bc.wlt.enums.PlatformTypeEnum;
import org.fc.bc.wlt.enums.ReturnCodeTypeEnum;
import org.fc.bc.wlt.enums.StatusTypeEnum;
import org.fc.bc.wlt.gens.Asset.PASTCommand;
import org.fc.bc.wlt.gens.Asset.PASTModule;
import org.fc.bc.wlt.gens.Asset.PRetCRTAST;
import org.fc.bc.wlt.gens.Asset.PSCRTAST;
import org.fc.bc.wlt.util.ExceptionUtil;

//http://localhost:8000/ast/pbcrt.do?fh=CRTAST0000000J00&resp=bd&bd={"orderNo":"xxx","userKey":"xxx","userId":"xxxxx","alias":"测试资产","dataTable":"test","filePath":"","metadata":"","type":"CT","amount":100.91,"count":1,"wuCoin":0,"coloredBTC":0,"coloredLTC":0,"coloredXRP":0}
@NActorProvider
@Slf4j
@Data
public class CreateAssetService extends SessionModules<PSCRTAST> {
	@ActorRequire
	Daos daos;
	@ActorRequire
	CommonService commonService;

	@ActorRequire(name = "http", scope = "global")
	IPacketSender sender;

	private PropHelper props = new PropHelper(null);

	@Override
	public String[] getCmds() {
		return new String[] { PASTCommand.CRT.name() };
	}

	@Override
	public String getModule() {
		return PASTModule.AST.name();
	}

	public String toString() {
		return "CreateAssetService";
	}

	private BCWltAccessLog accessLog;

	@Override
	public void onPBPacket(FramePacket pack, PSCRTAST pbo, CompleteHandler handler) {
		final PRetCRTAST.Builder ret = PRetCRTAST.newBuilder();
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
		String agent = pack.getHttpServerletRequest().getHeader("user-agent"); 
		int beginIndex = agent.indexOf("(");
		int endIndex = agent.indexOf(")");
		String ovname = "";
		if(beginIndex!=-1&&endIndex!=-1){
			ovname = agent.substring(beginIndex, endIndex+1);
		}
		accessLog = new BCWltAccessLog();
		accessLog.setProxyTime(new Date());
		accessLog.setAccessLogId(UUIDGenerator.generate());
		accessLog.setClientOsver(ovname);
		accessLog.setOrderNo(pbo.getOrderNo());
		accessLog.setPbAction(this.getModule() + PASTCommand.CRT.name());
		accessLog.setPlatform(PlatformTypeEnum.PC.getValue());
		accessLog.setUserCookies(pack.getHttpServerletRequest().getSession().getId());
		accessLog.setUserId(pbo.getUserId());
		accessLog.setUserIp(pack.getHttpServerletRequest().getRemoteAddr());
		accessLog.setReqStr(JsonSerializer.formatToString(pbo.toBuilder().build().toString()));
		accessLog.setReqTime(new Date());
		log.debug("getBody:" + pbo);
		try {
			checkValidity(pbo);
			createAsset(pbo, ret);
		} catch (Exception e) {
			ret.setErrorCode(ReturnCodeTypeEnum.FAIL.getValue()).setErrorDesc(e.getMessage());
		} finally {
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

	public void createAsset(PSCRTAST pbo, PRetCRTAST.Builder ret) {
		PMSignAddressR address = new PMSignAddressR();
		BCWltUserAddressExample addressExample = new BCWltUserAddressExample();
		addressExample.createCriteria().andUserIdEqualTo(pbo.getUserId()).andDefaultAddrEqualTo(StatusTypeEnum.YES.getValue()).andDefaultAddrEqualTo("1");
		BCWltUserAddress userAddress = (BCWltUserAddress) daos.bcWltUserAddressDao.selectOneByExample(addressExample);
		if (userAddress == null) {
			throw new IllegalArgumentException(String.format("%s：address不存在", pbo.getUserId()));
		}
		if(StringUtils.isBlank(userAddress.getHexAddr())){
			throw new NullPointerException("地址为空");
		}
		if(StringUtils.isBlank(userAddress.getRpmbHash())){
			throw new NullPointerException("地址公钥Hash为空");
		}
		BrewChainCRTASTReq req = new BrewChainCRTASTReq();
		req.setTrade_no("xxxxx" + pbo.getOrderNo());
		req.setMeta_data(pbo.getMetadata());
		req.setSigned_code("");
		String assetId = UUIDGenerator.generate();
		address.setHex_addr(userAddress.getHexAddr());
		address.setRpmd_hash(userAddress.getRpmbHash());
		req.getCo_signers().add(address);
		PMFundInfoR fundInfo = new PMFundInfoR();
		fundInfo.setAlias(pbo.getAlias());
		fundInfo.setCount(pbo.getCount());
		fundInfo.setAmount(pbo.getAmount());
		req.getFunds().add(fundInfo);
		BrewChainCRTASTRet resp = execBrewChain(req);
		if ("0".equals(resp.getErr_code())) {
			Date now = new Date();
			BigDecimal numberZero = new BigDecimal(0d);
			BCWltAsset asset = new BCWltAsset();
			asset.setAssetId(assetId);
			asset.setAddress(address.getHex_addr());//resp.getAsset().getAddress().getHex_addr()
			asset.setAlias(pbo.getAlias());
			asset.setAmount(new BigDecimal(pbo.getAmount()));
			asset.setColoredBtc(numberZero);
			asset.setColoredEth(numberZero);
			asset.setColoredXrp(numberZero);
			asset.setCount((long) pbo.getCount());
			asset.setCreatedTime(now);
			asset.setDataTable(pbo.getDataTable());
			asset.setDiscount((short) 0);
			asset.setFilePath(pbo.getFilePath());
			asset.setMetadata(pbo.getMetadata());
			asset.setNetFee(numberZero);
			asset.setReserved1("");
			asset.setReserved2("");
			asset.setStatus(StatusTypeEnum.ENABLED.getValue());
			asset.setTotalFee(numberZero);
			asset.setTxid(resp.getBc_txid());
			asset.setType(pbo.getType());
			asset.setUserId(pbo.getUserId());
			asset.setUpdatedTime(now);
			asset.setFbcCount(numberZero);
			try{
				daos.bcWltAssetDao.insert(asset);
			} catch(Exception e){
				ExceptionUtil.InsertDatabaseException();
			}
			if(resp.getAsset().getFunds()!=null){
				for(PMFundInfo fund : resp.getAsset().getFunds()){
					BCWltFund bcWltFund = new BCWltFund();
					bcWltFund.setAlias(StringUtils.isBlank(fund.getAlias()) ? "" : fund.getAlias());
					bcWltFund.setAmount(new BigDecimal(fund.getAmount()));
					bcWltFund.setAssetId(StringUtils.isBlank(asset.getAssetId()) ? "" : asset.getAssetId());
					bcWltFund.setColoredBtc(new BigDecimal(fund.getColored_btc()));
					bcWltFund.setColoredEth(new BigDecimal(fund.getColored_eth()));
					bcWltFund.setColoredXrp(new BigDecimal(fund.getColored_xrp()));
					bcWltFund.setCount(fund.getCount());
					bcWltFund.setDiscount(new BigDecimal(fund.getDiscount()));
					bcWltFund.setDmt("");
					bcWltFund.setFbcCount(fund.getFbc_count());
					bcWltFund.setFundId(UUIDGenerator.generate());
					bcWltFund.setGenisAddress("");
					bcWltFund.setGenisOrg("");
					bcWltFund.setNetFee(new BigDecimal(fund.getNet_fee()));
					bcWltFund.setTotalFee(new BigDecimal(fund.getTotal_fee()));
					bcWltFund.setUniCode(fund.getUniCode());
					try{
						daos.bcWltFundDao.insert(bcWltFund);
					}catch(Exception e){
						ExceptionUtil.InsertDatabaseException();
					}
				}
			}
			userAddress.setUpdatedTime(now);
			userAddress.setDefaultAddr(StatusTypeEnum.DISABLED.getValue());
			try{
				daos.bcWltUserAddressDao.updateByPrimaryKey(userAddress);
			}catch(Exception e){
				ExceptionUtil.UpdateDatabaseException();
			}

			BCWltUserAddress userAddress1 = new BCWltUserAddress();
			userAddress1.setUserId(userAddress.getUserId());
			userAddress1.setAlias("");
			userAddress1.setHexAddr(resp.getAsset().getAddress().getHex_addr());
			userAddress1.setRpmbHash(resp.getAsset().getAddress().getRpmd_hash());
			userAddress1.setKeyId(UUIDGenerator.generate());
			userAddress1.setPki("");
			userAddress1.setPub("");
			userAddress1.setDefaultAddr(StatusTypeEnum.YES.getValue());;
			userAddress1.setCreatedTime(now);
			userAddress1.setUpdatedTime(now);
			try{
				daos.bcWltUserAddressDao.insert(userAddress1);
			}catch(Exception e){
				ExceptionUtil.InsertDatabaseException();
			}
			
			ret.setOrderNo(pbo.getOrderNo());
			ret.setErrorCode(ReturnCodeTypeEnum.SUCCESS.getValue());
			ret.setErrorDesc("success");
			ret.setAssetId(asset.getAssetId());
		} else {
			ret.setErrorCode(ReturnCodeTypeEnum.FAIL.getValue());
			ret.setErrorDesc(resp.getMsg());
			ret.setAssetId("");
		}
	}

	private BrewChainCRTASTRet execBrewChain(BrewChainCRTASTReq req) {
		accessLog.setProxyTime(new Date());
		String brewChainUrl = props.get("org.fc.bc.hiwallet.brewChainUrl", "http://211.159.149.246:8002");
		String postUrl = brewChainUrl + "/fbs/fbs/pbnew.do?fh=VNEWBOS000000J00&resp=bd";
		String sendJson = JsonSerializer.formatToString(req);
		System.out.println(sendJson);
		accessLog.setReqStr(sendJson);
		FramePacket fp = PacketHelper.buildUrlFromJson(sendJson, "POST", postUrl);
		val retCRTAST = sender.send(fp, 30000);
		BrewChainCRTASTRet resp = JsonSerializer.getInstance().deserialize(retCRTAST.getBody(), BrewChainCRTASTRet.class);
		accessLog.setResStr(JsonSerializer.formatToString(resp));
		accessLog.setResTime(new Date());
		accessLog.setRetCode(resp.getErr_code());
		accessLog.setRetMsg(resp.getMsg());
		return resp;
	}
	
	public void checkNull(PSCRTAST pb){
		if(pb == null){
			throw new IllegalArgumentException("无请求参数");
		}
		if (StringUtils.isBlank(pb.getOrderNo())) {
			throw new IllegalArgumentException("orderNo不能为空");
		}
		if (StringUtils.isBlank(pb.getUserKey())) {
			throw new IllegalArgumentException("userKey不能为空");
		}
		if (StringUtils.isBlank(pb.getUserId())) {
			throw new IllegalArgumentException("userId不能为空");
		}
		if (StringUtils.isBlank(pb.getAlias())) {
			throw new IllegalArgumentException("alias不能为空");
		}
		if (pb.getDataTable() == null) {
			throw new IllegalArgumentException("dataTable不能为空");
		}
		if (pb.getFilePath() == null) {
			throw new IllegalArgumentException("filePath不能为空");
		}
		if (StringUtils.isBlank(pb.getMetadata())) {
			throw new IllegalArgumentException("metadata不能为空");
		}
		if (StringUtils.isBlank(pb.getType())) {
			throw new IllegalArgumentException("type不能为空");
		}
	}

	public void checkValidity(PSCRTAST pb) {
		// 校验用户是否存在
		BCWltUserExample bcWltUserExample = new BCWltUserExample();
		bcWltUserExample.createCriteria().andUserIdEqualTo(pb.getUserId()).andStatusEqualTo(StatusTypeEnum.ENABLED.getValue());
		BCWltUser bcSysUserTmp = (BCWltUser) daos.bcWltUserDao.selectOneByExample(bcWltUserExample);
		if (bcSysUserTmp == null) {
			throw new IllegalArgumentException(String.format("%s：用户不存在", pb.getUserId()));
		}	
	}
}
