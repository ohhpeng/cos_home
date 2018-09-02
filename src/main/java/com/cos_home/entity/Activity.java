package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Activity
 * 数据库表：activity
 */
public class Activity implements Serializable {
    /**
     * 活动id
     * 表字段 : activity.activity_id
     */
    private Long activityId;

    /**
     * 活动名
     * 表字段 : activity.activity_name
     */
    private String activityName;

    /**
     * 活动图片
     * 表字段 : activity.activity_image_url
     */
    private String activityImageUrl;

    /**
     * 活动创建时间
     * 表字段 : activity.activity_createtime
     */
    private Date activityCreatetime;

    /**
     * 活动举办时间
     * 表字段 : activity.activity_start_holding
     */
    private Date activityStartHolding;

    /**
     * 活动结束时间
     * 表字段 : activity.activity_end_holding
     */
    private Date activityEndHolding;

    /**
     * 活动内容
     * 表字段 : activity.activity_content
     */
    private String activityContent;

    /**
     * 活动地址
     * 表字段 : activity.activity_address
     */
    private String activityAddress;

    /**
     * 活动是否删除（0否1是）
     * 表字段 : activity.activity_is_del
     */
    private Integer activityIsDel;

    /**
     * 赞助商
     * 表字段 : activity.activity_sponsor
     */
    private String activitySponsor;

    /**
     * 举办方
     * 表字段 : activity.activity_holder
     */
    private String activityHolder;

    /**
     * 活动参与人数
     * 表字段 : activity.activity_people_num
     */
    private Long activityPeopleNum;

    /**
     * 活动星级
     * 表字段 : activity.activity_star
     */
    private Integer activityStar;

    /**
     * 活动创建人Id
     * 表字段 : activity.activity_admin_id
     */
    private Long activityAdminId;

    /**
     * 活动是否长期(（0不是 1是）
     * 表字段 : activity.activity_is_Longterm
     */
    private Integer activityIsLongterm;

    /**
     * 活动参与人数是否有限制（0是 1否）
     * 表字段 : activity.activity_is_limit
     */
    private Integer activityIsLimit;

    /**
     * 活动开始报名时间
     * 表字段 : activity.activity_apply_start_time
     */
    private Date activityApplyStartTime;

    /**
     * 活动报名结束时间
     * 表字段 : activity.activity_apply_end_time
     */
    private Date activityApplyEndTime;

    /**
     * 已报名人数
     * 表字段 : activity.activity_apply_people_num
     */
    private Long activityApplyPeopleNum;

    /**
     * 活动报名是否需要审核（0否1是）
     * 表字段 : activity.activity_is_check
     */
    private Integer activityIsCheck;

    /**
     * 活动标签id
     * 表字段 : activity.activity_lable_id
     */
    private Long activityLableId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 活动id 字段:activity.activity_id
     *
     * @return activity.activity_id, 活动id
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置 活动id 字段:activity.activity_id
     *
     * @param activityId the value for activity.activity_id, 活动id
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取 活动名 字段:activity.activity_name
     *
     * @return activity.activity_name, 活动名
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置 活动名 字段:activity.activity_name
     *
     * @param activityName the value for activity.activity_name, 活动名
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * 获取 活动图片 字段:activity.activity_image_url
     *
     * @return activity.activity_image_url, 活动图片
     */
    public String getActivityImageUrl() {
        return activityImageUrl;
    }

    /**
     * 设置 活动图片 字段:activity.activity_image_url
     *
     * @param activityImageUrl the value for activity.activity_image_url, 活动图片
     */
    public void setActivityImageUrl(String activityImageUrl) {
        this.activityImageUrl = activityImageUrl == null ? null : activityImageUrl.trim();
    }

    /**
     * 获取 活动创建时间 字段:activity.activity_createtime
     *
     * @return activity.activity_createtime, 活动创建时间
     */
    public Date getActivityCreatetime() {
        return activityCreatetime;
    }

    /**
     * 设置 活动创建时间 字段:activity.activity_createtime
     *
     * @param activityCreatetime the value for activity.activity_createtime, 活动创建时间
     */
    public void setActivityCreatetime(Date activityCreatetime) {
        this.activityCreatetime = activityCreatetime;
    }

    /**
     * 获取 活动举办时间 字段:activity.activity_start_holding
     *
     * @return activity.activity_start_holding, 活动举办时间
     */
    public Date getActivityStartHolding() {
        return activityStartHolding;
    }

