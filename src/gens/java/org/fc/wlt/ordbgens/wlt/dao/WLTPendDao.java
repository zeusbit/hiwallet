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

import org.fc.wlt.ordbgens.wlt.entity.WLTPend;
import org.fc.wlt.ordbgens.wlt.entity.WLTPendExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTPendExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTPendKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTPendMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_PEND")
public class WLTPendDao extends ExtendDaoSupper<WLTPend, WLTPendExample, WLTPendKey>{

	private WLTPendMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTPendExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTPendExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTPendKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTPend record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTPend record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTPend> records) throws Exception
			 {
		for(WLTPend record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTPend> records) throws Exception
			 {
		for(WLTPend record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTPend> selectByExample(WLTPendExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTPend selectByPrimaryKey(WLTPendKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTPend> findAll(List<WLTPend> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTPendExample());
		}
		List<WLTPend> list = new ArrayList<>();
		for(WLTPend record : records){
			WLTPend result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTPend record, WLTPendExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTPend record, WLTPendExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTPend record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTPend record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTPendExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTPendExample());
	}

	@Override
	public WLTPendExample getExample(WLTPend record) {
		WLTPendExample example = new WLTPendExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getPendId()!=null){
				criteria.andPendIdEqualTo(record.getPendId());
				}
				if(record.getBsCode()!=null){
				criteria.andBsCodeEqualTo(record.getBsCode());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getSourceAssetId()!=null){
				criteria.andSourceAssetIdEqualTo(record.getSourceAssetId());
				}
				if(record.getSourceAmount()!=null){
				criteria.andSourceAmountEqualTo(record.getSourceAmount());
				}
				if(record.getTargetFundId()!=null){
				criteria.andTargetFundIdEqualTo(record.getTargetFundId());
				}
				if(record.getTargetAmount()!=null){
				criteria.andTargetAmountEqualTo(record.getTargetAmount());
				}
				if(record.getPendType()!=null){
				criteria.andPendTypeEqualTo(record.getPendType());
				}
				if(record.getAutoCommit()!=null){
				criteria.andAutoCommitEqualTo(record.getAutoCommit());
				}
				if(record.getTotalFee()!=null){
				criteria.andTotalFeeEqualTo(record.getTotalFee());
				}
				if(record.getPendStatus()!=null){
				criteria.andPendStatusEqualTo(record.getPendStatus());
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
	
	public WLTPend selectOneByExample(WLTPendExample example)
			 {
		example.setLimit(1);
		List<WLTPend> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTPend> records) throws Exception {
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
			sb.append("INSERT INTO WLT_PEND(PEND_ID,BS_CODE,USER_ID,SOURCE_ASSET_ID,SOURCE_AMOUNT,TARGET_FUND_ID,TARGET_AMOUNT,PEND_TYPE,AUTO_COMMIT,TOTAL_FEE,PEND_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTPend record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getPendId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPendId()+"'");
				}
			
				sb.append(",");
			
				if(record.getBsCode()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getBsCode()+"'");
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
			
				if(record.getSourceAssetId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getSourceAssetId()+"'");
				}
			
				sb.append(",");
			
				if(record.getSourceAmount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getSourceAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getTargetFundId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTargetFundId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTargetAmount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getTargetAmount()+"'");
				}
			
				sb.append(",");
			
				if(record.getPendType()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPendType()+"'");
				}
			
				sb.append(",");
			
				if(record.getAutoCommit()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAutoCommit()+"'");
				}
			
				sb.append(",");
			
				if(record.getTotalFee()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getTotalFee()+"'");
				}
			
				sb.append(",");
			
				if(record.getPendStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPendStatus()+"'");
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
