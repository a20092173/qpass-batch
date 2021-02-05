package com.unionpay.batch.service.imp;

import com.unionpay.batch.dao.TblQpbatSequenceMapper;
import com.unionpay.batch.entity.TblQpbatSequence;
import com.unionpay.batch.entity.TblQpbatSequenceExample;
import com.unionpay.batch.service.TblQpbatSequenceService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Service
@Transactional
public class TblQpbatSequenceServiceImpl implements TblQpbatSequenceService {

    @Autowired
    private TblQpbatSequenceMapper tblQpbatSequenceDao;

    @Override
    public TblQpbatSequence getBatSequenceBySysCd(String sysCd) {
        return tblQpbatSequenceDao.findBatSequenceBySysCd(sysCd);
    }

    public int updBatSequenceBySysCd(JobDataMap dataMap) throws Exception{
        TblQpbatSequence qpbatSequence = new TblQpbatSequence();
        qpbatSequence.setSeqId(dataMap.getString("NEW_SEQ_ID"));
        TblQpbatSequenceExample qpbatSequenceExample = new TblQpbatSequenceExample();
        TblQpbatSequenceExample.Criteria criteria = qpbatSequenceExample.createCriteria();
        criteria.andSysCodeEqualTo(dataMap.getString("SYS_CODE"));
        return tblQpbatSequenceDao.updateByExample(qpbatSequence, qpbatSequenceExample);
    }

    @Override
    public String getSequenceId(JobDataMap dataMap){
        String curSeqID="";
        String formatSuff = "";
        int seqId,increstep,seqLen,maxId,inDx;
        try {
            TblQpbatSequence qpbatSequence = new TblQpbatSequence();
            qpbatSequence = getBatSequenceBySysCd(dataMap.getString("SYS_CODE"));
            curSeqID = qpbatSequence.getSeqId();
            log.info("【获取batsequence】获取数据库当前流水号为:" + curSeqID);
            seqId = Integer.parseInt(curSeqID);
            increstep = qpbatSequence.getInCreStep();
            seqLen = qpbatSequence.getMaxId().length();
            maxId = Integer.parseInt(qpbatSequence.getMaxId());
            if (0 >= seqLen || 0 >= increstep) {
                log.error("【获取batsequence】当前流水号信息配置错误；原因：步长或最大流水号不大于零");
                return BAT_FAILURE;
            }
            if (seqId >= maxId) {
                log.debug("【获取batsequence】流水号当前已达上限重新计号");
                seqId = 0;
            } else {
                seqId += increstep;
            }
            for(inDx = 0; inDx < seqLen; inDx++){
                formatSuff += "0";
            }
            log.debug("【更新batsequence】流水号格式串:" + formatSuff);
            String seqIdStr = new DecimalFormat(formatSuff).format(seqId);
            log.info("【更新batsequence】待更新流水号为:" + seqIdStr);
            dataMap.put("NEW_SEQ_ID", seqIdStr);
            int iResult = 0;
            iResult = updBatSequenceBySysCd(dataMap);
            if(0 >= iResult){
                log.error("【更新batsequence】更新库表流水号失败");
                return BAT_FAILURE;
            }
        }catch(Exception e){
            //e.printStackTrace();
            log.warn("【更新batsequence】发生异常",e);
        }
        log.info("【获取batsequence】获取sequence成功,本次使用流水号:"+curSeqID);
        return curSeqID;
    }

    public synchronized String makeBatchTaskId(JobDataMap dataMap){
        String seqId = getSequenceId(dataMap);
        if(seqId.equals(BAT_FAILURE)) {
            return BAT_FAILURE;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String curDateTime = dateFormat.format(new Date());
        return curDateTime+seqId;
    }
}
