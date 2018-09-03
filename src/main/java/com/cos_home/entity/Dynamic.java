package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Dynamic
 * 数据库表：dynamic
 */
public class Dynamic implements Serializable {
    /**
     * 动态id
     * 表字段 : dynamic.dynamic_id
     */
    private Long dynamicId;

    /**
     * 动态内容
     * 表字段 : dynamic.dynamic_content
     */
    private String dynamicContent;

    /**
     * 动态创建时间
     * 表字段 : dynamic.dynamic_create_date
     */
    private Date dynamicCreateDate;

    /**
     * 动态是否删除
     * 表字段 : dynamic.dynamic_is_del
     */
    private Integer dynamicIsDel;

    /**
     * 动态图片
     * 表字段 : dynamic.dynamic_image_url
     */
    private String dynamicImageUrl;

    /**
     * 动态用户id
     * 表字段 : dynamic.dynamic_user_id
     */
    private Long dynamicUserId;

    /**
     * 动态标签id
     * 表字段 : dynamic.dynamic_lable_id
     */
    private Long dynamicLableId;

    /**
     * 浏览量
     * 表字段 : dynamic. dynamic_browse_records
     */
    private Long dynamicBrowseRecords;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 动态id 字段:dynamic.dynamic_id
     *
     * @return dynamic.dynamic_id, 动态id
     */
    public Long getDynamicId() {
        return dynamicId;
    }

    /**
     * 设置 动态id 字段:dynamic.dynamic_id
     *
     * @param dynamicId the value for dynamic.dynamic_id, 动态id
     */
    public void setDynamicId(Long dynamicId) {
        this.dynamicId = dynamicId;
    }

    /**
     * 获取 动态内容 字段:dynamic.dynamic_content
     *
     * @return dynamic.dynamic_content, 动态内容
     */
    public String getDynamicContent() {
        return dynamicContent;
    }

    /**
     * 设置 动态内容 字段:dynamic.dynamic_content
     *
     * @param dynamicContent the value for dynamic.dynamic_content, 动态内容
     */
    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent == null ? null : dynamicContent.trim();
    }

    /**
     * 获取 动态创建时间 字段:dynamic.dynamic_create_date
     *
     * @return dynamic.dynamic_create_date, 动态创建时间
     */
    public Date getDynamicCreateDate() {
        return dynamicCreateDate;
    }

    /**
     * 设置 动态创建时间 字段:dynamic.dynamic_create_date
     *
     * @param dynamicCreateDate the value for dynamic.dynamic_create_date, 动态创建时间
     */
    public void setDynamicCreateDate(Date dynamicCreateDate) {
        this.dynamicCreateDate = dynamicCreateDate;
    }

    /**
     * 获取 动态是否删除 字段:dynamic.dynamic_is_del
     *
     * @return dynamic.dynamic_is_del, 动态是否删除
     */
    public Integer getDynamicIsDel() {
        return dynamicIsDel;
    }

    /**
     * 设置 动态是否删除 字段:dynamic.dynamic_is_del
     *
     * @param dynamicIsDel the value for dynamic.dynamic_is_del, 动态是否删除
     */
    public void setDynamicIsDel(Integer dynamicIsDel) {
        this.dynamicIsDel = dynamicIsDel;
    }

    /**
     * 获取 动态图片 字段:dynamic.dynamic_image_url
     *
     * @return dynamic.dynamic_image_url, 动态图片
     */
    public String getDynamicImageUrl() {
        return dynamicImageUrl;
    }

    /**
     * 设置 动态图片 字段:dynamic.dynamic_image_url
     *
     * @param dynamicImageUrl the value for dynamic.dynamic_image_url, 动态图片
     */
    public void setDynamicImageUrl(String dynamicImageUrl) {
        this.dynamicImageUrl = dynamicImageUrl == null ? null : dynamicImageUrl.trim();
    }

    /**
     * 获取 动态用户id 字段:dynamic.dynamic_user_id
     *
     * @return dynamic.dynamic_user_id, 动态用户id
     */
    public Long getDynamicUserId() {
        return dynamicUserId;
    }

    /**
     * 设置 动态用户id 字段:dynamic.dynamic_user_id
     *
     * @param dynamicUserId the value for dynamic.dynamic_user_id, 动态用户id
     */
    public void setDynamicUserId(Long dynamicUserId) {
        this.dynamicUserId = dynamicUserId;
    }

    /**
     * 获取 动态标签id 字段:dynamic.dynamic_lable_id
     *
     * @return dynamic.dynamic_lable_id, 动态标签id
     */
    public Long getDynamicLableId() {
        return dynamicLableId;
    }

    /**
     * 设置 动态标签id 字段:dynamic.dynamic_lable_id
     *
     * @param dynamicLableId the value for dynamic.dynamic_lable_id, 动态标签id
     */
    public void setDynamicLableId(Long dynamicLableId) {
        this.dynamicLableId = dynamicLableId;
    }

    /**
     * 获取 浏览量 字段:dynamic. dynamic_browse_records
     *
     * @return dynamic. dynamic_browse_records, 浏览量
     */
    public Long getDynamicBrowseRecords() {
        return dynamicBrowseRecords;
    }

    /**
     * 设置 浏览量 字段:dynamic. dynamic_browse_records
     *
     * @param dynamicBrowseRecords the value for dynamic. dynamic_browse_records, 浏览量
     */
    public void setDynamicBrowseRecords(Long dynamicBrowseRecords) {
        this.dynamicBrowseRecords = dynamicBrowseRecords;
    }
}