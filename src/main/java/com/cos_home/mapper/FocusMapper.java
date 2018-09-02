package com.cos_home.mapper;

import com.cos_home.entity.Focus;
import com.cos_home.entity.FocusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FocusMapper {
    /**
     *  根据指定的条件获取数据库记录数,focus
     *
     * @param example
     */
    int countByExample(FocusExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,focus
     *
     * @param example
     */
    int deleteByExample(FocusExample example);

    /**
     *  根据主键删除数据库的记录,focus
     *
     * @param focusId
     */
    int deleteByPrimaryKey(Long focusId);

    /**
     *  新写入数据库记录,focus
     *
     * @param record
     */
    int insert(Focus record);

    /**
     *  动态字段,写入数据库记录,focus
     *
     * @param record
     */
    int insertSelective(Focus record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,focus
     *
     * @param example
     */
    List<Focus> selectByExample(FocusExample example);

    /**
     *  根据指定主键获取一条数据库记录,focus
     *
     * @param focusId
     */
    Focus selectByPrimaryKey(Long focusId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,focus
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Focus record, @Param("example") FocusExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,focus
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Focus record, @Param("example") FocusExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,focus
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Focus record);

    /**
     *  根据主键来更新符合条件的数据库记录,focus
     *
     * @param record
     */
    int updateByPrimaryKey(Focus record);
}