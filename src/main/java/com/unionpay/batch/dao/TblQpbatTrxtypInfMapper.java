package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatTrxtypInf;
import com.unionpay.batch.entity.TblQpbatTrxtypInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatTrxtypInfMapper {
    int countByExample(TblQpbatTrxtypInfExample example);

    int deleteByExample(TblQpbatTrxtypInfExample example);

    int deleteByPrimaryKey(TblQpbatTrxtypInf record);

    int insert(TblQpbatTrxtypInf record);

    int insertSelective(TblQpbatTrxtypInf record);

    List<TblQpbatTrxtypInf> selectByExample(TblQpbatTrxtypInfExample example);

    TblQpbatTrxtypInf selectByPrimaryKey(TblQpbatTrxtypInf record);

    List<String> selectByRecSt(String recnclSt);

    int updateByExampleSelective(@Param("record") TblQpbatTrxtypInf record, @Param("example") TblQpbatTrxtypInfExample example);

    int updateByExample(@Param("record") TblQpbatTrxtypInf record, @Param("example") TblQpbatTrxtypInfExample example);

    int updateByPrimaryKeySelective(TblQpbatTrxtypInf record);

    int updateByPrimaryKey(TblQpbatTrxtypInf record);
}