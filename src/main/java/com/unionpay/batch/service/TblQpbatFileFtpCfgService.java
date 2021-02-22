package com.unionpay.batch.service;

import com.unionpay.batch.entity.TblQpbatFileFtpCfg;
import org.quartz.JobDataMap;

public interface TblQpbatFileFtpCfgService {
    public TblQpbatFileFtpCfg getFtpCfgFileExampInf(JobDataMap datMap, String fileIndex);
}
