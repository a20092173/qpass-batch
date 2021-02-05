package com.unionpay.batch.service.imp;

import com.unionpay.batch.dao.TblQpbatUpComtrxMapper;
import com.unionpay.batch.entity.TblQpbatUpComtrx;
import com.unionpay.batch.service.TblQpbatUpComtrxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Service
@Transactional
public class TblQpbatUpComtrxServiceImpl implements TblQpbatUpComtrxService {
    @Autowired
    TblQpbatUpComtrxMapper TblQpbatUpComtrxDao;

    @Override
    public int insert(String tableName,TblQpbatUpComtrx upComtrxRecord) {
        return TblQpbatUpComtrxDao.insertSelective(tableName,upComtrxRecord);
    }

    public boolean insertOneRecordIntoUpComtrx(Map<String,String> dataMap){
        TblQpbatUpComtrx upComtrx = new TblQpbatUpComtrx();
        upComtrx.setBussCd(dataMap.get("BussCd"));
        upComtrx.setSndrInsIdCd(dataMap.get("SndrInsIdCd"));
        upComtrx.setSettleDt(dataMap.get("SettleDt"));
        upComtrx.setTransSeq(dataMap.get("TransSeq"));
        upComtrx.setBankTransSeq(dataMap.get("BankTransSeq"));
        upComtrx.setBizFuncCd(dataMap.get("BizFuncCd"));
        upComtrx.setBtpNo(dataMap.get("BtpNo"));
        upComtrx.setTransAt(dataMap.get("TransAt"));
        upComtrx.setTransDt(dataMap.get("TransDt"));
        upComtrx.setTransTm(dataMap.get("TransTm"));
        upComtrx.setTransTp(dataMap.get("TransTp"));
        upComtrx.setSettleNum(dataMap.get("SettleNum"));
        //upComtrx.setOrgTransSeq(dataMap.get("OrgTransSeq"));
        //upComtrx.setOrgTransAt(dataMap.get("OrgTransAt"));
        upComtrx.setIssAcq(dataMap.get("IssAcq"));
        int iResult = 0;
        try{
            iResult = insert(dataMap.get("UpTableName"),upComtrx);
            if(0 >= iResult){
                log.error("【Cups清算流水】入库失败");
                return BAT_FAIL;
            }
        }catch(Exception e){
            log.error("【Cups清算流水】入库发生异常",e);
            return BAT_FAIL;
        }
        log.info("【Cups清算流水】银联流水:"+ upComtrx.getTransSeq() + "入库成功");
        return BAT_SUCC;
    }
}
