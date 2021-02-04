package com.unionpay.batch.dao;

import com.unionpay.batch.entity.TblQpbatSequence;
import com.unionpay.batch.entity.TblQpbatSequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblQpbatSequenceMapper {
    int countByExample(TblQpbatSequenceExample example);

    TblQpbatSequence findBatSequenceBySysCd(String sysCd);

    int deleteByExample(TblQpbatSequenceExample example);

    int insert(TblQpbatSequence record);

    int insertSelective(TblQpbatSequence record);

    List<TblQpbatSequence> selectByExample(TblQpbatSequenceExample example);

    int updateByExampleSelective(@Param("record") TblQpbatSequence record, @Param("example") TblQpbatSequenceExample example);

    int updateByExample(@Param("record") TblQpbatSequence record, @Param("example") TblQpbatSequenceExample example);
}