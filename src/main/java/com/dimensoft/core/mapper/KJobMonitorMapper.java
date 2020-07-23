package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KJobMonitor;
import com.dimensoft.core.model.KJobMonitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KJobMonitorMapper {
    int countByExample(KJobMonitorExample example);

    int deleteByExample(KJobMonitorExample example);

    int deleteByPrimaryKey(Integer monitorId);

    int insert(KJobMonitor record);

    int insertSelective(KJobMonitor record);

    List<KJobMonitor> selectByExampleWithBLOBs(KJobMonitorExample example);

    List<KJobMonitor> selectByExample(KJobMonitorExample example);

    KJobMonitor selectByPrimaryKey(Integer monitorId);

    int updateByExampleSelective(@Param("record") KJobMonitor record, @Param("example") KJobMonitorExample example);

    int updateByExampleWithBLOBs(@Param("record") KJobMonitor record, @Param("example") KJobMonitorExample example);

    int updateByExample(@Param("record") KJobMonitor record, @Param("example") KJobMonitorExample example);

    int updateByPrimaryKeySelective(KJobMonitor record);

    int updateByPrimaryKeyWithBLOBs(KJobMonitor record);

    int updateByPrimaryKey(KJobMonitor record);

    KJobMonitor selectOneByExample(KJobMonitorExample example);
}