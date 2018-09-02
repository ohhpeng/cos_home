package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Zan
 * 数据库表：zan
 */
public class Zan implements Serializable {
    /**
     * 点赞id
     * 表字段 : zan.zan_id
     */
    private Long zanId;

    /**
     * 点赞人id
     * 表字段 : zan.zan_user_id
     */
    private Long zanUserId;

    /**
     * 被点赞人id
     * 表字段 : zan.zan_target_user_id
     */
    private Long zanTargetUserId;

    /**
     * 点赞时间
     * 表字段 : zan.zan_create_time
     */
    private Date zanCreateTime;

    /**
     * 点赞状态（0未点赞  1已点赞）
     * 表字段 : zan.zan_state
     */
    private Integer zanState;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 点赞id 字段:zan.zan_id
     *
     * @return zan.zan_id, 点赞id
     */
    public Long getZanId() {
        return zanId;
    }

    /**
     * 设置 点赞id 字段:zan.zan_id
     *
     * @param zanId the value for zan.zan_id, 点赞id
     */
    public void setZanId(Long zanId) {
        this.zanId = zanId;
    }

    /**
     * 获取 点赞人id 字段:zan.zan_user_id
     *
     * @return zan.zan_user_id, 点赞人id
     */
    public Long getZanUserId() {
        return zanUserId;
    }

    /**
     * 设置 点赞人id 字段:zan.zan_user_id
     *
     * @param zanUserId the value for zan.zan_user_id, 点赞人id
     */
    public void setZanUserId(Long zanUserId) {
        this.zanUserId = zanUserId;
    }

    /**
     * 获取 被点赞人id 字段:zan.zan_target_user_id
     *
     * @return zan.zan_target_user_id, 被点赞人id
     */
    public Long getZanTargetUserId() {
        return zanTargetUserId;
    }

    /**
     * 设置 被点赞人id 字段:zan.zan_target_user_id
     *
     * @param zanTargetUserId the value for zan.zan_target_user_id, 被点赞人id
     */
    public void setZanTargetUserId(Long zanTargetUserId) {
        this.zanTargetUserId = zanTargetUserId;
    }

    /**
     * 获取 点赞时间 字段:zan.zan_create_time
     *
     * @return zan.zan_create_time, 点赞时间
     */
    public Date getZanCreateTime() {
        return zanCreateTime;
    }

    /**
     * 设置 点赞时间 字段:zan.zan_create_time
     *
     * @param zanCreateTime the value for zan.zan_create_time, 点赞时间
     */
    public void setZanCreateTime(Date zanCreateTime) {
        this.zanCreateTime = zanCreateTime;
    }

    /**
     * 获取 点赞状态（0未点赞  1已点赞） 字段:zan.zan_state
     *
     * @return zan.zan_state, 点赞状态（0未点赞  1已点赞）
     */
    public Integer getZanState() {
        return zanState;
    }

    /**
     * 设置 点赞状态（0未点赞  1已点赞） 字段:zan.zan_state
     *
     * @param zanState the value for zan.zan_state, 点赞状态（0未点赞  1已点赞）
     */
    public void setZanState(Integer zanState) {
        this.zanState = zanState;
    }
}