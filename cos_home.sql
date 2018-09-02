/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : cos_home

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-08-30 23:22:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `activity_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '活动id',
  `activity_name` varchar(64) DEFAULT NULL COMMENT '活动名',
  `activity_image_url` varchar(255) DEFAULT NULL COMMENT '活动图片',
  `activity_createtime` datetime DEFAULT NULL COMMENT '活动创建时间',
  `activity_start_holding` datetime DEFAULT NULL COMMENT '活动举办时间',
  `activity_end_holding` datetime DEFAULT NULL COMMENT '活动结束时间',
  `activity_content` varchar(255) DEFAULT NULL COMMENT '活动内容',
  `activity_address` varchar(128) DEFAULT NULL COMMENT '活动地址',
  `activity_is_del` int(11) DEFAULT '0' COMMENT '活动是否删除（0否1是）',
  `activity_sponsor` varchar(255) DEFAULT NULL COMMENT '赞助商',
  `activity_holder` varchar(128) DEFAULT NULL COMMENT '举办方',
  `activity_people_num` bigint(20) DEFAULT NULL COMMENT '活动参与人数',
  `activity_star` int(11) DEFAULT NULL COMMENT '活动星级',
  `activity_admin_id` bigint(20) DEFAULT NULL COMMENT '活动创建人Id',
  `activity_is_Longterm` int(2) DEFAULT NULL COMMENT '活动是否长期(（0不是 1是）',
  `activity_is_limit` int(2) DEFAULT NULL COMMENT '活动参与人数是否有限制（0是 1否）',
  `activity_apply_start_time` datetime DEFAULT NULL COMMENT '活动开始报名时间',
  `activity_apply_end_time` datetime DEFAULT NULL COMMENT '活动报名结束时间',
  `activity_apply_people_num` bigint(20) DEFAULT NULL COMMENT '已报名人数',
  `activity_is_check` int(2) DEFAULT NULL COMMENT '活动报名是否需要审核（0否1是）',
  `activity_lable_id` bigint(20) DEFAULT NULL COMMENT '活动标签id',
  PRIMARY KEY (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '管理员Id',
  `admin_account` varchar(32) DEFAULT NULL COMMENT '用户名',
  `admin_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `admin_phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `admin_email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `admin_salt` varchar(32) DEFAULT NULL COMMENT '盐',
  `admin_password` varchar(64) DEFAULT NULL COMMENT '密码',
  `admin_portrait_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `admin_gender` varchar(4) DEFAULT NULL COMMENT ' 性别',
  `admin_is_del` int(11) DEFAULT '0' COMMENT '是否删除(0否1是）',
  `admin_state` int(11) DEFAULT NULL COMMENT '管理员状态',
  `admin_create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `admin_create_id` bigint(20) DEFAULT NULL COMMENT '创建id',
  `admin_role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `collection_id` bigint(20) NOT NULL COMMENT '收藏id',
  `collection_type` int(2) DEFAULT NULL COMMENT '收藏类型（1 活动 2景点 3作品）',
  `collection_belong_id` bigint(20) DEFAULT NULL COMMENT '收藏所属id',
  `collection_user_id` bigint(20) DEFAULT NULL COMMENT '收藏者id',
  `collection_time` datetime DEFAULT NULL COMMENT '收藏时间',
  PRIMARY KEY (`collection_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `discuss_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '讨论id',
  `discuss_user_id` bigint(20) DEFAULT NULL COMMENT '讨论者id',
  `discuss_name` varchar(128) DEFAULT NULL COMMENT '讨论名',
  `discuss_content` varchar(255) DEFAULT NULL COMMENT '讨论内容',
  `discuss_createtime` datetime DEFAULT NULL COMMENT '讨论创建时间',
  `discuss_image_url` varchar(255) DEFAULT NULL COMMENT '讨论图片',
  `discuss_lable_id` bigint(20) DEFAULT NULL COMMENT '讨论标签id',
  PRIMARY KEY (`discuss_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dynamic
