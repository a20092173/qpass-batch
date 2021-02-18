package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatBatTaskSt;
import com.unionpay.batch.entity.TblQpbatBatTaskStExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatBatTaskStMapper {
    int countByExample(TblQpbatBatTaskStExample example);

    int deleteByExample(TblQpbatBatTaskStExample example);

    int deleteByPrimaryKey(TblQpbatBatTaskSt record);

    int insert(TblQpbatBatTaskSt record);

    int insertSelective(TblQpbatBatTaskSt record);

    List<TblQpbatBatTaskSt> selectByExample(TblQpbatBatTaskStExample example);

    TblQpbatBatTaskSt selectByPrimaryKey(TblQpbatBatTaskSt record);

    int updateByExampleSelective(@Param("record") TblQpbatBatTaskSt record, @Param("example") TblQpbatBatTaskStExample example);

    int updateByExample(@Param("record") TblQpbatBatTaskSt record, @Param("example") TblQpbatBatTaskStExample example);

    int updateByPrimaryKeySelective(TblQpbatBatTaskSt record);

    int updateByPrimaryKey(TblQpbatBatTaskSt record);
}