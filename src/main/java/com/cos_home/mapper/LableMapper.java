package com.cos_home.mapper;

import com.cos_home.entity.Lable;
import com.cos_home.entity.LableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LableMapper {
    /**
     *  根据指定的条件获取数据库记录数,lable
     *
     * @param example
     */
    int countByExample(LableExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,lable
     *
     * @param example
     */
    int deleteByExample(LableExample example);

    /**
     *  根据主键删除数据库的记录,lable
     *
     * @param dislableId
     */
    int deleteByPrimaryKey(Long dislableId);

    /**
     *  新写入数据库记录,lable
     *
     * @param record
     */
    int insert(Lable record);

    /**
     *  动态字段,写入数据库记录,lable
     *
     * @param record
     */
    int insertSelective(Lable record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,lable
     *
     * @param example
     */
    List<Lable> selectByExample(LableExample example);

    /**
     *  根据指定主键获取一条数据库记录,lable
     *
     * @param dislableId
     */
    Lable selectByPrimaryKey(Long dislableId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,lable
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Lable record, @Param("example") LableExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,lable
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Lable record, @Param("example") LableExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,lable
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Lable record);

    /**
     *  根据主键来更新符合条件的数据库记录,lable
     *
     * @param record
     */
    int updateByPrimaryKey(Lable record);
}