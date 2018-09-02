package com.cos_home.mapper;

import com.cos_home.entity.Discuss;
import com.cos_home.entity.DiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussMapper {
    /**
     *  根据指定的条件获取数据库记录数,discuss
     *
     * @param example
     */
    int countByExample(DiscussExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,discuss
     *
     * @param example
     */
    int deleteByExample(DiscussExample example);

    /**
     *  根据主键删除数据库的记录,discuss
     *
     * @param discussId
     */
    int deleteByPrimaryKey(Long discussId);

    /**
     *  新写入数据库记录,discuss
     *
     * @param record
     */
    int insert(Discuss record);

    /**
     *  动态字段,写入数据库记录,discuss
     *
     * @param record
     */
    int insertSelective(Discuss record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,discuss
     *
     * @param example
     */
    List<Discuss> selectByExample(DiscussExample example);

    /**
     *  根据指定主键获取一条数据库记录,discuss
     *
     * @param discussId
     */
    Discuss selectByPrimaryKey(Long discussId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,discuss
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Discuss record, @Param("example") DiscussExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,discuss
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Discuss record, @Param("example") DiscussExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,discuss
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Discuss record);

    /**
     *  根据主键来更新符合条件的数据库记录,discuss
     *
     * @param record
     */
    int updateByPrimaryKey(Discuss record);
}