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
import org.fc.wlt.ordbgens.wlt.entity.WLTUser;
import org.fc.wlt.ordbgens.wlt.entity.WLTUserExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTUserKey;

public interface WLTUserMapper extends StaticTableDaoSupport<WLTUser, WLTUserExample, WLTUserKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @SelectProvider(type=WLTUserSqlProvider.class, method="countByExample")
    int countByExample(WLTUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @DeleteProvider(type=WLTUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(WLTUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Delete({
        "delete from WLT_USER",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(WLTUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Insert({
        "insert into WLT_USER (USER_ID, USER_CODE, ",
        "USER_NAME, USER_PASSWD, ",
        "CHECK_PHONE, CHECK_EMAIL, ",
        "USER_STATUS, CREATED_TIME, ",
        "UPDATED_TIME, RESERVED1, ",
        "RESERVED2)",
        "values (#{userId,jdbcType=VARCHAR}, #{userCode,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{userPasswd,jdbcType=VARCHAR}, ",
        "#{checkPhone,jdbcType=VARCHAR}, #{checkEmail,jdbcType=VARCHAR}, ",
        "#{userStatus,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{reserved1,jdbcType=VARCHAR}, ",
        "#{reserved2,jdbcType=VARCHAR})"
    })
    int insert(WLTUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @InsertProvider(type=WLTUserSqlProvider.class, method="insertSelective")
    int insertSelective(WLTUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @SelectProvider(type=WLTUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_CODE", property="userCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_PASSWD", property="userPasswd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_PHONE", property="checkPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_EMAIL", property="checkEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_STATUS", property="userStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    List<WLTUser> selectByExample(WLTUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Select({
        "select",
        "USER_ID, USER_CODE, USER_NAME, USER_PASSWD, CHECK_PHONE, CHECK_EMAIL, USER_STATUS, ",
        "CREATED_TIME, UPDATED_TIME, RESERVED1, RESERVED2",
        "from WLT_USER",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_CODE", property="userCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_PASSWD", property="userPasswd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_PHONE", property="checkPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHECK_EMAIL", property="checkEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_STATUS", property="userStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    WLTUser selectByPrimaryKey(WLTUserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WLTUser record, @Param("example") WLTUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WLTUser record, @Param("example") WLTUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WLTUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_USER
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Update({
        "update WLT_USER",
        "set USER_CODE = #{userCode,jdbcType=VARCHAR},",
          "USER_NAME = #{userName,jdbcType=VARCHAR},",
          "USER_PASSWD = #{userPasswd,jdbcType=VARCHAR},",
          "CHECK_PHONE = #{checkPhone,jdbcType=VARCHAR},",
          "CHECK_EMAIL = #{checkEmail,jdbcType=VARCHAR},",
          "USER_STATUS = #{userStatus,jdbcType=VARCHAR},",
          "CREATED_TIME = #{createdTime,jdbcType=TIMESTAMP},",
          "UPDATED_TIME = #{updatedTime,jdbcType=TIMESTAMP},",
          "RESERVED1 = #{reserved1,jdbcType=VARCHAR},",
          "RESERVED2 = #{reserved2,jdbcType=VARCHAR}",
        "where USER_ID = #{userId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(WLTUser record);
}