    /**
     * 设置 活动举办时间 字段:activity.activity_start_holding
     *
     * @param activityStartHolding the value for activity.activity_start_holding, 活动举办时间
     */
    public void setActivityStartHolding(Date activityStartHolding) {
        this.activityStartHolding = activityStartHolding;
    }

    /**
     * 获取 活动结束时间 字段:activity.activity_end_holding
     *
     * @return activity.activity_end_holding, 活动结束时间
     */
    public Date getActivityEndHolding() {
        return activityEndHolding;
    }

    /**
     * 设置 活动结束时间 字段:activity.activity_end_holding
     *
     * @param activityEndHolding the value for activity.activity_end_holding, 活动结束时间
     */
    public void setActivityEndHolding(Date activityEndHolding) {
        this.activityEndHolding = activityEndHolding;
    }

    /**
     * 获取 活动内容 字段:activity.activity_content
     *
     * @return activity.activity_content, 活动内容
     */
    public String getActivityContent() {
        return activityContent;
    }

    /**
     * 设置 活动内容 字段:activity.activity_content
     *
     * @param activityContent the value for activity.activity_content, 活动内容
     */
    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    /**
     * 获取 活动地址 字段:activity.activity_address
     *
     * @return activity.activity_address, 活动地址
     */
    public String getActivityAddress() {
        return activityAddress;
    }

    /**
     * 设置 活动地址 字段:activity.activity_address
     *
     * @param activityAddress the value for activity.activity_address, 活动地址
     */
    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    /**
     * 获取 活动是否删除（0否1是） 字段:activity.activity_is_del
     *
     * @return activity.activity_is_del, 活动是否删除（0否1是）
     */
    public Integer getActivityIsDel() {
        return activityIsDel;
    }

    /**
     * 设置 活动是否删除（0否1是） 字段:activity.activity_is_del
     *
     * @param activityIsDel the value for activity.activity_is_del, 活动是否删除（0否1是）
     */
    public void setActivityIsDel(Integer activityIsDel) {
        this.activityIsDel = activityIsDel;
    }

    /**
     * 获取 赞助商 字段:activity.activity_sponsor
     *
     * @return activity.activity_sponsor, 赞助商
     */
    public String getActivitySponsor() {
        return activitySponsor;
    }

    /**
     * 设置 赞助商 字段:activity.activity_sponsor
     *
     * @param activitySponsor the value for activity.activity_sponsor, 赞助商
     */
    public void setActivitySponsor(String activitySponsor) {
        this.activitySponsor = activitySponsor == null ? null : activitySponsor.trim();
    }

    /**
     * 获取 举办方 字段:activity.activity_holder
     *
     * @return activity.activity_holder, 举办方
     */
    public String getActivityHolder() {
        return activityHolder;
    }

    /**
     * 设置 举办方 字段:activity.activity_holder
     *
     * @param activityHolder the value for activity.activity_holder, 举办方
     */
    public void setActivityHolder(String activityHolder) {
        this.activityHolder = activityHolder == null ? null : activityHolder.trim();
    }

    /**
     * 获取 活动参与人数 字段:activity.activity_people_num
     *
     * @return activity.activity_people_num, 活动参与人数
     */
    public Long getActivityPeopleNum() {
        return activityPeopleNum;
    }

    /**
     * 设置 活动参与人数 字段:activity.activity_people_num
     *
     * @param activityPeopleNum the value for activity.activity_people_num, 活动参与人数
     */
    public void setActivityPeopleNum(Long activityPeopleNum) {
        this.activityPeopleNum = activityPeopleNum;
    }

    /**
     * 获取 活动星级 字段:activity.activity_star
     *
     * @return activity.activity_star, 活动星级
     */
    public Integer getActivityStar() {
        return activityStar;
    }

    /**
     * 设置 活动星级 字段:activity.activity_star
     *
     * @param activityStar the value for activity.activity_star, 活动星级
     */
    public void setActivityStar(Integer activityStar) {
        this.activityStar = activityStar;
    }

    /**
     * 获取 活动创建人Id 字段:activity.activity_admin_id
     *
     * @return activity.activity_admin_id, 活动创建人Id
     */
    public Long getActivityAdminId() {
        return activityAdminId;
    }

