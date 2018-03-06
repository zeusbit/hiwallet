package org.fc.wlt.ordbgens.wlt.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import org.fc.wlt.ordbgens.wlt.entity.WLTFund;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundExample.Criteria;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundExample.Criterion;
import org.fc.wlt.ordbgens.wlt.entity.WLTFundExample;

public class WLTFundSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String countByExample(WLTFundExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("WLT_FUND");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String deleteByExample(WLTFundExample example) {
        BEGIN();
        DELETE_FROM("WLT_FUND");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String insertSelective(WLTFund record) {
        BEGIN();
        INSERT_INTO("WLT_FUND");
        
        if (record.getFundId() != null) {
            VALUES("FUND_ID", "#{fundId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("USER_ID", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtCname() != null) {
            VALUES("DMT_CNAME", "#{dmtCname,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtEname() != null) {
            VALUES("DMT_ENAME", "#{dmtEname,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisAddr() != null) {
            VALUES("GENIS_ADDR", "#{genisAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisOrgId() != null) {
            VALUES("GENIS_ORG_ID", "#{genisOrgId,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisDeposit() != null) {
            VALUES("GENIS_DEPOSIT", "#{genisDeposit,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalCount() != null) {
            VALUES("TOTAL_COUNT", "#{totalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getColoredFbc() != null) {
            VALUES("COLORED_FBC", "#{coloredFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getExchangeFbc() != null) {
            VALUES("EXCHANGE_FBC", "#{exchangeFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getTurnoverCount() != null) {
            VALUES("TURNOVER_COUNT", "#{turnoverCount,jdbcType=DOUBLE}");
        }
        
        if (record.getDateTime() != null) {
            VALUES("DATE_TIME", "#{dateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundStatus() != null) {
            VALUES("FUND_STATUS", "#{fundStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            VALUES("CREATED_TIME", "#{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            VALUES("UPDATED_TIME", "#{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReserved1() != null) {
            VALUES("RESERVED1", "#{reserved1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserved2() != null) {
            VALUES("RESERVED2", "#{reserved2,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String selectByExample(WLTFundExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("FUND_ID");
        } else {
            SELECT("FUND_ID");
        }
        SELECT("USER_ID");
        SELECT("DMT_CNAME");
        SELECT("DMT_ENAME");
        SELECT("GENIS_ADDR");
        SELECT("GENIS_ORG_ID");
        SELECT("GENIS_DEPOSIT");
        SELECT("TOTAL_COUNT");
        SELECT("COLORED_FBC");
        SELECT("EXCHANGE_FBC");
        SELECT("TURNOVER_COUNT");
        SELECT("DATE_TIME");
        SELECT("FUND_STATUS");
        SELECT("CREATED_TIME");
        SELECT("UPDATED_TIME");
        SELECT("RESERVED1");
        SELECT("RESERVED2");
        FROM("WLT_FUND");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example!=null&&example.getSelectCols()!=null&&example.getSelectCols().trim().length()>0){
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT(example.getSelectCols());
		} else {
				SELECT(example.getSelectCols());
		}
				FROM("WLT_FUND");				applyWhere(example, false);
		}
        if(example != null){
            if(example.getLimit() !=  Integer.MAX_VALUE && example.getOffset() >0 ){
                String retstr= SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
                if(example.isForUpdate()) { return retstr+"  FOR UPDATE " ;} else { return retstr;}}
                else if(example.isForUpdate()){  return SQL()+"  FOR UPDATE " ;  }
            }
            return SQL();
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        WLTFund record = (WLTFund) parameter.get("record");
        WLTFundExample example = (WLTFundExample) parameter.get("example");
        
        BEGIN();
        UPDATE("WLT_FUND");
        
        if (record.getFundId() != null) {
            SET("FUND_ID = #{record.fundId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtCname() != null) {
            SET("DMT_CNAME = #{record.dmtCname,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtEname() != null) {
            SET("DMT_ENAME = #{record.dmtEname,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisAddr() != null) {
            SET("GENIS_ADDR = #{record.genisAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisOrgId() != null) {
            SET("GENIS_ORG_ID = #{record.genisOrgId,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisDeposit() != null) {
            SET("GENIS_DEPOSIT = #{record.genisDeposit,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalCount() != null) {
            SET("TOTAL_COUNT = #{record.totalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getColoredFbc() != null) {
            SET("COLORED_FBC = #{record.coloredFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getExchangeFbc() != null) {
            SET("EXCHANGE_FBC = #{record.exchangeFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getTurnoverCount() != null) {
            SET("TURNOVER_COUNT = #{record.turnoverCount,jdbcType=DOUBLE}");
        }
        
        if (record.getDateTime() != null) {
            SET("DATE_TIME = #{record.dateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundStatus() != null) {
            SET("FUND_STATUS = #{record.fundStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            SET("CREATED_TIME = #{record.createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            SET("UPDATED_TIME = #{record.updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReserved1() != null) {
            SET("RESERVED1 = #{record.reserved1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserved2() != null) {
            SET("RESERVED2 = #{record.reserved2,jdbcType=VARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("WLT_FUND");
        
        SET("FUND_ID = #{record.fundId,jdbcType=VARCHAR}");
        SET("USER_ID = #{record.userId,jdbcType=VARCHAR}");
        SET("DMT_CNAME = #{record.dmtCname,jdbcType=VARCHAR}");
        SET("DMT_ENAME = #{record.dmtEname,jdbcType=VARCHAR}");
        SET("GENIS_ADDR = #{record.genisAddr,jdbcType=VARCHAR}");
        SET("GENIS_ORG_ID = #{record.genisOrgId,jdbcType=VARCHAR}");
        SET("GENIS_DEPOSIT = #{record.genisDeposit,jdbcType=DOUBLE}");
        SET("TOTAL_COUNT = #{record.totalCount,jdbcType=DOUBLE}");
        SET("COLORED_FBC = #{record.coloredFbc,jdbcType=DOUBLE}");
        SET("EXCHANGE_FBC = #{record.exchangeFbc,jdbcType=DOUBLE}");
        SET("TURNOVER_COUNT = #{record.turnoverCount,jdbcType=DOUBLE}");
        SET("DATE_TIME = #{record.dateTime,jdbcType=TIMESTAMP}");
        SET("FUND_STATUS = #{record.fundStatus,jdbcType=VARCHAR}");
        SET("CREATED_TIME = #{record.createdTime,jdbcType=TIMESTAMP}");
        SET("UPDATED_TIME = #{record.updatedTime,jdbcType=TIMESTAMP}");
        SET("RESERVED1 = #{record.reserved1,jdbcType=VARCHAR}");
        SET("RESERVED2 = #{record.reserved2,jdbcType=VARCHAR}");
        
        WLTFundExample example = (WLTFundExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String updateByPrimaryKeySelective(WLTFund record) {
        BEGIN();
        UPDATE("WLT_FUND");
        
        if (record.getUserId() != null) {
            SET("USER_ID = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtCname() != null) {
            SET("DMT_CNAME = #{dmtCname,jdbcType=VARCHAR}");
        }
        
        if (record.getDmtEname() != null) {
            SET("DMT_ENAME = #{dmtEname,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisAddr() != null) {
            SET("GENIS_ADDR = #{genisAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisOrgId() != null) {
            SET("GENIS_ORG_ID = #{genisOrgId,jdbcType=VARCHAR}");
        }
        
        if (record.getGenisDeposit() != null) {
            SET("GENIS_DEPOSIT = #{genisDeposit,jdbcType=DOUBLE}");
        }
        
        if (record.getTotalCount() != null) {
            SET("TOTAL_COUNT = #{totalCount,jdbcType=DOUBLE}");
        }
        
        if (record.getColoredFbc() != null) {
            SET("COLORED_FBC = #{coloredFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getExchangeFbc() != null) {
            SET("EXCHANGE_FBC = #{exchangeFbc,jdbcType=DOUBLE}");
        }
        
        if (record.getTurnoverCount() != null) {
            SET("TURNOVER_COUNT = #{turnoverCount,jdbcType=DOUBLE}");
        }
        
        if (record.getDateTime() != null) {
            SET("DATE_TIME = #{dateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundStatus() != null) {
            SET("FUND_STATUS = #{fundStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedTime() != null) {
            SET("CREATED_TIME = #{createdTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedTime() != null) {
            SET("UPDATED_TIME = #{updatedTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getReserved1() != null) {
            SET("RESERVED1 = #{reserved1,jdbcType=VARCHAR}");
        }
        
        if (record.getReserved2() != null) {
            SET("RESERVED2 = #{reserved2,jdbcType=VARCHAR}");
        }
        
        WHERE("FUND_ID = #{fundId,jdbcType=VARCHAR}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_FUND
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    protected void applyWhere(WLTFundExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}