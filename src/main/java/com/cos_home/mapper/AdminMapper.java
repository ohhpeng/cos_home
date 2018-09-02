package com.cos_home.mapper;

import com.cos_home.entity.Admin;
import com.cos_home.entity.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    /**
     *  根据指定的条件获取数据库记录数,admin
     *
     * @param example
     */
    int countByExample(AdminExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,admin
     *
     * @param example
     */
    int deleteByExample(AdminExample example);

    /**
     *  根据主键删除数据库的记录,admin
     *
     * @param adminId
     */
    int deleteByPrimaryKey(Long adminId);

    /**
     *  新写入数据库记录,admin
     *
     * @param record
     */
    int insert(Admin record);

    /**
     *  动态字段,写入数据库记录,admin
     *
     * @param record
     */
    int insertSelective(Admin record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,admin
     *
     * @param example
     */
    List<Admin> selectByExample(AdminExample example);

    /**
     *  根据指定主键获取一条数据库记录,admin
     *
     * @param adminId
     */
    Admin selectByPrimaryKey(Long adminId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,admin
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,admin
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,admin
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *  根据主键来更新符合条件的数据库记录,admin
     *
     * @param record
     */
    int updateByPrimaryKey(Admin record);
}