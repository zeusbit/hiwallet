package org.fc.wlt.ordbgens.wlt.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.transaction.annotation.Transactional;

import org.fc.wlt.ordbgens.wlt.entity.WLTCertOrg;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertOrgExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertOrgExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertOrgKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTCertOrgMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_CERT_ORG")
public class WLTCertOrgDao extends ExtendDaoSupper<WLTCertOrg, WLTCertOrgExample, WLTCertOrgKey>{

	private WLTCertOrgMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTCertOrgExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTCertOrgExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTCertOrgKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTCertOrg record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTCertOrg record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTCertOrg> records) throws Exception
			 {
		for(WLTCertOrg record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTCertOrg> records) throws Exception
			 {
		for(WLTCertOrg record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTCertOrg> selectByExample(WLTCertOrgExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTCertOrg selectByPrimaryKey(WLTCertOrgKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTCertOrg> findAll(List<WLTCertOrg> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTCertOrgExample());
		}
		List<WLTCertOrg> list = new ArrayList<>();
		for(WLTCertOrg record : records){
			WLTCertOrg result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTCertOrg record, WLTCertOrgExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTCertOrg record, WLTCertOrgExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTCertOrg record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTCertOrg record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTCertOrgExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTCertOrgExample());
	}

	@Override
	public WLTCertOrgExample getExample(WLTCertOrg record) {
		WLTCertOrgExample example = new WLTCertOrgExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getOrgId()!=null){
				criteria.andOrgIdEqualTo(record.getOrgId());
				}
				if(record.getOrgCode()!=null){
				criteria.andOrgCodeEqualTo(record.getOrgCode());
				}
				if(record.getOrgName()!=null){
				criteria.andOrgNameEqualTo(record.getOrgName());
				}
				if(record.getOrgType()!=null){
				criteria.andOrgTypeEqualTo(record.getOrgType());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getCorporateName()!=null){
				criteria.andCorporateNameEqualTo(record.getCorporateName());
				}
				if(record.getLicenseCode()!=null){
				criteria.andLicenseCodeEqualTo(record.getLicenseCode());
				}
				if(record.getLicensePhotoId()!=null){
				criteria.andLicensePhotoIdEqualTo(record.getLicensePhotoId());
				}
				if(record.getNational()!=null){
				criteria.andNationalEqualTo(record.getNational());
				}
				if(record.getProvince()!=null){
				criteria.andProvinceEqualTo(record.getProvince());
				}
				if(record.getCity()!=null){
				criteria.andCityEqualTo(record.getCity());
				}
				if(record.getStreet()!=null){
				criteria.andStreetEqualTo(record.getStreet());
				}
				if(record.getTel()!=null){
				criteria.andTelEqualTo(record.getTel());
				}
				if(record.getFax()!=null){
				criteria.andFaxEqualTo(record.getFax());
				}
				if(record.getWebRecordNum()!=null){
				criteria.andWebRecordNumEqualTo(record.getWebRecordNum());
				}
				if(record.getOrgStatus()!=null){
				criteria.andOrgStatusEqualTo(record.getOrgStatus());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getUpdatedTime()!=null){
				criteria.andUpdatedTimeEqualTo(record.getUpdatedTime());
				}
				if(record.getReserved1()!=null){
				criteria.andReserved1EqualTo(record.getReserved1());
				}
				if(record.getReserved2()!=null){
				criteria.andReserved2EqualTo(record.getReserved2());
				}

		}
		return example;
	}
	
	public WLTCertOrg selectOneByExample(WLTCertOrgExample example)
			 {
		example.setLimit(1);
		List<WLTCertOrg> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTCertOrg> records) throws Exception {
		if(records.size()<=0)return 0;
		
		Connection txconn = (Connection) ThreadContext.getContext("__connection");
		Connection conn = txconn;
		SqlSession session = null;
		if (txconn == null) {
			session = sqlSessionFactory.openSession();
			conn = session.getConnection();
		}
		Statement st = null;

		int result=0;
		try {
			if (txconn == null) {
				conn.setAutoCommit(false);
			}		
			StringBuffer sb=new StringBuffer();
			sb.append("INSERT INTO WLT_CERT_ORG(ORG_ID,ORG_CODE,ORG_NAME,ORG_TYPE,USER_ID,CORPORATE_NAME,LICENSE_CODE,LICENSE_PHOTO_ID,NATIONAL,PROVINCE,CITY,STREET,TEL,FAX,WEB_RECORD_NUM,ORG_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTCertOrg record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getOrgId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getOrgId()+"'");
				}
			
				sb.append(",");
			
				if(record.getOrgCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getOrgCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getOrgName()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getOrgName()+"'");
				}
			
				sb.append(",");
			
				if(record.getOrgType()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getOrgType()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getCorporateName()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCorporateName()+"'");
				}
			
				sb.append(",");
			
				if(record.getLicenseCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getLicenseCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getLicensePhotoId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getLicensePhotoId()+"'");
				}
			
				sb.append(",");
			
				if(record.getNational()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getNational()+"'");
				}
			
				sb.append(",");
			
				if(record.getProvince()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getProvince()+"'");
				}
			
				sb.append(",");
			
				if(record.getCity()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCity()+"'");
				}
			
				sb.append(",");
			
				if(record.getStreet()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getStreet()+"'");
				}
			
				sb.append(",");
			
				if(record.getTel()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTel()+"'");
				}
			
				sb.append(",");
			
				if(record.getFax()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFax()+"'");
				}
			
				sb.append(",");
			
				if(record.getWebRecordNum()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getWebRecordNum()+"'");
				}
			
				sb.append(",");
			
				if(record.getOrgStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getOrgStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getCreatedTime()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getCreatedTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getUpdatedTime()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdatedTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getReserved1()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getReserved1()+"'");
				}
			
				sb.append(",");
			
				if(record.getReserved2()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getReserved2()+"'");
				}
							sb.append(")");
			
			}
						result=st.executeUpdate(sb.toString());


			if (txconn == null) {
				conn.commit();
			}
		} catch (SQLException e) {
			if (txconn == null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			throw e;
		}finally{
			if(st!=null){
				try {
					st.close();
				} catch (Exception est) {
					est.printStackTrace();
				}
			}
			if(session!=null)session.close();
		}
		return result;
	}
	
	
}
