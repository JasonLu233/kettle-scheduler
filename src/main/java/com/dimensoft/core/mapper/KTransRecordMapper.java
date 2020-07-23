package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KTransRecord;
import com.dimensoft.core.model.KTransRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KTransRecordMapper {
    int countByExample(KTransRecordExample example);

    int deleteByExample(KTransRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(KTransRecord record);

    int insertSelective(KTransRecord record);

    List<KTransRecord> selectByExample(KTransRecordExample example);

    KTransRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") KTransRecord record, @Param("example") KTransRecordExample example);

    int updateByExample(@Param("record") KTransRecord record, @Param("example") KTransRecordExample example);

    int updateByPrimaryKeySelective(KTransRecord record);

    int updateByPrimaryKey(KTransRecord record);
}