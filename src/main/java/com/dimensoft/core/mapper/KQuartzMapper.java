package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KQuartz;
import com.dimensoft.core.model.KQuartzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KQuartzMapper {
    int countByExample(KQuartzExample example);

    int deleteByExample(KQuartzExample example);

    int deleteByPrimaryKey(Integer quartzId);

    int insert(KQuartz record);

    int insertSelective(KQuartz record);

    List<KQuartz> selectByExample(KQuartzExample example);

    KQuartz selectByPrimaryKey(Integer quartzId);

    int updateByExampleSelective(@Param("record") KQuartz record, @Param("example") KQuartzExample example);

    int updateByExample(@Param("record") KQuartz record, @Param("example") KQuartzExample example);

    int updateByPrimaryKeySelective(KQuartz record);

    int updateByPrimaryKey(KQuartz record);
}