package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * View
 * 数据库表：view
 */
public class View implements Serializable {
    /**
     * 景点id
     * 表字段 : view.view_id
     */
    private Long viewId;

    /**
     * 景点名
     * 表字段 : view.view_name
     */
    private String viewName;

    /**
     * 景点介绍
     * 表字段 : view.view_introduce
     */
    private String viewIntroduce;

    /**
     * 景点地址
     * 表字段 : view.view_address
     */
    private String viewAddress;

    /**
     * 所属景区
     * 表字段 : view.view_spot
     */
    private String viewSpot;

    /**
     * 门票数
     * 表字段 : view.view_ticket_num
     */
    private Long viewTicketNum;

    /**
     * 景点图
     * 表字段 : view.view_image_url
     */
    private String viewImageUrl;

    /**
     * 创建时间
     * 表字段 : view.view_create_date
     */
    private Date viewCreateDate;

    /**
     * 创建者id
     * 表字段 : view.view_admin_id
     */
    private Long viewAdminId;

    /**
     * 是否删除（0否 1是）
     * 表字段 : view.view_is_del
     */
    private Integer viewIsDel;

    /**
     * 更新时间
     * 表字段 : view.view_update_date
     */
    private Date viewUpdateDate;

    /**
     * 景点标签id
     * 表字段 : view.view_lable_id
     */
    private Long viewLableId;

    /**
     * 景点开放时间
     * 表字段 : view.view_open_time
     */
    private Date viewOpenTime;

    /**
     * 景点关闭时间
     * 表字段 : view.view_close_time
     */
    private Date viewCloseTime;

    /**
     * 景点信息补充说明
     * 表字段 : view.view_instructions
     */
    private String viewInstructions;

    /**
     * 浏览量
     * 表字段 : view.view_visit_record
     */
    private Long viewVisitRecord;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 景点id 字段:view.view_id
     *
     * @return view.view_id, 景点id
     */
    public Long getViewId() {
        return viewId;
    }

