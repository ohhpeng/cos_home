package com.cos_home.entity;

import java.io.Serializable;

/**
 * 
 * Permission
 * 数据库表：permission
 */
public class Permission implements Serializable {
    /**
     * 权限id
     * 表字段 : permission.permission_id
     */
    private Long permissionId;

    /**
     * 权限名
     * 表字段 : permission.permission_name
     */
    private String permissionName;

    /**
     * 权限描述
     * 表字段 : permission.permission_description
     */
    private String permissionDescription;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 权限id 字段:permission.permission_id
     *
     * @return permission.permission_id, 权限id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * 设置 权限id 字段:permission.permission_id
     *
     * @param permissionId the value for permission.permission_id, 权限id
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取 权限名 字段:permission.permission_name
     *
     * @return permission.permission_name, 权限名
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置 权限名 字段:permission.permission_name
     *
     * @param permissionName the value for permission.permission_name, 权限名
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    /**
     * 获取 权限描述 字段:permission.permission_description
     *
     * @return permission.permission_description, 权限描述
     */
    public String getPermissionDescription() {
        return permissionDescription;
    }

    /**
     * 设置 权限描述 字段:permission.permission_description
     *
     * @param permissionDescription the value for permission.permission_description, 权限描述
     */
    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription == null ? null : permissionDescription.trim();
    }
}