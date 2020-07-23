package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KTransMonitor;
import com.dimensoft.core.model.KTransMonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KTransMonitorMapper {
    int countByExample(KTransMonitorExample example);

    int deleteByExample(KTransMonitorExample example);

    int deleteByPrimaryKey(Integer monitorId);

    int insert(KTransMonitor record);

    int insertSelective(KTransMonitor record);

    List<KTransMonitor> selectByExampleWithBLOBs(KTransMonitorExample example);

    List<KTransMonitor> selectByExample(KTransMonitorExample example);

    KTransMonitor selectByPrimaryKey(Integer monitorId);

    int updateByExampleSelective(@Param("record") KTransMonitor record, @Param("example") KTransMonitorExample example);

    int updateByExampleWithBLOBs(@Param("record") KTransMonitor record, @Param("example") KTransMonitorExample example);

    int updateByExample(@Param("record") KTransMonitor record, @Param("example") KTransMonitorExample example);

    int updateByPrimaryKeySelective(KTransMonitor record);

    int updateByPrimaryKeyWithBLOBs(KTransMonitor record);

    int updateByPrimaryKey(KTransMonitor record);

    KTransMonitor selectOneByExample(KTransMonitorExample example);
}