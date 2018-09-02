package com.cos_home.mapper;

import com.cos_home.entity.Works;
import com.cos_home.entity.WorksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorksMapper {
    /**
     *  根据指定的条件获取数据库记录数,works
     *
     * @param example
     */
    int countByExample(WorksExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,works
     *
     * @param example
     */
    int deleteByExample(WorksExample example);

    /**
     *  根据主键删除数据库的记录,works
     *
     * @param worksId
     */
    int deleteByPrimaryKey(Long worksId);

    /**
     *  新写入数据库记录,works
     *
     * @param record
     */
    int insert(Works record);

    /**
     *  动态字段,写入数据库记录,works
     *
     * @param record
     */
    int insertSelective(Works record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,works
     *
     * @param example
     */
    List<Works> selectByExample(WorksExample example);

    /**
     *  根据指定主键获取一条数据库记录,works
     *
     * @param worksId
     */
    Works selectByPrimaryKey(Long worksId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,works
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Works record, @Param("example") WorksExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,works
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Works record, @Param("example") WorksExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,works
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Works record);

    /**
     *  根据主键来更新符合条件的数据库记录,works
     *
     * @param record
     */
    int updateByPrimaryKey(Works record);
}