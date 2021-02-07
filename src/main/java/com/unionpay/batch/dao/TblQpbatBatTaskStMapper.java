package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatBatTaskSt;
import com.unionpay.batch.entity.TblQpbatBatTaskStExample;
import com.unionpay.batch.entity.TblQpbatBatTaskStKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblQpbatBatTaskStMapper {
    int countByExample(TblQpbatBatTaskStExample example);

    int deleteByExample(TblQpbatBatTaskStExample example);

    int deleteByPrimaryKey(TblQpbatBatTaskStKey key);

    int insert(TblQpbatBatTaskSt record);

    int insertSelective(TblQpbatBatTaskSt record);

    List<TblQpbatBatTaskSt> selectByExample(TblQpbatBatTaskStExample example);

    TblQpbatBatTaskSt selectByPrimaryKey(TblQpbatBatTaskStKey key);

    int updateByExampleSelective(@Param("record") TblQpbatBatTaskSt record, @Param("example") TblQpbatBatTaskStExample example);

    int updateByExample(@Param("record") TblQpbatBatTaskSt record, @Param("example") TblQpbatBatTaskStExample example);

    int updateByPrimaryKeySelective(TblQpbatBatTaskSt record);

    int updateByPrimaryKey(TblQpbatBatTaskSt record);
}