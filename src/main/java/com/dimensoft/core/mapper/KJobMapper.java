package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KJob;
import com.dimensoft.core.model.KJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KJobMapper {
    int countByExample(KJobExample example);

    int deleteByExample(KJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(KJob record);

    int insertSelective(KJob record);

    List<KJob> selectByExample(KJobExample example);

    KJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") KJob record, @Param("example") KJobExample example);

    int updateByExample(@Param("record") KJob record, @Param("example") KJobExample example);

    int updateByPrimaryKeySelective(KJob record);

    int updateByPrimaryKey(KJob record);
}