    /**
     * 设置 活动创建人Id 字段:activity.activity_admin_id
     *
     * @param activityAdminId the value for activity.activity_admin_id, 活动创建人Id
     */
    public void setActivityAdminId(Long activityAdminId) {
        this.activityAdminId = activityAdminId;
    }

    /**
     * 获取 活动是否长期(（0不是 1是） 字段:activity.activity_is_Longterm
     *
     * @return activity.activity_is_Longterm, 活动是否长期(（0不是 1是）
     */
    public Integer getActivityIsLongterm() {
        return activityIsLongterm;
    }

    /**
     * 设置 活动是否长期(（0不是 1是） 字段:activity.activity_is_Longterm
     *
     * @param activityIsLongterm the value for activity.activity_is_Longterm, 活动是否长期(（0不是 1是）
     */
    public void setActivityIsLongterm(Integer activityIsLongterm) {
        this.activityIsLongterm = activityIsLongterm;
    }

    /**
     * 获取 活动参与人数是否有限制（0是 1否） 字段:activity.activity_is_limit
     *
     * @return activity.activity_is_limit, 活动参与人数是否有限制（0是 1否）
     */
    public Integer getActivityIsLimit() {
        return activityIsLimit;
    }

    /**
     * 设置 活动参与人数是否有限制（0是 1否） 字段:activity.activity_is_limit
     *
     * @param activityIsLimit the value for activity.activity_is_limit, 活动参与人数是否有限制（0是 1否）
     */
    public void setActivityIsLimit(Integer activityIsLimit) {
        this.activityIsLimit = activityIsLimit;
    }

    /**
     * 获取 活动开始报名时间 字段:activity.activity_apply_start_time
     *
     * @return activity.activity_apply_start_time, 活动开始报名时间
     */
    public Date getActivityApplyStartTime() {
        return activityApplyStartTime;
    }

    /**
     * 设置 活动开始报名时间 字段:activity.activity_apply_start_time
     *
     * @param activityApplyStartTime the value for activity.activity_apply_start_time, 活动开始报名时间
     */
    public void setActivityApplyStartTime(Date activityApplyStartTime) {
        this.activityApplyStartTime = activityApplyStartTime;
    }

    /**
     * 获取 活动报名结束时间 字段:activity.activity_apply_end_time
     *
     * @return activity.activity_apply_end_time, 活动报名结束时间
     */
    public Date getActivityApplyEndTime() {
        return activityApplyEndTime;
    }

    /**
     * 设置 活动报名结束时间 字段:activity.activity_apply_end_time
     *
     * @param activityApplyEndTime the value for activity.activity_apply_end_time, 活动报名结束时间
     */
    public void setActivityApplyEndTime(Date activityApplyEndTime) {
        this.activityApplyEndTime = activityApplyEndTime;
    }

    /**
     * 获取 已报名人数 字段:activity.activity_apply_people_num
     *
     * @return activity.activity_apply_people_num, 已报名人数
     */
    public Long getActivityApplyPeopleNum() {
        return activityApplyPeopleNum;
    }

    /**
     * 设置 已报名人数 字段:activity.activity_apply_people_num
     *
     * @param activityApplyPeopleNum the value for activity.activity_apply_people_num, 已报名人数
     */
    public void setActivityApplyPeopleNum(Long activityApplyPeopleNum) {
        this.activityApplyPeopleNum = activityApplyPeopleNum;
    }

    /**
     * 获取 活动报名是否需要审核（0否1是） 字段:activity.activity_is_check
     *
     * @return activity.activity_is_check, 活动报名是否需要审核（0否1是）
     */
    public Integer getActivityIsCheck() {
        return activityIsCheck;
    }

    /**
     * 设置 活动报名是否需要审核（0否1是） 字段:activity.activity_is_check
     *
     * @param activityIsCheck the value for activity.activity_is_check, 活动报名是否需要审核（0否1是）
     */
    public void setActivityIsCheck(Integer activityIsCheck) {
        this.activityIsCheck = activityIsCheck;
    }

    /**
     * 获取 活动标签id 字段:activity.activity_lable_id
     *
     * @return activity.activity_lable_id, 活动标签id
     */
    public Long getActivityLableId() {
        return activityLableId;
    }

    /**
     * 设置 活动标签id 字段:activity.activity_lable_id
     *
     * @param activityLableId the value for activity.activity_lable_id, 活动标签id
     */
    public void setActivityLableId(Long activityLableId) {
        this.activityLableId = activityLableId;
    }
}