package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Admin
 * 数据库表：admin
 */
public class Admin implements Serializable {
    /**
     * 管理员Id
     * 表字段 : admin.admin_id
     */
    private Long adminId;

    /**
     * 用户名
     * 表字段 : admin.admin_account
     */
    private String adminAccount;

    /**
     * 姓名
     * 表字段 : admin.admin_name
     */
    private String adminName;

    /**
     * 手机号
     * 表字段 : admin.admin_phone
     */
    private String adminPhone;

    /**
     * 邮箱
     * 表字段 : admin.admin_email
     */
    private String adminEmail;

    /**
     * 盐
     * 表字段 : admin.admin_salt
     */
    private String adminSalt;

    /**
     * 密码
     * 表字段 : admin.admin_password
     */
    private String adminPassword;

    /**
     * 头像
     * 表字段 : admin.admin_portrait_url
     */
    private String adminPortraitUrl;

    /**
     *  性别
     * 表字段 : admin.admin_gender
     */
    private String adminGender;

    /**
     * 是否删除(0否1是）
     * 表字段 : admin.admin_is_del
     */
    private Integer adminIsDel;

    /**
     * 管理员状态
     * 表字段 : admin.admin_state
     */
    private Integer adminState;

    /**
     * 创建时间
     * 表字段 : admin.admin_create_time
     */
    private Date adminCreateTime;

    /**
     * 创建id
     * 表字段 : admin.admin_create_id
     */
    private Long adminCreateId;

    /**
     * 角色id
     * 表字段 : admin.admin_role_id
     */
    private Long adminRoleId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 管理员Id 字段:admin.admin_id
     *
     * @return admin.admin_id, 管理员Id
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 设置 管理员Id 字段:admin.admin_id
     *
     * @param adminId the value for admin.admin_id, 管理员Id
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取 用户名 字段:admin.admin_account
     *
     * @return admin.admin_account, 用户名
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * 设置 用户名 字段:admin.admin_account
     *
     * @param adminAccount the value for admin.admin_account, 用户名
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    /**
     * 获取 姓名 字段:admin.admin_name
     *
     * @return admin.admin_name, 姓名
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置 姓名 字段:admin.admin_name
     *
     * @param adminName the value for admin.admin_name, 姓名
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 获取 手机号 字段:admin.admin_phone
     *
     * @return admin.admin_phone, 手机号
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * 设置 手机号 字段:admin.admin_phone
     *
     * @param adminPhone the value for admin.admin_phone, 手机号
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    /**
     * 获取 邮箱 字段:admin.admin_email
     *
     * @return admin.admin_email, 邮箱
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * 设置 邮箱 字段:admin.admin_email
     *
     * @param adminEmail the value for admin.admin_email, 邮箱
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * 获取 盐 字段:admin.admin_salt
     *
     * @return admin.admin_salt, 盐
     */
    public String getAdminSalt() {
        return adminSalt;
    }

    /**
     * 设置 盐 字段:admin.admin_salt
     *
     * @param adminSalt the value for admin.admin_salt, 盐
     */
    public void setAdminSalt(String adminSalt) {
        this.adminSalt = adminSalt == null ? null : adminSalt.trim();
    }

    /**
     * 获取 密码 字段:admin.admin_password
     *
     * @return admin.admin_password, 密码
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置 密码 字段:admin.admin_password
     *
     * @param adminPassword the value for admin.admin_password, 密码
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * 获取 头像 字段:admin.admin_portrait_url
     *
     * @return admin.admin_portrait_url, 头像
     */
    public String getAdminPortraitUrl() {
        return adminPortraitUrl;
    }

    /**
     * 设置 头像 字段:admin.admin_portrait_url
     *
     * @param adminPortraitUrl the value for admin.admin_portrait_url, 头像
     */
    public void setAdminPortraitUrl(String adminPortraitUrl) {
        this.adminPortraitUrl = adminPortraitUrl == null ? null : adminPortraitUrl.trim();
    }

    /**
     * 获取  性别 字段:admin.admin_gender
     *
     * @return admin.admin_gender,  性别
     */
    public String getAdminGender() {
        return adminGender;
    }

    /**
     * 设置  性别 字段:admin.admin_gender
     *
     * @param adminGender the value for admin.admin_gender,  性别
     */
    public void setAdminGender(String adminGender) {
        this.adminGender = adminGender == null ? null : adminGender.trim();
    }

    /**
     * 获取 是否删除(0否1是） 字段:admin.admin_is_del
     *
     * @return admin.admin_is_del, 是否删除(0否1是）
     */
    public Integer getAdminIsDel() {
        return adminIsDel;
    }

    /**
     * 设置 是否删除(0否1是） 字段:admin.admin_is_del
     *
     * @param adminIsDel the value for admin.admin_is_del, 是否删除(0否1是）
     */
    public void setAdminIsDel(Integer adminIsDel) {
        this.adminIsDel = adminIsDel;
    }

    /**
     * 获取 管理员状态 字段:admin.admin_state
     *
     * @return admin.admin_state, 管理员状态
     */
    public Integer getAdminState() {
        return adminState;
    }

    /**
     * 设置 管理员状态 字段:admin.admin_state
     *
     * @param adminState the value for admin.admin_state, 管理员状态
     */
    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
    }

    /**
     * 获取 创建时间 字段:admin.admin_create_time
     *
     * @return admin.admin_create_time, 创建时间
     */
    public Date getAdminCreateTime() {
        return adminCreateTime;
    }

    /**
     * 设置 创建时间 字段:admin.admin_create_time
     *
     * @param adminCreateTime the value for admin.admin_create_time, 创建时间
     */
    public void setAdminCreateTime(Date adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    /**
     * 获取 创建id 字段:admin.admin_create_id
     *
     * @return admin.admin_create_id, 创建id
     */
    public Long getAdminCreateId() {
        return adminCreateId;
    }

    /**
     * 设置 创建id 字段:admin.admin_create_id
     *
     * @param adminCreateId the value for admin.admin_create_id, 创建id
     */
    public void setAdminCreateId(Long adminCreateId) {
        this.adminCreateId = adminCreateId;
    }

    /**
     * 获取 角色id 字段:admin.admin_role_id
     *
     * @return admin.admin_role_id, 角色id
     */
    public Long getAdminRoleId() {
        return adminRoleId;
    }

    /**
     * 设置 角色id 字段:admin.admin_role_id
     *
     * @param adminRoleId the value for admin.admin_role_id, 角色id
     */
    public void setAdminRoleId(Long adminRoleId) {
        this.adminRoleId = adminRoleId;
    }
}