package com.cos_home.entity;

import java.io.Serializable;

/**
 * 
 * Role
 * 数据库表：role
 */
public class Role implements Serializable {
    /**
     * 角色id
     * 表字段 : role.role_id
     */
    private Long roleId;

    /**
     * 角色名
     * 表字段 : role.role_name
     */
    private String roleName;

    /**
     * 角色描述
     * 表字段 : role.role_description
     */
    private String roleDescription;

    /**
     * 权限id
     * 表字段 : role.role_permission_id
     */
    private Long rolePermissionId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 角色id 字段:role.role_id
     *
     * @return role.role_id, 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色id 字段:role.role_id
     *
     * @param roleId the value for role.role_id, 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 角色名 字段:role.role_name
     *
     * @return role.role_name, 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置 角色名 字段:role.role_name
     *
     * @param roleName the value for role.role_name, 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 获取 角色描述 字段:role.role_description
     *
     * @return role.role_description, 角色描述
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * 设置 角色描述 字段:role.role_description
     *
     * @param roleDescription the value for role.role_description, 角色描述
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    /**
     * 获取 权限id 字段:role.role_permission_id
     *
     * @return role.role_permission_id, 权限id
     */
    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    /**
     * 设置 权限id 字段:role.role_permission_id
     *
     * @param rolePermissionId the value for role.role_permission_id, 权限id
     */
    public void setRolePermissionId(Long rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }
}