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

import org.fc.wlt.ordbgens.wlt.entity.WLTCertPer;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertPerExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertPerExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTCertPerKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTCertPerMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_CERT_PER")
public class WLTCertPerDao extends ExtendDaoSupper<WLTCertPer, WLTCertPerExample, WLTCertPerKey>{

	private WLTCertPerMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTCertPerExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTCertPerExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTCertPerKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTCertPer record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTCertPer record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTCertPer> records) throws Exception
			 {
		for(WLTCertPer record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTCertPer> records) throws Exception
			 {
		for(WLTCertPer record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTCertPer> selectByExample(WLTCertPerExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTCertPer selectByPrimaryKey(WLTCertPerKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTCertPer> findAll(List<WLTCertPer> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTCertPerExample());
		}
		List<WLTCertPer> list = new ArrayList<>();
		for(WLTCertPer record : records){
			WLTCertPer result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTCertPer record, WLTCertPerExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTCertPer record, WLTCertPerExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTCertPer record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTCertPer record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTCertPerExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTCertPerExample());
	}

	@Override
	public WLTCertPerExample getExample(WLTCertPer record) {
		WLTCertPerExample example = new WLTCertPerExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getPerId()!=null){
				criteria.andPerIdEqualTo(record.getPerId());
				}
				if(record.getPerCode()!=null){
				criteria.andPerCodeEqualTo(record.getPerCode());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getRealName()!=null){
				criteria.andRealNameEqualTo(record.getRealName());
				}
				if(record.getIdCardType()!=null){
				criteria.andIdCardTypeEqualTo(record.getIdCardType());
				}
				if(record.getIdCardCode()!=null){
				criteria.andIdCardCodeEqualTo(record.getIdCardCode());
				}
				if(record.getIdCardPhotoId()!=null){
				criteria.andIdCardPhotoIdEqualTo(record.getIdCardPhotoId());
				}
				if(record.getPerStatus()!=null){
				criteria.andPerStatusEqualTo(record.getPerStatus());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getUpdatedTimd()!=null){
				criteria.andUpdatedTimdEqualTo(record.getUpdatedTimd());
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
	
	public WLTCertPer selectOneByExample(WLTCertPerExample example)
			 {
		example.setLimit(1);
		List<WLTCertPer> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTCertPer> records) throws Exception {
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
			sb.append("INSERT INTO WLT_CERT_PER(PER_ID,PER_CODE,USER_ID,REAL_NAME,ID_CARD_TYPE,ID_CARD_CODE,ID_CARD_PHOTO_ID,PER_STATUS,CREATED_TIME,UPDATED_TIMD,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTCertPer record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getPerId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPerId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPerCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPerCode()+"'");
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
			
				if(record.getRealName()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getRealName()+"'");
				}
			
				sb.append(",");
			
				if(record.getIdCardType()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getIdCardType()+"'");
				}
			
				sb.append(",");
			
				if(record.getIdCardCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getIdCardCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getIdCardPhotoId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getIdCardPhotoId()+"'");
				}
			
				sb.append(",");
			
				if(record.getPerStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPerStatus()+"'");
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
			
				if(record.getUpdatedTimd()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getUpdatedTimd())+"'");
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
