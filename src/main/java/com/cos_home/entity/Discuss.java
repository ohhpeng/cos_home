package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Discuss
 * 数据库表：discuss
 */
public class Discuss implements Serializable {
    /**
     * 讨论id
     * 表字段 : discuss.discuss_id
     */
    private Long discussId;

    /**
     * 讨论者id
     * 表字段 : discuss.discuss_user_id
     */
    private Long discussUserId;

    /**
     * 讨论名
     * 表字段 : discuss.discuss_name
     */
    private String discussName;

    /**
     * 讨论内容
     * 表字段 : discuss.discuss_content
     */
    private String discussContent;

    /**
     * 讨论创建时间
     * 表字段 : discuss.discuss_createtime
     */
    private Date discussCreatetime;

    /**
     * 讨论图片
     * 表字段 : discuss.discuss_image_url
     */
    private String discussImageUrl;

    /**
     * 讨论标签id
     * 表字段 : discuss.discuss_lable_id
     */
    private Long discussLableId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 讨论id 字段:discuss.discuss_id
     *
     * @return discuss.discuss_id, 讨论id
     */
    public Long getDiscussId() {
        return discussId;
    }

    /**
     * 设置 讨论id 字段:discuss.discuss_id
     *
     * @param discussId the value for discuss.discuss_id, 讨论id
     */
    public void setDiscussId(Long discussId) {
        this.discussId = discussId;
    }

    /**
     * 获取 讨论者id 字段:discuss.discuss_user_id
     *
     * @return discuss.discuss_user_id, 讨论者id
     */
    public Long getDiscussUserId() {
        return discussUserId;
    }

    /**
     * 设置 讨论者id 字段:discuss.discuss_user_id
     *
     * @param discussUserId the value for discuss.discuss_user_id, 讨论者id
     */
    public void setDiscussUserId(Long discussUserId) {
        this.discussUserId = discussUserId;
    }

    /**
     * 获取 讨论名 字段:discuss.discuss_name
     *
     * @return discuss.discuss_name, 讨论名
     */
    public String getDiscussName() {
        return discussName;
    }

    /**
     * 设置 讨论名 字段:discuss.discuss_name
     *
     * @param discussName the value for discuss.discuss_name, 讨论名
     */
    public void setDiscussName(String discussName) {
        this.discussName = discussName == null ? null : discussName.trim();
    }

    /**
     * 获取 讨论内容 字段:discuss.discuss_content
     *
     * @return discuss.discuss_content, 讨论内容
     */
    public String getDiscussContent() {
        return discussContent;
    }

    /**
     * 设置 讨论内容 字段:discuss.discuss_content
     *
     * @param discussContent the value for discuss.discuss_content, 讨论内容
     */
    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent == null ? null : discussContent.trim();
    }

    /**
     * 获取 讨论创建时间 字段:discuss.discuss_createtime
     *
     * @return discuss.discuss_createtime, 讨论创建时间
     */
    public Date getDiscussCreatetime() {
        return discussCreatetime;
    }

    /**
     * 设置 讨论创建时间 字段:discuss.discuss_createtime
     *
     * @param discussCreatetime the value for discuss.discuss_createtime, 讨论创建时间
     */
    public void setDiscussCreatetime(Date discussCreatetime) {
        this.discussCreatetime = discussCreatetime;
    }

    /**
     * 获取 讨论图片 字段:discuss.discuss_image_url
     *
     * @return discuss.discuss_image_url, 讨论图片
     */
    public String getDiscussImageUrl() {
        return discussImageUrl;
    }

    /**
     * 设置 讨论图片 字段:discuss.discuss_image_url
     *
     * @param discussImageUrl the value for discuss.discuss_image_url, 讨论图片
     */
    public void setDiscussImageUrl(String discussImageUrl) {
        this.discussImageUrl = discussImageUrl == null ? null : discussImageUrl.trim();
    }

    /**
     * 获取 讨论标签id 字段:discuss.discuss_lable_id
     *
     * @return discuss.discuss_lable_id, 讨论标签id
     */
    public Long getDiscussLableId() {
        return discussLableId;
    }

    /**
     * 设置 讨论标签id 字段:discuss.discuss_lable_id
     *
     * @param discussLableId the value for discuss.discuss_lable_id, 讨论标签id
     */
    public void setDiscussLableId(Long discussLableId) {
        this.discussLableId = discussLableId;
    }
}