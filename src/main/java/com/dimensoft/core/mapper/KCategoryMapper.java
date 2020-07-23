package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KCategory;
import com.dimensoft.core.model.KCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KCategoryMapper {
    int countByExample(KCategoryExample example);

    int deleteByExample(KCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(KCategory record);

    int insertSelective(KCategory record);

    List<KCategory> selectByExample(KCategoryExample example);

    KCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") KCategory record, @Param("example") KCategoryExample example);

    int updateByExample(@Param("record") KCategory record, @Param("example") KCategoryExample example);

    int updateByPrimaryKeySelective(KCategory record);

    int updateByPrimaryKey(KCategory record);

    KCategory selectOneByExample(KCategoryExample example);
}