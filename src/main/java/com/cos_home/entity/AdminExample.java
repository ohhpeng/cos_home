package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,admin
     */
    public AdminExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,admin
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,admin
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,admin
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,admin
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,admin
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,admin
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,admin
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,admin
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,admin
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,admin
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,admin
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,admin
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,admin
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,admin
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：admin
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIsNull() {
            addCriterion("admin_salt is null");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIsNotNull() {
            addCriterion("admin_salt is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSaltEqualTo(String value) {
            addCriterion("admin_salt =", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotEqualTo(String value) {
            addCriterion("admin_salt <>", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltGreaterThan(String value) {
            addCriterion("admin_salt >", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltGreaterThanOrEqualTo(String value) {
            addCriterion("admin_salt >=", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLessThan(String value) {
            addCriterion("admin_salt <", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLessThanOrEqualTo(String value) {
            addCriterion("admin_salt <=", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLike(String value) {
            addCriterion("admin_salt like", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotLike(String value) {
            addCriterion("admin_salt not like", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIn(List<String> values) {
            addCriterion("admin_salt in", values, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotIn(List<String> values) {
            addCriterion("admin_salt not in", values, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltBetween(String value1, String value2) {
            addCriterion("admin_salt between", value1, value2, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotBetween(String value1, String value2) {
            addCriterion("admin_salt not between", value1, value2, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlIsNull() {
            addCriterion("admin_portrait_url is null");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlIsNotNull() {
            addCriterion("admin_portrait_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlEqualTo(String value) {
            addCriterion("admin_portrait_url =", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlNotEqualTo(String value) {
            addCriterion("admin_portrait_url <>", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlGreaterThan(String value) {
            addCriterion("admin_portrait_url >", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("admin_portrait_url >=", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlLessThan(String value) {
            addCriterion("admin_portrait_url <", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlLessThanOrEqualTo(String value) {
            addCriterion("admin_portrait_url <=", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlLike(String value) {
            addCriterion("admin_portrait_url like", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlNotLike(String value) {
            addCriterion("admin_portrait_url not like", value, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlIn(List<String> values) {
            addCriterion("admin_portrait_url in", values, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlNotIn(List<String> values) {
            addCriterion("admin_portrait_url not in", values, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlBetween(String value1, String value2) {
            addCriterion("admin_portrait_url between", value1, value2, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminPortraitUrlNotBetween(String value1, String value2) {
            addCriterion("admin_portrait_url not between", value1, value2, "adminPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIsNull() {
            addCriterion("admin_gender is null");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIsNotNull() {
            addCriterion("admin_gender is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGenderEqualTo(String value) {
            addCriterion("admin_gender =", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotEqualTo(String value) {
            addCriterion("admin_gender <>", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderGreaterThan(String value) {
            addCriterion("admin_gender >", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderGreaterThanOrEqualTo(String value) {
            addCriterion("admin_gender >=", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderLessThan(String value) {
            addCriterion("admin_gender <", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderLessThanOrEqualTo(String value) {
            addCriterion("admin_gender <=", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderLike(String value) {
            addCriterion("admin_gender like", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotLike(String value) {
            addCriterion("admin_gender not like", value, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderIn(List<String> values) {
            addCriterion("admin_gender in", values, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotIn(List<String> values) {
            addCriterion("admin_gender not in", values, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderBetween(String value1, String value2) {
            addCriterion("admin_gender between", value1, value2, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminGenderNotBetween(String value1, String value2) {
            addCriterion("admin_gender not between", value1, value2, "adminGender");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIsNull() {
            addCriterion("admin_is_del is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIsNotNull() {
            addCriterion("admin_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelEqualTo(Integer value) {
            addCriterion("admin_is_del =", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotEqualTo(Integer value) {
            addCriterion("admin_is_del <>", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelGreaterThan(Integer value) {
            addCriterion("admin_is_del >", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_is_del >=", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelLessThan(Integer value) {
            addCriterion("admin_is_del <", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("admin_is_del <=", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIn(List<Integer> values) {
            addCriterion("admin_is_del in", values, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotIn(List<Integer> values) {
            addCriterion("admin_is_del not in", values, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelBetween(Integer value1, Integer value2) {
            addCriterion("admin_is_del between", value1, value2, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_is_del not between", value1, value2, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNull() {
            addCriterion("admin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNotNull() {
            addCriterion("admin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeEqualTo(Date value) {
            addCriterion("admin_create_time =", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotEqualTo(Date value) {
            addCriterion("admin_create_time <>", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThan(Date value) {
            addCriterion("admin_create_time >", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_create_time >=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThan(Date value) {
            addCriterion("admin_create_time <", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_create_time <=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIn(List<Date> values) {
            addCriterion("admin_create_time in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotIn(List<Date> values) {
            addCriterion("admin_create_time not in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_create_time between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_create_time not between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdIsNull() {
            addCriterion("admin_create_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdIsNotNull() {
            addCriterion("admin_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdEqualTo(Long value) {
            addCriterion("admin_create_id =", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdNotEqualTo(Long value) {
            addCriterion("admin_create_id <>", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdGreaterThan(Long value) {
            addCriterion("admin_create_id >", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_create_id >=", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdLessThan(Long value) {
            addCriterion("admin_create_id <", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_create_id <=", value, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdIn(List<Long> values) {
            addCriterion("admin_create_id in", values, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdNotIn(List<Long> values) {
            addCriterion("admin_create_id not in", values, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdBetween(Long value1, Long value2) {
            addCriterion("admin_create_id between", value1, value2, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_create_id not between", value1, value2, "adminCreateId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdIsNull() {
            addCriterion("admin_role_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdIsNotNull() {
            addCriterion("admin_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdEqualTo(Long value) {
            addCriterion("admin_role_id =", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotEqualTo(Long value) {
            addCriterion("admin_role_id <>", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdGreaterThan(Long value) {
            addCriterion("admin_role_id >", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_role_id >=", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdLessThan(Long value) {
            addCriterion("admin_role_id <", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_role_id <=", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdIn(List<Long> values) {
            addCriterion("admin_role_id in", values, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotIn(List<Long> values) {
            addCriterion("admin_role_id not in", values, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdBetween(Long value1, Long value2) {
            addCriterion("admin_role_id between", value1, value2, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_role_id not between", value1, value2, "adminRoleId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：admin
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：admin
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