package com.unionpay.batch.service.imp;

import com.unionpay.batch.dao.TblQpbatOnlTransLogTmpMapper;
import com.unionpay.batch.entity.TblQpbatOnlTransLogTmp;
import com.unionpay.batch.entity.TblQpbatOnlTransLogTmpExample;
import com.unionpay.batch.service.TblQpbatOnlTransLogTmpService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Service
@Transactional
public class TblQpbatOnlTransLogTmpServiceImpl implements TblQpbatOnlTransLogTmpService {

    @Autowired
    TblQpbatOnlTransLogTmpMapper tblQpbatOnlTransLogTmpDao;

    @Override
    public boolean insertOnlTransLogTmp(JobDataMap dataMap){
        int iResult = 0;
        String settleDt = dataMap.getString("SettleDt");
        //从当前月前置流水表转存数据
        String onlTransLogTblNm = dataMap.getString("OnlTransLogTblNm")+settleDt.substring(4,6);
        String batDbNm = dataMap.getString("BatDbNm");
        String onlDbNm = dataMap.getString("OnlDbNm");
        String settleDtTm = "";
        if(8 == settleDt.length()){
            settleDtTm = settleDt.substring(0,4)+"_"+settleDt.substring(4,6)+"_"+settleDt.substring(6,8);
        }
        TblQpbatOnlTransLogTmp tblQpbatOnlTransLogTmp = new TblQpbatOnlTransLogTmp();
        tblQpbatOnlTransLogTmp.setSettleDtTm(settleDtTm);
        try{
            iResult=tblQpbatOnlTransLogTmpDao.insertSpec1(onlTransLogTblNm,onlDbNm,batDbNm,tblQpbatOnlTransLogTmp);
            if(0 > iResult){
                log.error("【insertOnlTransLogTmp】从当前月表转存清算日"+settleDtTm+"流水失败");
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【insertOnlTransLogTmp】从当前月表转存清算日"+settleDtTm+"流水发生异常",e);
            return BAT_FAIL;
        }
        log.info("【insertOnlTransLogTmp】从当前月表转存清算日"+settleDtTm+"流水完毕");
        //转存上月表前置流水
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        try {
            Date date1 = df.parse(settleDt);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date1);
            calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)-1);
            date1 = calendar.getTime();
            String preDate = format.format(date1);
            log.info("【insertOnlTransLogTmp】当前月上月为:"+preDate);
            String preOnlTransLogTblNm = dataMap.getString("OnlTransLogTblNm")+preDate.substring(4,6);
            iResult=tblQpbatOnlTransLogTmpDao.insertSpec1(preOnlTransLogTblNm,onlDbNm,batDbNm,tblQpbatOnlTransLogTmp);
            if(0 > iResult){
                log.error("【insertOnlTransLogTmp】从上月表转存清算日"+settleDtTm+"流水失败");
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【insertOnlTransLogTmp】从上月转存前置流水发生异常:",e);
            return BAT_FAIL;
        }
        log.info("【insertOnlTransLogTmp】从上月表转存清算日"+settleDtTm+"流水完毕");
        //转存下月流水
        try{
            Date date2 = df.parse(settleDt);
            SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date2);
            calendar.set(Calendar.MONTH,calendar.get(Calendar.MONTH)+1);
            date2 = calendar.getTime();
            String nextDate = format.format(date2);
            log.info("【insertOnlTransLogTmp】当前月下月为:"+nextDate);
            String nextOnlTransLogTblNm = dataMap.getString("OnlTransLogTblNm")+nextDate.substring(4,6);
            iResult=tblQpbatOnlTransLogTmpDao.insertSpec1(nextOnlTransLogTblNm,onlDbNm,batDbNm,tblQpbatOnlTransLogTmp);
            if(0 > iResult){
                log.error("【insertOnlTransLogTmp】从下月表转存清算日"+settleDtTm+"流水失败");
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【insertOnlTransLogTmp】从下月转存前置流水发生异常:",e);
            return BAT_FAIL;
        }
        log.info("【insertOnlTransLogTmp】从下月表转存清算日"+settleDtTm+"流水完毕");
        return BAT_SUCC;
    }

    @Override
    public boolean deleteOnlTransLogTmp(JobDataMap dataMap){

        int iResult = 0;
        log.info("【deleteOnlTransLogTmp】清理前置流水转存表");
        try{
            iResult=tblQpbatOnlTransLogTmpDao.deleteByExample(null);
            if(0 > iResult){
                log.error("【deleteOnlTransLogTmp】清理前置流水转存表失败iResult:",iResult);
                return BAT_FAIL;
            }
        }catch (Exception e){
            log.error("【deleteOnlTransLogTmp】清理前置流水转存表发生异常:", e);
            return BAT_FAIL;
        }
        log.info("【deleteOnlTransLogTmp】清理前置流水转存表完毕");
        return BAT_SUCC;
    }
}
