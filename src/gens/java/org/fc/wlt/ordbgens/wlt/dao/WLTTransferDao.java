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

import org.fc.wlt.ordbgens.wlt.entity.WLTTransfer;
import org.fc.wlt.ordbgens.wlt.entity.WLTTransferExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTTransferExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTTransferKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTTransferMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_TRANSFER")
public class WLTTransferDao extends ExtendDaoSupper<WLTTransfer, WLTTransferExample, WLTTransferKey>{

	private WLTTransferMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTTransferExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTTransferExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTTransferKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTTransfer record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTTransfer record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTTransfer> records) throws Exception
			 {
		for(WLTTransfer record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTTransfer> records) throws Exception
			 {
		for(WLTTransfer record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTTransfer> selectByExample(WLTTransferExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTTransfer selectByPrimaryKey(WLTTransferKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTTransfer> findAll(List<WLTTransfer> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTTransferExample());
		}
		List<WLTTransfer> list = new ArrayList<>();
		for(WLTTransfer record : records){
			WLTTransfer result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTTransfer record, WLTTransferExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTTransfer record, WLTTransferExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTTransfer record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTTransfer record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTTransferExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTTransferExample());
	}

	@Override
	public WLTTransferExample getExample(WLTTransfer record) {
		WLTTransferExample example = new WLTTransferExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getTransferId()!=null){
				criteria.andTransferIdEqualTo(record.getTransferId());
				}
				if(record.getSourceUserId()!=null){
				criteria.andSourceUserIdEqualTo(record.getSourceUserId());
				}
				if(record.getSourceAssetId()!=null){
				criteria.andSourceAssetIdEqualTo(record.getSourceAssetId());
				}
				if(record.getSourceAmount()!=null){
				criteria.andSourceAmountEqualTo(record.getSourceAmount());
				}
				if(record.getSourceFundId()!=null){
				criteria.andSourceFundIdEqualTo(record.getSourceFundId());
				}
				if(record.getTargetUserId()!=null){
				criteria.andTargetUserIdEqualTo(record.getTargetUserId());
				}
				if(record.getTargetAssetId()!=null){
				criteria.andTargetAssetIdEqualTo(record.getTargetAssetId());
				}
				if(record.getTargetAmount()!=null){
				criteria.andTargetAmountEqualTo(record.getTargetAmount());
				}
				if(record.getTargetFundId()!=null){
				criteria.andTargetFundIdEqualTo(record.getTargetFundId());
				}
				if(record.getTotalFee()!=null){
				criteria.andTotalFeeEqualTo(record.getTotalFee());
				}
				if(record.getTransferType()!=null){
				criteria.andTransferTypeEqualTo(record.getTransferType());
				}
				if(record.getPendId()!=null){
				criteria.andPendIdEqualTo(record.getPendId());
				}
				if(record.getTransferStatus()!=null){
				criteria.andTransferStatusEqualTo(record.getTransferStatus());
				}
				if(record.getCreatedTime()!=null){
				criteria.andCreatedTimeEqualTo(record.getCreatedTime());
				}
				if(record.getUpdatedTime()!=null){
				criteria.andUpdatedTimeEqualTo(record.getUpdatedTime());
				}
				if(record.getReserved01()!=null){
				criteria.andReserved01EqualTo(record.getReserved01());
				}
				if(record.getReserved02()!=null){
				criteria.andReserved02EqualTo(record.getReserved02());
				}

		}
		return example;
	}
	
	public WLTTransfer selectOneByExample(WLTTransferExample example)
			 {
		example.setLimit(1);
		List<WLTTransfer> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTTransfer> records) throws Exception {
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
			sb.append("INSERT INTO WLT_TRANSFER(TRANSFER_ID,SOURCE_USER_ID,SOURCE_ASSET_ID,SOURCE_AMOUNT,SOURCE_FUND_ID,TARGET_USER_ID,TARGET_ASSET_ID,TARGET_AMOUNT,TARGET_FUND_ID,TOTAL_FEE,TRANSFER_TYPE,PEND_ID,TRANSFER_STATUS,CREATED_TIME,UPDATED_TIME,RESERVED_01,RESERVED_02) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTTransfer record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getTransferId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTransferId()+"'");
				}
			
				sb.append(",");
			
				if(record.getSourceUserId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getSourceUserId()+"'");
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
			
				if(record.getSourceFundId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getSourceFundId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTargetUserId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTargetUserId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTargetAssetId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTargetAssetId()+"'");
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
			
				if(record.getTargetFundId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTargetFundId()+"'");
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
			
				if(record.getTransferType()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTransferType()+"'");
				}
			
				sb.append(",");
			
				if(record.getPendId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getPendId()+"'");
				}
			
				sb.append(",");
			
				if(record.getTransferStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getTransferStatus()+"'");
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
			
				if(record.getReserved01()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getReserved01()+"'");
				}
			
				sb.append(",");
			
				if(record.getReserved02()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getReserved02()+"'");
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
