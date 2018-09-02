package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscussExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,discuss
     */
    public DiscussExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,discuss
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,discuss
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,discuss
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,discuss
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,discuss
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,discuss
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,discuss
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,discuss
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,discuss
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,discuss
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,discuss
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,discuss
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,discuss
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,discuss
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：discuss
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

        public Criteria andDiscussIdIsNull() {
            addCriterion("discuss_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIsNotNull() {
            addCriterion("discuss_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussIdEqualTo(Long value) {
            addCriterion("discuss_id =", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotEqualTo(Long value) {
            addCriterion("discuss_id <>", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThan(Long value) {
            addCriterion("discuss_id >", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdGreaterThanOrEqualTo(Long value) {
            addCriterion("discuss_id >=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThan(Long value) {
            addCriterion("discuss_id <", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdLessThanOrEqualTo(Long value) {
            addCriterion("discuss_id <=", value, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdIn(List<Long> values) {
            addCriterion("discuss_id in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotIn(List<Long> values) {
            addCriterion("discuss_id not in", values, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdBetween(Long value1, Long value2) {
            addCriterion("discuss_id between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussIdNotBetween(Long value1, Long value2) {
            addCriterion("discuss_id not between", value1, value2, "discussId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdIsNull() {
            addCriterion("discuss_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdIsNotNull() {
            addCriterion("discuss_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdEqualTo(Long value) {
            addCriterion("discuss_user_id =", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdNotEqualTo(Long value) {
            addCriterion("discuss_user_id <>", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdGreaterThan(Long value) {
            addCriterion("discuss_user_id >", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("discuss_user_id >=", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdLessThan(Long value) {
            addCriterion("discuss_user_id <", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdLessThanOrEqualTo(Long value) {
            addCriterion("discuss_user_id <=", value, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdIn(List<Long> values) {
            addCriterion("discuss_user_id in", values, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdNotIn(List<Long> values) {
            addCriterion("discuss_user_id not in", values, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdBetween(Long value1, Long value2) {
            addCriterion("discuss_user_id between", value1, value2, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussUserIdNotBetween(Long value1, Long value2) {
            addCriterion("discuss_user_id not between", value1, value2, "discussUserId");
            return (Criteria) this;
        }

        public Criteria andDiscussNameIsNull() {
            addCriterion("discuss_name is null");
            return (Criteria) this;
        }

        public Criteria andDiscussNameIsNotNull() {
            addCriterion("discuss_name is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussNameEqualTo(String value) {
            addCriterion("discuss_name =", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameNotEqualTo(String value) {
            addCriterion("discuss_name <>", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameGreaterThan(String value) {
            addCriterion("discuss_name >", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_name >=", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameLessThan(String value) {
            addCriterion("discuss_name <", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameLessThanOrEqualTo(String value) {
            addCriterion("discuss_name <=", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameLike(String value) {
            addCriterion("discuss_name like", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameNotLike(String value) {
            addCriterion("discuss_name not like", value, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameIn(List<String> values) {
            addCriterion("discuss_name in", values, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameNotIn(List<String> values) {
            addCriterion("discuss_name not in", values, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameBetween(String value1, String value2) {
            addCriterion("discuss_name between", value1, value2, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussNameNotBetween(String value1, String value2) {
            addCriterion("discuss_name not between", value1, value2, "discussName");
            return (Criteria) this;
        }

        public Criteria andDiscussContentIsNull() {
            addCriterion("discuss_content is null");
            return (Criteria) this;
        }

        public Criteria andDiscussContentIsNotNull() {
            addCriterion("discuss_content is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussContentEqualTo(String value) {
            addCriterion("discuss_content =", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentNotEqualTo(String value) {
            addCriterion("discuss_content <>", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentGreaterThan(String value) {
            addCriterion("discuss_content >", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_content >=", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentLessThan(String value) {
            addCriterion("discuss_content <", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentLessThanOrEqualTo(String value) {
            addCriterion("discuss_content <=", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentLike(String value) {
            addCriterion("discuss_content like", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentNotLike(String value) {
            addCriterion("discuss_content not like", value, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentIn(List<String> values) {
            addCriterion("discuss_content in", values, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentNotIn(List<String> values) {
            addCriterion("discuss_content not in", values, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentBetween(String value1, String value2) {
            addCriterion("discuss_content between", value1, value2, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussContentNotBetween(String value1, String value2) {
            addCriterion("discuss_content not between", value1, value2, "discussContent");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeIsNull() {
            addCriterion("discuss_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeIsNotNull() {
            addCriterion("discuss_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeEqualTo(Date value) {
            addCriterion("discuss_createtime =", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeNotEqualTo(Date value) {
            addCriterion("discuss_createtime <>", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeGreaterThan(Date value) {
            addCriterion("discuss_createtime >", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discuss_createtime >=", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeLessThan(Date value) {
            addCriterion("discuss_createtime <", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("discuss_createtime <=", value, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeIn(List<Date> values) {
            addCriterion("discuss_createtime in", values, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeNotIn(List<Date> values) {
            addCriterion("discuss_createtime not in", values, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeBetween(Date value1, Date value2) {
            addCriterion("discuss_createtime between", value1, value2, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("discuss_createtime not between", value1, value2, "discussCreatetime");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlIsNull() {
            addCriterion("discuss_image_url is null");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlIsNotNull() {
            addCriterion("discuss_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlEqualTo(String value) {
            addCriterion("discuss_image_url =", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlNotEqualTo(String value) {
            addCriterion("discuss_image_url <>", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlGreaterThan(String value) {
            addCriterion("discuss_image_url >", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_image_url >=", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlLessThan(String value) {
            addCriterion("discuss_image_url <", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlLessThanOrEqualTo(String value) {
            addCriterion("discuss_image_url <=", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlLike(String value) {
            addCriterion("discuss_image_url like", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlNotLike(String value) {
            addCriterion("discuss_image_url not like", value, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlIn(List<String> values) {
            addCriterion("discuss_image_url in", values, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlNotIn(List<String> values) {
            addCriterion("discuss_image_url not in", values, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlBetween(String value1, String value2) {
            addCriterion("discuss_image_url between", value1, value2, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussImageUrlNotBetween(String value1, String value2) {
            addCriterion("discuss_image_url not between", value1, value2, "discussImageUrl");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdIsNull() {
            addCriterion("discuss_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdIsNotNull() {
            addCriterion("discuss_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdEqualTo(Long value) {
            addCriterion("discuss_lable_id =", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdNotEqualTo(Long value) {
            addCriterion("discuss_lable_id <>", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdGreaterThan(Long value) {
            addCriterion("discuss_lable_id >", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("discuss_lable_id >=", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdLessThan(Long value) {
            addCriterion("discuss_lable_id <", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdLessThanOrEqualTo(Long value) {
            addCriterion("discuss_lable_id <=", value, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdIn(List<Long> values) {
            addCriterion("discuss_lable_id in", values, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdNotIn(List<Long> values) {
            addCriterion("discuss_lable_id not in", values, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdBetween(Long value1, Long value2) {
            addCriterion("discuss_lable_id between", value1, value2, "discussLableId");
            return (Criteria) this;
        }

        public Criteria andDiscussLableIdNotBetween(Long value1, Long value2) {
            addCriterion("discuss_lable_id not between", value1, value2, "discussLableId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：discuss
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：discuss
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