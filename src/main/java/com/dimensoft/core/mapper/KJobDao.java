package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KJob;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;


public interface KJobDao extends BaseMapper<KJob> {
    @SqlStatement(params = "kJob,start,size")
    List<KJob> pageQuery(KJob kJob, Integer start, Integer size);

    @SqlStatement(params = "kJob")
    List<KJob> queryByCondition(KJob kJob);

    @SqlStatement(params = "kJob")
    Long allCount(KJob kJob);
}