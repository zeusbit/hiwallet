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
import org.fc.wlt.ordbgens.wlt.entity.WLTAsset;
import org.fc.wlt.ordbgens.wlt.entity.WLTAssetExample;
import org.fc.wlt.ordbgens.wlt.entity.WLTAssetKey;

public interface WLTAssetMapper extends StaticTableDaoSupport<WLTAsset, WLTAssetExample, WLTAssetKey> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @SelectProvider(type=WLTAssetSqlProvider.class, method="countByExample")
    int countByExample(WLTAssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @DeleteProvider(type=WLTAssetSqlProvider.class, method="deleteByExample")
    int deleteByExample(WLTAssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Delete({
        "delete from WLT_ASSET",
        "where ASSET_ID = #{assetId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(WLTAssetKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Insert({
        "insert into WLT_ASSET (ASSET_ID, USER_ID, ",
        "FUND_ID, HOLD_COUNT, ",
        "BC_TXID, ADDR_ID, ",
        "ASSET_PUB_HASH, ASSET_TYPE, ",
        "ASSET_STATUS, ASSET_ALIAS, ",
        "ASSET_KEYWORDS, DMT_ENAME, ",
        "DMT_CNAME, DMT_COUNT, ",
        "METADATA, CREATED_TIME, ",
        "UPDATED_TIME, RESERVED1, ",
        "RESERVED2)",
        "values (#{assetId,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, ",
        "#{fundId,jdbcType=VARCHAR}, #{holdCount,jdbcType=DOUBLE}, ",
        "#{bcTxid,jdbcType=VARCHAR}, #{addrId,jdbcType=VARCHAR}, ",
        "#{assetPubHash,jdbcType=VARCHAR}, #{assetType,jdbcType=VARCHAR}, ",
        "#{assetStatus,jdbcType=VARCHAR}, #{assetAlias,jdbcType=VARCHAR}, ",
        "#{assetKeywords,jdbcType=VARCHAR}, #{dmtEname,jdbcType=VARCHAR}, ",
        "#{dmtCname,jdbcType=VARCHAR}, #{dmtCount,jdbcType=DOUBLE}, ",
        "#{metadata,jdbcType=VARCHAR}, #{createdTime,jdbcType=TIMESTAMP}, ",
        "#{updatedTime,jdbcType=TIMESTAMP}, #{reserved1,jdbcType=VARCHAR}, ",
        "#{reserved2,jdbcType=VARCHAR})"
    })
    int insert(WLTAsset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @InsertProvider(type=WLTAssetSqlProvider.class, method="insertSelective")
    int insertSelective(WLTAsset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @SelectProvider(type=WLTAssetSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ASSET_ID", property="assetId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_ID", property="fundId", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLD_COUNT", property="holdCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="BC_TXID", property="bcTxid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDR_ID", property="addrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_PUB_HASH", property="assetPubHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_TYPE", property="assetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_STATUS", property="assetStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_ALIAS", property="assetAlias", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_KEYWORDS", property="assetKeywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_ENAME", property="dmtEname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_CNAME", property="dmtCname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_COUNT", property="dmtCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="METADATA", property="metadata", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    List<WLTAsset> selectByExample(WLTAssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Select({
        "select",
        "ASSET_ID, USER_ID, FUND_ID, HOLD_COUNT, BC_TXID, ADDR_ID, ASSET_PUB_HASH, ASSET_TYPE, ",
        "ASSET_STATUS, ASSET_ALIAS, ASSET_KEYWORDS, DMT_ENAME, DMT_CNAME, DMT_COUNT, ",
        "METADATA, CREATED_TIME, UPDATED_TIME, RESERVED1, RESERVED2",
        "from WLT_ASSET",
        "where ASSET_ID = #{assetId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ASSET_ID", property="assetId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="FUND_ID", property="fundId", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOLD_COUNT", property="holdCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="BC_TXID", property="bcTxid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDR_ID", property="addrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_PUB_HASH", property="assetPubHash", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_TYPE", property="assetType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_STATUS", property="assetStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_ALIAS", property="assetAlias", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASSET_KEYWORDS", property="assetKeywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_ENAME", property="dmtEname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_CNAME", property="dmtCname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DMT_COUNT", property="dmtCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="METADATA", property="metadata", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATED_TIME", property="createdTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UPDATED_TIME", property="updatedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RESERVED1", property="reserved1", jdbcType=JdbcType.VARCHAR),
        @Result(column="RESERVED2", property="reserved2", jdbcType=JdbcType.VARCHAR)
    })
    WLTAsset selectByPrimaryKey(WLTAssetKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAssetSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") WLTAsset record, @Param("example") WLTAssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAssetSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") WLTAsset record, @Param("example") WLTAssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @UpdateProvider(type=WLTAssetSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(WLTAsset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Update({
        "update WLT_ASSET",
        "set USER_ID = #{userId,jdbcType=VARCHAR},",
          "FUND_ID = #{fundId,jdbcType=VARCHAR},",
          "HOLD_COUNT = #{holdCount,jdbcType=DOUBLE},",
          "BC_TXID = #{bcTxid,jdbcType=VARCHAR},",
          "ADDR_ID = #{addrId,jdbcType=VARCHAR},",
          "ASSET_PUB_HASH = #{assetPubHash,jdbcType=VARCHAR},",
          "ASSET_TYPE = #{assetType,jdbcType=VARCHAR},",
          "ASSET_STATUS = #{assetStatus,jdbcType=VARCHAR},",
          "ASSET_ALIAS = #{assetAlias,jdbcType=VARCHAR},",
          "ASSET_KEYWORDS = #{assetKeywords,jdbcType=VARCHAR},",
          "DMT_ENAME = #{dmtEname,jdbcType=VARCHAR},",
          "DMT_CNAME = #{dmtCname,jdbcType=VARCHAR},",
          "DMT_COUNT = #{dmtCount,jdbcType=DOUBLE},",
          "METADATA = #{metadata,jdbcType=VARCHAR},",
          "CREATED_TIME = #{createdTime,jdbcType=TIMESTAMP},",
          "UPDATED_TIME = #{updatedTime,jdbcType=TIMESTAMP},",
          "RESERVED1 = #{reserved1,jdbcType=VARCHAR},",
          "RESERVED2 = #{reserved2,jdbcType=VARCHAR}",
        "where ASSET_ID = #{assetId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(WLTAsset record);
}