package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatRecnclRstCom{
    private String bussCd;

    private String sndInsCd;

    private String settleDt;

    private String transSeq;

    private String transTp;

    private String bizFuncId;

    private String outActNo;

    private String inActNo;

    private String transAt;

    private String settleNum;

    private String transDt;

    private String transTm;

    private String issAcq;

    private String operSt;

    private String recnclSt;

    private String btpNo;

    private String rstMsg;

    private String openIn;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd == null ? null : bussCd.trim();
    }

    public String getSndInsCd() {
        return sndInsCd;
    }

    public void setSndInsCd(String sndInsCd) {
        this.sndInsCd = sndInsCd == null ? null : sndInsCd.trim();
    }

    public String getSettleDt() {
        return settleDt;
    }

    public void setSettleDt(String settleDt) {
        this.settleDt = settleDt == null ? null : settleDt.trim();
    }

    public String getTransSeq() {
        return transSeq;
    }

    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq == null ? null : transSeq.trim();
    }

    public String getTransTp() {
        return transTp;
    }

    public void setTransTp(String transTp) {
        this.transTp = transTp == null ? null : transTp.trim();
    }

    public String getBizFuncId() {
        return bizFuncId;
    }

    public void setBizFuncId(String bizFuncId) {
        this.bizFuncId = bizFuncId == null ? null : bizFuncId.trim();
    }

    public String getOutActNo() {
        return outActNo;
    }

    public void setOutActNo(String outActNo) {
        this.outActNo = outActNo == null ? null : outActNo.trim();
    }

    public String getInActNo() {
        return inActNo;
    }

    public void setInActNo(String inActNo) {
        this.inActNo = inActNo == null ? null : inActNo.trim();
    }

    public String getTransAt() {
        return transAt;
    }

    public void setTransAt(String transAt) {
        this.transAt = transAt == null ? null : transAt.trim();
    }

    public String getSettleNum() {
        return settleNum;
    }

    public void setSettleNum(String settleNum) {
        this.settleNum = settleNum == null ? null : settleNum.trim();
    }

    public String getTransDt() {
        return transDt;
    }

    public void setTransDt(String transDt) {
        this.transDt = transDt == null ? null : transDt.trim();
    }

    public String getTransTm() {
        return transTm;
    }

    public void setTransTm(String transTm) {
        this.transTm = transTm == null ? null : transTm.trim();
    }

    public String getIssAcq() {
        return issAcq;
    }

    public void setIssAcq(String issAcq) {
        this.issAcq = issAcq == null ? null : issAcq.trim();
    }

    public String getOperSt() {
        return operSt;
    }

    public void setOperSt(String operSt) {
        this.operSt = operSt == null ? null : operSt.trim();
    }

    public String getRecnclSt() {
        return recnclSt;
    }

    public void setRecnclSt(String recnclSt) {
        this.recnclSt = recnclSt == null ? null : recnclSt.trim();
    }

    public String getBtpNo() {
        return btpNo;
    }

    public void setBtpNo(String btpNo) {
        this.btpNo = btpNo == null ? null : btpNo.trim();
    }

    public String getRstMsg() {
        return rstMsg;
    }

    public void setRstMsg(String rstMsg) {
        this.rstMsg = rstMsg == null ? null : rstMsg.trim();
    }

    public String getOpenIn() {
        return openIn;
    }

    public void setOpenIn(String openIn) {
        this.openIn = openIn == null ? null : openIn.trim();
    }

    public String getRecUpdUsrId() {
        return recUpdUsrId;
    }

    public void setRecUpdUsrId(String recUpdUsrId) {
        this.recUpdUsrId = recUpdUsrId == null ? null : recUpdUsrId.trim();
    }

    public Date getRecUpdTs() {
        return recUpdTs;
    }

    public void setRecUpdTs(Date recUpdTs) {
        this.recUpdTs = recUpdTs;
    }

    public Date getRecCrtTs() {
        return recCrtTs;
    }

    public void setRecCrtTs(Date recCrtTs) {
        this.recCrtTs = recCrtTs;
    }
}