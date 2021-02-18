package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatFileFmtInf;
import com.unionpay.batch.entity.TblQpbatFileFmtInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatFileFmtInfMapper {
    int countByExample(TblQpbatFileFmtInfExample example);

    int deleteByExample(TblQpbatFileFmtInfExample example);

    int deleteByPrimaryKey(String fileFldIdx);

    int insert(TblQpbatFileFmtInf record);

    int insertSelective(TblQpbatFileFmtInf record);

    List<TblQpbatFileFmtInf> selectByExample(TblQpbatFileFmtInfExample example);

    TblQpbatFileFmtInf selectByPrimaryKey(String fileFldIdx);

    int updateByExampleSelective(@Param("record") TblQpbatFileFmtInf record, @Param("example") TblQpbatFileFmtInfExample example);

    int updateByExample(@Param("record") TblQpbatFileFmtInf record, @Param("example") TblQpbatFileFmtInfExample example);

    int updateByPrimaryKeySelective(TblQpbatFileFmtInf record);

    int updateByPrimaryKey(TblQpbatFileFmtInf record);
}