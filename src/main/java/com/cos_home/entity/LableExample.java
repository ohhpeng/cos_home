package com.cos_home.entity;

import java.util.ArrayList;
import java.util.List;

public class LableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,lable
     */
    public LableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,lable
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,lable
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,lable
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,lable
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,lable
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,lable
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,lable
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,lable
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,lable
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,lable
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,lable
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,lable
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,lable
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,lable
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：lable
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

        public Criteria andDislableIdIsNull() {
            addCriterion("dislable_id is null");
            return (Criteria) this;
        }

        public Criteria andDislableIdIsNotNull() {
            addCriterion("dislable_id is not null");
            return (Criteria) this;
        }

        public Criteria andDislableIdEqualTo(Long value) {
            addCriterion("dislable_id =", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdNotEqualTo(Long value) {
            addCriterion("dislable_id <>", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdGreaterThan(Long value) {
            addCriterion("dislable_id >", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dislable_id >=", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdLessThan(Long value) {
            addCriterion("dislable_id <", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdLessThanOrEqualTo(Long value) {
            addCriterion("dislable_id <=", value, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdIn(List<Long> values) {
            addCriterion("dislable_id in", values, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdNotIn(List<Long> values) {
            addCriterion("dislable_id not in", values, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdBetween(Long value1, Long value2) {
            addCriterion("dislable_id between", value1, value2, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableIdNotBetween(Long value1, Long value2) {
            addCriterion("dislable_id not between", value1, value2, "dislableId");
            return (Criteria) this;
        }

        public Criteria andDislableNameIsNull() {
            addCriterion("dislable_name is null");
            return (Criteria) this;
        }

        public Criteria andDislableNameIsNotNull() {
            addCriterion("dislable_name is not null");
            return (Criteria) this;
        }

        public Criteria andDislableNameEqualTo(String value) {
            addCriterion("dislable_name =", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameNotEqualTo(String value) {
            addCriterion("dislable_name <>", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameGreaterThan(String value) {
            addCriterion("dislable_name >", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameGreaterThanOrEqualTo(String value) {
            addCriterion("dislable_name >=", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameLessThan(String value) {
            addCriterion("dislable_name <", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameLessThanOrEqualTo(String value) {
            addCriterion("dislable_name <=", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameLike(String value) {
            addCriterion("dislable_name like", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameNotLike(String value) {
            addCriterion("dislable_name not like", value, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameIn(List<String> values) {
            addCriterion("dislable_name in", values, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameNotIn(List<String> values) {
            addCriterion("dislable_name not in", values, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameBetween(String value1, String value2) {
            addCriterion("dislable_name between", value1, value2, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableNameNotBetween(String value1, String value2) {
            addCriterion("dislable_name not between", value1, value2, "dislableName");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdIsNull() {
            addCriterion("dislable_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdIsNotNull() {
            addCriterion("dislable_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdEqualTo(Long value) {
            addCriterion("dislable_user_id =", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdNotEqualTo(Long value) {
            addCriterion("dislable_user_id <>", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdGreaterThan(Long value) {
            addCriterion("dislable_user_id >", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dislable_user_id >=", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdLessThan(Long value) {
            addCriterion("dislable_user_id <", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdLessThanOrEqualTo(Long value) {
            addCriterion("dislable_user_id <=", value, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdIn(List<Long> values) {
            addCriterion("dislable_user_id in", values, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdNotIn(List<Long> values) {
            addCriterion("dislable_user_id not in", values, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdBetween(Long value1, Long value2) {
            addCriterion("dislable_user_id between", value1, value2, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableUserIdNotBetween(Long value1, Long value2) {
            addCriterion("dislable_user_id not between", value1, value2, "dislableUserId");
            return (Criteria) this;
        }

        public Criteria andDislableTypeIsNull() {
            addCriterion("dislable_type is null");
            return (Criteria) this;
        }

        public Criteria andDislableTypeIsNotNull() {
            addCriterion("dislable_type is not null");
            return (Criteria) this;
        }

        public Criteria andDislableTypeEqualTo(Integer value) {
            addCriterion("dislable_type =", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeNotEqualTo(Integer value) {
            addCriterion("dislable_type <>", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeGreaterThan(Integer value) {
            addCriterion("dislable_type >", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dislable_type >=", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeLessThan(Integer value) {
            addCriterion("dislable_type <", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dislable_type <=", value, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeIn(List<Integer> values) {
            addCriterion("dislable_type in", values, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeNotIn(List<Integer> values) {
            addCriterion("dislable_type not in", values, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeBetween(Integer value1, Integer value2) {
            addCriterion("dislable_type between", value1, value2, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dislable_type not between", value1, value2, "dislableType");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdIsNull() {
            addCriterion("dislable_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdIsNotNull() {
            addCriterion("dislable_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdEqualTo(Long value) {
            addCriterion("dislable_admin_id =", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdNotEqualTo(Long value) {
            addCriterion("dislable_admin_id <>", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdGreaterThan(Long value) {
            addCriterion("dislable_admin_id >", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dislable_admin_id >=", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdLessThan(Long value) {
            addCriterion("dislable_admin_id <", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("dislable_admin_id <=", value, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdIn(List<Long> values) {
            addCriterion("dislable_admin_id in", values, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdNotIn(List<Long> values) {
            addCriterion("dislable_admin_id not in", values, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdBetween(Long value1, Long value2) {
            addCriterion("dislable_admin_id between", value1, value2, "dislableAdminId");
            return (Criteria) this;
        }

        public Criteria andDislableAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("dislable_admin_id not between", value1, value2, "dislableAdminId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：lable
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：lable
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