package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatTrxtypInf{
    private String trxtypCd;

    private String bizFuncId;

    private String trxtypNm;

    private String bizFuncNm;

    private String recnclSt;

    private String settleSt;

    private String openIn;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    public String getTrxtypCd() {
        return trxtypCd;
    }

    public void setTrxtypCd(String trxtypCd) {
        this.trxtypCd = trxtypCd == null ? null : trxtypCd.trim();
    }

    public String getBizFuncId() {
        return bizFuncId;
    }

    public void setBizFuncId(String bizFuncId) {
        this.bizFuncId = bizFuncId == null ? null : bizFuncId.trim();
    }

    public String getTrxtypNm() {
        return trxtypNm;
    }

    public void setTrxtypNm(String trxtypNm) {
        this.trxtypNm = trxtypNm == null ? null : trxtypNm.trim();
    }

    public String getBizFuncNm() {
        return bizFuncNm;
    }

    public void setBizFuncNm(String bizFuncNm) {
        this.bizFuncNm = bizFuncNm == null ? null : bizFuncNm.trim();
    }

    public String getRecnclSt() {
        return recnclSt;
    }

    public void setRecnclSt(String recnclSt) {
        this.recnclSt = recnclSt == null ? null : recnclSt.trim();
    }

    public String getSettleSt() {
        return settleSt;
    }

    public void setSettleSt(String settleSt) {
        this.settleSt = settleSt == null ? null : settleSt.trim();
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