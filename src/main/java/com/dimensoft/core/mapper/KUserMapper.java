package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KUser;
import com.dimensoft.core.model.KUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KUserMapper {
    int countByExample(KUserExample example);

    int deleteByExample(KUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(KUser record);

    int insertSelective(KUser record);

    List<KUser> selectByExample(KUserExample example);

    KUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") KUser record, @Param("example") KUserExample example);

    int updateByExample(@Param("record") KUser record, @Param("example") KUserExample example);

    int updateByPrimaryKeySelective(KUser record);

    int updateByPrimaryKey(KUser record);

    KUser selectOneByExample(KUserExample example);
}