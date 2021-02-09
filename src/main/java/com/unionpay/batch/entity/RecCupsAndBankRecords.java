package com.unionpay.batch.entity;

import java.util.Date;

public class RecCupsAndBankRecords{

    private String cupsTblNm;

    private String bankTblNm;

    private String retTblNm;
    
    private String bussCd;

    private String settleDt;

    private String settleNum;

    public String getCupsTblNm() {
        return cupsTblNm;
    }

    public void setCupsTblNm(String cupsTblNm) {
        this.cupsTblNm = cupsTblNm == null ? null : cupsTblNm.trim();
    }

    public String getBankTblNm() {
        return bankTblNm;
    }

    public void setBankTblNm(String bankTblNm) {
        this.bankTblNm = bankTblNm == null ? null : bankTblNm.trim();
    }

    public String getRetTblNm() {
        return retTblNm;
    }

    public void setRetTblNm(String retTblNm) {
        this.retTblNm = retTblNm == null ? null : retTblNm.trim();
    }

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

    public String getSettleNum() {
        return settleNum;
    }

    public void setSettleNum(String settleNum) {
        this.settleNum = settleNum == null ? null : settleNum.trim();
    }

    @Override
    public String toString() {
        return "RecCupsAndBankRecords{" +
                "cupsTblNm='" + cupsTblNm + '\'' +
                ", bankTblNm='" + bankTblNm + '\'' +
                ", retTblNm='" + retTblNm + '\'' +
                ", bussCd='" + bussCd + '\'' +
                ", settleDt='" + settleDt + '\'' +
                ", settleNum='" + settleNum + '\'' +
                '}';
    }

}