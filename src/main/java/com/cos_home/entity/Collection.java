package com.cos_home.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Collection
 * 数据库表：collection
 */
public class Collection implements Serializable {
    /**
     * 收藏id
     * 表字段 : collection.collection_id
     */
    private Long collectionId;

    /**
     * 收藏类型（1 活动 2景点 3作品）
     * 表字段 : collection.collection_type
     */
    private Integer collectionType;

    /**
     * 收藏所属id
     * 表字段 : collection.collection_belong_id
     */
    private Long collectionBelongId;

    /**
     * 收藏者id
     * 表字段 : collection.collection_user_id
     */
    private Long collectionUserId;

    /**
     * 收藏时间
     * 表字段 : collection.collection_time
     */
    private Date collectionTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 收藏id 字段:collection.collection_id
     *
     * @return collection.collection_id, 收藏id
     */
    public Long getCollectionId() {
        return collectionId;
    }

    /**
     * 设置 收藏id 字段:collection.collection_id
     *
     * @param collectionId the value for collection.collection_id, 收藏id
     */
    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 获取 收藏类型（1 活动 2景点 3作品） 字段:collection.collection_type
     *
     * @return collection.collection_type, 收藏类型（1 活动 2景点 3作品）
     */
    public Integer getCollectionType() {
        return collectionType;
    }

    /**
     * 设置 收藏类型（1 活动 2景点 3作品） 字段:collection.collection_type
     *
     * @param collectionType the value for collection.collection_type, 收藏类型（1 活动 2景点 3作品）
     */
    public void setCollectionType(Integer collectionType) {
        this.collectionType = collectionType;
    }

    /**
     * 获取 收藏所属id 字段:collection.collection_belong_id
     *
     * @return collection.collection_belong_id, 收藏所属id
     */
    public Long getCollectionBelongId() {
        return collectionBelongId;
    }

    /**
     * 设置 收藏所属id 字段:collection.collection_belong_id
     *
     * @param collectionBelongId the value for collection.collection_belong_id, 收藏所属id
     */
    public void setCollectionBelongId(Long collectionBelongId) {
        this.collectionBelongId = collectionBelongId;
    }

    /**
     * 获取 收藏者id 字段:collection.collection_user_id
     *
     * @return collection.collection_user_id, 收藏者id
     */
    public Long getCollectionUserId() {
        return collectionUserId;
    }

    /**
     * 设置 收藏者id 字段:collection.collection_user_id
     *
     * @param collectionUserId the value for collection.collection_user_id, 收藏者id
     */
    public void setCollectionUserId(Long collectionUserId) {
        this.collectionUserId = collectionUserId;
    }

    /**
     * 获取 收藏时间 字段:collection.collection_time
     *
     * @return collection.collection_time, 收藏时间
     */
    public Date getCollectionTime() {
        return collectionTime;
    }

    /**
     * 设置 收藏时间 字段:collection.collection_time
     *
     * @param collectionTime the value for collection.collection_time, 收藏时间
     */
    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }
}