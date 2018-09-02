package com.cos_home.mapper;

import com.cos_home.entity.Evaluate;
import com.cos_home.entity.EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    /**
     *  根据指定的条件获取数据库记录数,evaluate
     *
     * @param example
     */
    int countByExample(EvaluateExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,evaluate
     *
     * @param example
     */
    int deleteByExample(EvaluateExample example);

    /**
     *  根据主键删除数据库的记录,evaluate
     *
     * @param evaluateId
     */
    int deleteByPrimaryKey(Long evaluateId);

    /**
     *  新写入数据库记录,evaluate
     *
     * @param record
     */
    int insert(Evaluate record);

    /**
     *  动态字段,写入数据库记录,evaluate
     *
     * @param record
     */
    int insertSelective(Evaluate record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,evaluate
     *
     * @param example
     */
    List<Evaluate> selectByExample(EvaluateExample example);

    /**
     *  根据指定主键获取一条数据库记录,evaluate
     *
     * @param evaluateId
     */
    Evaluate selectByPrimaryKey(Long evaluateId);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,evaluate
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,evaluate
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,evaluate
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Evaluate record);

    /**
     *  根据主键来更新符合条件的数据库记录,evaluate
     *
     * @param record
     */
    int updateByPrimaryKey(Evaluate record);
}