package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,focus
     */
    public FocusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,focus
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,focus
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,focus
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,focus
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,focus
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,focus
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,focus
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,focus
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,focus
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,focus
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,focus
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,focus
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,focus
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,focus
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：focus
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

        public Criteria andFocusIdIsNull() {
            addCriterion("focus_id is null");
            return (Criteria) this;
        }

        public Criteria andFocusIdIsNotNull() {
            addCriterion("focus_id is not null");
            return (Criteria) this;
        }

        public Criteria andFocusIdEqualTo(Long value) {
            addCriterion("focus_id =", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotEqualTo(Long value) {
            addCriterion("focus_id <>", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdGreaterThan(Long value) {
            addCriterion("focus_id >", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdGreaterThanOrEqualTo(Long value) {
            addCriterion("focus_id >=", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdLessThan(Long value) {
            addCriterion("focus_id <", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdLessThanOrEqualTo(Long value) {
            addCriterion("focus_id <=", value, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdIn(List<Long> values) {
            addCriterion("focus_id in", values, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotIn(List<Long> values) {
            addCriterion("focus_id not in", values, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdBetween(Long value1, Long value2) {
            addCriterion("focus_id between", value1, value2, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusIdNotBetween(Long value1, Long value2) {
            addCriterion("focus_id not between", value1, value2, "focusId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdIsNull() {
            addCriterion("focus_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdIsNotNull() {
            addCriterion("focus_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdEqualTo(Long value) {
            addCriterion("focus_user_id =", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdNotEqualTo(Long value) {
            addCriterion("focus_user_id <>", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdGreaterThan(Long value) {
            addCriterion("focus_user_id >", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("focus_user_id >=", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdLessThan(Long value) {
            addCriterion("focus_user_id <", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdLessThanOrEqualTo(Long value) {
            addCriterion("focus_user_id <=", value, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdIn(List<Long> values) {
            addCriterion("focus_user_id in", values, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdNotIn(List<Long> values) {
            addCriterion("focus_user_id not in", values, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdBetween(Long value1, Long value2) {
            addCriterion("focus_user_id between", value1, value2, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusUserIdNotBetween(Long value1, Long value2) {
            addCriterion("focus_user_id not between", value1, value2, "focusUserId");
            return (Criteria) this;
        }

        public Criteria andFocusStateIsNull() {
            addCriterion("focus_state is null");
            return (Criteria) this;
        }

        public Criteria andFocusStateIsNotNull() {
            addCriterion("focus_state is not null");
            return (Criteria) this;
        }

        public Criteria andFocusStateEqualTo(Integer value) {
            addCriterion("focus_state =", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateNotEqualTo(Integer value) {
            addCriterion("focus_state <>", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateGreaterThan(Integer value) {
            addCriterion("focus_state >", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_state >=", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateLessThan(Integer value) {
            addCriterion("focus_state <", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateLessThanOrEqualTo(Integer value) {
            addCriterion("focus_state <=", value, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateIn(List<Integer> values) {
            addCriterion("focus_state in", values, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateNotIn(List<Integer> values) {
            addCriterion("focus_state not in", values, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateBetween(Integer value1, Integer value2) {
            addCriterion("focus_state between", value1, value2, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusStateNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_state not between", value1, value2, "focusState");
            return (Criteria) this;
        }

        public Criteria andFocusTimeIsNull() {
            addCriterion("focus_time is null");
            return (Criteria) this;
        }

        public Criteria andFocusTimeIsNotNull() {
            addCriterion("focus_time is not null");
            return (Criteria) this;
        }

        public Criteria andFocusTimeEqualTo(Date value) {
            addCriterion("focus_time =", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeNotEqualTo(Date value) {
            addCriterion("focus_time <>", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeGreaterThan(Date value) {
            addCriterion("focus_time >", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("focus_time >=", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeLessThan(Date value) {
            addCriterion("focus_time <", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeLessThanOrEqualTo(Date value) {
            addCriterion("focus_time <=", value, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeIn(List<Date> values) {
            addCriterion("focus_time in", values, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeNotIn(List<Date> values) {
            addCriterion("focus_time not in", values, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeBetween(Date value1, Date value2) {
            addCriterion("focus_time between", value1, value2, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTimeNotBetween(Date value1, Date value2) {
            addCriterion("focus_time not between", value1, value2, "focusTime");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdIsNull() {
            addCriterion("focus_target_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdIsNotNull() {
            addCriterion("focus_target_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdEqualTo(Long value) {
            addCriterion("focus_target_user_id =", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdNotEqualTo(Long value) {
            addCriterion("focus_target_user_id <>", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdGreaterThan(Long value) {
            addCriterion("focus_target_user_id >", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("focus_target_user_id >=", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdLessThan(Long value) {
            addCriterion("focus_target_user_id <", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdLessThanOrEqualTo(Long value) {
            addCriterion("focus_target_user_id <=", value, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdIn(List<Long> values) {
            addCriterion("focus_target_user_id in", values, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdNotIn(List<Long> values) {
            addCriterion("focus_target_user_id not in", values, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdBetween(Long value1, Long value2) {
            addCriterion("focus_target_user_id between", value1, value2, "focusTargetUserId");
            return (Criteria) this;
        }

        public Criteria andFocusTargetUserIdNotBetween(Long value1, Long value2) {
            addCriterion("focus_target_user_id not between", value1, value2, "focusTargetUserId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：focus
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：focus
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