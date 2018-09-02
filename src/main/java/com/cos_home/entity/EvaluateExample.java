package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,evaluate
     */
    public EvaluateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,evaluate
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,evaluate
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,evaluate
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,evaluate
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,evaluate
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,evaluate
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,evaluate
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,evaluate
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,evaluate
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,evaluate
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,evaluate
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,evaluate
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,evaluate
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,evaluate
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：evaluate
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

        public Criteria andEvaluateIdIsNull() {
            addCriterion("evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIsNotNull() {
            addCriterion("evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdEqualTo(Long value) {
            addCriterion("evaluate_id =", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotEqualTo(Long value) {
            addCriterion("evaluate_id <>", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThan(Long value) {
            addCriterion("evaluate_id >", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_id >=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThan(Long value) {
            addCriterion("evaluate_id <", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_id <=", value, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdIn(List<Long> values) {
            addCriterion("evaluate_id in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotIn(List<Long> values) {
            addCriterion("evaluate_id not in", values, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_id between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_id not between", value1, value2, "evaluateId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdIsNull() {
            addCriterion("evaluate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdIsNotNull() {
            addCriterion("evaluate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdEqualTo(Long value) {
            addCriterion("evaluate_user_id =", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdNotEqualTo(Long value) {
            addCriterion("evaluate_user_id <>", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdGreaterThan(Long value) {
            addCriterion("evaluate_user_id >", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_user_id >=", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdLessThan(Long value) {
            addCriterion("evaluate_user_id <", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_user_id <=", value, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdIn(List<Long> values) {
            addCriterion("evaluate_user_id in", values, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdNotIn(List<Long> values) {
            addCriterion("evaluate_user_id not in", values, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_user_id between", value1, value2, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_user_id not between", value1, value2, "evaluateUserId");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNull() {
            addCriterion("evaluate_content is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIsNotNull() {
            addCriterion("evaluate_content is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentEqualTo(String value) {
            addCriterion("evaluate_content =", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotEqualTo(String value) {
            addCriterion("evaluate_content <>", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThan(String value) {
            addCriterion("evaluate_content >", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_content >=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThan(String value) {
            addCriterion("evaluate_content <", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLessThanOrEqualTo(String value) {
            addCriterion("evaluate_content <=", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentLike(String value) {
            addCriterion("evaluate_content like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotLike(String value) {
            addCriterion("evaluate_content not like", value, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentIn(List<String> values) {
            addCriterion("evaluate_content in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotIn(List<String> values) {
            addCriterion("evaluate_content not in", values, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentBetween(String value1, String value2) {
            addCriterion("evaluate_content between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateContentNotBetween(String value1, String value2) {
            addCriterion("evaluate_content not between", value1, value2, "evaluateContent");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeEqualTo(Date value) {
            addCriterion("evaluate_time =", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotEqualTo(Date value) {
            addCriterion("evaluate_time <>", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThan(Date value) {
            addCriterion("evaluate_time >", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluate_time >=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThan(Date value) {
            addCriterion("evaluate_time <", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluate_time <=", value, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeIn(List<Date> values) {
            addCriterion("evaluate_time in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotIn(List<Date> values) {
            addCriterion("evaluate_time not in", values, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeBetween(Date value1, Date value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluateTime");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdIsNull() {
            addCriterion("evaluate_works_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdIsNotNull() {
            addCriterion("evaluate_works_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdEqualTo(Long value) {
            addCriterion("evaluate_works_id =", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdNotEqualTo(Long value) {
            addCriterion("evaluate_works_id <>", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdGreaterThan(Long value) {
            addCriterion("evaluate_works_id >", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_works_id >=", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdLessThan(Long value) {
            addCriterion("evaluate_works_id <", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_works_id <=", value, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdIn(List<Long> values) {
            addCriterion("evaluate_works_id in", values, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdNotIn(List<Long> values) {
            addCriterion("evaluate_works_id not in", values, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_works_id between", value1, value2, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateWorksIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_works_id not between", value1, value2, "evaluateWorksId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdIsNull() {
            addCriterion("evaluate_view_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdIsNotNull() {
            addCriterion("evaluate_view_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdEqualTo(Long value) {
            addCriterion("evaluate_view_id =", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdNotEqualTo(Long value) {
            addCriterion("evaluate_view_id <>", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdGreaterThan(Long value) {
            addCriterion("evaluate_view_id >", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_view_id >=", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdLessThan(Long value) {
            addCriterion("evaluate_view_id <", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_view_id <=", value, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdIn(List<Long> values) {
            addCriterion("evaluate_view_id in", values, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdNotIn(List<Long> values) {
            addCriterion("evaluate_view_id not in", values, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_view_id between", value1, value2, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateViewIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_view_id not between", value1, value2, "evaluateViewId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdIsNull() {
            addCriterion("evaluate_dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdIsNotNull() {
            addCriterion("evaluate_dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdEqualTo(Long value) {
            addCriterion("evaluate_dynamic_id =", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdNotEqualTo(Long value) {
            addCriterion("evaluate_dynamic_id <>", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdGreaterThan(Long value) {
            addCriterion("evaluate_dynamic_id >", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_dynamic_id >=", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdLessThan(Long value) {
            addCriterion("evaluate_dynamic_id <", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_dynamic_id <=", value, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdIn(List<Long> values) {
            addCriterion("evaluate_dynamic_id in", values, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdNotIn(List<Long> values) {
            addCriterion("evaluate_dynamic_id not in", values, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_dynamic_id between", value1, value2, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDynamicIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_dynamic_id not between", value1, value2, "evaluateDynamicId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdIsNull() {
            addCriterion("evaluate_discuss_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdIsNotNull() {
            addCriterion("evaluate_discuss_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdEqualTo(Long value) {
            addCriterion("evaluate_discuss_id =", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdNotEqualTo(Long value) {
            addCriterion("evaluate_discuss_id <>", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdGreaterThan(Long value) {
            addCriterion("evaluate_discuss_id >", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_discuss_id >=", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdLessThan(Long value) {
            addCriterion("evaluate_discuss_id <", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_discuss_id <=", value, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdIn(List<Long> values) {
            addCriterion("evaluate_discuss_id in", values, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdNotIn(List<Long> values) {
            addCriterion("evaluate_discuss_id not in", values, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_discuss_id between", value1, value2, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateDiscussIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_discuss_id not between", value1, value2, "evaluateDiscussId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdIsNull() {
            addCriterion("evaluate_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdIsNotNull() {
            addCriterion("evaluate_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdEqualTo(Long value) {
            addCriterion("evaluate_activity_id =", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdNotEqualTo(Long value) {
            addCriterion("evaluate_activity_id <>", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdGreaterThan(Long value) {
            addCriterion("evaluate_activity_id >", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_activity_id >=", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdLessThan(Long value) {
            addCriterion("evaluate_activity_id <", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_activity_id <=", value, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdIn(List<Long> values) {
            addCriterion("evaluate_activity_id in", values, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdNotIn(List<Long> values) {
            addCriterion("evaluate_activity_id not in", values, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_activity_id between", value1, value2, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_activity_id not between", value1, value2, "evaluateActivityId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdIsNull() {
            addCriterion("evaluate_order_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdIsNotNull() {
            addCriterion("evaluate_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdEqualTo(Long value) {
            addCriterion("evaluate_order_id =", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdNotEqualTo(Long value) {
            addCriterion("evaluate_order_id <>", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdGreaterThan(Long value) {
            addCriterion("evaluate_order_id >", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_order_id >=", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdLessThan(Long value) {
            addCriterion("evaluate_order_id <", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_order_id <=", value, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdIn(List<Long> values) {
            addCriterion("evaluate_order_id in", values, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdNotIn(List<Long> values) {
            addCriterion("evaluate_order_id not in", values, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_order_id between", value1, value2, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_order_id not between", value1, value2, "evaluateOrderId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdIsNull() {
            addCriterion("evaluate_target_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdIsNotNull() {
            addCriterion("evaluate_target_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdEqualTo(Long value) {
            addCriterion("evaluate_target_id =", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdNotEqualTo(Long value) {
            addCriterion("evaluate_target_id <>", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdGreaterThan(Long value) {
            addCriterion("evaluate_target_id >", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("evaluate_target_id >=", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdLessThan(Long value) {
            addCriterion("evaluate_target_id <", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("evaluate_target_id <=", value, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdIn(List<Long> values) {
            addCriterion("evaluate_target_id in", values, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdNotIn(List<Long> values) {
            addCriterion("evaluate_target_id not in", values, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdBetween(Long value1, Long value2) {
            addCriterion("evaluate_target_id between", value1, value2, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("evaluate_target_id not between", value1, value2, "evaluateTargetId");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameIsNull() {
            addCriterion("evaluate_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameIsNotNull() {
            addCriterion("evaluate_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameEqualTo(String value) {
            addCriterion("evaluate_user_name =", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameNotEqualTo(String value) {
            addCriterion("evaluate_user_name <>", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameGreaterThan(String value) {
            addCriterion("evaluate_user_name >", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_user_name >=", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameLessThan(String value) {
            addCriterion("evaluate_user_name <", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameLessThanOrEqualTo(String value) {
            addCriterion("evaluate_user_name <=", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameLike(String value) {
            addCriterion("evaluate_user_name like", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameNotLike(String value) {
            addCriterion("evaluate_user_name not like", value, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameIn(List<String> values) {
            addCriterion("evaluate_user_name in", values, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameNotIn(List<String> values) {
            addCriterion("evaluate_user_name not in", values, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameBetween(String value1, String value2) {
            addCriterion("evaluate_user_name between", value1, value2, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserNameNotBetween(String value1, String value2) {
            addCriterion("evaluate_user_name not between", value1, value2, "evaluateUserName");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbIsNull() {
            addCriterion("evaluate_user_headThumb is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbIsNotNull() {
            addCriterion("evaluate_user_headThumb is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbEqualTo(String value) {
            addCriterion("evaluate_user_headThumb =", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbNotEqualTo(String value) {
            addCriterion("evaluate_user_headThumb <>", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbGreaterThan(String value) {
            addCriterion("evaluate_user_headThumb >", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate_user_headThumb >=", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbLessThan(String value) {
            addCriterion("evaluate_user_headThumb <", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbLessThanOrEqualTo(String value) {
            addCriterion("evaluate_user_headThumb <=", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbLike(String value) {
            addCriterion("evaluate_user_headThumb like", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbNotLike(String value) {
            addCriterion("evaluate_user_headThumb not like", value, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbIn(List<String> values) {
            addCriterion("evaluate_user_headThumb in", values, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbNotIn(List<String> values) {
            addCriterion("evaluate_user_headThumb not in", values, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbBetween(String value1, String value2) {
            addCriterion("evaluate_user_headThumb between", value1, value2, "evaluateUserHeadthumb");
            return (Criteria) this;
        }

        public Criteria andEvaluateUserHeadthumbNotBetween(String value1, String value2) {
            addCriterion("evaluate_user_headThumb not between", value1, value2, "evaluateUserHeadthumb");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：evaluate
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：evaluate
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