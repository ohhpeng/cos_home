package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,dynamic
     */
    public DynamicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,dynamic
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,dynamic
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,dynamic
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,dynamic
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,dynamic
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,dynamic
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,dynamic
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,dynamic
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,dynamic
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,dynamic
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,dynamic
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,dynamic
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,dynamic
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,dynamic
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：dynamic
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

        public Criteria andDynamicIdIsNull() {
            addCriterion("dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(Long value) {
            addCriterion("dynamic_id =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(Long value) {
            addCriterion("dynamic_id <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(Long value) {
            addCriterion("dynamic_id >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dynamic_id >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(Long value) {
            addCriterion("dynamic_id <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(Long value) {
            addCriterion("dynamic_id <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<Long> values) {
            addCriterion("dynamic_id in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<Long> values) {
            addCriterion("dynamic_id not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(Long value1, Long value2) {
            addCriterion("dynamic_id between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(Long value1, Long value2) {
            addCriterion("dynamic_id not between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNull() {
            addCriterion("dynamic_content is null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIsNotNull() {
            addCriterion("dynamic_content is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicContentEqualTo(String value) {
            addCriterion("dynamic_content =", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotEqualTo(String value) {
            addCriterion("dynamic_content <>", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThan(String value) {
            addCriterion("dynamic_content >", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_content >=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThan(String value) {
            addCriterion("dynamic_content <", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLessThanOrEqualTo(String value) {
            addCriterion("dynamic_content <=", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentLike(String value) {
            addCriterion("dynamic_content like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotLike(String value) {
            addCriterion("dynamic_content not like", value, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentIn(List<String> values) {
            addCriterion("dynamic_content in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotIn(List<String> values) {
            addCriterion("dynamic_content not in", values, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentBetween(String value1, String value2) {
            addCriterion("dynamic_content between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicContentNotBetween(String value1, String value2) {
            addCriterion("dynamic_content not between", value1, value2, "dynamicContent");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateIsNull() {
            addCriterion("dynamic_create_date is null");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateIsNotNull() {
            addCriterion("dynamic_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateEqualTo(Date value) {
            addCriterion("dynamic_create_date =", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateNotEqualTo(Date value) {
            addCriterion("dynamic_create_date <>", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateGreaterThan(Date value) {
            addCriterion("dynamic_create_date >", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dynamic_create_date >=", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateLessThan(Date value) {
            addCriterion("dynamic_create_date <", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("dynamic_create_date <=", value, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateIn(List<Date> values) {
            addCriterion("dynamic_create_date in", values, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateNotIn(List<Date> values) {
            addCriterion("dynamic_create_date not in", values, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateBetween(Date value1, Date value2) {
            addCriterion("dynamic_create_date between", value1, value2, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("dynamic_create_date not between", value1, value2, "dynamicCreateDate");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelIsNull() {
            addCriterion("dynamic_is_del is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelIsNotNull() {
            addCriterion("dynamic_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelEqualTo(Integer value) {
            addCriterion("dynamic_is_del =", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelNotEqualTo(Integer value) {
            addCriterion("dynamic_is_del <>", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelGreaterThan(Integer value) {
            addCriterion("dynamic_is_del >", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_is_del >=", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelLessThan(Integer value) {
            addCriterion("dynamic_is_del <", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_is_del <=", value, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelIn(List<Integer> values) {
            addCriterion("dynamic_is_del in", values, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelNotIn(List<Integer> values) {
            addCriterion("dynamic_is_del not in", values, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_is_del between", value1, value2, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_is_del not between", value1, value2, "dynamicIsDel");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlIsNull() {
            addCriterion("dynamic_image_url is null");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlIsNotNull() {
            addCriterion("dynamic_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlEqualTo(String value) {
            addCriterion("dynamic_image_url =", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlNotEqualTo(String value) {
            addCriterion("dynamic_image_url <>", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlGreaterThan(String value) {
            addCriterion("dynamic_image_url >", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_image_url >=", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlLessThan(String value) {
            addCriterion("dynamic_image_url <", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlLessThanOrEqualTo(String value) {
            addCriterion("dynamic_image_url <=", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlLike(String value) {
            addCriterion("dynamic_image_url like", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlNotLike(String value) {
            addCriterion("dynamic_image_url not like", value, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlIn(List<String> values) {
            addCriterion("dynamic_image_url in", values, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlNotIn(List<String> values) {
            addCriterion("dynamic_image_url not in", values, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlBetween(String value1, String value2) {
            addCriterion("dynamic_image_url between", value1, value2, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicImageUrlNotBetween(String value1, String value2) {
            addCriterion("dynamic_image_url not between", value1, value2, "dynamicImageUrl");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdIsNull() {
            addCriterion("dynamic_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdIsNotNull() {
            addCriterion("dynamic_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdEqualTo(Long value) {
            addCriterion("dynamic_user_id =", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdNotEqualTo(Long value) {
            addCriterion("dynamic_user_id <>", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdGreaterThan(Long value) {
            addCriterion("dynamic_user_id >", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dynamic_user_id >=", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdLessThan(Long value) {
            addCriterion("dynamic_user_id <", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdLessThanOrEqualTo(Long value) {
            addCriterion("dynamic_user_id <=", value, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdIn(List<Long> values) {
            addCriterion("dynamic_user_id in", values, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdNotIn(List<Long> values) {
            addCriterion("dynamic_user_id not in", values, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdBetween(Long value1, Long value2) {
            addCriterion("dynamic_user_id between", value1, value2, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicUserIdNotBetween(Long value1, Long value2) {
            addCriterion("dynamic_user_id not between", value1, value2, "dynamicUserId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdIsNull() {
            addCriterion("dynamic_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdIsNotNull() {
            addCriterion("dynamic_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdEqualTo(Long value) {
            addCriterion("dynamic_lable_id =", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdNotEqualTo(Long value) {
            addCriterion("dynamic_lable_id <>", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdGreaterThan(Long value) {
            addCriterion("dynamic_lable_id >", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dynamic_lable_id >=", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdLessThan(Long value) {
            addCriterion("dynamic_lable_id <", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdLessThanOrEqualTo(Long value) {
            addCriterion("dynamic_lable_id <=", value, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdIn(List<Long> values) {
            addCriterion("dynamic_lable_id in", values, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdNotIn(List<Long> values) {
            addCriterion("dynamic_lable_id not in", values, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdBetween(Long value1, Long value2) {
            addCriterion("dynamic_lable_id between", value1, value2, "dynamicLableId");
            return (Criteria) this;
        }

        public Criteria andDynamicLableIdNotBetween(Long value1, Long value2) {
            addCriterion("dynamic_lable_id not between", value1, value2, "dynamicLableId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：dynamic
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：dynamic
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