package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Focus
 * 数据库表：focus
 */
public class Focus implements Serializable {
    /**
     * 关注id
     * 表字段 : focus.focus_id
     */
    private Long focusId;

    /**
     * 关注者id
     * 表字段 : focus.focus_user_id
     */
    private Long focusUserId;

    /**
     * 关注状态（1关注）
     * 表字段 : focus.focus_state
     */
    private Integer focusState;

    /**
     * 关注时间
     * 表字段 : focus.focus_time
     */
    private Date focusTime;

    /**
     * 被关注者id
     * 表字段 : focus.focus_target_user_id
     */
    private Long focusTargetUserId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 关注id 字段:focus.focus_id
     *
     * @return focus.focus_id, 关注id
     */
    public Long getFocusId() {
        return focusId;
    }

    /**
     * 设置 关注id 字段:focus.focus_id
     *
     * @param focusId the value for focus.focus_id, 关注id
     */
    public void setFocusId(Long focusId) {
        this.focusId = focusId;
    }

    /**
     * 获取 关注者id 字段:focus.focus_user_id
     *
     * @return focus.focus_user_id, 关注者id
     */
    public Long getFocusUserId() {
        return focusUserId;
    }

    /**
     * 设置 关注者id 字段:focus.focus_user_id
     *
     * @param focusUserId the value for focus.focus_user_id, 关注者id
     */
    public void setFocusUserId(Long focusUserId) {
        this.focusUserId = focusUserId;
    }

    /**
     * 获取 关注状态（1关注） 字段:focus.focus_state
     *
     * @return focus.focus_state, 关注状态（1关注）
     */
    public Integer getFocusState() {
        return focusState;
    }

    /**
     * 设置 关注状态（1关注） 字段:focus.focus_state
     *
     * @param focusState the value for focus.focus_state, 关注状态（1关注）
     */
    public void setFocusState(Integer focusState) {
        this.focusState = focusState;
    }

    /**
     * 获取 关注时间 字段:focus.focus_time
     *
     * @return focus.focus_time, 关注时间
     */
    public Date getFocusTime() {
        return focusTime;
    }

    /**
     * 设置 关注时间 字段:focus.focus_time
     *
     * @param focusTime the value for focus.focus_time, 关注时间
     */
    public void setFocusTime(Date focusTime) {
        this.focusTime = focusTime;
    }

    /**
     * 获取 被关注者id 字段:focus.focus_target_user_id
     *
     * @return focus.focus_target_user_id, 被关注者id
     */
    public Long getFocusTargetUserId() {
        return focusTargetUserId;
    }

    /**
     * 设置 被关注者id 字段:focus.focus_target_user_id
     *
     * @param focusTargetUserId the value for focus.focus_target_user_id, 被关注者id
     */
    public void setFocusTargetUserId(Long focusTargetUserId) {
        this.focusTargetUserId = focusTargetUserId;
    }
}