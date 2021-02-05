package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatStdBankDetail;
import com.unionpay.batch.entity.TblQpbatStdBankDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatStdBankDetailMapper {
    int countByExample(@Param("tableName") String tableName, @Param("example") TblQpbatStdBankDetailExample example);

    int deleteByExample(@Param("tableName") String tableName, @Param("example") TblQpbatStdBankDetailExample example);

    int deleteByPrimaryKey(@Param("tableName") String tableName, @Param("record") TblQpbatStdBankDetail record);

    int insert(@Param("tableName") String tableName,@Param("record") TblQpbatStdBankDetail record);

    int insertSelective(@Param("tableName") String tableName,@Param("record") TblQpbatStdBankDetail record);

    List<TblQpbatStdBankDetail> selectByExample(@Param("tableName") String tableName,@Param("example") TblQpbatStdBankDetailExample example);

    TblQpbatStdBankDetail selectByPrimaryKey(@Param("tableName") String tableName,@Param("record") TblQpbatStdBankDetail record);

    int updateByExampleSelective(@Param("tableName") String tableName,@Param("record") TblQpbatStdBankDetail record, @Param("example") TblQpbatStdBankDetailExample example);

    int updateByExample(@Param("tableName") String tableName, @Param("record") TblQpbatStdBankDetail record, @Param("example") TblQpbatStdBankDetailExample example);

    int updateByPrimaryKeySelective(@Param("tableName") String tableName, @Param("record") TblQpbatStdBankDetail record);

    int updateByPrimaryKey(@Param("tableName") String tableName, @Param("record") TblQpbatStdBankDetail record);
}