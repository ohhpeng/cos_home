package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,works
     */
    public WorksExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,works
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,works
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,works
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,works
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,works
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,works
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,works
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,works
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,works
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,works
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,works
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,works
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,works
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,works
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：works
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

        public Criteria andWorksIdIsNull() {
            addCriterion("works_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNotNull() {
            addCriterion("works_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIdEqualTo(Long value) {
            addCriterion("works_id =", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotEqualTo(Long value) {
            addCriterion("works_id <>", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThan(Long value) {
            addCriterion("works_id >", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_id >=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThan(Long value) {
            addCriterion("works_id <", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThanOrEqualTo(Long value) {
            addCriterion("works_id <=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIn(List<Long> values) {
            addCriterion("works_id in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotIn(List<Long> values) {
            addCriterion("works_id not in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdBetween(Long value1, Long value2) {
            addCriterion("works_id between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotBetween(Long value1, Long value2) {
            addCriterion("works_id not between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNull() {
            addCriterion("works_name is null");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNotNull() {
            addCriterion("works_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNameEqualTo(String value) {
            addCriterion("works_name =", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotEqualTo(String value) {
            addCriterion("works_name <>", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThan(String value) {
            addCriterion("works_name >", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThanOrEqualTo(String value) {
            addCriterion("works_name >=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThan(String value) {
            addCriterion("works_name <", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThanOrEqualTo(String value) {
            addCriterion("works_name <=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLike(String value) {
            addCriterion("works_name like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotLike(String value) {
            addCriterion("works_name not like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameIn(List<String> values) {
            addCriterion("works_name in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotIn(List<String> values) {
            addCriterion("works_name not in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameBetween(String value1, String value2) {
            addCriterion("works_name between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotBetween(String value1, String value2) {
            addCriterion("works_name not between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceIsNull() {
            addCriterion("works_introduce is null");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceIsNotNull() {
            addCriterion("works_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceEqualTo(String value) {
            addCriterion("works_introduce =", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceNotEqualTo(String value) {
            addCriterion("works_introduce <>", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceGreaterThan(String value) {
            addCriterion("works_introduce >", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("works_introduce >=", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceLessThan(String value) {
            addCriterion("works_introduce <", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceLessThanOrEqualTo(String value) {
            addCriterion("works_introduce <=", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceLike(String value) {
            addCriterion("works_introduce like", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceNotLike(String value) {
            addCriterion("works_introduce not like", value, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceIn(List<String> values) {
            addCriterion("works_introduce in", values, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceNotIn(List<String> values) {
            addCriterion("works_introduce not in", values, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceBetween(String value1, String value2) {
            addCriterion("works_introduce between", value1, value2, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksIntroduceNotBetween(String value1, String value2) {
            addCriterion("works_introduce not between", value1, value2, "worksIntroduce");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlIsNull() {
            addCriterion("works_image_url is null");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlIsNotNull() {
            addCriterion("works_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlEqualTo(String value) {
            addCriterion("works_image_url =", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlNotEqualTo(String value) {
            addCriterion("works_image_url <>", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlGreaterThan(String value) {
            addCriterion("works_image_url >", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("works_image_url >=", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlLessThan(String value) {
            addCriterion("works_image_url <", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlLessThanOrEqualTo(String value) {
            addCriterion("works_image_url <=", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlLike(String value) {
            addCriterion("works_image_url like", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlNotLike(String value) {
            addCriterion("works_image_url not like", value, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlIn(List<String> values) {
            addCriterion("works_image_url in", values, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlNotIn(List<String> values) {
            addCriterion("works_image_url not in", values, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlBetween(String value1, String value2) {
            addCriterion("works_image_url between", value1, value2, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImageUrlNotBetween(String value1, String value2) {
            addCriterion("works_image_url not between", value1, value2, "worksImageUrl");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelIsNull() {
            addCriterion("works_is_del is null");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelIsNotNull() {
            addCriterion("works_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelEqualTo(Integer value) {
            addCriterion("works_is_del =", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelNotEqualTo(Integer value) {
            addCriterion("works_is_del <>", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelGreaterThan(Integer value) {
            addCriterion("works_is_del >", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("works_is_del >=", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelLessThan(Integer value) {
            addCriterion("works_is_del <", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("works_is_del <=", value, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelIn(List<Integer> values) {
            addCriterion("works_is_del in", values, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelNotIn(List<Integer> values) {
            addCriterion("works_is_del not in", values, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelBetween(Integer value1, Integer value2) {
            addCriterion("works_is_del between", value1, value2, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("works_is_del not between", value1, value2, "worksIsDel");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeIsNull() {
            addCriterion("works_createtime is null");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeIsNotNull() {
            addCriterion("works_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeEqualTo(Date value) {
            addCriterion("works_createtime =", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeNotEqualTo(Date value) {
            addCriterion("works_createtime <>", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeGreaterThan(Date value) {
            addCriterion("works_createtime >", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("works_createtime >=", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeLessThan(Date value) {
            addCriterion("works_createtime <", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("works_createtime <=", value, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeIn(List<Date> values) {
            addCriterion("works_createtime in", values, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeNotIn(List<Date> values) {
            addCriterion("works_createtime not in", values, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeBetween(Date value1, Date value2) {
            addCriterion("works_createtime between", value1, value2, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("works_createtime not between", value1, value2, "worksCreatetime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeIsNull() {
            addCriterion("works_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeIsNotNull() {
            addCriterion("works_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeEqualTo(Date value) {
            addCriterion("works_publishtime =", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeNotEqualTo(Date value) {
            addCriterion("works_publishtime <>", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeGreaterThan(Date value) {
            addCriterion("works_publishtime >", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("works_publishtime >=", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeLessThan(Date value) {
            addCriterion("works_publishtime <", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("works_publishtime <=", value, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeIn(List<Date> values) {
            addCriterion("works_publishtime in", values, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeNotIn(List<Date> values) {
            addCriterion("works_publishtime not in", values, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeBetween(Date value1, Date value2) {
            addCriterion("works_publishtime between", value1, value2, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("works_publishtime not between", value1, value2, "worksPublishtime");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassIsNull() {
            addCriterion("works_is_pass is null");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassIsNotNull() {
            addCriterion("works_is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassEqualTo(Integer value) {
            addCriterion("works_is_pass =", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassNotEqualTo(Integer value) {
            addCriterion("works_is_pass <>", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassGreaterThan(Integer value) {
            addCriterion("works_is_pass >", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("works_is_pass >=", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassLessThan(Integer value) {
            addCriterion("works_is_pass <", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassLessThanOrEqualTo(Integer value) {
            addCriterion("works_is_pass <=", value, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassIn(List<Integer> values) {
            addCriterion("works_is_pass in", values, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassNotIn(List<Integer> values) {
            addCriterion("works_is_pass not in", values, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassBetween(Integer value1, Integer value2) {
            addCriterion("works_is_pass between", value1, value2, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksIsPassNotBetween(Integer value1, Integer value2) {
            addCriterion("works_is_pass not between", value1, value2, "worksIsPass");
            return (Criteria) this;
        }

        public Criteria andWorksReasonIsNull() {
            addCriterion("works_reason is null");
            return (Criteria) this;
        }

        public Criteria andWorksReasonIsNotNull() {
            addCriterion("works_reason is not null");
            return (Criteria) this;
        }

        public Criteria andWorksReasonEqualTo(String value) {
            addCriterion("works_reason =", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonNotEqualTo(String value) {
            addCriterion("works_reason <>", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonGreaterThan(String value) {
            addCriterion("works_reason >", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonGreaterThanOrEqualTo(String value) {
            addCriterion("works_reason >=", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonLessThan(String value) {
            addCriterion("works_reason <", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonLessThanOrEqualTo(String value) {
            addCriterion("works_reason <=", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonLike(String value) {
            addCriterion("works_reason like", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonNotLike(String value) {
            addCriterion("works_reason not like", value, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonIn(List<String> values) {
            addCriterion("works_reason in", values, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonNotIn(List<String> values) {
            addCriterion("works_reason not in", values, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonBetween(String value1, String value2) {
            addCriterion("works_reason between", value1, value2, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksReasonNotBetween(String value1, String value2) {
            addCriterion("works_reason not between", value1, value2, "worksReason");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityIsNull() {
            addCriterion("works_popularity is null");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityIsNotNull() {
            addCriterion("works_popularity is not null");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityEqualTo(Long value) {
            addCriterion("works_popularity =", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityNotEqualTo(Long value) {
            addCriterion("works_popularity <>", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityGreaterThan(Long value) {
            addCriterion("works_popularity >", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityGreaterThanOrEqualTo(Long value) {
            addCriterion("works_popularity >=", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityLessThan(Long value) {
            addCriterion("works_popularity <", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityLessThanOrEqualTo(Long value) {
            addCriterion("works_popularity <=", value, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityIn(List<Long> values) {
            addCriterion("works_popularity in", values, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityNotIn(List<Long> values) {
            addCriterion("works_popularity not in", values, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityBetween(Long value1, Long value2) {
            addCriterion("works_popularity between", value1, value2, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksPopularityNotBetween(Long value1, Long value2) {
            addCriterion("works_popularity not between", value1, value2, "worksPopularity");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdIsNull() {
            addCriterion("works_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdIsNotNull() {
            addCriterion("works_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdEqualTo(Long value) {
            addCriterion("works_user_id =", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdNotEqualTo(Long value) {
            addCriterion("works_user_id <>", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdGreaterThan(Long value) {
            addCriterion("works_user_id >", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_user_id >=", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdLessThan(Long value) {
            addCriterion("works_user_id <", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdLessThanOrEqualTo(Long value) {
            addCriterion("works_user_id <=", value, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdIn(List<Long> values) {
            addCriterion("works_user_id in", values, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdNotIn(List<Long> values) {
            addCriterion("works_user_id not in", values, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdBetween(Long value1, Long value2) {
            addCriterion("works_user_id between", value1, value2, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksUserIdNotBetween(Long value1, Long value2) {
            addCriterion("works_user_id not between", value1, value2, "worksUserId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdIsNull() {
            addCriterion("works_lable_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdIsNotNull() {
            addCriterion("works_lable_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdEqualTo(Long value) {
            addCriterion("works_lable_id =", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdNotEqualTo(Long value) {
            addCriterion("works_lable_id <>", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdGreaterThan(Long value) {
            addCriterion("works_lable_id >", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_lable_id >=", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdLessThan(Long value) {
            addCriterion("works_lable_id <", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdLessThanOrEqualTo(Long value) {
            addCriterion("works_lable_id <=", value, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdIn(List<Long> values) {
            addCriterion("works_lable_id in", values, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdNotIn(List<Long> values) {
            addCriterion("works_lable_id not in", values, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdBetween(Long value1, Long value2) {
            addCriterion("works_lable_id between", value1, value2, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksLableIdNotBetween(Long value1, Long value2) {
            addCriterion("works_lable_id not between", value1, value2, "worksLableId");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsIsNull() {
            addCriterion("works_browse_records is null");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsIsNotNull() {
            addCriterion("works_browse_records is not null");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsEqualTo(Long value) {
            addCriterion("works_browse_records =", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsNotEqualTo(Long value) {
            addCriterion("works_browse_records <>", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsGreaterThan(Long value) {
            addCriterion("works_browse_records >", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsGreaterThanOrEqualTo(Long value) {
            addCriterion("works_browse_records >=", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsLessThan(Long value) {
            addCriterion("works_browse_records <", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsLessThanOrEqualTo(Long value) {
            addCriterion("works_browse_records <=", value, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsIn(List<Long> values) {
            addCriterion("works_browse_records in", values, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsNotIn(List<Long> values) {
            addCriterion("works_browse_records not in", values, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsBetween(Long value1, Long value2) {
            addCriterion("works_browse_records between", value1, value2, "worksBrowseRecords");
            return (Criteria) this;
        }

        public Criteria andWorksBrowseRecordsNotBetween(Long value1, Long value2) {
            addCriterion("works_browse_records not between", value1, value2, "worksBrowseRecords");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：works
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：works
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