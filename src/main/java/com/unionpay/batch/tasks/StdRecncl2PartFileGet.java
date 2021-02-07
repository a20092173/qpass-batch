package com.unionpay.batch.tasks;

import com.unionpay.batch.base.BankStdFile;
import com.unionpay.batch.base.QpCupsN01File;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
@Slf4j
public class StdRecncl2PartFileGet {
    @Autowired
    QpCupsN01File qpCupsN01File;

    @Autowired
    BankStdFile bankStdFile;

    public boolean exeBatchRecnclCommonFlow(JobDataMap datMap) throws InterruptedException {

        //获取文件索引和对账日期
        String qpCupsN01IsFileIndex = datMap.get("QPCUPSN01_Is_FILE_INDEX").toString();
        String stdBankFileIndex = datMap.get("STDBANK_FILE_INDEX").toString();

        String transDt = getTransDt();
        String recnclDt = getRecnclDt();

        //银联文件获取
        if(isQpCupsN01IsFileGetSucc()){
            log.info("银联文件获取成功，无需重复获取"+qpCupsN01IsFileIndex+" , "+recnclDt);
        }
        else{
            QpCupsN01IsFileGet();
        }
        Thread.sleep(1000);

        //银行文件获取
        if(isStdBankFileGetSucc()){
            log.info("银行文件获取成功，无需重复获取"+stdBankFileIndex+" , "+recnclDt);
        }
        else {
            StdBankFileGet();
        }
        Thread.sleep(1000);

        return true;
    }

    private boolean isStdBankFileGetSucc() {
        return true;
    }

    private boolean isQpCupsN01IsFileGetSucc() {
        return true;
    }

    public boolean QpCupsN01IsFileGet(){
        return true;
    }

    public boolean StdBankFileGet(){
        return true;
    }

    public static String getRecnclDt() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date dt=new Date();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        //rightNow.add(Calendar.YEAR,-1);//日期减1年
        //rightNow.add(Calendar.MONTH,3);//日期加3个月
        rightNow.add(Calendar.DAY_OF_YEAR,-1);//日期减1天
        Date dt1=rightNow.getTime();
        String recnclDt = sdf.format(dt1);
        log.info("对账业务日期recnclDt="+recnclDt);

        return recnclDt;
    }

    public static String getRecnclDtByInputDate(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");

        Date dt=sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
//        rightNow.add(Calendar.YEAR,-1);//日期减1年
//        rightNow.add(Calendar.MONTH,3);//日期加3个月
        rightNow.add(Calendar.DAY_OF_YEAR,10);//日期加10天
        Date dt1=rightNow.getTime();
        String recnclDt = sdf.format(dt1);
        log.info("对账业务日期recnclDt="+recnclDt);

        return recnclDt;
    }

    public static String getTransDt() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date dt=new Date();
        String transDt = sdf.format(dt);
        log.info("对账任务执行日期transDt="+transDt);

        return transDt;
    }
}
