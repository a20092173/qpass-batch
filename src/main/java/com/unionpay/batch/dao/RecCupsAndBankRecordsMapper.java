package com.unionpay.batch.dao;

import com.unionpay.batch.entity.RecCupsAndBankRecords;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecCupsAndBankRecordsMapper {
    //不带场次号
    int updCupsAndBankTblRecStForRecAmt1(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //带场次号
    int updCupsAndBankTblRecStForRecAmt2(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //Cups more upd 不带场次号
    int updCupsMoreRecords1(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //带场次号
    int updCupsMoreRecords2(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //Bank more upd 不带场次号
    int updBankMoreRecords1(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //带场次号
    int updBankMoreRecords2(@Param("cupsTblNm") String cupsTblNm, @Param("bankTblNm") String bankTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银联多记录插入结果表 不带场次
    int selUpComtrxNoEqualIntoRetTbl1(@Param("cupsTblNm") String cupsTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银联多记录插入结果表 带场次
    int selUpComtrxNoEqualIntoRetTbl2(@Param("cupsTblNm") String cupsTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银联相平记录插入结果表 不带场次
    int selUpComtrxEqualIntoRetTbl1(@Param("cupsTblNm") String cupsTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银联相平记录插入结果表 带场次
    int selUpComtrxEqualIntoRetTbl2(@Param("cupsTblNm") String cupsTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银行多记录插入结果表 不带场次
    int selStdBkDtlNoEqualIntoRetTbl1(@Param("bankTblNm") String bankTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);
    //将银行多记录插入结果表 带场次
    int selStdBkDtlNoEqualIntoRetTbl2(@Param("bankTblNm") String bankTblNm, @Param("retTblNm") String retTblNm, @Param("record") RecCupsAndBankRecords record);

}