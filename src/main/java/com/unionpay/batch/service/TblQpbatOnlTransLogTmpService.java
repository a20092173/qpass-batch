package com.unionpay.batch.service;

import org.quartz.Job;
import org.quartz.JobDataMap;

public interface TblQpbatOnlTransLogTmpService {
    public boolean insertOnlTransLogTmp(JobDataMap dataMap);

    public boolean deleteOnlTransLogTmp(JobDataMap dataMap);
}
