package com.cos_home.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    /**
     *  构造查询条件,user
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,user
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,user
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,user
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,user
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,user
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,user
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,user
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,user
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,user
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,user
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,user
     *
     * @param limitStart
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,user
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * ,user
     *
     * @param limitEnd
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,user
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：user
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserRegisterIsNull() {
            addCriterion("user_register is null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterIsNotNull() {
            addCriterion("user_register is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterEqualTo(Date value) {
            addCriterion("user_register =", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterNotEqualTo(Date value) {
            addCriterion("user_register <>", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterGreaterThan(Date value) {
            addCriterion("user_register >", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterGreaterThanOrEqualTo(Date value) {
            addCriterion("user_register >=", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterLessThan(Date value) {
            addCriterion("user_register <", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterLessThanOrEqualTo(Date value) {
            addCriterion("user_register <=", value, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterIn(List<Date> values) {
            addCriterion("user_register in", values, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterNotIn(List<Date> values) {
            addCriterion("user_register not in", values, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterBetween(Date value1, Date value2) {
            addCriterion("user_register between", value1, value2, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserRegisterNotBetween(Date value1, Date value2) {
            addCriterion("user_register not between", value1, value2, "userRegister");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIsNull() {
            addCriterion("user_is_del is null");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIsNotNull() {
            addCriterion("user_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsDelEqualTo(Integer value) {
            addCriterion("user_is_del =", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotEqualTo(Integer value) {
            addCriterion("user_is_del <>", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelGreaterThan(Integer value) {
            addCriterion("user_is_del >", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_is_del >=", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelLessThan(Integer value) {
            addCriterion("user_is_del <", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("user_is_del <=", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIn(List<Integer> values) {
            addCriterion("user_is_del in", values, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotIn(List<Integer> values) {
            addCriterion("user_is_del not in", values, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelBetween(Integer value1, Integer value2) {
            addCriterion("user_is_del between", value1, value2, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_is_del not between", value1, value2, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlIsNull() {
            addCriterion("user_portrait_url is null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlIsNotNull() {
            addCriterion("user_portrait_url is not null");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlEqualTo(String value) {
            addCriterion("user_portrait_url =", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlNotEqualTo(String value) {
            addCriterion("user_portrait_url <>", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlGreaterThan(String value) {
            addCriterion("user_portrait_url >", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("user_portrait_url >=", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlLessThan(String value) {
            addCriterion("user_portrait_url <", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlLessThanOrEqualTo(String value) {
            addCriterion("user_portrait_url <=", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlLike(String value) {
            addCriterion("user_portrait_url like", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlNotLike(String value) {
            addCriterion("user_portrait_url not like", value, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlIn(List<String> values) {
            addCriterion("user_portrait_url in", values, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlNotIn(List<String> values) {
            addCriterion("user_portrait_url not in", values, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlBetween(String value1, String value2) {
            addCriterion("user_portrait_url between", value1, value2, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserPortraitUrlNotBetween(String value1, String value2) {
            addCriterion("user_portrait_url not between", value1, value2, "userPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNull() {
            addCriterion("user_token is null");
            return (Criteria) this;
        }

        public Criteria andUserTokenIsNotNull() {
            addCriterion("user_token is not null");
            return (Criteria) this;
        }

        public Criteria andUserTokenEqualTo(String value) {
            addCriterion("user_token =", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotEqualTo(String value) {
            addCriterion("user_token <>", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThan(String value) {
            addCriterion("user_token >", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("user_token >=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThan(String value) {
            addCriterion("user_token <", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLessThanOrEqualTo(String value) {
            addCriterion("user_token <=", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenLike(String value) {
            addCriterion("user_token like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotLike(String value) {
            addCriterion("user_token not like", value, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenIn(List<String> values) {
            addCriterion("user_token in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotIn(List<String> values) {
            addCriterion("user_token not in", values, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenBetween(String value1, String value2) {
            addCriterion("user_token between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserTokenNotBetween(String value1, String value2) {
            addCriterion("user_token not between", value1, value2, "userToken");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNull() {
            addCriterion("user_salt is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNotNull() {
            addCriterion("user_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("user_salt =", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("user_salt <>", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("user_salt >", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("user_salt >=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThan(String value) {
            addCriterion("user_salt <", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("user_salt <=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLike(String value) {
            addCriterion("user_salt like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotLike(String value) {
            addCriterion("user_salt not like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("user_salt in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("user_salt not in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("user_salt between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("user_salt not between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserHonorIsNull() {
            addCriterion("user_honor is null");
            return (Criteria) this;
        }

        public Criteria andUserHonorIsNotNull() {
            addCriterion("user_honor is not null");
            return (Criteria) this;
        }

        public Criteria andUserHonorEqualTo(String value) {
            addCriterion("user_honor =", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorNotEqualTo(String value) {
            addCriterion("user_honor <>", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorGreaterThan(String value) {
            addCriterion("user_honor >", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorGreaterThanOrEqualTo(String value) {
            addCriterion("user_honor >=", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorLessThan(String value) {
            addCriterion("user_honor <", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorLessThanOrEqualTo(String value) {
            addCriterion("user_honor <=", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorLike(String value) {
            addCriterion("user_honor like", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorNotLike(String value) {
            addCriterion("user_honor not like", value, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorIn(List<String> values) {
            addCriterion("user_honor in", values, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorNotIn(List<String> values) {
            addCriterion("user_honor not in", values, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorBetween(String value1, String value2) {
            addCriterion("user_honor between", value1, value2, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserHonorNotBetween(String value1, String value2) {
            addCriterion("user_honor not between", value1, value2, "userHonor");
            return (Criteria) this;
        }

        public Criteria andUserExperienceIsNull() {
            addCriterion("user_experience is null");
            return (Criteria) this;
        }

        public Criteria andUserExperienceIsNotNull() {
            addCriterion("user_experience is not null");
            return (Criteria) this;
        }

        public Criteria andUserExperienceEqualTo(String value) {
            addCriterion("user_experience =", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceNotEqualTo(String value) {
            addCriterion("user_experience <>", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceGreaterThan(String value) {
            addCriterion("user_experience >", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("user_experience >=", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceLessThan(String value) {
            addCriterion("user_experience <", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceLessThanOrEqualTo(String value) {
            addCriterion("user_experience <=", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceLike(String value) {
            addCriterion("user_experience like", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceNotLike(String value) {
            addCriterion("user_experience not like", value, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceIn(List<String> values) {
            addCriterion("user_experience in", values, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceNotIn(List<String> values) {
            addCriterion("user_experience not in", values, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceBetween(String value1, String value2) {
            addCriterion("user_experience between", value1, value2, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserExperienceNotBetween(String value1, String value2) {
            addCriterion("user_experience not between", value1, value2, "userExperience");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceIsNull() {
            addCriterion("user_order_price is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceIsNotNull() {
            addCriterion("user_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceEqualTo(Double value) {
            addCriterion("user_order_price =", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceNotEqualTo(Double value) {
            addCriterion("user_order_price <>", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceGreaterThan(Double value) {
            addCriterion("user_order_price >", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("user_order_price >=", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceLessThan(Double value) {
            addCriterion("user_order_price <", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("user_order_price <=", value, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceIn(List<Double> values) {
            addCriterion("user_order_price in", values, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceNotIn(List<Double> values) {
            addCriterion("user_order_price not in", values, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceBetween(Double value1, Double value2) {
            addCriterion("user_order_price between", value1, value2, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("user_order_price not between", value1, value2, "userOrderPrice");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenIsNull() {
            addCriterion("user_is_frozen is null");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenIsNotNull() {
            addCriterion("user_is_frozen is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenEqualTo(Integer value) {
            addCriterion("user_is_frozen =", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenNotEqualTo(Integer value) {
            addCriterion("user_is_frozen <>", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenGreaterThan(Integer value) {
            addCriterion("user_is_frozen >", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_is_frozen >=", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenLessThan(Integer value) {
            addCriterion("user_is_frozen <", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenLessThanOrEqualTo(Integer value) {
            addCriterion("user_is_frozen <=", value, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenIn(List<Integer> values) {
            addCriterion("user_is_frozen in", values, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenNotIn(List<Integer> values) {
            addCriterion("user_is_frozen not in", values, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenBetween(Integer value1, Integer value2) {
            addCriterion("user_is_frozen between", value1, value2, "userIsFrozen");
            return (Criteria) this;
        }

        public Criteria andUserIsFrozenNotBetween(Integer value1, Integer value2) {
            addCriterion("user_is_frozen not between", value1, value2, "userIsFrozen");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：user
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