package org.fc.wlt.ordbgens.wlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="WLT_ASSET")
@AllArgsConstructor
@NoArgsConstructor
public class WLTAsset extends WLTAssetKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String fundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.HOLD_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double holdCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.BC_TXID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String bcTxid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ADDR_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String addrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ASSET_PUB_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String assetPubHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ASSET_TYPE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String assetType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ASSET_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String assetStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ASSET_ALIAS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String assetAlias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.ASSET_KEYWORDS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String assetKeywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String dmtEname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String dmtCname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.DMT_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double dmtCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.METADATA
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String metadata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_ASSET.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.USER_ID
     *
     * @return the value of WLT_ASSET.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.USER_ID
     *
     * @param userId the value for WLT_ASSET.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.FUND_ID
     *
     * @return the value of WLT_ASSET.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.FUND_ID
     *
     * @param fundId the value for WLT_ASSET.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.HOLD_COUNT
     *
     * @return the value of WLT_ASSET.HOLD_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getHoldCount() {
        return holdCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.HOLD_COUNT
     *
     * @param holdCount the value for WLT_ASSET.HOLD_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setHoldCount(Double holdCount) {
        this.holdCount = holdCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.BC_TXID
     *
     * @return the value of WLT_ASSET.BC_TXID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getBcTxid() {
        return bcTxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.BC_TXID
     *
     * @param bcTxid the value for WLT_ASSET.BC_TXID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setBcTxid(String bcTxid) {
        this.bcTxid = bcTxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ADDR_ID
     *
     * @return the value of WLT_ASSET.ADDR_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAddrId() {
        return addrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ADDR_ID
     *
     * @param addrId the value for WLT_ASSET.ADDR_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ASSET_PUB_HASH
     *
     * @return the value of WLT_ASSET.ASSET_PUB_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAssetPubHash() {
        return assetPubHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ASSET_PUB_HASH
     *
     * @param assetPubHash the value for WLT_ASSET.ASSET_PUB_HASH
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAssetPubHash(String assetPubHash) {
        this.assetPubHash = assetPubHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ASSET_TYPE
     *
     * @return the value of WLT_ASSET.ASSET_TYPE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ASSET_TYPE
     *
     * @param assetType the value for WLT_ASSET.ASSET_TYPE
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ASSET_STATUS
     *
     * @return the value of WLT_ASSET.ASSET_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAssetStatus() {
        return assetStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ASSET_STATUS
     *
     * @param assetStatus the value for WLT_ASSET.ASSET_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ASSET_ALIAS
     *
     * @return the value of WLT_ASSET.ASSET_ALIAS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAssetAlias() {
        return assetAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ASSET_ALIAS
     *
     * @param assetAlias the value for WLT_ASSET.ASSET_ALIAS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAssetAlias(String assetAlias) {
        this.assetAlias = assetAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.ASSET_KEYWORDS
     *
     * @return the value of WLT_ASSET.ASSET_KEYWORDS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getAssetKeywords() {
        return assetKeywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.ASSET_KEYWORDS
     *
     * @param assetKeywords the value for WLT_ASSET.ASSET_KEYWORDS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setAssetKeywords(String assetKeywords) {
        this.assetKeywords = assetKeywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.DMT_ENAME
     *
     * @return the value of WLT_ASSET.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getDmtEname() {
        return dmtEname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.DMT_ENAME
     *
     * @param dmtEname the value for WLT_ASSET.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDmtEname(String dmtEname) {
        this.dmtEname = dmtEname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.DMT_CNAME
     *
     * @return the value of WLT_ASSET.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getDmtCname() {
        return dmtCname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.DMT_CNAME
     *
     * @param dmtCname the value for WLT_ASSET.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDmtCname(String dmtCname) {
        this.dmtCname = dmtCname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.DMT_COUNT
     *
     * @return the value of WLT_ASSET.DMT_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getDmtCount() {
        return dmtCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.DMT_COUNT
     *
     * @param dmtCount the value for WLT_ASSET.DMT_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDmtCount(Double dmtCount) {
        this.dmtCount = dmtCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.METADATA
     *
     * @return the value of WLT_ASSET.METADATA
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.METADATA
     *
     * @param metadata the value for WLT_ASSET.METADATA
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.CREATED_TIME
     *
     * @return the value of WLT_ASSET.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.CREATED_TIME
     *
     * @param createdTime the value for WLT_ASSET.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.UPDATED_TIME
     *
     * @return the value of WLT_ASSET.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.UPDATED_TIME
     *
     * @param updatedTime the value for WLT_ASSET.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.RESERVED1
     *
     * @return the value of WLT_ASSET.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.RESERVED1
     *
     * @param reserved1 the value for WLT_ASSET.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_ASSET.RESERVED2
     *
     * @return the value of WLT_ASSET.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_ASSET.RESERVED2
     *
     * @param reserved2 the value for WLT_ASSET.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WLTAsset other = (WLTAsset) that;
        return (this.getAssetId() == null ? other.getAssetId() == null : this.getAssetId().equals(other.getAssetId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFundId() == null ? other.getFundId() == null : this.getFundId().equals(other.getFundId()))
            && (this.getHoldCount() == null ? other.getHoldCount() == null : this.getHoldCount().equals(other.getHoldCount()))
            && (this.getBcTxid() == null ? other.getBcTxid() == null : this.getBcTxid().equals(other.getBcTxid()))
            && (this.getAddrId() == null ? other.getAddrId() == null : this.getAddrId().equals(other.getAddrId()))
            && (this.getAssetPubHash() == null ? other.getAssetPubHash() == null : this.getAssetPubHash().equals(other.getAssetPubHash()))
            && (this.getAssetType() == null ? other.getAssetType() == null : this.getAssetType().equals(other.getAssetType()))
            && (this.getAssetStatus() == null ? other.getAssetStatus() == null : this.getAssetStatus().equals(other.getAssetStatus()))
            && (this.getAssetAlias() == null ? other.getAssetAlias() == null : this.getAssetAlias().equals(other.getAssetAlias()))
            && (this.getAssetKeywords() == null ? other.getAssetKeywords() == null : this.getAssetKeywords().equals(other.getAssetKeywords()))
            && (this.getDmtEname() == null ? other.getDmtEname() == null : this.getDmtEname().equals(other.getDmtEname()))
            && (this.getDmtCname() == null ? other.getDmtCname() == null : this.getDmtCname().equals(other.getDmtCname()))
            && (this.getDmtCount() == null ? other.getDmtCount() == null : this.getDmtCount().equals(other.getDmtCount()))
            && (this.getMetadata() == null ? other.getMetadata() == null : this.getMetadata().equals(other.getMetadata()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFundId() == null) ? 0 : getFundId().hashCode());
        result = prime * result + ((getHoldCount() == null) ? 0 : getHoldCount().hashCode());
        result = prime * result + ((getBcTxid() == null) ? 0 : getBcTxid().hashCode());
        result = prime * result + ((getAddrId() == null) ? 0 : getAddrId().hashCode());
        result = prime * result + ((getAssetPubHash() == null) ? 0 : getAssetPubHash().hashCode());
        result = prime * result + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        result = prime * result + ((getAssetStatus() == null) ? 0 : getAssetStatus().hashCode());
        result = prime * result + ((getAssetAlias() == null) ? 0 : getAssetAlias().hashCode());
        result = prime * result + ((getAssetKeywords() == null) ? 0 : getAssetKeywords().hashCode());
        result = prime * result + ((getDmtEname() == null) ? 0 : getDmtEname().hashCode());
        result = prime * result + ((getDmtCname() == null) ? 0 : getDmtCname().hashCode());
        result = prime * result + ((getDmtCount() == null) ? 0 : getDmtCount().hashCode());
        result = prime * result + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ASSET
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", fundId=").append(fundId);
        sb.append(", holdCount=").append(holdCount);
        sb.append(", bcTxid=").append(bcTxid);
        sb.append(", addrId=").append(addrId);
        sb.append(", assetPubHash=").append(assetPubHash);
        sb.append(", assetType=").append(assetType);
        sb.append(", assetStatus=").append(assetStatus);
        sb.append(", assetAlias=").append(assetAlias);
        sb.append(", assetKeywords=").append(assetKeywords);
        sb.append(", dmtEname=").append(dmtEname);
        sb.append(", dmtCname=").append(dmtCname);
        sb.append(", dmtCount=").append(dmtCount);
        sb.append(", metadata=").append(metadata);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append("]");
        return sb.toString();
    }
}