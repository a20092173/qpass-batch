package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatUpComtrx;
import com.unionpay.batch.entity.TblQpbatUpComtrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatUpComtrxMapper {
    int countByExample(@Param("tableName") String tableName,@Param("example") TblQpbatUpComtrxExample example);

    int deleteByExample(@Param("tableName") String tableName,@Param("example") TblQpbatUpComtrxExample example);

    int deleteByPrimaryKey(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record);

    int insert(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record);

    int insertSelective(@Param("upTableName") String upTableName,@Param("record") TblQpbatUpComtrx record);

    List<TblQpbatUpComtrx> selectByExample(@Param("tableName") String tableName,@Param("example") TblQpbatUpComtrxExample example);

    TblQpbatUpComtrx selectByPrimaryKey(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record);

    int updateByExampleSelective(@Param("tableName") String tableName, @Param("record") TblQpbatUpComtrx record, @Param("example") TblQpbatUpComtrxExample example);

    int updateByExample(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record, @Param("example") TblQpbatUpComtrxExample example);

    int updateByPrimaryKeySelective(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record);

    int updateByPrimaryKey(@Param("tableName") String tableName,@Param("record") TblQpbatUpComtrx record);
}