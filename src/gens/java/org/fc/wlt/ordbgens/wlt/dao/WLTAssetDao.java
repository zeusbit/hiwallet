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

import org.fc.wlt.ordbgens.wlt.entity.WLTAsset;
import org.fc.wlt.ordbgens.wlt.entity.WLTAssetExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTAssetExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTAssetKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTAssetMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_ASSET")
public class WLTAssetDao extends ExtendDaoSupper<WLTAsset, WLTAssetExample, WLTAssetKey>{

	private WLTAssetMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTAssetExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTAssetExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTAssetKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTAsset record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTAsset record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTAsset> records) throws Exception
			 {
		for(WLTAsset record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTAsset> records) throws Exception
			 {
		for(WLTAsset record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTAsset> selectByExample(WLTAssetExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTAsset selectByPrimaryKey(WLTAssetKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTAsset> findAll(List<WLTAsset> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTAssetExample());
		}
		List<WLTAsset> list = new ArrayList<>();
		for(WLTAsset record : records){
			WLTAsset result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTAsset record, WLTAssetExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTAsset record, WLTAssetExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTAsset record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTAsset record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTAssetExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTAssetExample());
	}

	@Override
	public WLTAssetExample getExample(WLTAsset record) {
		WLTAssetExample example = new WLTAssetExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getAssetId()!=null){
				criteria.andAssetIdEqualTo(record.getAssetId());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getFundId()!=null){
				criteria.andFundIdEqualTo(record.getFundId());
				}
				if(record.getHoldCount()!=null){
				criteria.andHoldCountEqualTo(record.getHoldCount());
				}
				if(record.getBcTxid()!=null){
				criteria.andBcTxidEqualTo(record.getBcTxid());
				}
				if(record.getAddrId()!=null){
				criteria.andAddrIdEqualTo(record.getAddrId());
				}
				if(record.getAssetPubHash()!=null){
				criteria.andAssetPubHashEqualTo(record.getAssetPubHash());
				}
				if(record.getAssetType()!=null){
				criteria.andAssetTypeEqualTo(record.getAssetType());
				}
				if(record.getAssetStatus()!=null){
				criteria.andAssetStatusEqualTo(record.getAssetStatus());
				}
				if(record.getAssetAlias()!=null){
				criteria.andAssetAliasEqualTo(record.getAssetAlias());
				}
				if(record.getAssetKeywords()!=null){
				criteria.andAssetKeywordsEqualTo(record.getAssetKeywords());
				}
				if(record.getDmtEname()!=null){
				criteria.andDmtEnameEqualTo(record.getDmtEname());
				}
				if(record.getDmtCname()!=null){
				criteria.andDmtCnameEqualTo(record.getDmtCname());
				}
				if(record.getDmtCount()!=null){
				criteria.andDmtCountEqualTo(record.getDmtCount());
				}
				if(record.getMetadata()!=null){
				criteria.andMetadataEqualTo(record.getMetadata());
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
	
	public WLTAsset selectOneByExample(WLTAssetExample example)
			 {
		example.setLimit(1);
		List<WLTAsset> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTAsset> records) throws Exception {
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
			sb.append("INSERT INTO WLT_ASSET(ASSET_ID,USER_ID,FUND_ID,HOLD_COUNT,BC_TXID,ADDR_ID,ASSET_PUB_HASH,ASSET_TYPE,ASSET_STATUS,ASSET_ALIAS,ASSET_KEYWORDS,DMT_ENAME,DMT_CNAME,DMT_COUNT,METADATA,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTAsset record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getAssetId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetId()+"'");
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
			
				if(record.getFundId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFundId()+"'");
				}
			
				sb.append(",");
			
				if(record.getHoldCount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getHoldCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getBcTxid()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getBcTxid()+"'");
				}
			
				sb.append(",");
			
				if(record.getAddrId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAddrId()+"'");
				}
			
				sb.append(",");
			
				if(record.getAssetPubHash()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetPubHash()+"'");
				}
			
				sb.append(",");
			
				if(record.getAssetType()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetType()+"'");
				}
			
				sb.append(",");
			
				if(record.getAssetStatus()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetStatus()+"'");
				}
			
				sb.append(",");
			
				if(record.getAssetAlias()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetAlias()+"'");
				}
			
				sb.append(",");
			
				if(record.getAssetKeywords()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getAssetKeywords()+"'");
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
			
				if(record.getDmtCname()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getDmtCname()+"'");
				}
			
				sb.append(",");
			
				if(record.getDmtCount()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getDmtCount()+"'");
				}
			
				sb.append(",");
			
				if(record.getMetadata()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getMetadata()+"'");
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
