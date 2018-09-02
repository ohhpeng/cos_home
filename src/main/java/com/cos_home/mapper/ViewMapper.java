package com.cos_home.mapper;

import com.cos_home.entity.View;
import com.cos_home.entity.ViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewMapper {
    /**
     *  根据指定的条件获取数据库记录数,view
     *
     * @param example
     */
    int countByExample(ViewExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,view
     *
     * @param example
     */
    int deleteByExample(ViewExample example);

    /**
     *  根据主键删除数据库的记录,view
     *
     * @param viewId
     */
    int deleteByPrimaryKey(Long viewId);

    /**
     *  新写入数据库记录,view
     *
     * @param record
     */
    int insert(View record);

    /**
     *  动态字段,写入数据库记录,view
     *
     * @param record
     */
    int insertSelective(View record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,view
     *
     * @param example
     */
    List<View> selectByExample(ViewExample example);

    /**
     *  根据指定主键获取一条数据库记录,view
     *
     * @param viewId
     */
    View selectByPrimaryKey(Long viewId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,view
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") View record, @Param("example") ViewExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,view
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") View record, @Param("example") ViewExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,view
     *
     * @param record
     */
    int updateByPrimaryKeySelective(View record);

    /**
     *  根据主键来更新符合条件的数据库记录,view
     *
     * @param record
     */
    int updateByPrimaryKey(View record);
}