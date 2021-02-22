package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatFileFtpCfg;
import com.unionpay.batch.entity.TblQpbatFileFtpCfgExample;
//import com.unionpay.batch.entity.TblQpbatFileFtpCfgKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatFileFtpCfgMapper {
    int countByExample(TblQpbatFileFtpCfgExample example);

    int deleteByExample(TblQpbatFileFtpCfgExample example);

    //int deleteByPrimaryKey(TblQpbatFileFtpCfgKey key);
    int deleteByPrimaryKey(TblQpbatFileFtpCfg record);

    int insert(TblQpbatFileFtpCfg record);

    int insertSelective(TblQpbatFileFtpCfg record);

    List<TblQpbatFileFtpCfg> selectByExample(TblQpbatFileFtpCfgExample example);

    //TblQpbatFileFtpCfg selectByPrimaryKey(TblQpbatFileFtpCfgKey key);
    TblQpbatFileFtpCfg selectByPrimaryKey(TblQpbatFileFtpCfg record);

    int updateByExampleSelective(@Param("record") TblQpbatFileFtpCfg record, @Param("example") TblQpbatFileFtpCfgExample example);

    int updateByExample(@Param("record") TblQpbatFileFtpCfg record, @Param("example") TblQpbatFileFtpCfgExample example);

    int updateByPrimaryKeySelective(TblQpbatFileFtpCfg record);

    int updateByPrimaryKey(TblQpbatFileFtpCfg record);
}