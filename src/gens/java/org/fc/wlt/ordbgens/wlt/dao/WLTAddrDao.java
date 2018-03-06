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

import org.fc.wlt.ordbgens.wlt.entity.WLTAddr;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddrExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddrExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddrKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTAddrMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_ADDR")
public class WLTAddrDao extends ExtendDaoSupper<WLTAddr, WLTAddrExample, WLTAddrKey>{

	private WLTAddrMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTAddrExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTAddrExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTAddrKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTAddr record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTAddr record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTAddr> records) throws Exception
			 {
		for(WLTAddr record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTAddr> records) throws Exception
			 {
		for(WLTAddr record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTAddr> selectByExample(WLTAddrExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTAddr selectByPrimaryKey(WLTAddrKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTAddr> findAll(List<WLTAddr> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTAddrExample());
		}
		List<WLTAddr> list = new ArrayList<>();
		for(WLTAddr record : records){
			WLTAddr result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTAddr record, WLTAddrExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTAddr record, WLTAddrExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTAddr record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTAddr record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTAddrExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTAddrExample());
	}

	@Override
	public WLTAddrExample getExample(WLTAddr record) {
		WLTAddrExample example = new WLTAddrExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getAddrId()!=null){
				criteria.andAddrIdEqualTo(record.getAddrId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getHexAddr()!=null){
				criteria.andHexAddrEqualTo(record.getHexAddr());
				}
				if(record.getPublicKey()!=null){
				criteria.andPublicKeyEqualTo(record.getPublicKey());
				}
				if(record.getPublicKeyHash()!=null){
				criteria.andPublicKeyHashEqualTo(record.getPublicKeyHash());
				}
				if(record.getPrivateKey()!=null){
				criteria.andPrivateKeyEqualTo(record.getPrivateKey());
				}
				if(record.getAddrStatus()!=null){
				criteria.andAddrStatusEqualTo(record.getAddrStatus());
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
	
	public WLTAddr selectOneByExample(WLTAddrExample example)
			 {
		example.setLimit(1);
		List<WLTAddr> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTAddr> records) throws Exception {
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
			sb.append("INSERT INTO WLT_ADDR(ADDR_ID,USER_ID,HEX_ADDR,PUBLIC_KEY,PUBLIC_KEY_HASH,PRIVATE_KEY,ADDR_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTAddr record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getAddrId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAddrId()+"'");
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
			
				if(record.getHexAddr()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getHexAddr()+"'");
				}
			
				sb.append(",");
			
				if(record.getPublicKey()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPublicKey()+"'");
				}
			
				sb.append(",");
			
				if(record.getPublicKeyHash()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPublicKeyHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getPrivateKey()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPrivateKey()+"'");
				}
			
				sb.append(",");
			
				if(record.getAddrStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAddrStatus()+"'");
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
