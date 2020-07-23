package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KJobRecord;
import com.dimensoft.core.model.KJobRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KJobRecordMapper {
    int countByExample(KJobRecordExample example);

    int deleteByExample(KJobRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(KJobRecord record);

    int insertSelective(KJobRecord record);

    List<KJobRecord> selectByExample(KJobRecordExample example);

    KJobRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") KJobRecord record, @Param("example") KJobRecordExample example);

    int updateByExample(@Param("record") KJobRecord record, @Param("example") KJobRecordExample example);

    int updateByPrimaryKeySelective(KJobRecord record);

    int updateByPrimaryKey(KJobRecord record);
}