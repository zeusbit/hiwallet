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
import org.fc.wlt.ordbgens.wlt.entity.WLTPend;
import org.fc.wlt.ordbgens.wlt.entity.WLTPendExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTPendKey;

public interface WLTPendMapper extends StaticTableDaoSupport<WLTPend, WLTPendExample, WLTPendKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @SelectProvider(type=WLTPendSqlProvider.class, method="countByExample")
    int countByExample(WLTPendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @DeleteProvider(type=WLTPendSqlProvider.class, method="deleteByExample")
    int deleteByExample(WLTPendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Delete({
        "delete from WLT_PEND",
        "where PEND_ID = #{pendId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(WLTPendKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Insert({
        "insert into WLT_PEND (PEND_ID, BS_CODE, ",
        "USER_ID, SOURCE_ASSET_ID, ",
        "SOURCE_AMOUNT, TARGET_FUND_ID, ",
        "TARGET_AMOUNT, PEND_TYPE, ",
        "AUTO_COMMIT, TOTAL_FEE, ",
        "PEND_STATUS, CREATED_TIME, ",
        "UPDATED_TIME, RESERVED1, ",
        "RESERVED2)",
        "values (#{pendId,jdbcType=VARCHAR}, #{bsCode,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{sourceAssetId,jdbcType=VARCHAR}, ",
        "#{sourceAmount,jdbcType=DOUBLE}, #{targetFundId,jdbcType=VARCHAR}, ",
        "#{targetAmount,jdbcType=DOUBLE}, #{pendType,jdbcType=VARCHAR}, ",
        "#{autoCommit,jdbcType=VARCHAR}, #{totalFee,jdbcType=DOUBLE}, ",
        "#{pendStatus,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{reserved1,jdbcType=VARCHAR}, ",
        "#{reserved2,jdbcType=VARCHAR})"
    })
    int insert(WLTPend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @InsertProvider(type=WLTPendSqlProvider.class, method="insertSelective")
    int insertSelective(WLTPend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @SelectProvider(type=WLTPendSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="PEND_ID", property="pendId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BS_CODE", property="bsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_ASSET_ID", property="sourceAssetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_AMOUNT", property="sourceAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="TARGET_FUND_ID", property="targetFundId", jdbcType=JdbcType.VARCHAR),
        @Result(column="TARGET_AMOUNT", property="targetAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="PEND_TYPE", property="pendType", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTO_COMMIT", property="autoCommit", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOTAL_FEE", property="totalFee", jdbcType=JdbcType.DOUBLE),
        @Result(column="PEND_STATUS", property="pendStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    List<WLTPend> selectByExample(WLTPendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Select({
        "select",
        "PEND_ID, BS_CODE, USER_ID, SOURCE_ASSET_ID, SOURCE_AMOUNT, TARGET_FUND_ID, TARGET_AMOUNT, ",
        "PEND_TYPE, AUTO_COMMIT, TOTAL_FEE, PEND_STATUS, CREATED_TIME, UPDATED_TIME, ",
        "RESERVED1, RESERVED2",
        "from WLT_PEND",
        "where PEND_ID = #{pendId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="PEND_ID", property="pendId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BS_CODE", property="bsCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_ASSET_ID", property="sourceAssetId", jdbcType=JdbcType.VARCHAR),
        @Result(column="SOURCE_AMOUNT", property="sourceAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="TARGET_FUND_ID", property="targetFundId", jdbcType=JdbcType.VARCHAR),
        @Result(column="TARGET_AMOUNT", property="targetAmount", jdbcType=JdbcType.DOUBLE),
        @Result(column="PEND_TYPE", property="pendType", jdbcType=JdbcType.VARCHAR),
        @Result(column="AUTO_COMMIT", property="autoCommit", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOTAL_FEE", property="totalFee", jdbcType=JdbcType.DOUBLE),
        @Result(column="PEND_STATUS", property="pendStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    WLTPend selectByPrimaryKey(WLTPendKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTPendSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WLTPend record, @Param("example") WLTPendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTPendSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WLTPend record, @Param("example") WLTPendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @UpdateProvider(type=WLTPendSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WLTPend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_PEND
     *
     * @mbggenerated Thu Feb 01 14:31:14 CST 2018
     */
    @Update({
        "update WLT_PEND",
        "set BS_CODE = #{bsCode,jdbcType=VARCHAR},",
          "USER_ID = #{userId,jdbcType=VARCHAR},",
          "SOURCE_ASSET_ID = #{sourceAssetId,jdbcType=VARCHAR},",
          "SOURCE_AMOUNT = #{sourceAmount,jdbcType=DOUBLE},",
          "TARGET_FUND_ID = #{targetFundId,jdbcType=VARCHAR},",
          "TARGET_AMOUNT = #{targetAmount,jdbcType=DOUBLE},",
          "PEND_TYPE = #{pendType,jdbcType=VARCHAR},",
          "AUTO_COMMIT = #{autoCommit,jdbcType=VARCHAR},",
          "TOTAL_FEE = #{totalFee,jdbcType=DOUBLE},",
          "PEND_STATUS = #{pendStatus,jdbcType=VARCHAR},",
          "CREATED_TIME = #{createdTime,jdbcType=TIMESTAMP},",
          "UPDATED_TIME = #{updatedTime,jdbcType=TIMESTAMP},",
          "RESERVED1 = #{reserved1,jdbcType=VARCHAR},",
          "RESERVED2 = #{reserved2,jdbcType=VARCHAR}",
        "where PEND_ID = #{pendId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(WLTPend record);
}