package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KRepositoryType;
import com.dimensoft.core.model.KRepositoryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KRepositoryTypeMapper {
    int countByExample(KRepositoryTypeExample example);

    int deleteByExample(KRepositoryTypeExample example);

    int deleteByPrimaryKey(Integer repositoryTypeId);

    int insert(KRepositoryType record);

    int insertSelective(KRepositoryType record);

    List<KRepositoryType> selectByExample(KRepositoryTypeExample example);

    KRepositoryType selectByPrimaryKey(Integer repositoryTypeId);

    int updateByExampleSelective(@Param("record") KRepositoryType record, @Param("example") KRepositoryTypeExample example);

    int updateByExample(@Param("record") KRepositoryType record, @Param("example") KRepositoryTypeExample example);

    int updateByPrimaryKeySelective(KRepositoryType record);

    int updateByPrimaryKey(KRepositoryType record);
}