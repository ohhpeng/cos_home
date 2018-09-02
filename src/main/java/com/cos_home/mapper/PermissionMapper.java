package com.cos_home.mapper;

import com.cos_home.entity.Permission;
import com.cos_home.entity.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    /**
     *  根据指定的条件获取数据库记录数,permission
     *
     * @param example
     */
    int countByExample(PermissionExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,permission
     *
     * @param example
     */
    int deleteByExample(PermissionExample example);

    /**
     *  根据主键删除数据库的记录,permission
     *
     * @param permissionId
     */
    int deleteByPrimaryKey(Long permissionId);

    /**
     *  新写入数据库记录,permission
     *
     * @param record
     */
    int insert(Permission record);

    /**
     *  动态字段,写入数据库记录,permission
     *
     * @param record
     */
    int insertSelective(Permission record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,permission
     *
     * @param example
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     *  根据指定主键获取一条数据库记录,permission
     *
     * @param permissionId
     */
    Permission selectByPrimaryKey(Long permissionId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,permission
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,permission
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,permission
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     *  根据主键来更新符合条件的数据库记录,permission
     *
     * @param record
     */
    int updateByPrimaryKey(Permission record);
}