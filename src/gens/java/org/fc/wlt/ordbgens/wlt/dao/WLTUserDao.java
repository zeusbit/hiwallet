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

import org.fc.wlt.ordbgens.wlt.entity.WLTUser;
import org.fc.wlt.ordbgens.wlt.entity.WLTUserExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTUserExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTUserKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTUserMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_USER")
public class WLTUserDao extends ExtendDaoSupper<WLTUser, WLTUserExample, WLTUserKey>{

	private WLTUserMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTUserExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTUserExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTUserKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTUser record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTUser record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTUser> records) throws Exception
			 {
		for(WLTUser record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTUser> records) throws Exception
			 {
		for(WLTUser record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTUser> selectByExample(WLTUserExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTUser selectByPrimaryKey(WLTUserKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTUser> findAll(List<WLTUser> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTUserExample());
		}
		List<WLTUser> list = new ArrayList<>();
		for(WLTUser record : records){
			WLTUser result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTUser record, WLTUserExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTUser record, WLTUserExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTUser record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTUser record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTUserExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTUserExample());
	}

	@Override
	public WLTUserExample getExample(WLTUser record) {
		WLTUserExample example = new WLTUserExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getUserCode()!=null){
				criteria.andUserCodeEqualTo(record.getUserCode());
				}
				if(record.getUserName()!=null){
				criteria.andUserNameEqualTo(record.getUserName());
				}
				if(record.getUserPasswd()!=null){
				criteria.andUserPasswdEqualTo(record.getUserPasswd());
				}
				if(record.getCheckPhone()!=null){
				criteria.andCheckPhoneEqualTo(record.getCheckPhone());
				}
				if(record.getCheckEmail()!=null){
				criteria.andCheckEmailEqualTo(record.getCheckEmail());
				}
				if(record.getUserStatus()!=null){
				criteria.andUserStatusEqualTo(record.getUserStatus());
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
	
	public WLTUser selectOneByExample(WLTUserExample example)
			 {
		example.setLimit(1);
		List<WLTUser> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTUser> records) throws Exception {
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
			sb.append("INSERT INTO WLT_USER(USER_ID,USER_CODE,USER_NAME,USER_PASSWD,CHECK_PHONE,CHECK_EMAIL,USER_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTUser record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getUserId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserCode()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserName()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserName()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserPasswd()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserPasswd()+"'");
				}
			
				sb.append(",");
			
				if(record.getCheckPhone()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCheckPhone()+"'");
				}
			
				sb.append(",");
			
				if(record.getCheckEmail()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getCheckEmail()+"'");
				}
			
				sb.append(",");
			
				if(record.getUserStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getUserStatus()+"'");
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
