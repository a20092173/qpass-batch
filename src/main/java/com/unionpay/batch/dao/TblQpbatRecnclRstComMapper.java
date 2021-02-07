package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatRecnclRstCom;
import com.unionpay.batch.entity.TblQpbatRecnclRstComExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblQpbatRecnclRstComMapper {
    int countByExample(@Param("tableName") String tableName, @Param("example") TblQpbatRecnclRstComExample example);

    int deleteByExample(TblQpbatRecnclRstComExample example);

    int deleteByPrimaryKey(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);

    int insert(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);

    int insertSelective(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);

    List<TblQpbatRecnclRstCom> selectByExample(@Param("tabelName") String tabelName, @Param("example") TblQpbatRecnclRstComExample example);

    TblQpbatRecnclRstCom selectByPrimaryKey(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);

    int updateByExampleSelective(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record, @Param("example") TblQpbatRecnclRstComExample example);

    int updateByExample(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record, @Param("example") TblQpbatRecnclRstComExample example);

    int updateByPrimaryKeySelective(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);

    int updateByPrimaryKey(@Param("tableName") String tableName, @Param("record") TblQpbatRecnclRstCom record);
}