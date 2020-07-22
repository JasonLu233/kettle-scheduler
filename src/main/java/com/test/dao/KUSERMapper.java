package com.test.dao;

import com.test.model.KUSER;
import com.test.model.KUSERExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KUSERMapper {
    int countByExample(KUSERExample example);

    int deleteByExample(KUSERExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(KUSER record);

    int insertSelective(KUSER record);

    List<KUSER> selectByExample(KUSERExample example);

    KUSER selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") KUSER record, @Param("example") KUSERExample example);

    int updateByExample(@Param("record") KUSER record, @Param("example") KUSERExample example);

    int updateByPrimaryKeySelective(KUSER record);

    int updateByPrimaryKey(KUSER record);
}