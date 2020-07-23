package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KRepository;
import com.dimensoft.core.model.KRepositoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KRepositoryMapper {
    int countByExample(KRepositoryExample example);

    int deleteByExample(KRepositoryExample example);

    int deleteByPrimaryKey(Integer repositoryId);

    int insert(KRepository record);

    int insertSelective(KRepository record);

    List<KRepository> selectByExample(KRepositoryExample example);

    KRepository selectByPrimaryKey(Integer repositoryId);

    int updateByExampleSelective(@Param("record") KRepository record, @Param("example") KRepositoryExample example);

    int updateByExample(@Param("record") KRepository record, @Param("example") KRepositoryExample example);

    int updateByPrimaryKeySelective(KRepository record);

    int updateByPrimaryKey(KRepository record);
}