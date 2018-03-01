package org.fc.bc.wlt.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.felix.ipojo.annotations.Provides;
import org.fc.bc.ordbgens.wlt.entity.BCWltAccessLogExample;
import org.fc.bc.wlt.dao.Daos;
import org.fc.bc.wlt.enums.BrewChainURITypeEnum;
import org.fc.bc.wlt.enums.ReturnCodeTypeEnum;
import org.fc.bc.wlt.enums.StatusTypeEnum;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import onight.osgi.annotation.iPojoBean;
import onight.tfw.ntrans.api.ActorService;
import onight.tfw.ntrans.api.annotation.ActorRequire;
import onight.tfw.outils.conf.PropHelper;

/**
 * 公共方法
 * @author jack
 *
 */
@iPojoBean
@Provides(specifications = { ActorService.class }, strategy = "SINGLETON")
@Slf4j
@Data
public class CommonService implements  ActorService{
	@ActorRequire
	Daos daos;
	
	private PropHelper props=new PropHelper(null);
	
	/**
	 * 判断请求的orderno是否已经存在
	 * @param orderNo
	 * @return 存在则返回false，说明不可用
	 * 空也返回false，说明不可用
	 * 不存在则返回true， 说明可用
	 */
	public Map<String, String> checkOrderNo(String orderNo){
		Map<String, String> ret = new HashMap<String, String>();
		//判断order不能为空
		if(StringUtils.isBlank(orderNo)){
			ret.put("errorCode", ReturnCodeTypeEnum.FAIL.getValue());
			ret.put("errorDesc", "orderNo不能为空");
		}else{
			BCWltAccessLogExample example = new BCWltAccessLogExample();
			example.createCriteria().andOrderNoEqualTo(orderNo);
			
			Object obj = daos.bcWltAccessLogDao.selectOneByExample(example);
			if(obj != null){//说明orderNo已经存在
				ret.put("errorCode", ReturnCodeTypeEnum.FAIL.getValue());
				ret.put("errorDesc", "orderNo已存在，请不要重复使用");
			}else{
				//成功则返回成功
				ret.put("errorCode", ReturnCodeTypeEnum.SUCCESS.getValue());
			}
		}
		return ret;
	}
	
	public String getBrewChainURL(){
		return props.get("org.fc.bc.hiwallet.brewChainUrl", BrewChainURITypeEnum.HOST.getValue() + ":" + BrewChainURITypeEnum.PORT.getValue() + BrewChainURITypeEnum.ALIAS.getValue());
	}

}
