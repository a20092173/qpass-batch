package com.unionpay.batch.dao;

import com.unionpay.batch.entity.RecCupsAndBankRecords;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecCupsAndBankRecordsMapper {
    //不带场次号
    int updCupsAndBankTblRecStForRecAmt1(RecCupsAndBankRecords record);
    //带场次号
    int updCupsAndBankTblRecStForRecAmt2(RecCupsAndBankRecords record);
    //Cups more upd 不带场次号
    int updCupsMoreRecords1(RecCupsAndBankRecords record);
    //带场次号
    int updCupsMoreRecords2(RecCupsAndBankRecords record);
    //Bank more upd 不带场次号
    int updBankMoreRecords1(RecCupsAndBankRecords record);
    //带场次号
    int updBankMoreRecords2(RecCupsAndBankRecords record);
    //将银联多记录插入结果表 不带场次
    int selUpComtrxNoEqualIntoRetTbl1(RecCupsAndBankRecords record);
    //将银联多记录插入结果表 带场次
    int selUpComtrxNoEqualIntoRetTbl2(RecCupsAndBankRecords record);
    //将银联相平记录插入结果表 不带场次
    int selUpComtrxEqualIntoRetTbl1(RecCupsAndBankRecords record);
    //将银联相平记录插入结果表 带场次
    int selUpComtrxEqualIntoRetTbl2(RecCupsAndBankRecords record);
    //将银行多记录插入结果表 不带场次
    int selStdBkDtlNoEqualIntoRetTbl1(RecCupsAndBankRecords record);
    //将银行多记录插入结果表 带场次
    int selStdBkDtlNoEqualIntoRetTbl2(RecCupsAndBankRecords record);

}