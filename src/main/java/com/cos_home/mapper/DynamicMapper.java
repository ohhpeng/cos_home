package com.cos_home.mapper;

import com.cos_home.entity.Dynamic;
import com.cos_home.entity.DynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DynamicMapper {
    /**
     *  根据指定的条件获取数据库记录数,dynamic
     *
     * @param example
     */
    int countByExample(DynamicExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,dynamic
     *
     * @param example
     */
    int deleteByExample(DynamicExample example);

    /**
     *  根据主键删除数据库的记录,dynamic
     *
     * @param dynamicId
     */
    int deleteByPrimaryKey(Long dynamicId);

    /**
     *  新写入数据库记录,dynamic
     *
     * @param record
     */
    int insert(Dynamic record);

    /**
     *  动态字段,写入数据库记录,dynamic
     *
     * @param record
     */
    int insertSelective(Dynamic record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,dynamic
     *
     * @param example
     */
    List<Dynamic> selectByExample(DynamicExample example);

    /**
     *  根据指定主键获取一条数据库记录,dynamic
     *
     * @param dynamicId
     */
    Dynamic selectByPrimaryKey(Long dynamicId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,dynamic
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,dynamic
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,dynamic
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Dynamic record);

    /**
     *  根据主键来更新符合条件的数据库记录,dynamic
     *
     * @param record
     */
    int updateByPrimaryKey(Dynamic record);
}