package com.unionpay.batch.jobs;
/*
* BatchRecnclProcessCommonJob 类完成通用批量对账任务BatchRecnclProcessCommon类对账流程执行
* */

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BatchRecnclProcessCommonJob extends QuartzJobBean {

    BatchRecnclProcessCommon commonRecnclProc;

    public void setBatchRecnclProcCom(BatchRecnclProcessCommon commonRecnclProc)
    {
        this.commonRecnclProc = commonRecnclProc;
    }
    @SneakyThrows
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("start.................");
        setBatchRecnclProcCom(new BatchRecnclProcessCommon());
        commonRecnclProc.exeBatchRecnclCommonFlow(jobExecutionContext.getMergedJobDataMap());
    }
}



