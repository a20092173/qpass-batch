package com.unionpay.batch.service.imp;

import com.unionpay.batch.dao.*;
import com.unionpay.batch.entity.*;
import com.unionpay.batch.service.BatchStdRecnclService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Service
@Transactional
public class BatchStdRecnclServiceImpl implements BatchStdRecnclService{

    @Autowired
    private TblQpbatUpComtrxMapper TblQpbatUpComtrxDao;

    @Autowired
    private TblQpbatStdBankDetailMapper TblQpbatStdBankDetailDao;

    @Autowired
    private TblQpbatTrxtypInfMapper TblQpbatTrxtypInfDao;

    @Autowired
    private RecCupsAndBankRecordsMapper recCupsAndBankRecordsDao;

    @Autowired
    private TblQpbatRecnclRstComMapper TblQpbatRecnclRstComDao;

    /**
     * 清理银联、银行明细表，支持带场次号清理
     * @param dataMap
     * @return boolean
     */
    @Override
    public boolean initClearRecnclTbl(JobDataMap dataMap) {
        int iResult = 0;
        log.info("【initRecncl】 initRecncl exec start...");
        //清理银联清算明细表记录,settleDt+bussCd
        String tableName = dataMap.get("CurrCupsTblNm").toString();
        String bussCd = dataMap.get("BussCd").toString();
        String settleDt = dataMap.get("SettleDt").toString();
        String settleNum = "";
        log.info("【initRecncl】清理银联明细表tableName:"+ tableName +",bussCd:" + bussCd + ",settleDt:" + settleDt+",settleNum:"+dataMap.get("SettleNum"));
        TblQpbatUpComtrxExample qpbatUpComtrxExample = new TblQpbatUpComtrxExample();
        TblQpbatUpComtrxExample.Criteria criteriaUpComtrx = qpbatUpComtrxExample.createCriteria();
        criteriaUpComtrx.andBussCdEqualTo(bussCd);
        criteriaUpComtrx.andSettleDtEqualTo(settleDt);
        if (dataMap.get("SettleNum") != null) {
            settleNum = dataMap.get("SettleNum").toString();
            criteriaUpComtrx.andSettleNumEqualTo(settleNum);
        }
        try{
            iResult = TblQpbatUpComtrxDao.deleteByExample(tableName, qpbatUpComtrxExample);
            if(0 >= iResult){
                log.error("【initRecncl】清理银联明细表失败，bussCd:" + bussCd + ",settleDt:" + settleDt+",settleNum:" + settleNum);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【initRecncl】清理银联明细表发生异常，bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + settleNum);
            return BAT_FAIL;
        }
        log.info("【initRecncl】清理银联明细表成功，bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + settleNum);
        //清理银行明细表记录 transDt+bussCd
        tableName = dataMap.get("CurrBankTblNm").toString();
        bussCd = dataMap.get("BussCd").toString();
        String transDt = dataMap.get("TransDt").toString();
        log.info("【initRecncl】清理银行明细表tableName:"+ tableName +",bussCd:" + bussCd + ",transDt:" + transDt + ",settleNum:" + settleNum);
        TblQpbatStdBankDetailExample qpbatStdBankDetailExample = new TblQpbatStdBankDetailExample();
        TblQpbatStdBankDetailExample.Criteria criteria1StdDtl = qpbatStdBankDetailExample.createCriteria();
        criteria1StdDtl.andBussCdEqualTo(bussCd);
        criteria1StdDtl.andTransDtEqualTo(transDt);
        if(dataMap.get("SettleNum") != null){
            criteria1StdDtl.andSettleNumEqualTo(dataMap.get("SettleNum").toString());
        }
        try{
            iResult = TblQpbatStdBankDetailDao.deleteByExample(tableName, qpbatStdBankDetailExample);
            if(0 >= iResult){
                log.error("【initRecncl】清理银行明细表失败，bussCd:" + bussCd + ",transDt:" + transDt + ",settleNum:" + settleNum);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【initRecncl】清理银行明细表发生异常，bussCd:" + bussCd + ",transDt:" + transDt + ",settleNum:" + settleNum);
            return BAT_FAIL;
        }
        log.info("【initRecncl】清理银行明细表成功，bussCd:" + bussCd + ",transDt:" + transDt + ",settleNum:" + settleNum);
        log.info("【initRecncl】 initRecncl exec over!");
        return BAT_SUCC;
    }

    @Override
    public boolean recnclProc(JobDataMap dataMap) {
        if(!beforeRecnclCheck(dataMap)){
            return BAT_FAIL;
        }
        if(!initClearRecnclTbl(dataMap)){
            return BAT_FAIL;
        }
        if(!initUpComtrxTblSt(dataMap)){
            return BAT_FAIL;
        }
        if(!initStdBankDtlTblSt(dataMap)){
            return BAT_FAIL;
        }
        if(!recnclCupsAndBankAmt(dataMap)){
            return BAT_FAIL;
        }
        if(!updSingleMoreRecords(dataMap)){
            return BAT_FAIL;
        }
        if(!writeRecnclResultsIntoTable(dataMap)){
            return BAT_FAIL;
        }
        return BAT_SUCC;
    }

    public boolean beforeRecnclCheck(JobDataMap dataMap){
        int cupsCnts = 0;
        int bankCnts = 0;
        //检查银联明细表是否有记录
        log.info("【beforeRecnclCheck】 beforeRecnclCheck exec start...");
        //查询银联清算明细表记录,settleDt+bussCd
        String tableName = dataMap.get("CurrCupsTblNm").toString();
        String bussCd = dataMap.get("BussCd").toString();
        String settleDt = dataMap.get("SettleDt").toString();
        String settleNum = "";
        log.info("【beforeRecnclCheck】银联清算入库检查tableName:"+ tableName +",bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + settleNum);
        TblQpbatUpComtrxExample qpbatUpComtrxExample = new TblQpbatUpComtrxExample();
        TblQpbatUpComtrxExample.Criteria criteriaUpComtrx = qpbatUpComtrxExample.createCriteria();
        criteriaUpComtrx.andBussCdEqualTo(bussCd);
        criteriaUpComtrx.andSettleDtEqualTo(settleDt);
        if(dataMap.get("SettleNum") != null){
            settleNum = dataMap.get("SettleNum").toString();
            criteriaUpComtrx.andSettleNumEqualTo(settleNum);
        }
        try{
            cupsCnts = TblQpbatUpComtrxDao.countByExample(tableName, qpbatUpComtrxExample);
        }catch (Exception e){
            log.error("【beforeRecnclCheck】countByExample查询银联明细表发生异常，bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + settleNum);
            return BAT_FAIL;
        }
        //检查银行明细表是否有记录
        tableName = dataMap.get("CurrBankTblNm").toString();
        bussCd = dataMap.get("BussCd").toString();
        String transDt = dataMap.get("TransDt").toString();
        log.info("【beforeRecnclCheck】tableName:"+ tableName +",contidion:bussCd:" + bussCd + ",transDt:" + transDt);
        TblQpbatStdBankDetailExample qpbatStdBankDetailExample = new TblQpbatStdBankDetailExample();
        TblQpbatStdBankDetailExample.Criteria criteria1StdDtl = qpbatStdBankDetailExample.createCriteria();
        criteria1StdDtl.andBussCdEqualTo(bussCd);
        criteria1StdDtl.andTransDtEqualTo(transDt);
        if(dataMap.get("SettleNum") != null){
            criteria1StdDtl.andSettleNumEqualTo(dataMap.get("SettleNum").toString());
        }
        try{
            bankCnts = TblQpbatStdBankDetailDao.deleteByExample(tableName, qpbatStdBankDetailExample);
        }catch (Exception e){
            log.error("【beforeRecnclCheck】deleteByExample查询银行明细表发生异常，condition:bussCd:" + bussCd + ",transDt:" + transDt + ",settleNum:" + settleNum);
            return BAT_FAIL;
        }

        if(0 >= cupsCnts && 0 >= bankCnts) {
            log.error("【beforeRecnclCheck】日期:" + transDt + "银行与银联清算明细表均无记录！");
            return BAT_FAIL;
        }
        log.info("【beforeRecnclCheck】 beforeRecnclCheck exec over!");
        return BAT_SUCC;
    }

    public boolean writeRecnclResultsIntoTable(JobDataMap dataMap){
        int iResult = 0;
        //清理结果表
        String retTblNm = dataMap.get("CurrRetTblNm").toString();
        TblQpbatRecnclRstComExample tblQpbatRecnclRstComExample = new TblQpbatRecnclRstComExample();
        TblQpbatRecnclRstComExample.Criteria retCriteria = tblQpbatRecnclRstComExample.createCriteria();
        retCriteria.andBussCdEqualTo(dataMap.get("BussCd").toString());
        retCriteria.andSettleDtEqualTo(dataMap.get("SettleDt").toString());
        if(dataMap.get("SettleNum") != null){
            retCriteria.andSettleNumEqualTo(dataMap.get("SettleNum").toString());
        }
        try{
            iResult = TblQpbatRecnclRstComDao.deleteByExample(retTblNm, tblQpbatRecnclRstComExample);
            if(0 >= iResult){
                log.error("【writeRecnclResultsIntoTable】清理不平表失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【writeRecnclResultsIntoTable】清理不平表发生异常", e);
            return BAT_FAIL;
        }
        log.info("【writeRecnclResultsIntoTable】清理不平表成功");

        //登记银联清算明细相平结果至结果表
        RecCupsAndBankRecords recCupsAndBankRecords = new RecCupsAndBankRecords();
        recCupsAndBankRecords.setBussCd(dataMap.get("BussCd").toString());
        recCupsAndBankRecords.setSettleDt(dataMap.get("SettleDt").toString());
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.selUpComtrxEqualIntoRetTbl2(recCupsAndBankRecords);
            }else{
                iResult = recCupsAndBankRecordsDao.selUpComtrxEqualIntoRetTbl1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【writeRecnclResultsIntoTable】登记银联明细表相平记录至结果表失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【writeRecnclResultsIntoTable】登记银联明细表相平记录至结果表异常",e);
            return BAT_FAIL;
        }
        //登记银联清算明细不平结果至结果表
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.selUpComtrxNoEqualIntoRetTbl2(recCupsAndBankRecords);
            }else{
                iResult = recCupsAndBankRecordsDao.selUpComtrxNoEqualIntoRetTbl1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【writeRecnclResultsIntoTable】登记银联明细表不平记录至结果表失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【writeRecnclResultsIntoTable】登记银联明细表不平记录至结果表异常",e);
            return BAT_FAIL;
        }
        log.info("【writeRecnclResultsIntoTable】登记银联明细表不平记录至结果表成功");

        //登记银行明细表不平至结果表
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.selStdBkDtlNoEqualIntoRetTbl2(recCupsAndBankRecords);
            }else{
                iResult = recCupsAndBankRecordsDao.selStdBkDtlNoEqualIntoRetTbl1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【writeRecnclResultsIntoTable】登记银行清算明细表不平记录至结果表失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【writeRecnclResultsIntoTable】登记银行清算明细表不平记录至结果表异常",e);
            return BAT_FAIL;
        }
        log.info("【writeRecnclResultsIntoTable】登记银行清算明细表不平记录至结果表成功");

        return BAT_SUCC;
    }

    public boolean recnclCupsAndBankAmt(JobDataMap dataMap){
        int iResult = 0;
        //金额勾对
        RecCupsAndBankRecords recCupsAndBankRecords = new RecCupsAndBankRecords();
        recCupsAndBankRecords.setBussCd(dataMap.get("BussCd").toString());
        recCupsAndBankRecords.setSettleDt(dataMap.get("SettleDt").toString());
        recCupsAndBankRecords.setCupsTblNm(dataMap.get("CurrCupsTblNm").toString());
        recCupsAndBankRecords.setBankTblNm(dataMap.get("CurrBankTblNm").toString());
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.updCupsAndBankTblRecStForRecAmt2(recCupsAndBankRecords);
            }
            else{
                iResult = recCupsAndBankRecordsDao.updCupsAndBankTblRecStForRecAmt1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【recnclCupsAndBankAmt】银联银行明细金额勾对失败iResult:"+iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【recnclCupsAndBankAmt】银联银行明细金额勾对异常",e);
            return BAT_FAIL;
        }
        log.info("【recnclCupsAndBankAmt】银联银行明细金额勾对成功");
        return BAT_SUCC;
    }

