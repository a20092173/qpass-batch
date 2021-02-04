package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatSequence {
    private String sysCode;

    private String seqId;

    private Integer inCreStep;

    private String maxId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId == null ? null : seqId.trim();
    }

    public Integer getInCreStep() {
        return inCreStep;
    }

    public void setInCreStep(Integer inCreStep) {
        this.inCreStep = inCreStep;
    }

    public String getMaxId() {
        return maxId;
    }

    public void setMaxId(String maxId) {
        this.maxId = maxId == null ? null : maxId.trim();
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