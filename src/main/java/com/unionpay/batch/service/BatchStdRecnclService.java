package com.unionpay.batch.service;

import org.quartz.JobDataMap;

public interface BatchStdRecnclService {
    public boolean initClearRecnclTbl(JobDataMap dataMap);

    public boolean recnclProc(JobDataMap dataMap);
}
