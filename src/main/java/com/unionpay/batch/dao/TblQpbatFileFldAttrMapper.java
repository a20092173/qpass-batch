package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatFileFldAttr;
import com.unionpay.batch.entity.TblQpbatFileFldAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblQpbatFileFldAttrMapper {
    int countByExample(TblQpbatFileFldAttrExample example);

    int deleteByExample(TblQpbatFileFldAttrExample example);

    int deleteByPrimaryKey(String fileFldIdx);

    int insert(TblQpbatFileFldAttr record);

    int insertSelective(TblQpbatFileFldAttr record);

    List<TblQpbatFileFldAttr> selectByExample(TblQpbatFileFldAttrExample example);

    TblQpbatFileFldAttr selectByPrimaryKey(String fileFldIdx);

    int updateByExampleSelective(@Param("record") TblQpbatFileFldAttr record, @Param("example") TblQpbatFileFldAttrExample example);

    int updateByExample(@Param("record") TblQpbatFileFldAttr record, @Param("example") TblQpbatFileFldAttrExample example);

    int updateByPrimaryKeySelective(TblQpbatFileFldAttr record);

    int updateByPrimaryKey(TblQpbatFileFldAttr record);
}