package org.fc.wlt.ordbgens.wlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="WLT_FUND")
@AllArgsConstructor
@NoArgsConstructor
public class WLTFund extends WLTFundKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String dmtCname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String dmtEname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.GENIS_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String genisAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.GENIS_ORG_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String genisOrgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.GENIS_DEPOSIT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double genisDeposit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.TOTAL_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double totalCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.COLORED_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double coloredFbc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.EXCHANGE_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double exchangeFbc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.TURNOVER_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Double turnoverCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.DATE_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date dateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.FUND_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String fundStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String reserved2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.USER_ID
     *
     * @return the value of WLT_FUND.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.USER_ID
     *
     * @param userId the value for WLT_FUND.USER_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.DMT_CNAME
     *
     * @return the value of WLT_FUND.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getDmtCname() {
        return dmtCname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.DMT_CNAME
     *
     * @param dmtCname the value for WLT_FUND.DMT_CNAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDmtCname(String dmtCname) {
        this.dmtCname = dmtCname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.DMT_ENAME
     *
     * @return the value of WLT_FUND.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getDmtEname() {
        return dmtEname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.DMT_ENAME
     *
     * @param dmtEname the value for WLT_FUND.DMT_ENAME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDmtEname(String dmtEname) {
        this.dmtEname = dmtEname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.GENIS_ADDR
     *
     * @return the value of WLT_FUND.GENIS_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getGenisAddr() {
        return genisAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.GENIS_ADDR
     *
     * @param genisAddr the value for WLT_FUND.GENIS_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setGenisAddr(String genisAddr) {
        this.genisAddr = genisAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.GENIS_ORG_ID
     *
     * @return the value of WLT_FUND.GENIS_ORG_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getGenisOrgId() {
        return genisOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.GENIS_ORG_ID
     *
     * @param genisOrgId the value for WLT_FUND.GENIS_ORG_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setGenisOrgId(String genisOrgId) {
        this.genisOrgId = genisOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.GENIS_DEPOSIT
     *
     * @return the value of WLT_FUND.GENIS_DEPOSIT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getGenisDeposit() {
        return genisDeposit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.GENIS_DEPOSIT
     *
     * @param genisDeposit the value for WLT_FUND.GENIS_DEPOSIT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setGenisDeposit(Double genisDeposit) {
        this.genisDeposit = genisDeposit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.TOTAL_COUNT
     *
     * @return the value of WLT_FUND.TOTAL_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getTotalCount() {
        return totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.TOTAL_COUNT
     *
     * @param totalCount the value for WLT_FUND.TOTAL_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setTotalCount(Double totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.COLORED_FBC
     *
     * @return the value of WLT_FUND.COLORED_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getColoredFbc() {
        return coloredFbc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.COLORED_FBC
     *
     * @param coloredFbc the value for WLT_FUND.COLORED_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setColoredFbc(Double coloredFbc) {
        this.coloredFbc = coloredFbc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.EXCHANGE_FBC
     *
     * @return the value of WLT_FUND.EXCHANGE_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getExchangeFbc() {
        return exchangeFbc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.EXCHANGE_FBC
     *
     * @param exchangeFbc the value for WLT_FUND.EXCHANGE_FBC
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setExchangeFbc(Double exchangeFbc) {
        this.exchangeFbc = exchangeFbc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.TURNOVER_COUNT
     *
     * @return the value of WLT_FUND.TURNOVER_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Double getTurnoverCount() {
        return turnoverCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.TURNOVER_COUNT
     *
     * @param turnoverCount the value for WLT_FUND.TURNOVER_COUNT
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setTurnoverCount(Double turnoverCount) {
        this.turnoverCount = turnoverCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.DATE_TIME
     *
     * @return the value of WLT_FUND.DATE_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.DATE_TIME
     *
     * @param dateTime the value for WLT_FUND.DATE_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.FUND_STATUS
     *
     * @return the value of WLT_FUND.FUND_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFundStatus() {
        return fundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.FUND_STATUS
     *
     * @param fundStatus the value for WLT_FUND.FUND_STATUS
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.CREATED_TIME
     *
     * @return the value of WLT_FUND.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.CREATED_TIME
     *
     * @param createdTime the value for WLT_FUND.CREATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.UPDATED_TIME
     *
     * @return the value of WLT_FUND.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.UPDATED_TIME
     *
     * @param updatedTime the value for WLT_FUND.UPDATED_TIME
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.RESERVED1
     *
     * @return the value of WLT_FUND.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.RESERVED1
     *
     * @param reserved1 the value for WLT_FUND.RESERVED1
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.RESERVED2
     *
     * @return the value of WLT_FUND.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.RESERVED2
     *
     * @param reserved2 the value for WLT_FUND.RESERVED2
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
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
        WLTFund other = (WLTFund) that;
        return (this.getFundId() == null ? other.getFundId() == null : this.getFundId().equals(other.getFundId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getDmtCname() == null ? other.getDmtCname() == null : this.getDmtCname().equals(other.getDmtCname()))
            && (this.getDmtEname() == null ? other.getDmtEname() == null : this.getDmtEname().equals(other.getDmtEname()))
            && (this.getGenisAddr() == null ? other.getGenisAddr() == null : this.getGenisAddr().equals(other.getGenisAddr()))
            && (this.getGenisOrgId() == null ? other.getGenisOrgId() == null : this.getGenisOrgId().equals(other.getGenisOrgId()))
            && (this.getGenisDeposit() == null ? other.getGenisDeposit() == null : this.getGenisDeposit().equals(other.getGenisDeposit()))
            && (this.getTotalCount() == null ? other.getTotalCount() == null : this.getTotalCount().equals(other.getTotalCount()))
            && (this.getColoredFbc() == null ? other.getColoredFbc() == null : this.getColoredFbc().equals(other.getColoredFbc()))
            && (this.getExchangeFbc() == null ? other.getExchangeFbc() == null : this.getExchangeFbc().equals(other.getExchangeFbc()))
            && (this.getTurnoverCount() == null ? other.getTurnoverCount() == null : this.getTurnoverCount().equals(other.getTurnoverCount()))
            && (this.getDateTime() == null ? other.getDateTime() == null : this.getDateTime().equals(other.getDateTime()))
            && (this.getFundStatus() == null ? other.getFundStatus() == null : this.getFundStatus().equals(other.getFundStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getReserved1() == null ? other.getReserved1() == null : this.getReserved1().equals(other.getReserved1()))
            && (this.getReserved2() == null ? other.getReserved2() == null : this.getReserved2().equals(other.getReserved2()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFundId() == null) ? 0 : getFundId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getDmtCname() == null) ? 0 : getDmtCname().hashCode());
        result = prime * result + ((getDmtEname() == null) ? 0 : getDmtEname().hashCode());
        result = prime * result + ((getGenisAddr() == null) ? 0 : getGenisAddr().hashCode());
        result = prime * result + ((getGenisOrgId() == null) ? 0 : getGenisOrgId().hashCode());
        result = prime * result + ((getGenisDeposit() == null) ? 0 : getGenisDeposit().hashCode());
        result = prime * result + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        result = prime * result + ((getColoredFbc() == null) ? 0 : getColoredFbc().hashCode());
        result = prime * result + ((getExchangeFbc() == null) ? 0 : getExchangeFbc().hashCode());
        result = prime * result + ((getTurnoverCount() == null) ? 0 : getTurnoverCount().hashCode());
        result = prime * result + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        result = prime * result + ((getFundStatus() == null) ? 0 : getFundStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getReserved1() == null) ? 0 : getReserved1().hashCode());
        result = prime * result + ((getReserved2() == null) ? 0 : getReserved2().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
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
        sb.append(", dmtCname=").append(dmtCname);
        sb.append(", dmtEname=").append(dmtEname);
        sb.append(", genisAddr=").append(genisAddr);
        sb.append(", genisOrgId=").append(genisOrgId);
        sb.append(", genisDeposit=").append(genisDeposit);
        sb.append(", totalCount=").append(totalCount);
        sb.append(", coloredFbc=").append(coloredFbc);
        sb.append(", exchangeFbc=").append(exchangeFbc);
        sb.append(", turnoverCount=").append(turnoverCount);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", fundStatus=").append(fundStatus);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", reserved1=").append(reserved1);
        sb.append(", reserved2=").append(reserved2);
        sb.append("]");
        return sb.toString();
    }
}