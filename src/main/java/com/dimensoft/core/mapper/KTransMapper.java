package com.dimensoft.core.mapper;

import com.dimensoft.core.model.KTrans;
import com.dimensoft.core.model.KTransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KTransMapper {
    int countByExample(KTransExample example);

    int deleteByExample(KTransExample example);

    int deleteByPrimaryKey(Integer transId);

    int insert(KTrans record);

    int insertSelective(KTrans record);

    List<KTrans> selectByExample(KTransExample example);

    KTrans selectByPrimaryKey(Integer transId);

    int updateByExampleSelective(@Param("record") KTrans record, @Param("example") KTransExample example);

    int updateByExample(@Param("record") KTrans record, @Param("example") KTransExample example);

    int updateByPrimaryKeySelective(KTrans record);

    int updateByPrimaryKey(KTrans record);

    List<KTrans> selectByExample(KTransExample example,@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}