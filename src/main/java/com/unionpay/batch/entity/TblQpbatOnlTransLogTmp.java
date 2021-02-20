package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatOnlTransLogTmp{
    private String fwdInsIdCd;

    private String transSeq;

    private Long qpTransSeq;

    private String qpTransDtTm;

    private String transDetCd;

    private String transTp;

    private String bizFuncId;

    private String settleDtTm;

    private String transAt;

    private String rcvAcctNo;

    private String sndAcctNo;

    private String sgnNo;

    private String transSt;

    private String bankMainTransSeq;

    private String rsvFld;

    private String openIn;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getFwdInsIdCd() {
        return fwdInsIdCd;
    }

    public void setFwdInsIdCd(String fwdInsIdCd) {
        this.fwdInsIdCd = fwdInsIdCd == null ? null : fwdInsIdCd.trim();
    }

    public String getTransSeq() {
        return transSeq;
    }

    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq == null ? null : transSeq.trim();
    }

    public Long getQpTransSeq() {
        return qpTransSeq;
    }

    public void setQpTransSeq(Long qpTransSeq) {
        this.qpTransSeq = qpTransSeq;
    }

    public String getQpTransDtTm() {
        return qpTransDtTm;
    }

    public void setQpTransDtTm(String qpTransDtTm) {
        this.qpTransDtTm = qpTransDtTm == null ? null : qpTransDtTm.trim();
    }

    public String getTransDetCd() {
        return transDetCd;
    }

    public void setTransDetCd(String transDetCd) {
        this.transDetCd = transDetCd == null ? null : transDetCd.trim();
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

    public String getSettleDtTm() {
        return settleDtTm;
    }

    public void setSettleDtTm(String settleDtTm) {
        this.settleDtTm = settleDtTm == null ? null : settleDtTm.trim();
    }

    public String getTransAt() {
        return transAt;
    }

    public void setTransAt(String transAt) {
        this.transAt = transAt == null ? null : transAt.trim();
    }

    public String getRcvAcctNo() {
        return rcvAcctNo;
    }

    public void setRcvAcctNo(String rcvAcctNo) {
        this.rcvAcctNo = rcvAcctNo == null ? null : rcvAcctNo.trim();
    }

    public String getSndAcctNo() {
        return sndAcctNo;
    }

    public void setSndAcctNo(String sndAcctNo) {
        this.sndAcctNo = sndAcctNo == null ? null : sndAcctNo.trim();
    }

    public String getSgnNo() {
        return sgnNo;
    }

    public void setSgnNo(String sgnNo) {
        this.sgnNo = sgnNo == null ? null : sgnNo.trim();
    }

    public String getTransSt() {
        return transSt;
    }

    public void setTransSt(String transSt) {
        this.transSt = transSt == null ? null : transSt.trim();
    }

    public String getBankMainTransSeq() {
        return bankMainTransSeq;
    }

    public void setBankMainTransSeq(String bankMainTransSeq) {
        this.bankMainTransSeq = bankMainTransSeq == null ? null : bankMainTransSeq.trim();
    }

    public String getRsvFld() {
        return rsvFld;
    }

    public void setRsvFld(String rsvFld) {
        this.rsvFld = rsvFld == null ? null : rsvFld.trim();
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