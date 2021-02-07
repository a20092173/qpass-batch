package com.unionpay.batch.tasks;

import com.unionpay.batch.base.BankStdFile;
import com.unionpay.batch.base.QpCupsN01File;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class StdRecncl2PartFileResolveAndInsert {
    @Autowired
    QpCupsN01File qpCupsN01File;

    @Autowired
    BankStdFile bankStdFile;

    public boolean exeBatchRecnclCommonFlow(JobDataMap datMap) throws IOException, InterruptedException {

        //获取文件索引和对账日期
        String qpCupsN01IsFileIndex = datMap.get("QPCUPSN01_Is_FILE_INDEX").toString();
        String stdBankFileIndex = datMap.get("STDBANK_FILE_INDEX").toString();

        String transDt = StdRecncl2PartFileGet.getTransDt();
        String recnclDt = StdRecncl2PartFileGet.getRecnclDt();

        //银联文件解析入库
        if(isQpCupsN01IsFileResloveAndInsertSucc())
        {
            log.info("银联文件解析入库成功，无需重复解析入库"+qpCupsN01IsFileIndex+" , "+recnclDt);
        }
        else{
            QpCupsN01TableClearByRecnclDt();
            QpCupsN01IsFileResloveAndInsert(qpCupsN01IsFileIndex, recnclDt);
        }
        Thread.sleep(1000);
        log.info("QpCupsN01IsFileResloveAndInsert succ"+qpCupsN01IsFileIndex+" , "+recnclDt);

        //银行文件解析入库
        if(isStdBankFileResloveAndInsertSucc())
        {
            log.info("银行文件解析入库成功，无需重复解析入库"+stdBankFileIndex+" , "+recnclDt);
        }
        else {
            StdBankDataClearByRecnclDt();
            StdBankFileResloveAndInsert(stdBankFileIndex, recnclDt);
        }

        Thread.sleep(1000);
        log.info("StdBankFileResloveAndInsert succ"+stdBankFileIndex+" , "+recnclDt);

        return true;
    }

    private boolean isStdBankFileResloveAndInsertSucc() {
        return true;
    }

    private boolean isQpCupsN01IsFileResloveAndInsertSucc() {
        return true;
    }

    public boolean QpCupsN01TableClearByRecnclDt(){
        return true;
    }

    public boolean StdBankDataClearByRecnclDt(){
        return true;
    }

    public boolean QpCupsN01IsFileResloveAndInsert(String fileIndex, String settleDt) throws IOException {
        qpCupsN01File.init(fileIndex,settleDt);
        qpCupsN01File.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23");
        return true;
    }

    public boolean StdBankFileResloveAndInsert(String fileIndex, String settleDt) throws IOException {
        bankStdFile.init(fileIndex,settleDt);
        bankStdFile.readStdBankFileAndInsert("D:\\BANKSERL_04399200.20171207");
        return true;
    }


}
