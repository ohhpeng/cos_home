package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,zan
     */
    public ZanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,zan
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,zan
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,zan
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,zan
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,zan
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,zan
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,zan
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,zan
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,zan
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,zan
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,zan
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,zan
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,zan
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,zan
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：zan
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

        public Criteria andZanIdIsNull() {
            addCriterion("zan_id is null");
            return (Criteria) this;
        }

        public Criteria andZanIdIsNotNull() {
            addCriterion("zan_id is not null");
            return (Criteria) this;
        }

        public Criteria andZanIdEqualTo(Long value) {
            addCriterion("zan_id =", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdNotEqualTo(Long value) {
            addCriterion("zan_id <>", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdGreaterThan(Long value) {
            addCriterion("zan_id >", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zan_id >=", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdLessThan(Long value) {
            addCriterion("zan_id <", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdLessThanOrEqualTo(Long value) {
            addCriterion("zan_id <=", value, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdIn(List<Long> values) {
            addCriterion("zan_id in", values, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdNotIn(List<Long> values) {
            addCriterion("zan_id not in", values, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdBetween(Long value1, Long value2) {
            addCriterion("zan_id between", value1, value2, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanIdNotBetween(Long value1, Long value2) {
            addCriterion("zan_id not between", value1, value2, "zanId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdIsNull() {
            addCriterion("zan_user_id is null");
            return (Criteria) this;
        }

        public Criteria andZanUserIdIsNotNull() {
            addCriterion("zan_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andZanUserIdEqualTo(Long value) {
            addCriterion("zan_user_id =", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdNotEqualTo(Long value) {
            addCriterion("zan_user_id <>", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdGreaterThan(Long value) {
            addCriterion("zan_user_id >", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zan_user_id >=", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdLessThan(Long value) {
            addCriterion("zan_user_id <", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdLessThanOrEqualTo(Long value) {
            addCriterion("zan_user_id <=", value, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdIn(List<Long> values) {
            addCriterion("zan_user_id in", values, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdNotIn(List<Long> values) {
            addCriterion("zan_user_id not in", values, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdBetween(Long value1, Long value2) {
            addCriterion("zan_user_id between", value1, value2, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanUserIdNotBetween(Long value1, Long value2) {
            addCriterion("zan_user_id not between", value1, value2, "zanUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdIsNull() {
            addCriterion("zan_target_user_id is null");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdIsNotNull() {
            addCriterion("zan_target_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdEqualTo(Long value) {
            addCriterion("zan_target_user_id =", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdNotEqualTo(Long value) {
            addCriterion("zan_target_user_id <>", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdGreaterThan(Long value) {
            addCriterion("zan_target_user_id >", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("zan_target_user_id >=", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdLessThan(Long value) {
            addCriterion("zan_target_user_id <", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdLessThanOrEqualTo(Long value) {
            addCriterion("zan_target_user_id <=", value, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdIn(List<Long> values) {
            addCriterion("zan_target_user_id in", values, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdNotIn(List<Long> values) {
            addCriterion("zan_target_user_id not in", values, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdBetween(Long value1, Long value2) {
            addCriterion("zan_target_user_id between", value1, value2, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanTargetUserIdNotBetween(Long value1, Long value2) {
            addCriterion("zan_target_user_id not between", value1, value2, "zanTargetUserId");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeIsNull() {
            addCriterion("zan_create_time is null");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeIsNotNull() {
            addCriterion("zan_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeEqualTo(Date value) {
            addCriterion("zan_create_time =", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeNotEqualTo(Date value) {
            addCriterion("zan_create_time <>", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeGreaterThan(Date value) {
            addCriterion("zan_create_time >", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zan_create_time >=", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeLessThan(Date value) {
            addCriterion("zan_create_time <", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("zan_create_time <=", value, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeIn(List<Date> values) {
            addCriterion("zan_create_time in", values, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeNotIn(List<Date> values) {
            addCriterion("zan_create_time not in", values, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeBetween(Date value1, Date value2) {
            addCriterion("zan_create_time between", value1, value2, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("zan_create_time not between", value1, value2, "zanCreateTime");
            return (Criteria) this;
        }

        public Criteria andZanStateIsNull() {
            addCriterion("zan_state is null");
            return (Criteria) this;
        }

        public Criteria andZanStateIsNotNull() {
            addCriterion("zan_state is not null");
            return (Criteria) this;
        }

        public Criteria andZanStateEqualTo(Integer value) {
            addCriterion("zan_state =", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateNotEqualTo(Integer value) {
            addCriterion("zan_state <>", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateGreaterThan(Integer value) {
            addCriterion("zan_state >", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan_state >=", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateLessThan(Integer value) {
            addCriterion("zan_state <", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateLessThanOrEqualTo(Integer value) {
            addCriterion("zan_state <=", value, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateIn(List<Integer> values) {
            addCriterion("zan_state in", values, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateNotIn(List<Integer> values) {
            addCriterion("zan_state not in", values, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateBetween(Integer value1, Integer value2) {
            addCriterion("zan_state between", value1, value2, "zanState");
            return (Criteria) this;
        }

        public Criteria andZanStateNotBetween(Integer value1, Integer value2) {
            addCriterion("zan_state not between", value1, value2, "zanState");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：zan
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：zan
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