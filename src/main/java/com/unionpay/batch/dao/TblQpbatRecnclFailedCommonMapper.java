package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatRecnclFailedCommon;
import com.unionpay.batch.entity.TblQpbatRecnclFailedCommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatRecnclFailedCommonMapper {
    int countByExample(TblQpbatRecnclFailedCommonExample example);

    int deleteByExample(TblQpbatRecnclFailedCommonExample example);

    int insert(TblQpbatRecnclFailedCommon record);

    int insertSelective(TblQpbatRecnclFailedCommon record);

    List<TblQpbatRecnclFailedCommon> selectByExample(TblQpbatRecnclFailedCommonExample example);

    int updateByExampleSelective(@Param("record") TblQpbatRecnclFailedCommon record, @Param("example") TblQpbatRecnclFailedCommonExample example);

    int updateByExample(@Param("record") TblQpbatRecnclFailedCommon record, @Param("example") TblQpbatRecnclFailedCommonExample example);
}