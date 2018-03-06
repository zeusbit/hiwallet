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

import org.fc.wlt.ordbgens.wlt.entity.WLTFund;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTFundMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_FUND")
public class WLTFundDao extends ExtendDaoSupper<WLTFund, WLTFundExample, WLTFundKey>{

	private WLTFundMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTFundExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTFundExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTFundKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTFund record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTFund record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTFund> records) throws Exception
			 {
		for(WLTFund record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTFund> records) throws Exception
			 {
		for(WLTFund record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTFund> selectByExample(WLTFundExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTFund selectByPrimaryKey(WLTFundKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTFund> findAll(List<WLTFund> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTFundExample());
		}
		List<WLTFund> list = new ArrayList<>();
		for(WLTFund record : records){
			WLTFund result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTFund record, WLTFundExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTFund record, WLTFundExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTFund record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTFund record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTFundExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTFundExample());
	}

	@Override
	public WLTFundExample getExample(WLTFund record) {
		WLTFundExample example = new WLTFundExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getFundId()!=null){
				criteria.andFundIdEqualTo(record.getFundId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getDmtCname()!=null){
				criteria.andDmtCnameEqualTo(record.getDmtCname());
				}
				if(record.getDmtEname()!=null){
				criteria.andDmtEnameEqualTo(record.getDmtEname());
				}
				if(record.getGenisAddr()!=null){
				criteria.andGenisAddrEqualTo(record.getGenisAddr());
				}
				if(record.getGenisOrgId()!=null){
				criteria.andGenisOrgIdEqualTo(record.getGenisOrgId());
				}
				if(record.getGenisDeposit()!=null){
				criteria.andGenisDepositEqualTo(record.getGenisDeposit());
				}
				if(record.getTotalCount()!=null){
				criteria.andTotalCountEqualTo(record.getTotalCount());
				}
				if(record.getColoredFbc()!=null){
				criteria.andColoredFbcEqualTo(record.getColoredFbc());
				}
				if(record.getExchangeFbc()!=null){
				criteria.andExchangeFbcEqualTo(record.getExchangeFbc());
				}
				if(record.getTurnoverCount()!=null){
				criteria.andTurnoverCountEqualTo(record.getTurnoverCount());
				}
				if(record.getDateTime()!=null){
				criteria.andDateTimeEqualTo(record.getDateTime());
				}
				if(record.getFundStatus()!=null){
				criteria.andFundStatusEqualTo(record.getFundStatus());
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
	
	public WLTFund selectOneByExample(WLTFundExample example)
			 {
		example.setLimit(1);
		List<WLTFund> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTFund> records) throws Exception {
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
			sb.append("INSERT INTO WLT_FUND(FUND_ID,USER_ID,DMT_CNAME,DMT_ENAME,GENIS_ADDR,GENIS_ORG_ID,GENIS_DEPOSIT,TOTAL_COUNT,COLORED_FBC,EXCHANGE_FBC,TURNOVER_COUNT,DATE_TIME,FUND_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTFund record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getFundId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFundId()+"'");
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
			
				if(record.getDmtCname()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getDmtCname()+"'");
				}
			
				sb.append(",");
			
				if(record.getDmtEname()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getDmtEname()+"'");
				}
			
				sb.append(",");
			
				if(record.getGenisAddr()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getGenisAddr()+"'");
				}
			
				sb.append(",");
			
				if(record.getGenisOrgId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getGenisOrgId()+"'");
				}
			
				sb.append(",");
			
				if(record.getGenisDeposit()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getGenisDeposit()+"'");
				}
			
				sb.append(",");
			
				if(record.getTotalCount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getTotalCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getColoredFbc()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getColoredFbc()+"'");
				}
			
				sb.append(",");
			
				if(record.getExchangeFbc()==null){
//						sb.append("'"+"1"+"'");
						sb.append("'"+"1"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getExchangeFbc()+"'");
				}
			
				sb.append(",");
			
				if(record.getTurnoverCount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getTurnoverCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getDateTime()==null){
//						sb.append("'"+"CURRENT_TIMESTAMP"+"'");
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(new java.util.Date())+"'");
						
				}else{
				// java type==Date
					    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
						sb.append("'"+sdf.format(record.getDateTime())+"'");
				}
			
				sb.append(",");
			
				if(record.getFundStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFundStatus()+"'");
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
