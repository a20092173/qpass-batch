package com.unionpay.batch.tasks;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StdRecncl2PartDataRecncl {

    public boolean exeBatchRecnclCommonFlow(JobDataMap datMap)  {

        //获取文件索引和对账日期
        String qpCupsN01IsFileIndex = datMap.get("QPCUPSN01_Is_FILE_INDEX").toString();
        String stdBankFileIndex = datMap.get("STDBANK_FILE_INDEX").toString();

        String transDt = StdRecncl2PartFileGet.getTransDt();
        String recnclDt = StdRecncl2PartFileGet.getRecnclDt();


        return true;
    }
}
