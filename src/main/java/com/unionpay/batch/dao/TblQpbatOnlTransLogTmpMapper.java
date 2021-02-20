package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatOnlTransLogTmp;
import com.unionpay.batch.entity.TblQpbatOnlTransLogTmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatOnlTransLogTmpMapper {
    int countByExample(TblQpbatOnlTransLogTmpExample example);

    int deleteByExample(TblQpbatOnlTransLogTmpExample example);

    int deleteByPrimaryKey(TblQpbatOnlTransLogTmp record);

    int insert(TblQpbatOnlTransLogTmp record);

    int insertSpec1(@Param("onlTransLogTblNm") String onlTransLogTblNm,@Param("onlDb") String onlDb, @Param("batDb") String batDb, @Param("record") TblQpbatOnlTransLogTmp record);

    List<TblQpbatOnlTransLogTmp> selectByExample(TblQpbatOnlTransLogTmpExample example);

    TblQpbatOnlTransLogTmp selectByPrimaryKey(TblQpbatOnlTransLogTmp record);
}