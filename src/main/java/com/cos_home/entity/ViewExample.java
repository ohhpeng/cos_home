package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,view
     */
    public ViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,view
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,view
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,view
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,view
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,view
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,view
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,view
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,view
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,view
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,view
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,view
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,view
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,view
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,view
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：view
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

        public Criteria andViewIdIsNull() {
            addCriterion("view_id is null");
            return (Criteria) this;
        }

        public Criteria andViewIdIsNotNull() {
            addCriterion("view_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewIdEqualTo(Long value) {
            addCriterion("view_id =", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotEqualTo(Long value) {
            addCriterion("view_id <>", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThan(Long value) {
            addCriterion("view_id >", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThanOrEqualTo(Long value) {
            addCriterion("view_id >=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThan(Long value) {
            addCriterion("view_id <", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThanOrEqualTo(Long value) {
            addCriterion("view_id <=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdIn(List<Long> values) {
            addCriterion("view_id in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotIn(List<Long> values) {
            addCriterion("view_id not in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdBetween(Long value1, Long value2) {
            addCriterion("view_id between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotBetween(Long value1, Long value2) {
            addCriterion("view_id not between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNull() {
            addCriterion("view_name is null");
            return (Criteria) this;
        }

        public Criteria andViewNameIsNotNull() {
            addCriterion("view_name is not null");
            return (Criteria) this;
        }

        public Criteria andViewNameEqualTo(String value) {
            addCriterion("view_name =", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotEqualTo(String value) {
            addCriterion("view_name <>", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThan(String value) {
            addCriterion("view_name >", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameGreaterThanOrEqualTo(String value) {
            addCriterion("view_name >=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThan(String value) {
            addCriterion("view_name <", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLessThanOrEqualTo(String value) {
            addCriterion("view_name <=", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameLike(String value) {
            addCriterion("view_name like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotLike(String value) {
            addCriterion("view_name not like", value, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameIn(List<String> values) {
            addCriterion("view_name in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotIn(List<String> values) {
            addCriterion("view_name not in", values, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameBetween(String value1, String value2) {
            addCriterion("view_name between", value1, value2, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewNameNotBetween(String value1, String value2) {
            addCriterion("view_name not between", value1, value2, "viewName");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceIsNull() {
            addCriterion("view_introduce is null");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceIsNotNull() {
            addCriterion("view_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceEqualTo(String value) {
            addCriterion("view_introduce =", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceNotEqualTo(String value) {
            addCriterion("view_introduce <>", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceGreaterThan(String value) {
            addCriterion("view_introduce >", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("view_introduce >=", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceLessThan(String value) {
            addCriterion("view_introduce <", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceLessThanOrEqualTo(String value) {
            addCriterion("view_introduce <=", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceLike(String value) {
            addCriterion("view_introduce like", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceNotLike(String value) {
            addCriterion("view_introduce not like", value, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceIn(List<String> values) {
            addCriterion("view_introduce in", values, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceNotIn(List<String> values) {
            addCriterion("view_introduce not in", values, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceBetween(String value1, String value2) {
            addCriterion("view_introduce between", value1, value2, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewIntroduceNotBetween(String value1, String value2) {
            addCriterion("view_introduce not between", value1, value2, "viewIntroduce");
            return (Criteria) this;
        }

        public Criteria andViewAddressIsNull() {
            addCriterion("view_address is null");
            return (Criteria) this;
        }

        public Criteria andViewAddressIsNotNull() {
            addCriterion("view_address is not null");
            return (Criteria) this;
        }

        public Criteria andViewAddressEqualTo(String value) {
            addCriterion("view_address =", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressNotEqualTo(String value) {
            addCriterion("view_address <>", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressGreaterThan(String value) {
            addCriterion("view_address >", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressGreaterThanOrEqualTo(String value) {
            addCriterion("view_address >=", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressLessThan(String value) {
            addCriterion("view_address <", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressLessThanOrEqualTo(String value) {
            addCriterion("view_address <=", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressLike(String value) {
            addCriterion("view_address like", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressNotLike(String value) {
            addCriterion("view_address not like", value, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressIn(List<String> values) {
            addCriterion("view_address in", values, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressNotIn(List<String> values) {
            addCriterion("view_address not in", values, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressBetween(String value1, String value2) {
            addCriterion("view_address between", value1, value2, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewAddressNotBetween(String value1, String value2) {
            addCriterion("view_address not between", value1, value2, "viewAddress");
            return (Criteria) this;
        }

        public Criteria andViewSpotIsNull() {
            addCriterion("view_spot is null");
            return (Criteria) this;
        }

        public Criteria andViewSpotIsNotNull() {
            addCriterion("view_spot is not null");
            return (Criteria) this;
        }

        public Criteria andViewSpotEqualTo(String value) {
            addCriterion("view_spot =", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotNotEqualTo(String value) {
            addCriterion("view_spot <>", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotGreaterThan(String value) {
            addCriterion("view_spot >", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotGreaterThanOrEqualTo(String value) {
            addCriterion("view_spot >=", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotLessThan(String value) {
            addCriterion("view_spot <", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotLessThanOrEqualTo(String value) {
            addCriterion("view_spot <=", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotLike(String value) {
            addCriterion("view_spot like", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotNotLike(String value) {
            addCriterion("view_spot not like", value, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotIn(List<String> values) {
            addCriterion("view_spot in", values, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotNotIn(List<String> values) {
            addCriterion("view_spot not in", values, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotBetween(String value1, String value2) {
            addCriterion("view_spot between", value1, value2, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewSpotNotBetween(String value1, String value2) {
            addCriterion("view_spot not between", value1, value2, "viewSpot");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumIsNull() {
            addCriterion("view_ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumIsNotNull() {
            addCriterion("view_ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumEqualTo(Long value) {
            addCriterion("view_ticket_num =", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumNotEqualTo(Long value) {
            addCriterion("view_ticket_num <>", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumGreaterThan(Long value) {
            addCriterion("view_ticket_num >", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumGreaterThanOrEqualTo(Long value) {
            addCriterion("view_ticket_num >=", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumLessThan(Long value) {
            addCriterion("view_ticket_num <", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumLessThanOrEqualTo(Long value) {
            addCriterion("view_ticket_num <=", value, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumIn(List<Long> values) {
            addCriterion("view_ticket_num in", values, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumNotIn(List<Long> values) {
            addCriterion("view_ticket_num not in", values, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumBetween(Long value1, Long value2) {
            addCriterion("view_ticket_num between", value1, value2, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewTicketNumNotBetween(Long value1, Long value2) {
            addCriterion("view_ticket_num not between", value1, value2, "viewTicketNum");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlIsNull() {
            addCriterion("view_image_url is null");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlIsNotNull() {
            addCriterion("view_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlEqualTo(String value) {
            addCriterion("view_image_url =", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlNotEqualTo(String value) {
            addCriterion("view_image_url <>", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlGreaterThan(String value) {
            addCriterion("view_image_url >", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("view_image_url >=", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlLessThan(String value) {
            addCriterion("view_image_url <", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlLessThanOrEqualTo(String value) {
            addCriterion("view_image_url <=", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlLike(String value) {
            addCriterion("view_image_url like", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlNotLike(String value) {
            addCriterion("view_image_url not like", value, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlIn(List<String> values) {
            addCriterion("view_image_url in", values, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlNotIn(List<String> values) {
            addCriterion("view_image_url not in", values, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlBetween(String value1, String value2) {
            addCriterion("view_image_url between", value1, value2, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewImageUrlNotBetween(String value1, String value2) {
            addCriterion("view_image_url not between", value1, value2, "viewImageUrl");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateIsNull() {
            addCriterion("view_create_date is null");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateIsNotNull() {
            addCriterion("view_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateEqualTo(Date value) {
            addCriterion("view_create_date =", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateNotEqualTo(Date value) {
            addCriterion("view_create_date <>", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateGreaterThan(Date value) {
            addCriterion("view_create_date >", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("view_create_date >=", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateLessThan(Date value) {
            addCriterion("view_create_date <", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("view_create_date <=", value, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateIn(List<Date> values) {
            addCriterion("view_create_date in", values, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateNotIn(List<Date> values) {
            addCriterion("view_create_date not in", values, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateBetween(Date value1, Date value2) {
            addCriterion("view_create_date between", value1, value2, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("view_create_date not between", value1, value2, "viewCreateDate");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdIsNull() {
            addCriterion("view_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdIsNotNull() {
            addCriterion("view_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdEqualTo(Long value) {
            addCriterion("view_admin_id =", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdNotEqualTo(Long value) {
            addCriterion("view_admin_id <>", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdGreaterThan(Long value) {
            addCriterion("view_admin_id >", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("view_admin_id >=", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdLessThan(Long value) {
            addCriterion("view_admin_id <", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("view_admin_id <=", value, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdIn(List<Long> values) {
            addCriterion("view_admin_id in", values, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdNotIn(List<Long> values) {
            addCriterion("view_admin_id not in", values, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdBetween(Long value1, Long value2) {
            addCriterion("view_admin_id between", value1, value2, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("view_admin_id not between", value1, value2, "viewAdminId");
            return (Criteria) this;
        }

        public Criteria andViewIsDelIsNull() {
            addCriterion("view_is_del is null");
            return (Criteria) this;
        }

        public Criteria andViewIsDelIsNotNull() {
            addCriterion("view_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andViewIsDelEqualTo(Integer value) {
            addCriterion("view_is_del =", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelNotEqualTo(Integer value) {
            addCriterion("view_is_del <>", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelGreaterThan(Integer value) {
            addCriterion("view_is_del >", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_is_del >=", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelLessThan(Integer value) {
            addCriterion("view_is_del <", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("view_is_del <=", value, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelIn(List<Integer> values) {
            addCriterion("view_is_del in", values, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelNotIn(List<Integer> values) {
            addCriterion("view_is_del not in", values, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelBetween(Integer value1, Integer value2) {
            addCriterion("view_is_del between", value1, value2, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("view_is_del not between", value1, value2, "viewIsDel");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateIsNull() {
            addCriterion("view_update_date is null");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateIsNotNull() {
            addCriterion("view_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateEqualTo(Date value) {
            addCriterion("view_update_date =", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateNotEqualTo(Date value) {
            addCriterion("view_update_date <>", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateGreaterThan(Date value) {
            addCriterion("view_update_date >", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("view_update_date >=", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateLessThan(Date value) {
            addCriterion("view_update_date <", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("view_update_date <=", value, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateIn(List<Date> values) {
            addCriterion("view_update_date in", values, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateNotIn(List<Date> values) {
            addCriterion("view_update_date not in", values, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateBetween(Date value1, Date value2) {
            addCriterion("view_update_date between", value1, value2, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("view_update_date not between", value1, value2, "viewUpdateDate");
            return (Criteria) this;
        }

        public Criteria andViewLableIdIsNull() {
            addCriterion("view_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andViewLableIdIsNotNull() {
            addCriterion("view_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andViewLableIdEqualTo(Long value) {
            addCriterion("view_lable_id =", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdNotEqualTo(Long value) {
            addCriterion("view_lable_id <>", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdGreaterThan(Long value) {
            addCriterion("view_lable_id >", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("view_lable_id >=", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdLessThan(Long value) {
            addCriterion("view_lable_id <", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdLessThanOrEqualTo(Long value) {
            addCriterion("view_lable_id <=", value, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdIn(List<Long> values) {
            addCriterion("view_lable_id in", values, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdNotIn(List<Long> values) {
            addCriterion("view_lable_id not in", values, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdBetween(Long value1, Long value2) {
            addCriterion("view_lable_id between", value1, value2, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewLableIdNotBetween(Long value1, Long value2) {
            addCriterion("view_lable_id not between", value1, value2, "viewLableId");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeIsNull() {
            addCriterion("view_open_time is null");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeIsNotNull() {
            addCriterion("view_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeEqualTo(Date value) {
            addCriterion("view_open_time =", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeNotEqualTo(Date value) {
            addCriterion("view_open_time <>", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeGreaterThan(Date value) {
            addCriterion("view_open_time >", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("view_open_time >=", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeLessThan(Date value) {
            addCriterion("view_open_time <", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeLessThanOrEqualTo(Date value) {
            addCriterion("view_open_time <=", value, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeIn(List<Date> values) {
            addCriterion("view_open_time in", values, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeNotIn(List<Date> values) {
            addCriterion("view_open_time not in", values, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeBetween(Date value1, Date value2) {
            addCriterion("view_open_time between", value1, value2, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewOpenTimeNotBetween(Date value1, Date value2) {
            addCriterion("view_open_time not between", value1, value2, "viewOpenTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeIsNull() {
            addCriterion("view_close_time is null");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeIsNotNull() {
            addCriterion("view_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeEqualTo(Date value) {
            addCriterion("view_close_time =", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeNotEqualTo(Date value) {
            addCriterion("view_close_time <>", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeGreaterThan(Date value) {
            addCriterion("view_close_time >", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("view_close_time >=", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeLessThan(Date value) {
            addCriterion("view_close_time <", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("view_close_time <=", value, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeIn(List<Date> values) {
            addCriterion("view_close_time in", values, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeNotIn(List<Date> values) {
            addCriterion("view_close_time not in", values, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeBetween(Date value1, Date value2) {
            addCriterion("view_close_time between", value1, value2, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("view_close_time not between", value1, value2, "viewCloseTime");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsIsNull() {
            addCriterion("view_instructions is null");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsIsNotNull() {
            addCriterion("view_instructions is not null");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsEqualTo(String value) {
            addCriterion("view_instructions =", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsNotEqualTo(String value) {
            addCriterion("view_instructions <>", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsGreaterThan(String value) {
            addCriterion("view_instructions >", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("view_instructions >=", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsLessThan(String value) {
            addCriterion("view_instructions <", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsLessThanOrEqualTo(String value) {
            addCriterion("view_instructions <=", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsLike(String value) {
            addCriterion("view_instructions like", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsNotLike(String value) {
            addCriterion("view_instructions not like", value, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsIn(List<String> values) {
            addCriterion("view_instructions in", values, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsNotIn(List<String> values) {
            addCriterion("view_instructions not in", values, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsBetween(String value1, String value2) {
            addCriterion("view_instructions between", value1, value2, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewInstructionsNotBetween(String value1, String value2) {
            addCriterion("view_instructions not between", value1, value2, "viewInstructions");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordIsNull() {
            addCriterion("view_visit_record is null");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordIsNotNull() {
            addCriterion("view_visit_record is not null");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordEqualTo(Long value) {
            addCriterion("view_visit_record =", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordNotEqualTo(Long value) {
            addCriterion("view_visit_record <>", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordGreaterThan(Long value) {
            addCriterion("view_visit_record >", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordGreaterThanOrEqualTo(Long value) {
            addCriterion("view_visit_record >=", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordLessThan(Long value) {
            addCriterion("view_visit_record <", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordLessThanOrEqualTo(Long value) {
            addCriterion("view_visit_record <=", value, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordIn(List<Long> values) {
            addCriterion("view_visit_record in", values, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordNotIn(List<Long> values) {
            addCriterion("view_visit_record not in", values, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordBetween(Long value1, Long value2) {
            addCriterion("view_visit_record between", value1, value2, "viewVisitRecord");
            return (Criteria) this;
        }

        public Criteria andViewVisitRecordNotBetween(Long value1, Long value2) {
            addCriterion("view_visit_record not between", value1, value2, "viewVisitRecord");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：view
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：view
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