package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatBatTaskSt{
    private String bussCd;

    private String settleDt;

    private String taskId;

    private String taskSeq;

    private String transCode;

    private String taskNm;

    private String settleNum;

    private String issAcq;

    private String taskDt;

    private String taskTm;

    private String procSt;

    private String redoSt;

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

    public String getSettleDt() {
        return settleDt;
    }

    public void setSettleDt(String settleDt) {
        this.settleDt = settleDt == null ? null : settleDt.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskSeq() {
        return taskSeq;
    }

    public void setTaskSeq(String taskSeq) {
        this.taskSeq = taskSeq == null ? null : taskSeq.trim();
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getTaskNm() {
        return taskNm;
    }

    public void setTaskNm(String taskNm) {
        this.taskNm = taskNm == null ? null : taskNm.trim();
    }

    public String getSettleNum() {
        return settleNum;
    }

    public void setSettleNum(String settleNum) {
        this.settleNum = settleNum == null ? null : settleNum.trim();
    }

    public String getIssAcq() {
        return issAcq;
    }

    public void setIssAcq(String issAcq) {
        this.issAcq = issAcq == null ? null : issAcq.trim();
    }

    public String getTaskDt() {
        return taskDt;
    }

    public void setTaskDt(String taskDt) {
        this.taskDt = taskDt == null ? null : taskDt.trim();
    }

    public String getTaskTm() {
        return taskTm;
    }

    public void setTaskTm(String taskTm) {
        this.taskTm = taskTm == null ? null : taskTm.trim();
    }

    public String getProcSt() {
        return procSt;
    }

    public void setProcSt(String procSt) {
        this.procSt = procSt == null ? null : procSt.trim();
    }

    public String getRedoSt() {
        return redoSt;
    }

    public void setRedoSt(String redoSt) {
        this.redoSt = redoSt == null ? null : redoSt.trim();
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