    /**
     * 设置 景点id 字段:view.view_id
     *
     * @param viewId the value for view.view_id, 景点id
     */
    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }

    /**
     * 获取 景点名 字段:view.view_name
     *
     * @return view.view_name, 景点名
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 设置 景点名 字段:view.view_name
     *
     * @param viewName the value for view.view_name, 景点名
     */
    public void setViewName(String viewName) {
        this.viewName = viewName == null ? null : viewName.trim();
    }

    /**
     * 获取 景点介绍 字段:view.view_introduce
     *
     * @return view.view_introduce, 景点介绍
     */
    public String getViewIntroduce() {
        return viewIntroduce;
    }

    /**
     * 设置 景点介绍 字段:view.view_introduce
     *
     * @param viewIntroduce the value for view.view_introduce, 景点介绍
     */
    public void setViewIntroduce(String viewIntroduce) {
        this.viewIntroduce = viewIntroduce == null ? null : viewIntroduce.trim();
    }

    /**
     * 获取 景点地址 字段:view.view_address
     *
     * @return view.view_address, 景点地址
     */
    public String getViewAddress() {
        return viewAddress;
    }

    /**
     * 设置 景点地址 字段:view.view_address
     *
     * @param viewAddress the value for view.view_address, 景点地址
     */
    public void setViewAddress(String viewAddress) {
        this.viewAddress = viewAddress == null ? null : viewAddress.trim();
    }

    /**
     * 获取 所属景区 字段:view.view_spot
     *
     * @return view.view_spot, 所属景区
     */
    public String getViewSpot() {
        return viewSpot;
    }

    /**
     * 设置 所属景区 字段:view.view_spot
     *
     * @param viewSpot the value for view.view_spot, 所属景区
     */
    public void setViewSpot(String viewSpot) {
        this.viewSpot = viewSpot == null ? null : viewSpot.trim();
    }

    /**
     * 获取 门票数 字段:view.view_ticket_num
     *
     * @return view.view_ticket_num, 门票数
     */
    public Long getViewTicketNum() {
        return viewTicketNum;
    }

    /**
     * 设置 门票数 字段:view.view_ticket_num
     *
     * @param viewTicketNum the value for view.view_ticket_num, 门票数
     */
    public void setViewTicketNum(Long viewTicketNum) {
        this.viewTicketNum = viewTicketNum;
    }

    /**
     * 获取 景点图 字段:view.view_image_url
     *
     * @return view.view_image_url, 景点图
     */
    public String getViewImageUrl() {
        return viewImageUrl;
    }

    /**
     * 设置 景点图 字段:view.view_image_url
     *
     * @param viewImageUrl the value for view.view_image_url, 景点图
     */
    public void setViewImageUrl(String viewImageUrl) {
        this.viewImageUrl = viewImageUrl == null ? null : viewImageUrl.trim();
    }

    /**
     * 获取 创建时间 字段:view.view_create_date
     *
     * @return view.view_create_date, 创建时间
     */
    public Date getViewCreateDate() {
        return viewCreateDate;
    }

    /**
     * 设置 创建时间 字段:view.view_create_date
     *
     * @param viewCreateDate the value for view.view_create_date, 创建时间
     */
    public void setViewCreateDate(Date viewCreateDate) {
        this.viewCreateDate = viewCreateDate;
    }

    /**
     * 获取 创建者id 字段:view.view_admin_id
     *
     * @return view.view_admin_id, 创建者id
     */
    public Long getViewAdminId() {
        return viewAdminId;
    }

    /**
     * 设置 创建者id 字段:view.view_admin_id
     *
     * @param viewAdminId the value for view.view_admin_id, 创建者id
     */
    public void setViewAdminId(Long viewAdminId) {
        this.viewAdminId = viewAdminId;
    }

    /**
     * 获取 是否删除（0否 1是） 字段:view.view_is_del
     *
     * @return view.view_is_del, 是否删除（0否 1是）
     */
    public Integer getViewIsDel() {
        return viewIsDel;
    }

    /**
     * 设置 是否删除（0否 1是） 字段:view.view_is_del
     *
     * @param viewIsDel the value for view.view_is_del, 是否删除（0否 1是）
     */
    public void setViewIsDel(Integer viewIsDel) {
        this.viewIsDel = viewIsDel;
    }

    /**
     * 获取 更新时间 字段:view.view_update_date
     *
     * @return view.view_update_date, 更新时间
     */
    public Date getViewUpdateDate() {
        return viewUpdateDate;
    }

    /**
     * 设置 更新时间 字段:view.view_update_date
     *
     * @param viewUpdateDate the value for view.view_update_date, 更新时间
     */
    public void setViewUpdateDate(Date viewUpdateDate) {
        this.viewUpdateDate = viewUpdateDate;
    }

    /**
     * 获取 景点标签id 字段:view.view_lable_id
     *
     * @return view.view_lable_id, 景点标签id
     */
    public Long getViewLableId() {
        return viewLableId;
    }

    /**
     * 设置 景点标签id 字段:view.view_lable_id
     *
     * @param viewLableId the value for view.view_lable_id, 景点标签id
     */
    public void setViewLableId(Long viewLableId) {
        this.viewLableId = viewLableId;
    }

    /**
     * 获取 景点开放时间 字段:view.view_open_time
     *
     * @return view.view_open_time, 景点开放时间
     */
    public Date getViewOpenTime() {
        return viewOpenTime;
    }

    /**
     * 设置 景点开放时间 字段:view.view_open_time
     *
     * @param viewOpenTime the value for view.view_open_time, 景点开放时间
     */
    public void setViewOpenTime(Date viewOpenTime) {
        this.viewOpenTime = viewOpenTime;
    }

    /**
     * 获取 景点关闭时间 字段:view.view_close_time
     *
     * @return view.view_close_time, 景点关闭时间
     */
    public Date getViewCloseTime() {
        return viewCloseTime;
    }

    /**
     * 设置 景点关闭时间 字段:view.view_close_time
     *
     * @param viewCloseTime the value for view.view_close_time, 景点关闭时间
     */
    public void setViewCloseTime(Date viewCloseTime) {
        this.viewCloseTime = viewCloseTime;
    }

    /**
     * 获取 景点信息补充说明 字段:view.view_instructions
     *
     * @return view.view_instructions, 景点信息补充说明
     */
    public String getViewInstructions() {
        return viewInstructions;
    }

    /**
     * 设置 景点信息补充说明 字段:view.view_instructions
     *
     * @param viewInstructions the value for view.view_instructions, 景点信息补充说明
     */
    public void setViewInstructions(String viewInstructions) {
        this.viewInstructions = viewInstructions == null ? null : viewInstructions.trim();
    }

    /**
     * 获取 浏览量 字段:view.view_visit_record
     *
     * @return view.view_visit_record, 浏览量
     */
    public Long getViewVisitRecord() {
        return viewVisitRecord;
    }

    /**
     * 设置 浏览量 字段:view.view_visit_record
     *
     * @param viewVisitRecord the value for view.view_visit_record, 浏览量
     */
    public void setViewVisitRecord(Long viewVisitRecord) {
        this.viewVisitRecord = viewVisitRecord;
    }
}