    public boolean initUpComtrxTblSt(JobDataMap dataMap){
        int iResult = 0;
        //cups流水状态初始为00
        String tableName = dataMap.get("CurrCupsTblNm").toString();
        String bussCd = dataMap.get("BussCd").toString();
        String settleDt = dataMap.get("SettleDt").toString();
        String settleNum = "";
        log.info("【initUpComtrxTblSt】初始化银联明细流水tableName:"+ tableName +",bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + dataMap.get("SettleNum"));
        TblQpbatUpComtrx qpbatUpComtrx = new TblQpbatUpComtrx();
        qpbatUpComtrx.setRecnclSt("00");
        TblQpbatUpComtrxExample qpbatUpComtrxExample = new TblQpbatUpComtrxExample();
        TblQpbatUpComtrxExample.Criteria criteriaUpComtrx = qpbatUpComtrxExample.createCriteria();
        criteriaUpComtrx.andBussCdEqualTo(bussCd);
        criteriaUpComtrx.andSettleDtEqualTo(settleDt);
        if(dataMap.get("SettleNum") !=null){
            settleNum = dataMap.get("SettleNum").toString();
            criteriaUpComtrx.andSettleNumEqualTo(settleNum);
        }
        try{
            iResult = TblQpbatUpComtrxDao.updateByExample(tableName, qpbatUpComtrx, qpbatUpComtrxExample);
            if(0 >= iResult){
                log.error("【initUpComtrxTblSt】初始化银联清算流水失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【initUpComtrxTblSt】初始化银联清算流水发生异常", e);
            return BAT_FAIL;
        }
        log.info("【initUpComtrxTblSt】流水初始化完成");

        //comtrx流水不参与对账的流水状态更新为20,bussCd+settleDt+bizFuncCd
        log.info("【initUpComtrxTblSt】初始化不参与对账银联清算流水tableName:"+ tableName +",bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + settleNum);
        qpbatUpComtrx.setRecnclSt("20");
        criteriaUpComtrx.andBussCdEqualTo(bussCd);
        criteriaUpComtrx.andSettleDtEqualTo(settleDt);
        if(dataMap.get("SettleNum") != null){
            settleNum = dataMap.get("SettleNum").toString();
            criteriaUpComtrx.andSettleNumEqualTo(settleNum);
        }
        criteriaUpComtrx.andTransTpNotIn(TblQpbatTrxtypInfDao.selectByRecSt("0"));
        try{
            iResult = TblQpbatUpComtrxDao.updateByExample(tableName, qpbatUpComtrx, qpbatUpComtrxExample);
            if(0 >= iResult){
                log.error("【initUpComtrxTblSt】初始化不参与对账银联清算流水失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【initUpComtrxTblSt】初始化不参与对账银联清算流水发生异常", e);
            return BAT_FAIL;
        }
        log.info("【initUpComtrxTblSt】不参与对账银联清算流水初始化完成");

        return BAT_SUCC;
    }

    public boolean initStdBankDtlTblSt(JobDataMap dataMap){
        int iResult = 0;
        //bank查到流水的记录状态更新为00，除99外
        String tableName = dataMap.get("CurrBankTblNm").toString();
        String bussCd = dataMap.get("BussCd").toString();
        String settleDt = dataMap.get("SettleDt").toString();
        String settleNum = "";
        log.info("【initStdBankDtlTblSt】初始化银行明细流水tableName:"+ tableName +",bussCd:" + bussCd + ",settleDt:" + settleDt + ",settleNum:" + dataMap.get("SettleNum"));
        TblQpbatStdBankDetail qpbatStdBankDetail = new TblQpbatStdBankDetail();
        qpbatStdBankDetail.setRecnclSt("00");
        TblQpbatStdBankDetailExample qpbatStdBankDetailExample = new TblQpbatStdBankDetailExample();
        TblQpbatStdBankDetailExample.Criteria criteriaStdBankDtl = qpbatStdBankDetailExample.createCriteria();
        criteriaStdBankDtl.andBussCdEqualTo(bussCd);
        criteriaStdBankDtl.andSettleDtEqualTo(settleDt);
        if(dataMap.get("SettleNum") != null){
            settleNum = dataMap.get("SettleNum").toString();
            criteriaStdBankDtl.andSettleNumEqualTo(settleNum);
        }
        criteriaStdBankDtl.andRecnclStNotEqualTo("99");
        try{
            iResult = TblQpbatStdBankDetailDao.updateByExample(tableName, qpbatStdBankDetail, qpbatStdBankDetailExample);
            if(0 >= iResult){
                log.error("【initStdBankDtlTblSt】初始化银行清算流水失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【initStdBankDtlTblSt】初始化银行清算流水发生异常", e);
            return BAT_FAIL;
        }
        log.info("【initStdBankDtlTblSt】银行明细流水初始化完成");

        //bank流水状态初始为00
        tableName = dataMap.get("CurrBankTblNm").toString();
        qpbatStdBankDetail.setBussCd(dataMap.get("BussCd").toString());
        qpbatStdBankDetail.setSettleDt(dataMap.get("SettleDt").toString());
        log.info("【recnclProc】更新银行终态/已冲正成功明细流水tableName:"+ tableName +",bussCd:" + qpbatStdBankDetail.getBussCd() + ",settleDt:" + qpbatStdBankDetail.getSettleDt() + ",settleNum:" + settleNum);
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = TblQpbatStdBankDetailDao.update3002StdBkDtl2(tableName, qpbatStdBankDetail);
            }else{
                iResult = TblQpbatStdBankDetailDao.update3002StdBkDtl1(tableName, qpbatStdBankDetail);
            }
            if(0 >= iResult){
                log.error("【recnclProc】更新银行终态/已冲正成功明细流水失败iResult:" + iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【recnclProc】更新银行终态/已冲正成功明细流水发生异常", e);
            return BAT_FAIL;
        }
        log.info("【recnclProc】更新银行终态/已冲正明细流水初始化完成");

        return BAT_SUCC;
    }

    public boolean updSingleMoreRecords(JobDataMap dataMap){
        int iResult = 0;
        //更新银联多本行少记录
        RecCupsAndBankRecords recCupsAndBankRecords = new RecCupsAndBankRecords();
        recCupsAndBankRecords.setBussCd(dataMap.get("BussCd").toString());
        recCupsAndBankRecords.setSettleDt(dataMap.get("SettleDt").toString());
        recCupsAndBankRecords.setCupsTblNm(dataMap.get("CurrCupsTblNm").toString());
        recCupsAndBankRecords.setBankTblNm(dataMap.get("CurrBankTblNm").toString());
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.updCupsMoreRecords2(recCupsAndBankRecords);
            }else{
                iResult = recCupsAndBankRecordsDao.updCupsMoreRecords1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【updSingleMoreRecords】更新银联多银行少明细记录失败iResult:"+iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【updSingleMoreRecords】更新银联多银行少明细记录异常",e);
            return BAT_FAIL;
        }
        log.info("【updSingleMoreRecords】更新银联多银行少明细记录成功");

        //更新银联少银行多记录
        try{
            if(dataMap.get("SettleNum") != null){
                iResult = recCupsAndBankRecordsDao.updBankMoreRecords2(recCupsAndBankRecords);
            }else{
                iResult = recCupsAndBankRecordsDao.updBankMoreRecords1(recCupsAndBankRecords);
            }
            if(0 >= iResult){
                log.error("【updSingleMoreRecords】更新银行多银联少明细记录失败iResult:"+iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【updSingleMoreRecords】更新银行多银联少明细记录异常",e);
            return BAT_FAIL;
        }
        log.info("【updSingleMoreRecords】更新银行多银联少明细记录成功");
        return BAT_SUCC;
    }
}
