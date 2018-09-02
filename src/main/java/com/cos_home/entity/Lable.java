package com.cos_home.entity;

import java.io.Serializable;

/**
 * 
 * Lable
 * 数据库表：lable
 */
public class Lable implements Serializable {
    /**
     * 标签id
     * 表字段 : lable.dislable_id
     */
    private Long dislableId;

    /**
     * 标签名
     * 表字段 : lable.dislable_name
     */
    private String dislableName;

    /**
     * 用户id
     * 表字段 : lable.dislable_user_id
     */
    private Long dislableUserId;

    /**
     * 标签类型（1讨论 2动态 3景点 4作品 5活动）
     * 表字段 : lable.dislable_type
     */
    private Integer dislableType;

    /**
     * 管理员id
     * 表字段 : lable.dislable_admin_id
     */
    private Long dislableAdminId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 标签id 字段:lable.dislable_id
     *
     * @return lable.dislable_id, 标签id
     */
    public Long getDislableId() {
        return dislableId;
    }

    /**
     * 设置 标签id 字段:lable.dislable_id
     *
     * @param dislableId the value for lable.dislable_id, 标签id
     */
    public void setDislableId(Long dislableId) {
        this.dislableId = dislableId;
    }

    /**
     * 获取 标签名 字段:lable.dislable_name
     *
     * @return lable.dislable_name, 标签名
     */
    public String getDislableName() {
        return dislableName;
    }

    /**
     * 设置 标签名 字段:lable.dislable_name
     *
     * @param dislableName the value for lable.dislable_name, 标签名
     */
    public void setDislableName(String dislableName) {
        this.dislableName = dislableName == null ? null : dislableName.trim();
    }

    /**
     * 获取 用户id 字段:lable.dislable_user_id
     *
     * @return lable.dislable_user_id, 用户id
     */
    public Long getDislableUserId() {
        return dislableUserId;
    }

    /**
     * 设置 用户id 字段:lable.dislable_user_id
     *
     * @param dislableUserId the value for lable.dislable_user_id, 用户id
     */
    public void setDislableUserId(Long dislableUserId) {
        this.dislableUserId = dislableUserId;
    }

    /**
     * 获取 标签类型（1讨论 2动态 3景点 4作品 5活动） 字段:lable.dislable_type
     *
     * @return lable.dislable_type, 标签类型（1讨论 2动态 3景点 4作品 5活动）
     */
    public Integer getDislableType() {
        return dislableType;
    }

    /**
     * 设置 标签类型（1讨论 2动态 3景点 4作品 5活动） 字段:lable.dislable_type
     *
     * @param dislableType the value for lable.dislable_type, 标签类型（1讨论 2动态 3景点 4作品 5活动）
     */
    public void setDislableType(Integer dislableType) {
        this.dislableType = dislableType;
    }

    /**
     * 获取 管理员id 字段:lable.dislable_admin_id
     *
     * @return lable.dislable_admin_id, 管理员id
     */
    public Long getDislableAdminId() {
        return dislableAdminId;
    }

    /**
     * 设置 管理员id 字段:lable.dislable_admin_id
     *
     * @param dislableAdminId the value for lable.dislable_admin_id, 管理员id
     */
    public void setDislableAdminId(Long dislableAdminId) {
        this.dislableAdminId = dislableAdminId;
    }
}