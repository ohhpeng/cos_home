package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Orders
 * 数据库表：orders
 */
public class Orders implements Serializable {
    /**
     * 订单id
     * 表字段 : orders.order_id
     */
    private Long orderId;

    /**
     * 订单编号
     * 表字段 : orders.order_number
     */
    private Long orderNumber;

    /**
     * 服务人员id
     * 表字段 : orders.order_service_id
     */
    private Long orderServiceId;

    /**
     * 客户id
     * 表字段 : orders.order_user_id
     */
    private Long orderUserId;

    /**
     * 订单创建时间
     * 表字段 : orders.order_createtime
     */
    private Date orderCreatetime;

    /**
     * 订单内容
     * 表字段 : orders.order_content
     */
    private String orderContent;

    /**
     * 预定时间
     * 表字段 : orders.order_presettime
     */
    private Date orderPresettime;

    /**
     * 订单状态（0待确认 1已确认 2拒绝）
     * 表字段 : orders.order_state
     */
    private Integer orderState;

    /**
     * 订单服务地点
     * 表字段 : orders.order_serviceaddr
     */
    private String orderServiceaddr;

    /**
     * 是否删除 （0否1是）
     * 表字段 : orders.order_is_del
     */
    private Integer orderIsDel;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 订单id 字段:orders.order_id
     *
     * @return orders.order_id, 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置 订单id 字段:orders.order_id
     *
     * @param orderId the value for orders.order_id, 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取 订单编号 字段:orders.order_number
     *
     * @return orders.order_number, 订单编号
     */
    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置 订单编号 字段:orders.order_number
     *
     * @param orderNumber the value for orders.order_number, 订单编号
     */
    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取 服务人员id 字段:orders.order_service_id
     *
     * @return orders.order_service_id, 服务人员id
     */
    public Long getOrderServiceId() {
        return orderServiceId;
    }

    /**
     * 设置 服务人员id 字段:orders.order_service_id
     *
     * @param orderServiceId the value for orders.order_service_id, 服务人员id
     */
    public void setOrderServiceId(Long orderServiceId) {
        this.orderServiceId = orderServiceId;
    }

    /**
     * 获取 客户id 字段:orders.order_user_id
     *
     * @return orders.order_user_id, 客户id
     */
    public Long getOrderUserId() {
        return orderUserId;
    }

    /**
     * 设置 客户id 字段:orders.order_user_id
     *
     * @param orderUserId the value for orders.order_user_id, 客户id
     */
    public void setOrderUserId(Long orderUserId) {
        this.orderUserId = orderUserId;
    }

    /**
     * 获取 订单创建时间 字段:orders.order_createtime
     *
     * @return orders.order_createtime, 订单创建时间
     */
    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    /**
     * 设置 订单创建时间 字段:orders.order_createtime
     *
     * @param orderCreatetime the value for orders.order_createtime, 订单创建时间
     */
    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    /**
     * 获取 订单内容 字段:orders.order_content
     *
     * @return orders.order_content, 订单内容
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * 设置 订单内容 字段:orders.order_content
     *
     * @param orderContent the value for orders.order_content, 订单内容
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    /**
     * 获取 预定时间 字段:orders.order_presettime
     *
     * @return orders.order_presettime, 预定时间
     */
    public Date getOrderPresettime() {
        return orderPresettime;
    }

    /**
     * 设置 预定时间 字段:orders.order_presettime
     *
     * @param orderPresettime the value for orders.order_presettime, 预定时间
     */
    public void setOrderPresettime(Date orderPresettime) {
        this.orderPresettime = orderPresettime;
    }

    /**
     * 获取 订单状态（0待确认 1已确认 2拒绝） 字段:orders.order_state
     *
     * @return orders.order_state, 订单状态（0待确认 1已确认 2拒绝）
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * 设置 订单状态（0待确认 1已确认 2拒绝） 字段:orders.order_state
     *
     * @param orderState the value for orders.order_state, 订单状态（0待确认 1已确认 2拒绝）
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取 订单服务地点 字段:orders.order_serviceaddr
     *
     * @return orders.order_serviceaddr, 订单服务地点
     */
    public String getOrderServiceaddr() {
        return orderServiceaddr;
    }

    /**
     * 设置 订单服务地点 字段:orders.order_serviceaddr
     *
     * @param orderServiceaddr the value for orders.order_serviceaddr, 订单服务地点
     */
    public void setOrderServiceaddr(String orderServiceaddr) {
        this.orderServiceaddr = orderServiceaddr == null ? null : orderServiceaddr.trim();
    }

    /**
     * 获取 是否删除 （0否1是） 字段:orders.order_is_del
     *
     * @return orders.order_is_del, 是否删除 （0否1是）
     */
    public Integer getOrderIsDel() {
        return orderIsDel;
    }

    /**
     * 设置 是否删除 （0否1是） 字段:orders.order_is_del
     *
     * @param orderIsDel the value for orders.order_is_del, 是否删除 （0否1是）
     */
    public void setOrderIsDel(Integer orderIsDel) {
        this.orderIsDel = orderIsDel;
    }
}