package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,collection
     */
    public CollectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,collection
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,collection
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,collection
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,collection
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,collection
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,collection
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,collection
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,collection
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,collection
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,collection
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,collection
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,collection
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,collection
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,collection
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：collection
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
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

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(Long value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(Long value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(Long value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(Long value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(Long value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<Long> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<Long> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(Long value1, Long value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(Long value1, Long value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNull() {
            addCriterion("collection_type is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIsNotNull() {
            addCriterion("collection_type is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeEqualTo(Integer value) {
            addCriterion("collection_type =", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotEqualTo(Integer value) {
            addCriterion("collection_type <>", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThan(Integer value) {
            addCriterion("collection_type >", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_type >=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThan(Integer value) {
            addCriterion("collection_type <", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("collection_type <=", value, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeIn(List<Integer> values) {
            addCriterion("collection_type in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotIn(List<Integer> values) {
            addCriterion("collection_type not in", values, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeBetween(Integer value1, Integer value2) {
            addCriterion("collection_type between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_type not between", value1, value2, "collectionType");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdIsNull() {
            addCriterion("collection_belong_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdIsNotNull() {
            addCriterion("collection_belong_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdEqualTo(Long value) {
            addCriterion("collection_belong_id =", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdNotEqualTo(Long value) {
            addCriterion("collection_belong_id <>", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdGreaterThan(Long value) {
            addCriterion("collection_belong_id >", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_belong_id >=", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdLessThan(Long value) {
            addCriterion("collection_belong_id <", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdLessThanOrEqualTo(Long value) {
            addCriterion("collection_belong_id <=", value, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdIn(List<Long> values) {
            addCriterion("collection_belong_id in", values, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdNotIn(List<Long> values) {
            addCriterion("collection_belong_id not in", values, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdBetween(Long value1, Long value2) {
            addCriterion("collection_belong_id between", value1, value2, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionBelongIdNotBetween(Long value1, Long value2) {
            addCriterion("collection_belong_id not between", value1, value2, "collectionBelongId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdIsNull() {
            addCriterion("collection_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdIsNotNull() {
            addCriterion("collection_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdEqualTo(Long value) {
            addCriterion("collection_user_id =", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdNotEqualTo(Long value) {
            addCriterion("collection_user_id <>", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdGreaterThan(Long value) {
            addCriterion("collection_user_id >", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("collection_user_id >=", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdLessThan(Long value) {
            addCriterion("collection_user_id <", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdLessThanOrEqualTo(Long value) {
            addCriterion("collection_user_id <=", value, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdIn(List<Long> values) {
            addCriterion("collection_user_id in", values, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdNotIn(List<Long> values) {
            addCriterion("collection_user_id not in", values, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdBetween(Long value1, Long value2) {
            addCriterion("collection_user_id between", value1, value2, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionUserIdNotBetween(Long value1, Long value2) {
            addCriterion("collection_user_id not between", value1, value2, "collectionUserId");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNull() {
            addCriterion("collection_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIsNotNull() {
            addCriterion("collection_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeEqualTo(Date value) {
            addCriterion("collection_time =", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotEqualTo(Date value) {
            addCriterion("collection_time <>", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThan(Date value) {
            addCriterion("collection_time >", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collection_time >=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThan(Date value) {
            addCriterion("collection_time <", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeLessThanOrEqualTo(Date value) {
            addCriterion("collection_time <=", value, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeIn(List<Date> values) {
            addCriterion("collection_time in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotIn(List<Date> values) {
            addCriterion("collection_time not in", values, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeBetween(Date value1, Date value2) {
            addCriterion("collection_time between", value1, value2, "collectionTime");
            return (Criteria) this;
        }

        public Criteria andCollectionTimeNotBetween(Date value1, Date value2) {
            addCriterion("collection_time not between", value1, value2, "collectionTime");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：collection
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：collection
     */
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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
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

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}