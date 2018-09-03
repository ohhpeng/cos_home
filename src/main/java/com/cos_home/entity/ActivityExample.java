package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,activity
     */
    public ActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,activity
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,activity
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,activity
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,activity
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,activity
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,activity
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,activity
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,activity
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,activity
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,activity
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,activity
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,activity
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,activity
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,activity
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：activity
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlIsNull() {
            addCriterion("activity_image_url is null");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlIsNotNull() {
            addCriterion("activity_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlEqualTo(String value) {
            addCriterion("activity_image_url =", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlNotEqualTo(String value) {
            addCriterion("activity_image_url <>", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlGreaterThan(String value) {
            addCriterion("activity_image_url >", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("activity_image_url >=", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlLessThan(String value) {
            addCriterion("activity_image_url <", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlLessThanOrEqualTo(String value) {
            addCriterion("activity_image_url <=", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlLike(String value) {
            addCriterion("activity_image_url like", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlNotLike(String value) {
            addCriterion("activity_image_url not like", value, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlIn(List<String> values) {
            addCriterion("activity_image_url in", values, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlNotIn(List<String> values) {
            addCriterion("activity_image_url not in", values, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlBetween(String value1, String value2) {
            addCriterion("activity_image_url between", value1, value2, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityImageUrlNotBetween(String value1, String value2) {
            addCriterion("activity_image_url not between", value1, value2, "activityImageUrl");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeIsNull() {
            addCriterion("activity_createtime is null");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeIsNotNull() {
            addCriterion("activity_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeEqualTo(Date value) {
            addCriterion("activity_createtime =", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeNotEqualTo(Date value) {
            addCriterion("activity_createtime <>", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeGreaterThan(Date value) {
            addCriterion("activity_createtime >", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_createtime >=", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeLessThan(Date value) {
            addCriterion("activity_createtime <", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_createtime <=", value, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeIn(List<Date> values) {
            addCriterion("activity_createtime in", values, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeNotIn(List<Date> values) {
            addCriterion("activity_createtime not in", values, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeBetween(Date value1, Date value2) {
            addCriterion("activity_createtime between", value1, value2, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_createtime not between", value1, value2, "activityCreatetime");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingIsNull() {
            addCriterion("activity_start_holding is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingIsNotNull() {
            addCriterion("activity_start_holding is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingEqualTo(Date value) {
            addCriterion("activity_start_holding =", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingNotEqualTo(Date value) {
            addCriterion("activity_start_holding <>", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingGreaterThan(Date value) {
            addCriterion("activity_start_holding >", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start_holding >=", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingLessThan(Date value) {
            addCriterion("activity_start_holding <", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingLessThanOrEqualTo(Date value) {
            addCriterion("activity_start_holding <=", value, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingIn(List<Date> values) {
            addCriterion("activity_start_holding in", values, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingNotIn(List<Date> values) {
            addCriterion("activity_start_holding not in", values, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingBetween(Date value1, Date value2) {
            addCriterion("activity_start_holding between", value1, value2, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityStartHoldingNotBetween(Date value1, Date value2) {
            addCriterion("activity_start_holding not between", value1, value2, "activityStartHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingIsNull() {
            addCriterion("activity_end_holding is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingIsNotNull() {
            addCriterion("activity_end_holding is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingEqualTo(Date value) {
            addCriterion("activity_end_holding =", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingNotEqualTo(Date value) {
            addCriterion("activity_end_holding <>", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingGreaterThan(Date value) {
            addCriterion("activity_end_holding >", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end_holding >=", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingLessThan(Date value) {
            addCriterion("activity_end_holding <", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingLessThanOrEqualTo(Date value) {
            addCriterion("activity_end_holding <=", value, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingIn(List<Date> values) {
            addCriterion("activity_end_holding in", values, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingNotIn(List<Date> values) {
            addCriterion("activity_end_holding not in", values, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingBetween(Date value1, Date value2) {
            addCriterion("activity_end_holding between", value1, value2, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityEndHoldingNotBetween(Date value1, Date value2) {
            addCriterion("activity_end_holding not between", value1, value2, "activityEndHolding");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNull() {
            addCriterion("activity_content is null");
            return (Criteria) this;
        }

        public Criteria andActivityContentIsNotNull() {
            addCriterion("activity_content is not null");
            return (Criteria) this;
        }

        public Criteria andActivityContentEqualTo(String value) {
            addCriterion("activity_content =", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotEqualTo(String value) {
            addCriterion("activity_content <>", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThan(String value) {
            addCriterion("activity_content >", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentGreaterThanOrEqualTo(String value) {
            addCriterion("activity_content >=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThan(String value) {
            addCriterion("activity_content <", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLessThanOrEqualTo(String value) {
            addCriterion("activity_content <=", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentLike(String value) {
            addCriterion("activity_content like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotLike(String value) {
            addCriterion("activity_content not like", value, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentIn(List<String> values) {
            addCriterion("activity_content in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotIn(List<String> values) {
            addCriterion("activity_content not in", values, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentBetween(String value1, String value2) {
            addCriterion("activity_content between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityContentNotBetween(String value1, String value2) {
            addCriterion("activity_content not between", value1, value2, "activityContent");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNull() {
            addCriterion("activity_address is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNotNull() {
            addCriterion("activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressEqualTo(String value) {
            addCriterion("activity_address =", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotEqualTo(String value) {
            addCriterion("activity_address <>", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThan(String value) {
            addCriterion("activity_address >", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("activity_address >=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThan(String value) {
            addCriterion("activity_address <", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("activity_address <=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLike(String value) {
            addCriterion("activity_address like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotLike(String value) {
            addCriterion("activity_address not like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIn(List<String> values) {
            addCriterion("activity_address in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotIn(List<String> values) {
            addCriterion("activity_address not in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressBetween(String value1, String value2) {
            addCriterion("activity_address between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotBetween(String value1, String value2) {
            addCriterion("activity_address not between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelIsNull() {
            addCriterion("activity_is_del is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelIsNotNull() {
            addCriterion("activity_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelEqualTo(Integer value) {
            addCriterion("activity_is_del =", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelNotEqualTo(Integer value) {
            addCriterion("activity_is_del <>", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelGreaterThan(Integer value) {
            addCriterion("activity_is_del >", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_is_del >=", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelLessThan(Integer value) {
            addCriterion("activity_is_del <", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("activity_is_del <=", value, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelIn(List<Integer> values) {
            addCriterion("activity_is_del in", values, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelNotIn(List<Integer> values) {
            addCriterion("activity_is_del not in", values, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_del between", value1, value2, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivityIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_del not between", value1, value2, "activityIsDel");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorIsNull() {
            addCriterion("activity_sponsor is null");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorIsNotNull() {
            addCriterion("activity_sponsor is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorEqualTo(String value) {
            addCriterion("activity_sponsor =", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorNotEqualTo(String value) {
            addCriterion("activity_sponsor <>", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorGreaterThan(String value) {
            addCriterion("activity_sponsor >", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorGreaterThanOrEqualTo(String value) {
            addCriterion("activity_sponsor >=", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorLessThan(String value) {
            addCriterion("activity_sponsor <", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorLessThanOrEqualTo(String value) {
            addCriterion("activity_sponsor <=", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorLike(String value) {
            addCriterion("activity_sponsor like", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorNotLike(String value) {
            addCriterion("activity_sponsor not like", value, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorIn(List<String> values) {
            addCriterion("activity_sponsor in", values, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorNotIn(List<String> values) {
            addCriterion("activity_sponsor not in", values, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorBetween(String value1, String value2) {
            addCriterion("activity_sponsor between", value1, value2, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivitySponsorNotBetween(String value1, String value2) {
            addCriterion("activity_sponsor not between", value1, value2, "activitySponsor");
            return (Criteria) this;
        }

        public Criteria andActivityHolderIsNull() {
            addCriterion("activity_holder is null");
            return (Criteria) this;
        }

        public Criteria andActivityHolderIsNotNull() {
            addCriterion("activity_holder is not null");
            return (Criteria) this;
        }

        public Criteria andActivityHolderEqualTo(String value) {
            addCriterion("activity_holder =", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderNotEqualTo(String value) {
            addCriterion("activity_holder <>", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderGreaterThan(String value) {
            addCriterion("activity_holder >", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderGreaterThanOrEqualTo(String value) {
            addCriterion("activity_holder >=", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderLessThan(String value) {
            addCriterion("activity_holder <", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderLessThanOrEqualTo(String value) {
            addCriterion("activity_holder <=", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderLike(String value) {
            addCriterion("activity_holder like", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderNotLike(String value) {
            addCriterion("activity_holder not like", value, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderIn(List<String> values) {
            addCriterion("activity_holder in", values, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderNotIn(List<String> values) {
            addCriterion("activity_holder not in", values, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderBetween(String value1, String value2) {
            addCriterion("activity_holder between", value1, value2, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityHolderNotBetween(String value1, String value2) {
            addCriterion("activity_holder not between", value1, value2, "activityHolder");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumIsNull() {
            addCriterion("activity_people_num is null");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumIsNotNull() {
            addCriterion("activity_people_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumEqualTo(Long value) {
            addCriterion("activity_people_num =", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumNotEqualTo(Long value) {
            addCriterion("activity_people_num <>", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumGreaterThan(Long value) {
            addCriterion("activity_people_num >", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_people_num >=", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumLessThan(Long value) {
            addCriterion("activity_people_num <", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumLessThanOrEqualTo(Long value) {
            addCriterion("activity_people_num <=", value, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumIn(List<Long> values) {
            addCriterion("activity_people_num in", values, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumNotIn(List<Long> values) {
            addCriterion("activity_people_num not in", values, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumBetween(Long value1, Long value2) {
            addCriterion("activity_people_num between", value1, value2, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityPeopleNumNotBetween(Long value1, Long value2) {
            addCriterion("activity_people_num not between", value1, value2, "activityPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityStarIsNull() {
            addCriterion("activity_star is null");
            return (Criteria) this;
        }

        public Criteria andActivityStarIsNotNull() {
            addCriterion("activity_star is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStarEqualTo(Integer value) {
            addCriterion("activity_star =", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarNotEqualTo(Integer value) {
            addCriterion("activity_star <>", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarGreaterThan(Integer value) {
            addCriterion("activity_star >", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_star >=", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarLessThan(Integer value) {
            addCriterion("activity_star <", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarLessThanOrEqualTo(Integer value) {
            addCriterion("activity_star <=", value, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarIn(List<Integer> values) {
            addCriterion("activity_star in", values, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarNotIn(List<Integer> values) {
            addCriterion("activity_star not in", values, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarBetween(Integer value1, Integer value2) {
            addCriterion("activity_star between", value1, value2, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityStarNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_star not between", value1, value2, "activityStar");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdIsNull() {
            addCriterion("activity_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdIsNotNull() {
            addCriterion("activity_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdEqualTo(Long value) {
            addCriterion("activity_admin_id =", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdNotEqualTo(Long value) {
            addCriterion("activity_admin_id <>", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdGreaterThan(Long value) {
            addCriterion("activity_admin_id >", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_admin_id >=", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdLessThan(Long value) {
            addCriterion("activity_admin_id <", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_admin_id <=", value, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdIn(List<Long> values) {
            addCriterion("activity_admin_id in", values, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdNotIn(List<Long> values) {
            addCriterion("activity_admin_id not in", values, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdBetween(Long value1, Long value2) {
            addCriterion("activity_admin_id between", value1, value2, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_admin_id not between", value1, value2, "activityAdminId");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermIsNull() {
            addCriterion("activity_is_Longterm is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermIsNotNull() {
            addCriterion("activity_is_Longterm is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermEqualTo(Integer value) {
            addCriterion("activity_is_Longterm =", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermNotEqualTo(Integer value) {
            addCriterion("activity_is_Longterm <>", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermGreaterThan(Integer value) {
            addCriterion("activity_is_Longterm >", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_is_Longterm >=", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermLessThan(Integer value) {
            addCriterion("activity_is_Longterm <", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermLessThanOrEqualTo(Integer value) {
            addCriterion("activity_is_Longterm <=", value, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermIn(List<Integer> values) {
            addCriterion("activity_is_Longterm in", values, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermNotIn(List<Integer> values) {
            addCriterion("activity_is_Longterm not in", values, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_Longterm between", value1, value2, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLongtermNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_Longterm not between", value1, value2, "activityIsLongterm");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitIsNull() {
            addCriterion("activity_is_limit is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitIsNotNull() {
            addCriterion("activity_is_limit is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitEqualTo(Integer value) {
            addCriterion("activity_is_limit =", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitNotEqualTo(Integer value) {
            addCriterion("activity_is_limit <>", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitGreaterThan(Integer value) {
            addCriterion("activity_is_limit >", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_is_limit >=", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitLessThan(Integer value) {
            addCriterion("activity_is_limit <", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitLessThanOrEqualTo(Integer value) {
            addCriterion("activity_is_limit <=", value, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitIn(List<Integer> values) {
            addCriterion("activity_is_limit in", values, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitNotIn(List<Integer> values) {
            addCriterion("activity_is_limit not in", values, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_limit between", value1, value2, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityIsLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_limit not between", value1, value2, "activityIsLimit");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeIsNull() {
            addCriterion("activity_apply_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeIsNotNull() {
            addCriterion("activity_apply_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeEqualTo(Date value) {
            addCriterion("activity_apply_start_time =", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeNotEqualTo(Date value) {
            addCriterion("activity_apply_start_time <>", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeGreaterThan(Date value) {
            addCriterion("activity_apply_start_time >", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_apply_start_time >=", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeLessThan(Date value) {
            addCriterion("activity_apply_start_time <", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_apply_start_time <=", value, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeIn(List<Date> values) {
            addCriterion("activity_apply_start_time in", values, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeNotIn(List<Date> values) {
            addCriterion("activity_apply_start_time not in", values, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeBetween(Date value1, Date value2) {
            addCriterion("activity_apply_start_time between", value1, value2, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_apply_start_time not between", value1, value2, "activityApplyStartTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeIsNull() {
            addCriterion("activity_apply_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeIsNotNull() {
            addCriterion("activity_apply_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeEqualTo(Date value) {
            addCriterion("activity_apply_end_time =", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeNotEqualTo(Date value) {
            addCriterion("activity_apply_end_time <>", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeGreaterThan(Date value) {
            addCriterion("activity_apply_end_time >", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_apply_end_time >=", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeLessThan(Date value) {
            addCriterion("activity_apply_end_time <", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("activity_apply_end_time <=", value, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeIn(List<Date> values) {
            addCriterion("activity_apply_end_time in", values, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeNotIn(List<Date> values) {
            addCriterion("activity_apply_end_time not in", values, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeBetween(Date value1, Date value2) {
            addCriterion("activity_apply_end_time between", value1, value2, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("activity_apply_end_time not between", value1, value2, "activityApplyEndTime");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumIsNull() {
            addCriterion("activity_apply_people_num is null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumIsNotNull() {
            addCriterion("activity_apply_people_num is not null");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumEqualTo(Long value) {
            addCriterion("activity_apply_people_num =", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumNotEqualTo(Long value) {
            addCriterion("activity_apply_people_num <>", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumGreaterThan(Long value) {
            addCriterion("activity_apply_people_num >", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_apply_people_num >=", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumLessThan(Long value) {
            addCriterion("activity_apply_people_num <", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumLessThanOrEqualTo(Long value) {
            addCriterion("activity_apply_people_num <=", value, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumIn(List<Long> values) {
            addCriterion("activity_apply_people_num in", values, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumNotIn(List<Long> values) {
            addCriterion("activity_apply_people_num not in", values, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumBetween(Long value1, Long value2) {
            addCriterion("activity_apply_people_num between", value1, value2, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityApplyPeopleNumNotBetween(Long value1, Long value2) {
            addCriterion("activity_apply_people_num not between", value1, value2, "activityApplyPeopleNum");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckIsNull() {
            addCriterion("activity_is_check is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckIsNotNull() {
            addCriterion("activity_is_check is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckEqualTo(Integer value) {
            addCriterion("activity_is_check =", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckNotEqualTo(Integer value) {
            addCriterion("activity_is_check <>", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckGreaterThan(Integer value) {
            addCriterion("activity_is_check >", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_is_check >=", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckLessThan(Integer value) {
            addCriterion("activity_is_check <", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckLessThanOrEqualTo(Integer value) {
            addCriterion("activity_is_check <=", value, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckIn(List<Integer> values) {
            addCriterion("activity_is_check in", values, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckNotIn(List<Integer> values) {
            addCriterion("activity_is_check not in", values, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_check between", value1, value2, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityIsCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_is_check not between", value1, value2, "activityIsCheck");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdIsNull() {
            addCriterion("activity_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdIsNotNull() {
            addCriterion("activity_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdEqualTo(Long value) {
            addCriterion("activity_lable_id =", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdNotEqualTo(Long value) {
            addCriterion("activity_lable_id <>", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdGreaterThan(Long value) {
            addCriterion("activity_lable_id >", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_lable_id >=", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdLessThan(Long value) {
            addCriterion("activity_lable_id <", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_lable_id <=", value, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdIn(List<Long> values) {
            addCriterion("activity_lable_id in", values, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdNotIn(List<Long> values) {
            addCriterion("activity_lable_id not in", values, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdBetween(Long value1, Long value2) {
            addCriterion("activity_lable_id between", value1, value2, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityLableIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_lable_id not between", value1, value2, "activityLableId");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsIsNull() {
            addCriterion("activity_browse_records is null");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsIsNotNull() {
            addCriterion("activity_browse_records is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsEqualTo(Long value) {
            addCriterion("activity_browse_records =", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsNotEqualTo(Long value) {
            addCriterion("activity_browse_records <>", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsGreaterThan(Long value) {
            addCriterion("activity_browse_records >", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_browse_records >=", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsLessThan(Long value) {
            addCriterion("activity_browse_records <", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsLessThanOrEqualTo(Long value) {
            addCriterion("activity_browse_records <=", value, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsIn(List<Long> values) {
            addCriterion("activity_browse_records in", values, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsNotIn(List<Long> values) {
            addCriterion("activity_browse_records not in", values, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsBetween(Long value1, Long value2) {
            addCriterion("activity_browse_records between", value1, value2, "activityBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andActivityBrowseRecordsNotBetween(Long value1, Long value2) {
            addCriterion("activity_browse_records not between", value1, value2, "activityBrowseRecords");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：activity
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：activity
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