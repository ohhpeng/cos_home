package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * User
 * 数据库表：user
 */
public class User implements Serializable {
    /**
     * 用户id
     * 表字段 : user.user_id
     */
    private Long userId;

    /**
     * 姓名
     * 表字段 : user.user_name
     */
    private String userName;

    /**
     * 用户名
     * 表字段 : user.user_account
     */
    private String userAccount;

    /**
     *  手机号
     * 表字段 : user.user_phone
     */
    private String userPhone;

    /**
     * 密码
     * 表字段 : user.user_password
     */
    private String userPassword;

    /**
     * 用户地址
     * 表字段 : user.user_address
     */
    private String userAddress;

    /**
     * 用户邮箱
     * 表字段 : user.user_email
     */
    private String userEmail;

    /**
     * 用户性别
     * 表字段 : user.user_gender
     */
    private String userGender;

    /**
     * 注册时间
     * 表字段 : user.user_register
     */
    private Date userRegister;

    /**
     * 是否删除（0否1是）
     * 表字段 : user.user_is_del
     */
    private Integer userIsDel;

    /**
     * 头像
     * 表字段 : user.user_portrait_url
     */
    private String userPortraitUrl;

    /**
     * 
     * 表字段 : user.user_token
     */
    private String userToken;

    /**
     * 盐
     * 表字段 : user.user_salt
     */
    private String userSalt;

    /**
     * 用户类型(0普通用户 1服务人员）
     * 表字段 : user.user_type
     */
    private Integer userType;

    /**
     * 所获荣誉
     * 表字段 : user.user_honor
     */
    private String userHonor;

    /**
     * 工作经历
     * 表字段 : user.user_experience
     */
    private String userExperience;

    /**
     * 订单价位
     * 表字段 : user.user_order_price
     */
    private Double userOrderPrice;

    /**
     * 是否被冻结（0否 1是）
     * 表字段 : user.user_is_frozen
     */
    private Integer userIsFrozen;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 用户id 字段:user.user_id
     *
     * @return user.user_id, 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 用户id 字段:user.user_id
     *
     * @param userId the value for user.user_id, 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 姓名 字段:user.user_name
     *
     * @return user.user_name, 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 姓名 字段:user.user_name
     *
     * @param userName the value for user.user_name, 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取 用户名 字段:user.user_account
     *
     * @return user.user_account, 用户名
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置 用户名 字段:user.user_account
     *
     * @param userAccount the value for user.user_account, 用户名
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * 获取  手机号 字段:user.user_phone
     *
     * @return user.user_phone,  手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置  手机号 字段:user.user_phone
     *
     * @param userPhone the value for user.user_phone,  手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取 密码 字段:user.user_password
     *
     * @return user.user_password, 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置 密码 字段:user.user_password
     *
     * @param userPassword the value for user.user_password, 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 获取 用户地址 字段:user.user_address
     *
     * @return user.user_address, 用户地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置 用户地址 字段:user.user_address
     *
     * @param userAddress the value for user.user_address, 用户地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * 获取 用户邮箱 字段:user.user_email
     *
     * @return user.user_email, 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置 用户邮箱 字段:user.user_email
     *
     * @param userEmail the value for user.user_email, 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取 用户性别 字段:user.user_gender
     *
     * @return user.user_gender, 用户性别
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * 设置 用户性别 字段:user.user_gender
     *
     * @param userGender the value for user.user_gender, 用户性别
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    /**
     * 获取 注册时间 字段:user.user_register
     *
     * @return user.user_register, 注册时间
     */
    public Date getUserRegister() {
        return userRegister;
    }

    /**
     * 设置 注册时间 字段:user.user_register
     *
     * @param userRegister the value for user.user_register, 注册时间
     */
    public void setUserRegister(Date userRegister) {
        this.userRegister = userRegister;
    }

    /**
     * 获取 是否删除（0否1是） 字段:user.user_is_del
     *
     * @return user.user_is_del, 是否删除（0否1是）
     */
    public Integer getUserIsDel() {
        return userIsDel;
    }

    /**
     * 设置 是否删除（0否1是） 字段:user.user_is_del
     *
     * @param userIsDel the value for user.user_is_del, 是否删除（0否1是）
     */
    public void setUserIsDel(Integer userIsDel) {
        this.userIsDel = userIsDel;
    }

    /**
     * 获取 头像 字段:user.user_portrait_url
     *
     * @return user.user_portrait_url, 头像
     */
    public String getUserPortraitUrl() {
        return userPortraitUrl;
    }

    /**
     * 设置 头像 字段:user.user_portrait_url
     *
     * @param userPortraitUrl the value for user.user_portrait_url, 头像
     */
    public void setUserPortraitUrl(String userPortraitUrl) {
        this.userPortraitUrl = userPortraitUrl == null ? null : userPortraitUrl.trim();
    }

    /**
     * 获取  字段:user.user_token
     *
     * @return user.user_token, 
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * 设置  字段:user.user_token
     *
     * @param userToken the value for user.user_token, 
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    /**
     * 获取 盐 字段:user.user_salt
     *
     * @return user.user_salt, 盐
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * 设置 盐 字段:user.user_salt
     *
     * @param userSalt the value for user.user_salt, 盐
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    /**
     * 获取 用户类型(0普通用户 1服务人员） 字段:user.user_type
     *
     * @return user.user_type, 用户类型(0普通用户 1服务人员）
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置 用户类型(0普通用户 1服务人员） 字段:user.user_type
     *
     * @param userType the value for user.user_type, 用户类型(0普通用户 1服务人员）
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取 所获荣誉 字段:user.user_honor
     *
     * @return user.user_honor, 所获荣誉
     */
    public String getUserHonor() {
        return userHonor;
    }

    /**
     * 设置 所获荣誉 字段:user.user_honor
     *
     * @param userHonor the value for user.user_honor, 所获荣誉
     */
    public void setUserHonor(String userHonor) {
        this.userHonor = userHonor == null ? null : userHonor.trim();
    }

    /**
     * 获取 工作经历 字段:user.user_experience
     *
     * @return user.user_experience, 工作经历
     */
    public String getUserExperience() {
        return userExperience;
    }

    /**
     * 设置 工作经历 字段:user.user_experience
     *
     * @param userExperience the value for user.user_experience, 工作经历
     */
    public void setUserExperience(String userExperience) {
        this.userExperience = userExperience == null ? null : userExperience.trim();
    }

    /**
     * 获取 订单价位 字段:user.user_order_price
     *
     * @return user.user_order_price, 订单价位
     */
    public Double getUserOrderPrice() {
        return userOrderPrice;
    }

    /**
     * 设置 订单价位 字段:user.user_order_price
     *
     * @param userOrderPrice the value for user.user_order_price, 订单价位
     */
    public void setUserOrderPrice(Double userOrderPrice) {
        this.userOrderPrice = userOrderPrice;
    }

    /**
     * 获取 是否被冻结（0否 1是） 字段:user.user_is_frozen
     *
     * @return user.user_is_frozen, 是否被冻结（0否 1是）
     */
    public Integer getUserIsFrozen() {
        return userIsFrozen;
    }

    /**
     * 设置 是否被冻结（0否 1是） 字段:user.user_is_frozen
     *
     * @param userIsFrozen the value for user.user_is_frozen, 是否被冻结（0否 1是）
     */
    public void setUserIsFrozen(Integer userIsFrozen) {
        this.userIsFrozen = userIsFrozen;
    }
}