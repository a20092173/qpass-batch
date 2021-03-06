package com.unionpay.batch.jobs;
/*
* BatchRecnclProcessCommonJob 类完成通用批量对账任务BatchRecnclProcessCommon类对账流程执行
* */

import com.unionpay.batch.service.imp.TblQpbatSequenceServiceImpl;
import com.unionpay.batch.service.imp.TblQpbatUpComtrxServiceImpl;
import com.unionpay.batch.tasks.BatchRecnclProcessCommon;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class BatchRecnclProcessCommonJob extends QuartzJobBean {

    //获取个性化流水号(默认6位：000000-999999)
    @Autowired
    TblQpbatSequenceServiceImpl tblQpbatSequenceService;

    @Autowired
    TblQpbatUpComtrxServiceImpl tblQpbatUpComtrxService;

    @Autowired
    BatchRecnclProcessCommon batchRecnclProcessCommon;

    private void initParm(JobDataMap dataMap){
        //日期时间
        String settleDt = dataMap.get("SettleDt").toString();
        dataMap.put("TransDt",settleDt);
        dataMap.put("CurrBankTblNm", "tbl_qpbat_std_bank_detail"+settleDt.substring(4,6));
        dataMap.put("CurrCupsTblNm", "tbl_qpbat_up_comtrx"+settleDt.substring(4,6));
        dataMap.put("CurrRetTblNm", "tbl_qpbat_recncl_rst_com"+settleDt.substring(4,6));
        dataMap.put("OnlTransLogTblNm", "tbl_qponl_trans_log"); //转存时需确定是否要从T+1、T、T-1表转存数据
        dataMap.put("BatDbNm","qpbatdb");
        dataMap.put("OnlDbNm","qponldb");
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("start.................");
        //生成个性化流水号
        //String taskId = tblQpbatSequenceService.makeBatchTaskId(jobExecutionContext.getMergedJobDataMap());
        //log.info("--------taskID:"+taskId+ "----------");

        //银联清算流水入库
        /*
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("UpTableName", "tbl_qpbat_up_comtrx01");
        dataMap.put("BussCd", "TESTBANK");
        dataMap.put("SndrInsIdCd","W0ACQ002");
        dataMap.put("SettleDt","20200610");
        dataMap.put("TransSeq","0610C04myZS1c3IB");
        dataMap.put("BankTransSeq","00000000001");
        dataMap.put("BizFuncCd","100003");
        dataMap.put("BtpNo","10000001");
        dataMap.put("TransAt","156000000010000");
        dataMap.put("TransDt","20200610");
        dataMap.put("TransTm","164840");
        dataMap.put("TransTp","1002");
        dataMap.put("SettleNum","13");
        dataMap.put("IssAcq","0");
        tblQpbatUpComtrxService.insertOneRecordIntoUpComtrx(dataMap);
        */
        JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
        //参数初始化
        initParm(dataMap);
        //task任务执行
        batchRecnclProcessCommon.exeBatchRecnclCommonFlow(dataMap);
        log.info("end...................");
        //SignUser user1;
        //user1 = signUserService.getSignUserByEmpId("A000001");
        //log.info("result = " + user1.toString());
    }
}



