package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,orders
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,orders
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,orders
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,orders
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,orders
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,orders
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,orders
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,orders
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,orders
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,orders
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,orders
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,orders
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,orders
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,orders
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,orders
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：orders
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Long value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Long value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Long value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Long value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Long> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Long> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Long value1, Long value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdIsNull() {
            addCriterion("order_service_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdIsNotNull() {
            addCriterion("order_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdEqualTo(Long value) {
            addCriterion("order_service_id =", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdNotEqualTo(Long value) {
            addCriterion("order_service_id <>", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdGreaterThan(Long value) {
            addCriterion("order_service_id >", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_service_id >=", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdLessThan(Long value) {
            addCriterion("order_service_id <", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("order_service_id <=", value, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdIn(List<Long> values) {
            addCriterion("order_service_id in", values, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdNotIn(List<Long> values) {
            addCriterion("order_service_id not in", values, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdBetween(Long value1, Long value2) {
            addCriterion("order_service_id between", value1, value2, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("order_service_id not between", value1, value2, "orderServiceId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Long value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Long value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Long value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Long value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Long> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Long> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Long value1, Long value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNull() {
            addCriterion("order_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNotNull() {
            addCriterion("order_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeEqualTo(Date value) {
            addCriterion("order_createtime =", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotEqualTo(Date value) {
            addCriterion("order_createtime <>", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThan(Date value) {
            addCriterion("order_createtime >", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_createtime >=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThan(Date value) {
            addCriterion("order_createtime <", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("order_createtime <=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIn(List<Date> values) {
            addCriterion("order_createtime in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotIn(List<Date> values) {
            addCriterion("order_createtime not in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeBetween(Date value1, Date value2) {
            addCriterion("order_createtime between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("order_createtime not between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNull() {
            addCriterion("order_content is null");
            return (Criteria) this;
        }

        public Criteria andOrderContentIsNotNull() {
            addCriterion("order_content is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContentEqualTo(String value) {
            addCriterion("order_content =", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotEqualTo(String value) {
            addCriterion("order_content <>", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThan(String value) {
            addCriterion("order_content >", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentGreaterThanOrEqualTo(String value) {
            addCriterion("order_content >=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThan(String value) {
            addCriterion("order_content <", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLessThanOrEqualTo(String value) {
            addCriterion("order_content <=", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentLike(String value) {
            addCriterion("order_content like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotLike(String value) {
            addCriterion("order_content not like", value, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentIn(List<String> values) {
            addCriterion("order_content in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotIn(List<String> values) {
            addCriterion("order_content not in", values, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentBetween(String value1, String value2) {
            addCriterion("order_content between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderContentNotBetween(String value1, String value2) {
            addCriterion("order_content not between", value1, value2, "orderContent");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeIsNull() {
            addCriterion("order_presettime is null");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeIsNotNull() {
            addCriterion("order_presettime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeEqualTo(Date value) {
            addCriterion("order_presettime =", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeNotEqualTo(Date value) {
            addCriterion("order_presettime <>", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeGreaterThan(Date value) {
            addCriterion("order_presettime >", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_presettime >=", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeLessThan(Date value) {
            addCriterion("order_presettime <", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeLessThanOrEqualTo(Date value) {
            addCriterion("order_presettime <=", value, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeIn(List<Date> values) {
            addCriterion("order_presettime in", values, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeNotIn(List<Date> values) {
            addCriterion("order_presettime not in", values, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeBetween(Date value1, Date value2) {
            addCriterion("order_presettime between", value1, value2, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderPresettimeNotBetween(Date value1, Date value2) {
            addCriterion("order_presettime not between", value1, value2, "orderPresettime");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrIsNull() {
            addCriterion("order_serviceaddr is null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrIsNotNull() {
            addCriterion("order_serviceaddr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrEqualTo(String value) {
            addCriterion("order_serviceaddr =", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrNotEqualTo(String value) {
            addCriterion("order_serviceaddr <>", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrGreaterThan(String value) {
            addCriterion("order_serviceaddr >", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrGreaterThanOrEqualTo(String value) {
            addCriterion("order_serviceaddr >=", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrLessThan(String value) {
            addCriterion("order_serviceaddr <", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrLessThanOrEqualTo(String value) {
            addCriterion("order_serviceaddr <=", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrLike(String value) {
            addCriterion("order_serviceaddr like", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrNotLike(String value) {
            addCriterion("order_serviceaddr not like", value, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrIn(List<String> values) {
            addCriterion("order_serviceaddr in", values, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrNotIn(List<String> values) {
            addCriterion("order_serviceaddr not in", values, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrBetween(String value1, String value2) {
            addCriterion("order_serviceaddr between", value1, value2, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderServiceaddrNotBetween(String value1, String value2) {
            addCriterion("order_serviceaddr not between", value1, value2, "orderServiceaddr");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIsNull() {
            addCriterion("order_is_del is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIsNotNull() {
            addCriterion("order_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelEqualTo(Integer value) {
            addCriterion("order_is_del =", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotEqualTo(Integer value) {
            addCriterion("order_is_del <>", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelGreaterThan(Integer value) {
            addCriterion("order_is_del >", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_is_del >=", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelLessThan(Integer value) {
            addCriterion("order_is_del <", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("order_is_del <=", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIn(List<Integer> values) {
            addCriterion("order_is_del in", values, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotIn(List<Integer> values) {
            addCriterion("order_is_del not in", values, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelBetween(Integer value1, Integer value2) {
            addCriterion("order_is_del between", value1, value2, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("order_is_del not between", value1, value2, "orderIsDel");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：orders
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：orders
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