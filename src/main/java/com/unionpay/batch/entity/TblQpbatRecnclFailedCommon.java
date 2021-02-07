package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatRecnclFailedCommon {
    private String transSeq;

    private String sndrInsIdCd;

    private String recnclDt;

    private String acctDt;

    private String peerTransSeq;

    private String transDt;

    private String transTm;

    private String transTp;

    private String outAcctNo;

    private String inAcctNo;

    private String transAt;

    private String recnclSt;

    private String recnclMsg;

    private String operIn;

    private Integer eventId;

    private Integer recId;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getTransSeq() {
        return transSeq;
    }

    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq == null ? null : transSeq.trim();
    }

    public String getSndrInsIdCd() {
        return sndrInsIdCd;
    }

    public void setSndrInsIdCd(String sndrInsIdCd) {
        this.sndrInsIdCd = sndrInsIdCd == null ? null : sndrInsIdCd.trim();
    }

    public String getRecnclDt() {
        return recnclDt;
    }

    public void setRecnclDt(String recnclDt) {
        this.recnclDt = recnclDt == null ? null : recnclDt.trim();
    }

    public String getAcctDt() {
        return acctDt;
    }

    public void setAcctDt(String acctDt) {
        this.acctDt = acctDt == null ? null : acctDt.trim();
    }

    public String getPeerTransSeq() {
        return peerTransSeq;
    }

    public void setPeerTransSeq(String peerTransSeq) {
        this.peerTransSeq = peerTransSeq == null ? null : peerTransSeq.trim();
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

    public String getTransTp() {
        return transTp;
    }

    public void setTransTp(String transTp) {
        this.transTp = transTp == null ? null : transTp.trim();
    }

    public String getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(String outAcctNo) {
        this.outAcctNo = outAcctNo == null ? null : outAcctNo.trim();
    }

    public String getInAcctNo() {
        return inAcctNo;
    }

    public void setInAcctNo(String inAcctNo) {
        this.inAcctNo = inAcctNo == null ? null : inAcctNo.trim();
    }

    public String getTransAt() {
        return transAt;
    }

    public void setTransAt(String transAt) {
        this.transAt = transAt == null ? null : transAt.trim();
    }

    public String getRecnclSt() {
        return recnclSt;
    }

    public void setRecnclSt(String recnclSt) {
        this.recnclSt = recnclSt == null ? null : recnclSt.trim();
    }

    public String getRecnclMsg() {
        return recnclMsg;
    }

    public void setRecnclMsg(String recnclMsg) {
        this.recnclMsg = recnclMsg == null ? null : recnclMsg.trim();
    }

    public String getOperIn() {
        return operIn;
    }

    public void setOperIn(String operIn) {
        this.operIn = operIn == null ? null : operIn.trim();
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
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