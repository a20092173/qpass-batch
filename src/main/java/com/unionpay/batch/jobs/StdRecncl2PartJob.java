package com.unionpay.batch.jobs;

import com.unionpay.batch.service.imp.TblQpbatSequenceServiceImpl;
import com.unionpay.batch.service.imp.TblQpbatUpComtrxServiceImpl;
import com.unionpay.batch.tasks.BatchRecnclProcessCommon;
import com.unionpay.batch.tasks.StdRecncl2PartDataRecncl;
import com.unionpay.batch.tasks.StdRecncl2PartFileGet;
import com.unionpay.batch.tasks.StdRecncl2PartFileResolveAndInsert;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StdRecncl2PartJob extends QuartzJobBean {
    //获取个性化流水号(默认6位：000000-999999)
    @Autowired
    TblQpbatSequenceServiceImpl tblQpbatSequenceService;

    @Autowired
    TblQpbatUpComtrxServiceImpl tblQpbatUpComtrxService;

    @Autowired
    StdRecncl2PartFileGet stdRecncl2PartFileGet;
    @Autowired
    StdRecncl2PartFileResolveAndInsert stdRecncl2PartFileResolveAndInsert;
    @Autowired
    StdRecncl2PartDataRecncl stdRecncl2PartDataRecncl;

    @SneakyThrows
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("start.................");
        //生成个性化流水号
        //String taskId = tblQpbatSequenceService.makeBatchTaskId(jobExecutionContext.getMergedJobDataMap());
        //log.info("--------taskID:"+taskId+ "----------");

        stdRecncl2PartFileGet.exeBatchRecnclCommonFlow(jobExecutionContext.getMergedJobDataMap());

        stdRecncl2PartFileResolveAndInsert.exeBatchRecnclCommonFlow(jobExecutionContext.getMergedJobDataMap());

        stdRecncl2PartDataRecncl.exeBatchRecnclCommonFlow(jobExecutionContext.getMergedJobDataMap());

        log.info("end...................");

    }

}
