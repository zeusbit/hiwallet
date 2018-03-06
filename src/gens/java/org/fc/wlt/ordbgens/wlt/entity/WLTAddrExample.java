package org.fc.wlt.ordbgens.wlt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class WLTAddrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected boolean forUpdate;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public WLTAddrExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        this.offset= 0;
        this.limit= Integer.MAX_VALUE;
        this.sumCol=null;
        this.groupSelClause=null;
        this.groupByClause=null;
        this.forUpdate=false;
    }

    public void setOffset(int offset) {
         this.offset = offset;
    }

    public int getOffset() {
          return offset;
    }

    public void setLimit(int limit) {
         this.limit = limit;
    }

    public int getLimit() {
          return limit;
    }

    public void setSumCol(String sumCol) {
         this.sumCol = sumCol;
    }

    public String getSumCol() {
          return sumCol;
    }

    public void setGroupSelClause(String groupSelClause) {
         this.groupSelClause = groupSelClause;
    }

    public String getGroupSelClause() {
          return groupSelClause;
    }

    public void setForUpdate(boolean forUpdate) {
         this.forUpdate = forUpdate;
    }

    public boolean isForUpdate() {
          return forUpdate;
    }

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Data
    public abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddrIdIsNull() {
            addCriterion("ADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddrIdIsNotNull() {
            addCriterion("ADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddrIdEqualTo(String value) {
            addCriterion("ADDR_ID =", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotEqualTo(String value) {
            addCriterion("ADDR_ID <>", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThan(String value) {
            addCriterion("ADDR_ID >", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_ID >=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThan(String value) {
            addCriterion("ADDR_ID <", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLessThanOrEqualTo(String value) {
            addCriterion("ADDR_ID <=", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdLike(String value) {
            addCriterion("ADDR_ID like", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotLike(String value) {
            addCriterion("ADDR_ID not like", value, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdIn(List<String> values) {
            addCriterion("ADDR_ID in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotIn(List<String> values) {
            addCriterion("ADDR_ID not in", values, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdBetween(String value1, String value2) {
            addCriterion("ADDR_ID between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andAddrIdNotBetween(String value1, String value2) {
            addCriterion("ADDR_ID not between", value1, value2, "addrId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHexAddrIsNull() {
            addCriterion("HEX_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andHexAddrIsNotNull() {
            addCriterion("HEX_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHexAddrEqualTo(String value) {
            addCriterion("HEX_ADDR =", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrNotEqualTo(String value) {
            addCriterion("HEX_ADDR <>", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrGreaterThan(String value) {
            addCriterion("HEX_ADDR >", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrGreaterThanOrEqualTo(String value) {
            addCriterion("HEX_ADDR >=", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrLessThan(String value) {
            addCriterion("HEX_ADDR <", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrLessThanOrEqualTo(String value) {
            addCriterion("HEX_ADDR <=", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrLike(String value) {
            addCriterion("HEX_ADDR like", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrNotLike(String value) {
            addCriterion("HEX_ADDR not like", value, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrIn(List<String> values) {
            addCriterion("HEX_ADDR in", values, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrNotIn(List<String> values) {
            addCriterion("HEX_ADDR not in", values, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrBetween(String value1, String value2) {
            addCriterion("HEX_ADDR between", value1, value2, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andHexAddrNotBetween(String value1, String value2) {
            addCriterion("HEX_ADDR not between", value1, value2, "hexAddr");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("PUBLIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("PUBLIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("PUBLIC_KEY =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("PUBLIC_KEY <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("PUBLIC_KEY >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("PUBLIC_KEY <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("PUBLIC_KEY like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("PUBLIC_KEY not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("PUBLIC_KEY in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("PUBLIC_KEY not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashIsNull() {
            addCriterion("PUBLIC_KEY_HASH is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashIsNotNull() {
            addCriterion("PUBLIC_KEY_HASH is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashEqualTo(String value) {
            addCriterion("PUBLIC_KEY_HASH =", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashNotEqualTo(String value) {
            addCriterion("PUBLIC_KEY_HASH <>", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashGreaterThan(String value) {
            addCriterion("PUBLIC_KEY_HASH >", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY_HASH >=", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashLessThan(String value) {
            addCriterion("PUBLIC_KEY_HASH <", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY_HASH <=", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashLike(String value) {
            addCriterion("PUBLIC_KEY_HASH like", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashNotLike(String value) {
            addCriterion("PUBLIC_KEY_HASH not like", value, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashIn(List<String> values) {
            addCriterion("PUBLIC_KEY_HASH in", values, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashNotIn(List<String> values) {
            addCriterion("PUBLIC_KEY_HASH not in", values, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY_HASH between", value1, value2, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY_HASH not between", value1, value2, "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNull() {
            addCriterion("PRIVATE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNotNull() {
            addCriterion("PRIVATE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyEqualTo(String value) {
            addCriterion("PRIVATE_KEY =", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotEqualTo(String value) {
            addCriterion("PRIVATE_KEY <>", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThan(String value) {
            addCriterion("PRIVATE_KEY >", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATE_KEY >=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThan(String value) {
            addCriterion("PRIVATE_KEY <", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("PRIVATE_KEY <=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLike(String value) {
            addCriterion("PRIVATE_KEY like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotLike(String value) {
            addCriterion("PRIVATE_KEY not like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIn(List<String> values) {
            addCriterion("PRIVATE_KEY in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotIn(List<String> values) {
            addCriterion("PRIVATE_KEY not in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyBetween(String value1, String value2) {
            addCriterion("PRIVATE_KEY between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("PRIVATE_KEY not between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andAddrStatusIsNull() {
            addCriterion("ADDR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAddrStatusIsNotNull() {
            addCriterion("ADDR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAddrStatusEqualTo(String value) {
            addCriterion("ADDR_STATUS =", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusNotEqualTo(String value) {
            addCriterion("ADDR_STATUS <>", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusGreaterThan(String value) {
            addCriterion("ADDR_STATUS >", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_STATUS >=", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusLessThan(String value) {
            addCriterion("ADDR_STATUS <", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusLessThanOrEqualTo(String value) {
            addCriterion("ADDR_STATUS <=", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusLike(String value) {
            addCriterion("ADDR_STATUS like", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusNotLike(String value) {
            addCriterion("ADDR_STATUS not like", value, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusIn(List<String> values) {
            addCriterion("ADDR_STATUS in", values, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusNotIn(List<String> values) {
            addCriterion("ADDR_STATUS not in", values, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusBetween(String value1, String value2) {
            addCriterion("ADDR_STATUS between", value1, value2, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andAddrStatusNotBetween(String value1, String value2) {
            addCriterion("ADDR_STATUS not between", value1, value2, "addrStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("RESERVED1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("RESERVED1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("RESERVED1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("RESERVED1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("RESERVED1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("RESERVED1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("RESERVED1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("RESERVED1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("RESERVED1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("RESERVED1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("RESERVED1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("RESERVED1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("RESERVED1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("RESERVED2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("RESERVED2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("RESERVED2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("RESERVED2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("RESERVED2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("RESERVED2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("RESERVED2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("RESERVED2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("RESERVED2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("RESERVED2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("RESERVED2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("RESERVED2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("RESERVED2 not between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andAddrIdLikeInsensitive(String value) {
            addCriterion("upper(ADDR_ID) like", value.toUpperCase(), "addrId");
            return (Criteria) this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(USER_ID) like", value.toUpperCase(), "userId");
            return (Criteria) this;
        }

        public Criteria andHexAddrLikeInsensitive(String value) {
            addCriterion("upper(HEX_ADDR) like", value.toUpperCase(), "hexAddr");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLikeInsensitive(String value) {
            addCriterion("upper(PUBLIC_KEY) like", value.toUpperCase(), "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyHashLikeInsensitive(String value) {
            addCriterion("upper(PUBLIC_KEY_HASH) like", value.toUpperCase(), "publicKeyHash");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLikeInsensitive(String value) {
            addCriterion("upper(PRIVATE_KEY) like", value.toUpperCase(), "privateKey");
            return (Criteria) this;
        }

        public Criteria andAddrStatusLikeInsensitive(String value) {
            addCriterion("upper(ADDR_STATUS) like", value.toUpperCase(), "addrStatus");
            return (Criteria) this;
        }

        public Criteria andReserved1LikeInsensitive(String value) {
            addCriterion("upper(RESERVED1) like", value.toUpperCase(), "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2LikeInsensitive(String value) {
            addCriterion("upper(RESERVED2) like", value.toUpperCase(), "reserved2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WLT_ADDR
     *
     * @mbggenerated do_not_delete_during_merge Thu Feb 01 14:31:13 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WLT_ADDR
     *
     * @mbggenerated Thu Feb 01 14:31:13 CST 2018
     */
    @Data
    @NoArgsConstructor
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}