-- ----------------------------
DROP TABLE IF EXISTS `dynamic`;
CREATE TABLE `dynamic` (
  `dynamic_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '动态id',
  `dynamic_content` varchar(255) DEFAULT NULL COMMENT '动态内容',
  `dynamic_create_date` datetime DEFAULT NULL COMMENT '动态创建时间',
  `dynamic_is_del` int(11) DEFAULT NULL COMMENT '动态是否删除',
  `dynamic_image_url` varchar(255) DEFAULT NULL COMMENT '动态图片',
  `dynamic_user_id` bigint(20) DEFAULT NULL COMMENT '动态用户id',
  `dynamic_lable_id` bigint(20) DEFAULT NULL COMMENT '动态标签id',
  PRIMARY KEY (`dynamic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate` (
  `evaluate_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `evaluate_user_id` bigint(20) DEFAULT NULL COMMENT '评论者id',
  `evaluate_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `evaluate_time` datetime DEFAULT NULL COMMENT '评论时间',
  `evaluate_works_id` bigint(20) DEFAULT NULL COMMENT '作品id',
  `evaluate_view_id` bigint(20) DEFAULT NULL COMMENT '景点id',
  `evaluate_dynamic_id` bigint(20) DEFAULT NULL COMMENT '动态id',
  `evaluate_discuss_id` bigint(20) DEFAULT NULL COMMENT '讨论id',
  `evaluate_activity_id` bigint(20) DEFAULT NULL COMMENT '活动id',
  `evaluate_order_id` bigint(20) DEFAULT NULL COMMENT '订单id',
  `evaluate_target_id` bigint(20) DEFAULT NULL COMMENT '被评论者Id',
  `evaluate_user_name` varchar(32) DEFAULT NULL COMMENT '评论者名字',
  `evaluate_user_headThumb` varchar(255) DEFAULT NULL COMMENT '评论者头像',
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for focus
-- ----------------------------
DROP TABLE IF EXISTS `focus`;
CREATE TABLE `focus` (
  `focus_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关注id',
  `focus_user_id` bigint(20) DEFAULT NULL COMMENT '关注者id',
  `focus_state` int(11) DEFAULT NULL COMMENT '关注状态（1关注）',
  `focus_time` datetime DEFAULT NULL COMMENT '关注时间',
  `focus_target_user_id` bigint(20) DEFAULT NULL COMMENT '被关注者id',
  PRIMARY KEY (`focus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for lable
-- ----------------------------
DROP TABLE IF EXISTS `lable`;
CREATE TABLE `lable` (
  `dislable_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `dislable_name` varchar(20) DEFAULT NULL COMMENT '标签名',
  `dislable_user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `dislable_type` int(2) DEFAULT NULL COMMENT '标签类型（1讨论 2动态 3景点 4作品 5活动）',
  `dislable_admin_id` bigint(20) DEFAULT NULL COMMENT '管理员id',
  PRIMARY KEY (`dislable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_number` bigint(20) DEFAULT NULL COMMENT '订单编号',
  `order_service_id` bigint(20) DEFAULT NULL COMMENT '服务人员id',
  `order_user_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `order_createtime` datetime DEFAULT NULL COMMENT '订单创建时间',
  `order_content` varchar(128) DEFAULT NULL COMMENT '订单内容',
  `order_presettime` datetime DEFAULT NULL COMMENT '预定时间',
  `order_state` int(11) DEFAULT '0' COMMENT '订单状态（0待确认 1已确认 2拒绝）',
  `order_serviceaddr` varchar(128) DEFAULT NULL COMMENT '订单服务地点',
  `order_is_del` int(2) DEFAULT '0' COMMENT '是否删除 （0否1是）',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `permission_name` varchar(32) DEFAULT NULL COMMENT '权限名',
  `permission_description` varchar(128) DEFAULT NULL COMMENT '权限描述',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(20) DEFAULT NULL COMMENT '角色名',
  `role_description` varchar(128) DEFAULT NULL COMMENT '角色描述',
  `role_permission_id` bigint(20) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `user_account` varchar(32) DEFAULT NULL COMMENT '用户名',
  `user_phone` varchar(20) DEFAULT NULL COMMENT ' 手机号',
  `user_password` varchar(64) DEFAULT NULL COMMENT '密码',
  `user_address` varchar(128) DEFAULT '' COMMENT '用户地址',
  `user_email` varchar(64) DEFAULT NULL COMMENT '用户邮箱',
  `user_gender` varchar(4) DEFAULT NULL COMMENT '用户性别',
  `user_register` datetime DEFAULT NULL COMMENT '注册时间',
  `user_is_del` int(11) DEFAULT '0' COMMENT '是否删除（0否1是）',
  `user_portrait_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `user_token` varchar(64) DEFAULT NULL,
  `user_salt` varchar(32) DEFAULT NULL COMMENT '盐',
  `user_type` int(11) DEFAULT NULL COMMENT '用户类型(0普通用户 1服务人员）',
  `user_honor` varchar(255) DEFAULT NULL COMMENT '所获荣誉',
  `user_experience` varchar(255) DEFAULT NULL COMMENT '工作经历',
  `user_order_price` double DEFAULT NULL COMMENT '订单价位',
  `user_is_frozen` int(2) DEFAULT '0' COMMENT '是否被冻结（0否 1是）',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for view
-- ----------------------------
DROP TABLE IF EXISTS `view`;
CREATE TABLE `view` (
  `view_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '景点id',
  `view_name` varchar(64) DEFAULT NULL COMMENT '景点名',
  `view_introduce` varchar(255) DEFAULT NULL COMMENT '景点介绍',
  `view_address` varchar(64) DEFAULT NULL COMMENT '景点地址',
  `view_spot` varchar(32) DEFAULT NULL COMMENT '所属景区',
  `view_ticket_num` bigint(20) DEFAULT NULL COMMENT '门票数',
  `view_image_url` varchar(255) DEFAULT NULL COMMENT '景点图',
  `view_create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `view_admin_id` bigint(20) DEFAULT NULL COMMENT '创建者id',
  `view_is_del` int(11) DEFAULT '0' COMMENT '是否删除（0否 1是）',
  `view_update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `view_lable_id` bigint(20) DEFAULT NULL COMMENT '景点标签id',
  `view_open_time` datetime DEFAULT NULL COMMENT '景点开放时间',
  `view_close_time` datetime DEFAULT NULL COMMENT '景点关闭时间',
  `view_instructions` varchar(255) DEFAULT NULL COMMENT '景点信息补充说明',
  PRIMARY KEY (`view_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for works
-- ----------------------------
DROP TABLE IF EXISTS `works`;
CREATE TABLE `works` (
  `works_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `works_name` varchar(64) DEFAULT NULL COMMENT '作品名',
  `works_introduce` varchar(128) DEFAULT NULL COMMENT '作品介绍',
  `works_image_url` varchar(255) DEFAULT NULL COMMENT '作品图片',
  `works_is_del` int(11) DEFAULT '0' COMMENT '是否删除 （0否 1是）',
  `works_createtime` datetime DEFAULT NULL COMMENT '作品创建时间',
  `works_publishtime` datetime DEFAULT NULL COMMENT '作品发布时间',
  `works_is_pass` int(11) DEFAULT '0' COMMENT '审核状态（0待审核 1成功  2失败）',
  `works_reason` varchar(128) DEFAULT NULL COMMENT '审核未通过原因',
  `works_popularity` bigint(20) DEFAULT NULL COMMENT '作品人气',
  `works_user_id` bigint(20) DEFAULT NULL COMMENT '作品的用户id',
  `works_lable_id` bigint(20) DEFAULT NULL COMMENT '作品标签id',
  PRIMARY KEY (`works_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for zan
-- ----------------------------
DROP TABLE IF EXISTS `zan`;
CREATE TABLE `zan` (
  `zan_id` bigint(20) NOT NULL COMMENT '点赞id',
  `zan_user_id` bigint(20) DEFAULT NULL COMMENT '点赞人id',
  `zan_target_user_id` bigint(20) DEFAULT NULL COMMENT '被点赞人id',
  `zan_create_time` datetime DEFAULT NULL COMMENT '点赞时间',
  `zan_state` int(2) DEFAULT NULL COMMENT '点赞状态（0未点赞  1已点赞）',
  PRIMARY KEY (`zan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
