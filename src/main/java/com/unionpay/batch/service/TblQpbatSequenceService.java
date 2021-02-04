package com.unionpay.batch.service;

import com.unionpay.batch.entity.TblQpbatSequence;
import org.quartz.JobDataMap;

public interface TblQpbatSequenceService {
    public TblQpbatSequence getBatSequenceBySysCd(String sysCd);

    public String getSequenceId(JobDataMap dataMap);
}
