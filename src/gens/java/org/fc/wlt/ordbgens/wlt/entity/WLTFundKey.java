package org.fc.wlt.ordbgens.wlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.outils.serialize.UUIDGenerator;

@AllArgsConstructor
@NoArgsConstructor
public class WLTFundKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WLT_FUND.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    private String fundId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WLT_FUND.FUND_ID
     *
     * @return the value of WLT_FUND.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WLT_FUND.FUND_ID
     *
     * @param fundId the value for WLT_FUND.FUND_ID
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setFundId(String fundId) {
        this.fundId = fundId;
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
        WLTFundKey other = (WLTFundKey) that;
        return (this.getFundId() == null ? other.getFundId() == null : this.getFundId().equals(other.getFundId()));
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
        sb.append(", fundId=").append(fundId);
        sb.append("]");
        return sb.toString();
    }
}