package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Works
 * 数据库表：works
 */
public class Works implements Serializable {
    /**
     * 
     * 表字段 : works.works_id
     */
    private Long worksId;

    /**
     * 作品名
     * 表字段 : works.works_name
     */
    private String worksName;

    /**
     * 作品介绍
     * 表字段 : works.works_introduce
     */
    private String worksIntroduce;

    /**
     * 作品图片
     * 表字段 : works.works_image_url
     */
    private String worksImageUrl;

    /**
     * 是否删除 （0否 1是）
     * 表字段 : works.works_is_del
     */
    private Integer worksIsDel;

    /**
     * 作品创建时间
     * 表字段 : works.works_createtime
     */
    private Date worksCreatetime;

    /**
     * 作品发布时间
     * 表字段 : works.works_publishtime
     */
    private Date worksPublishtime;

    /**
     * 审核状态（0待审核 1成功  2失败）
     * 表字段 : works.works_is_pass
     */
    private Integer worksIsPass;

    /**
     * 审核未通过原因
     * 表字段 : works.works_reason
     */
    private String worksReason;

    /**
     * 作品人气
     * 表字段 : works.works_popularity
     */
    private Long worksPopularity;

    /**
     * 作品的用户id
     * 表字段 : works.works_user_id
     */
    private Long worksUserId;

    /**
     * 作品标签id
     * 表字段 : works.works_lable_id
     */
    private Long worksLableId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:works.works_id
     *
     * @return works.works_id, 
     */
    public Long getWorksId() {
        return worksId;
    }

    /**
     * 设置  字段:works.works_id
     *
     * @param worksId the value for works.works_id, 
     */
    public void setWorksId(Long worksId) {
        this.worksId = worksId;
    }

    /**
     * 获取 作品名 字段:works.works_name
     *
     * @return works.works_name, 作品名
     */
    public String getWorksName() {
        return worksName;
    }

    /**
     * 设置 作品名 字段:works.works_name
     *
     * @param worksName the value for works.works_name, 作品名
     */
    public void setWorksName(String worksName) {
        this.worksName = worksName == null ? null : worksName.trim();
    }

    /**
     * 获取 作品介绍 字段:works.works_introduce
     *
     * @return works.works_introduce, 作品介绍
     */
    public String getWorksIntroduce() {
        return worksIntroduce;
    }

    /**
     * 设置 作品介绍 字段:works.works_introduce
     *
     * @param worksIntroduce the value for works.works_introduce, 作品介绍
     */
    public void setWorksIntroduce(String worksIntroduce) {
        this.worksIntroduce = worksIntroduce == null ? null : worksIntroduce.trim();
    }

    /**
     * 获取 作品图片 字段:works.works_image_url
     *
     * @return works.works_image_url, 作品图片
     */
    public String getWorksImageUrl() {
        return worksImageUrl;
    }

    /**
     * 设置 作品图片 字段:works.works_image_url
     *
     * @param worksImageUrl the value for works.works_image_url, 作品图片
     */
    public void setWorksImageUrl(String worksImageUrl) {
        this.worksImageUrl = worksImageUrl == null ? null : worksImageUrl.trim();
    }

    /**
     * 获取 是否删除 （0否 1是） 字段:works.works_is_del
     *
     * @return works.works_is_del, 是否删除 （0否 1是）
     */
    public Integer getWorksIsDel() {
        return worksIsDel;
    }

    /**
     * 设置 是否删除 （0否 1是） 字段:works.works_is_del
     *
     * @param worksIsDel the value for works.works_is_del, 是否删除 （0否 1是）
     */
    public void setWorksIsDel(Integer worksIsDel) {
        this.worksIsDel = worksIsDel;
    }

    /**
     * 获取 作品创建时间 字段:works.works_createtime
     *
     * @return works.works_createtime, 作品创建时间
     */
    public Date getWorksCreatetime() {
        return worksCreatetime;
    }

    /**
     * 设置 作品创建时间 字段:works.works_createtime
     *
     * @param worksCreatetime the value for works.works_createtime, 作品创建时间
     */
    public void setWorksCreatetime(Date worksCreatetime) {
        this.worksCreatetime = worksCreatetime;
    }

    /**
     * 获取 作品发布时间 字段:works.works_publishtime
     *
     * @return works.works_publishtime, 作品发布时间
     */
    public Date getWorksPublishtime() {
        return worksPublishtime;
    }

    /**
     * 设置 作品发布时间 字段:works.works_publishtime
     *
     * @param worksPublishtime the value for works.works_publishtime, 作品发布时间
     */
    public void setWorksPublishtime(Date worksPublishtime) {
        this.worksPublishtime = worksPublishtime;
    }

    /**
     * 获取 审核状态（0待审核 1成功  2失败） 字段:works.works_is_pass
     *
     * @return works.works_is_pass, 审核状态（0待审核 1成功  2失败）
     */
    public Integer getWorksIsPass() {
        return worksIsPass;
    }

    /**
     * 设置 审核状态（0待审核 1成功  2失败） 字段:works.works_is_pass
     *
     * @param worksIsPass the value for works.works_is_pass, 审核状态（0待审核 1成功  2失败）
     */
    public void setWorksIsPass(Integer worksIsPass) {
        this.worksIsPass = worksIsPass;
    }

    /**
     * 获取 审核未通过原因 字段:works.works_reason
     *
     * @return works.works_reason, 审核未通过原因
     */
    public String getWorksReason() {
        return worksReason;
    }

    /**
     * 设置 审核未通过原因 字段:works.works_reason
     *
     * @param worksReason the value for works.works_reason, 审核未通过原因
     */
    public void setWorksReason(String worksReason) {
        this.worksReason = worksReason == null ? null : worksReason.trim();
    }

    /**
     * 获取 作品人气 字段:works.works_popularity
     *
     * @return works.works_popularity, 作品人气
     */
    public Long getWorksPopularity() {
        return worksPopularity;
    }

    /**
     * 设置 作品人气 字段:works.works_popularity
     *
     * @param worksPopularity the value for works.works_popularity, 作品人气
     */
    public void setWorksPopularity(Long worksPopularity) {
        this.worksPopularity = worksPopularity;
    }

    /**
     * 获取 作品的用户id 字段:works.works_user_id
     *
     * @return works.works_user_id, 作品的用户id
     */
    public Long getWorksUserId() {
        return worksUserId;
    }

    /**
     * 设置 作品的用户id 字段:works.works_user_id
     *
     * @param worksUserId the value for works.works_user_id, 作品的用户id
     */
    public void setWorksUserId(Long worksUserId) {
        this.worksUserId = worksUserId;
    }

    /**
     * 获取 作品标签id 字段:works.works_lable_id
     *
     * @return works.works_lable_id, 作品标签id
     */
    public Long getWorksLableId() {
        return worksLableId;
    }

    /**
     * 设置 作品标签id 字段:works.works_lable_id
     *
     * @param worksLableId the value for works.works_lable_id, 作品标签id
     */
    public void setWorksLableId(Long worksLableId) {
        this.worksLableId = worksLableId;
    }
}