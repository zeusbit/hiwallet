package org.fc.wlt.ordbgens.wlt.mapper;

import java.util.List;
import onight.tfw.ojpa.ordb.StaticTableDaoSupport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddr;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddrExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTAddrKey;

public interface WLTAddrMapper extends StaticTableDaoSupport<WLTAddr, WLTAddrExample, WLTAddrKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @SelectProvider(type=WLTAddrSqlProvider.class, method="countByExample")
    int countByExample(WLTAddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @DeleteProvider(type=WLTAddrSqlProvider.class, method="deleteByExample")
    int deleteByExample(WLTAddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Delete({
        "delete from WLT_ADDR",
        "where ADDR_ID = #{addrId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(WLTAddrKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Insert({
        "insert into WLT_ADDR (ADDR_ID, USER_ID, ",
        "HEX_ADDR, PUBLIC_KEY, ",
        "PUBLIC_KEY_HASH, PRIVATE_KEY, ",
        "ADDR_STATUS, CREATED_TIME, ",
        "UPDATED_TIME, RESERVED1, ",
        "RESERVED2)",
        "values (#{addrId,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{hexAddr,jdbcType=VARCHAR}, #{publicKey,jdbcType=VARCHAR}, ",
        "#{publicKeyHash,jdbcType=VARCHAR}, #{privateKey,jdbcType=VARCHAR}, ",
        "#{addrStatus,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{reserved1,jdbcType=VARCHAR}, ",
        "#{reserved2,jdbcType=VARCHAR})"
    })
    int insert(WLTAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @InsertProvider(type=WLTAddrSqlProvider.class, method="insertSelective")
    int insertSelective(WLTAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @SelectProvider(type=WLTAddrSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ADDR_ID", property="addrId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="HEX_ADDR", property="hexAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="PUBLIC_KEY", property="publicKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="PUBLIC_KEY_HASH", property="publicKeyHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVATE_KEY", property="privateKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDR_STATUS", property="addrStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    List<WLTAddr> selectByExample(WLTAddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Select({
        "select",
        "ADDR_ID, USER_ID, HEX_ADDR, PUBLIC_KEY, PUBLIC_KEY_HASH, PRIVATE_KEY, ADDR_STATUS, ",
        "CREATED_TIME, UPDATED_TIME, RESERVED1, RESERVED2",
        "from WLT_ADDR",
        "where ADDR_ID = #{addrId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ADDR_ID", property="addrId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="HEX_ADDR", property="hexAddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="PUBLIC_KEY", property="publicKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="PUBLIC_KEY_HASH", property="publicKeyHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRIVATE_KEY", property="privateKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDR_STATUS", property="addrStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    WLTAddr selectByPrimaryKey(WLTAddrKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAddrSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WLTAddr record, @Param("example") WLTAddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAddrSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WLTAddr record, @Param("example") WLTAddrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAddrSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WLTAddr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Update({
        "update WLT_ADDR",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "HEX_ADDR = #{hexAddr,jdbcType=VARCHAR},",
          "PUBLIC_KEY = #{publicKey,jdbcType=VARCHAR},",
          "PUBLIC_KEY_HASH = #{publicKeyHash,jdbcType=VARCHAR},",
          "PRIVATE_KEY = #{privateKey,jdbcType=VARCHAR},",
          "ADDR_STATUS = #{addrStatus,jdbcType=VARCHAR},",
          "CREATED_TIME = #{createdTime,jdbcType=TIMESTAMP},",
          "UPDATED_TIME = #{updatedTime,jdbcType=TIMESTAMP},",
          "RESERVED1 = #{reserved1,jdbcType=VARCHAR},",
          "RESERVED2 = #{reserved2,jdbcType=VARCHAR}",
        "where ADDR_ID = #{addrId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(WLTAddr record);
}