package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Evaluate
 * 数据库表：evaluate
 */
public class Evaluate implements Serializable {
    /**
     * 评论id
     * 表字段 : evaluate.evaluate_id
     */
    private Long evaluateId;

    /**
     * 评论者id
     * 表字段 : evaluate.evaluate_user_id
     */
    private Long evaluateUserId;

    /**
     * 评论内容
     * 表字段 : evaluate.evaluate_content
     */
    private String evaluateContent;

    /**
     * 评论时间
     * 表字段 : evaluate.evaluate_time
     */
    private Date evaluateTime;

    /**
     * 作品id
     * 表字段 : evaluate.evaluate_works_id
     */
    private Long evaluateWorksId;

    /**
     * 景点id
     * 表字段 : evaluate.evaluate_view_id
     */
    private Long evaluateViewId;

    /**
     * 动态id
     * 表字段 : evaluate.evaluate_dynamic_id
     */
    private Long evaluateDynamicId;

    /**
     * 讨论id
     * 表字段 : evaluate.evaluate_discuss_id
     */
    private Long evaluateDiscussId;

    /**
     * 活动id
     * 表字段 : evaluate.evaluate_activity_id
     */
    private Long evaluateActivityId;

    /**
     * 订单id
     * 表字段 : evaluate.evaluate_order_id
     */
    private Long evaluateOrderId;

    /**
     * 被评论者Id
     * 表字段 : evaluate.evaluate_target_id
     */
    private Long evaluateTargetId;

    /**
     * 评论者名字
     * 表字段 : evaluate.evaluate_user_name
     */
    private String evaluateUserName;

    /**
     * 评论者头像
     * 表字段 : evaluate.evaluate_user_headThumb
     */
    private String evaluateUserHeadthumb;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 评论id 字段:evaluate.evaluate_id
     *
     * @return evaluate.evaluate_id, 评论id
     */
    public Long getEvaluateId() {
        return evaluateId;
    }

    /**
     * 设置 评论id 字段:evaluate.evaluate_id
     *
     * @param evaluateId the value for evaluate.evaluate_id, 评论id
     */
    public void setEvaluateId(Long evaluateId) {
        this.evaluateId = evaluateId;
    }

    /**
     * 获取 评论者id 字段:evaluate.evaluate_user_id
     *
     * @return evaluate.evaluate_user_id, 评论者id
     */
    public Long getEvaluateUserId() {
        return evaluateUserId;
    }

    /**
     * 设置 评论者id 字段:evaluate.evaluate_user_id
     *
     * @param evaluateUserId the value for evaluate.evaluate_user_id, 评论者id
     */
    public void setEvaluateUserId(Long evaluateUserId) {
        this.evaluateUserId = evaluateUserId;
    }

    /**
     * 获取 评论内容 字段:evaluate.evaluate_content
     *
     * @return evaluate.evaluate_content, 评论内容
     */
    public String getEvaluateContent() {
        return evaluateContent;
    }

