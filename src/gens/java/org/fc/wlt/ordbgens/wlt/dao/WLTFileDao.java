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

import org.fc.wlt.ordbgens.wlt.entity.WLTFile;
import org.fc.wlt.ordbgens.wlt.entity.WLTFileExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTFileExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTFileKey;
import org.fc.wlt.ordbgens.wlt.mapper.WLTFileMapper;
import onight.tfw.ojpa.api.annotations.Tab;
import onight.tfw.ojpa.ordb.ExtendDaoSupper;
import onight.tfw.mservice.ThreadContext;


@Data
@EqualsAndHashCode(callSuper=false)
@Tab(name="WLT_FILE")
public class WLTFileDao extends ExtendDaoSupper<WLTFile, WLTFileExample, WLTFileKey>{

	private WLTFileMapper mapper;

	private SqlSessionFactory sqlSessionFactory;
	
	
	@Override
	public int countByExample(WLTFileExample example) {
		return mapper.countByExample(example);
	}

	@Override
	public int deleteByExample(WLTFileExample example)  throws Exception{
		return mapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(WLTFileKey key)  throws Exception{
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(WLTFile record)   throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WLTFile record)   throws Exception{
		return mapper.insertSelective(record);
	}

	@Override
	//@Transactional
	public int batchUpdate(List<WLTFile> records) throws Exception
			 {
		for(WLTFile record : records){
			mapper.updateByPrimaryKeySelective(record);
		}
		return records.size();
	}

	@Override
	//@Transactional
	public int batchDelete(List<WLTFile> records) throws Exception
			 {
		for(WLTFile record : records){
			mapper.deleteByPrimaryKey(record);
		}
		return records.size();
	}

	@Override
	public List<WLTFile> selectByExample(WLTFileExample example)
			 {
		return mapper.selectByExample(example);
	}

	@Override
	public WLTFile selectByPrimaryKey(WLTFileKey key)
			 {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<WLTFile> findAll(List<WLTFile> records) {
		if(records==null||records.size()<=0){
			return mapper.selectByExample(new WLTFileExample());
		}
		List<WLTFile> list = new ArrayList<>();
		for(WLTFile record : records){
			WLTFile result = mapper.selectByPrimaryKey(record);
			if(result!=null){
				list.add(result);
			}
		}
		return list;
	}

	@Override
	public int updateByExampleSelective(WLTFile record, WLTFileExample example)  throws Exception {
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(WLTFile record, WLTFileExample example)  throws Exception{
		return mapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(WLTFile record)  throws Exception{
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WLTFile record)  throws Exception{
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int sumByExample(WLTFileExample example) {
		return 0;
	}

	@Override
	public void deleteAll()  throws Exception {
		mapper.deleteByExample(new WLTFileExample());
	}

	@Override
	public WLTFileExample getExample(WLTFile record) {
		WLTFileExample example = new WLTFileExample();
		if(record!=null){
			Criteria criteria = example.createCriteria();
							if(record.getFileId()!=null){
				criteria.andFileIdEqualTo(record.getFileId());
				}
				if(record.getFilePath()!=null){
				criteria.andFilePathEqualTo(record.getFilePath());
				}
				if(record.getFileName()!=null){
				criteria.andFileNameEqualTo(record.getFileName());
				}
				if(record.getFileSize()!=null){
				criteria.andFileSizeEqualTo(record.getFileSize());
				}
				if(record.getUserId()!=null){
				criteria.andUserIdEqualTo(record.getUserId());
				}
				if(record.getFileHash()!=null){
				criteria.andFileHashEqualTo(record.getFileHash());
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
	
	public WLTFile selectOneByExample(WLTFileExample example)
			 {
		example.setLimit(1);
		List<WLTFile> list=mapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	//@Transactional
	public int batchInsert(List<WLTFile> records) throws Exception {
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
			sb.append("INSERT INTO WLT_FILE(FILE_ID,FILE_PATH,FILE_NAME,FILE_SIZE,USER_ID,FILE_HASH,CREATED_TIME,UPDATED_TIME,RESERVED1,RESERVED2) values");
			
				int i=0;
				st = conn.createStatement();
				for (WLTFile record : records) {
					if(i>0){
						sb.append(",");
					}
					i++;
				
			
				sb.append("(");
			
				if(record.getFileId()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFileId()+"'");
				}
			
				sb.append(",");
			
				if(record.getFilePath()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFilePath()+"'");
				}
			
				sb.append(",");
			
				if(record.getFileName()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFileName()+"'");
				}
			
				sb.append(",");
			
				if(record.getFileSize()==null){
//						sb.append("'"+"0"+"'");
						sb.append("'"+"0"+"'");
						
				}else{
				// java type==Double
						sb.append("'"+record.getFileSize()+"'");
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
			
				if(record.getFileHash()==null){
//						sb.append("'"+""+"'");
						sb.append("'"+""+"'");
						
				}else{
				// java type==String
						sb.append("'"+record.getFileHash()+"'");
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