    /**
     * 设置 评论内容 字段:evaluate.evaluate_content
     *
     * @param evaluateContent the value for evaluate.evaluate_content, 评论内容
     */
    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent == null ? null : evaluateContent.trim();
    }

    /**
     * 获取 评论时间 字段:evaluate.evaluate_time
     *
     * @return evaluate.evaluate_time, 评论时间
     */
    public Date getEvaluateTime() {
        return evaluateTime;
    }

    /**
     * 设置 评论时间 字段:evaluate.evaluate_time
     *
     * @param evaluateTime the value for evaluate.evaluate_time, 评论时间
     */
    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    /**
     * 获取 作品id 字段:evaluate.evaluate_works_id
     *
     * @return evaluate.evaluate_works_id, 作品id
     */
    public Long getEvaluateWorksId() {
        return evaluateWorksId;
    }

    /**
     * 设置 作品id 字段:evaluate.evaluate_works_id
     *
     * @param evaluateWorksId the value for evaluate.evaluate_works_id, 作品id
     */
    public void setEvaluateWorksId(Long evaluateWorksId) {
        this.evaluateWorksId = evaluateWorksId;
    }

    /**
     * 获取 景点id 字段:evaluate.evaluate_view_id
     *
     * @return evaluate.evaluate_view_id, 景点id
     */
    public Long getEvaluateViewId() {
        return evaluateViewId;
    }

    /**
     * 设置 景点id 字段:evaluate.evaluate_view_id
     *
     * @param evaluateViewId the value for evaluate.evaluate_view_id, 景点id
     */
    public void setEvaluateViewId(Long evaluateViewId) {
        this.evaluateViewId = evaluateViewId;
    }

    /**
     * 获取 动态id 字段:evaluate.evaluate_dynamic_id
     *
     * @return evaluate.evaluate_dynamic_id, 动态id
     */
    public Long getEvaluateDynamicId() {
        return evaluateDynamicId;
    }

    /**
     * 设置 动态id 字段:evaluate.evaluate_dynamic_id
     *
     * @param evaluateDynamicId the value for evaluate.evaluate_dynamic_id, 动态id
     */
    public void setEvaluateDynamicId(Long evaluateDynamicId) {
        this.evaluateDynamicId = evaluateDynamicId;
    }

    /**
     * 获取 讨论id 字段:evaluate.evaluate_discuss_id
     *
     * @return evaluate.evaluate_discuss_id, 讨论id
     */
    public Long getEvaluateDiscussId() {
        return evaluateDiscussId;
    }

    /**
     * 设置 讨论id 字段:evaluate.evaluate_discuss_id
     *
     * @param evaluateDiscussId the value for evaluate.evaluate_discuss_id, 讨论id
     */
    public void setEvaluateDiscussId(Long evaluateDiscussId) {
        this.evaluateDiscussId = evaluateDiscussId;
    }

    /**
     * 获取 活动id 字段:evaluate.evaluate_activity_id
     *
     * @return evaluate.evaluate_activity_id, 活动id
     */
    public Long getEvaluateActivityId() {
        return evaluateActivityId;
    }

    /**
     * 设置 活动id 字段:evaluate.evaluate_activity_id
     *
     * @param evaluateActivityId the value for evaluate.evaluate_activity_id, 活动id
     */
    public void setEvaluateActivityId(Long evaluateActivityId) {
        this.evaluateActivityId = evaluateActivityId;
    }

    /**
     * 获取 订单id 字段:evaluate.evaluate_order_id
     *
     * @return evaluate.evaluate_order_id, 订单id
     */
    public Long getEvaluateOrderId() {
        return evaluateOrderId;
    }

    /**
     * 设置 订单id 字段:evaluate.evaluate_order_id
     *
     * @param evaluateOrderId the value for evaluate.evaluate_order_id, 订单id
     */
    public void setEvaluateOrderId(Long evaluateOrderId) {
        this.evaluateOrderId = evaluateOrderId;
    }

    /**
     * 获取 被评论者Id 字段:evaluate.evaluate_target_id
     *
     * @return evaluate.evaluate_target_id, 被评论者Id
     */
    public Long getEvaluateTargetId() {
        return evaluateTargetId;
    }

    /**
     * 设置 被评论者Id 字段:evaluate.evaluate_target_id
     *
     * @param evaluateTargetId the value for evaluate.evaluate_target_id, 被评论者Id
     */
    public void setEvaluateTargetId(Long evaluateTargetId) {
        this.evaluateTargetId = evaluateTargetId;
    }

    /**
     * 获取 评论者名字 字段:evaluate.evaluate_user_name
     *
     * @return evaluate.evaluate_user_name, 评论者名字
     */
    public String getEvaluateUserName() {
        return evaluateUserName;
    }

    /**
     * 设置 评论者名字 字段:evaluate.evaluate_user_name
     *
     * @param evaluateUserName the value for evaluate.evaluate_user_name, 评论者名字
     */
    public void setEvaluateUserName(String evaluateUserName) {
        this.evaluateUserName = evaluateUserName == null ? null : evaluateUserName.trim();
    }

    /**
     * 获取 评论者头像 字段:evaluate.evaluate_user_headThumb
     *
     * @return evaluate.evaluate_user_headThumb, 评论者头像
     */
    public String getEvaluateUserHeadthumb() {
        return evaluateUserHeadthumb;
    }

    /**
     * 设置 评论者头像 字段:evaluate.evaluate_user_headThumb
     *
     * @param evaluateUserHeadthumb the value for evaluate.evaluate_user_headThumb, 评论者头像
     */
    public void setEvaluateUserHeadthumb(String evaluateUserHeadthumb) {
        this.evaluateUserHeadthumb = evaluateUserHeadthumb == null ? null : evaluateUserHeadthumb.trim();
    }
}