package com.unionpay.batch.entity;

import java.util.Date;

public class TblQpbatUpComtrx{
    
    private String bussCd;

    private String sndrInsIdCd;

    private String settleDt;

    private String transSeq;

    private String transTp;

    private String bizFuncCd;

    private String transAt;

    private String transDt;

    private String transTm;

    private String bankTransSeq;

    private String orgTransSeq;

    private String orgTransAt;

    private String sgnNo;

    private String pyerAcctInsCd;

    private String pyerAcctTp;

    private String pyerAcctNo;

    private String pyeeAcctInsCd;

    private String pyeeAcctTp;

    private String pyeeAcctNo;

    private String prvBankIdCd;

    private String prvBankAcctNo;

    private String settleNum;

    private String issAcq;

    private String btpNo;

    private String rsvFld;

    private String recnclSt;

    private String recnclDesc;

    private String operIn;

    private String recUpdUsrId;

    private Date recUpdTs;

    private Date recCrtTs;

    //自定义区
    private String headEndFlag;
    //0:无头尾 1：有头无尾 2：无头有尾  3：有头有尾
    private int headLine;
    private int endLine;
    //自定义区 over

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd == null ? null : bussCd.trim();
    }

    public String getSndrInsIdCd() {
        return sndrInsIdCd;
    }

    public void setSndrInsIdCd(String sndrInsIdCd) {
        this.sndrInsIdCd = sndrInsIdCd == null ? null : sndrInsIdCd.trim();
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

    public String getBizFuncCd() {
        return bizFuncCd;
    }

    public void setBizFuncCd(String bizFuncCd) {
        this.bizFuncCd = bizFuncCd == null ? null : bizFuncCd.trim();
    }

    public String getTransAt() {
        return transAt;
    }

    public void setTransAt(String transAt) {
        this.transAt = transAt == null ? null : transAt.trim();
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

    public String getBankTransSeq() {
        return bankTransSeq;
    }

    public void setBankTransSeq(String bankTransSeq) {
        this.bankTransSeq = bankTransSeq == null ? null : bankTransSeq.trim();
    }

    public String getOrgTransSeq() {
        return orgTransSeq;
    }

    public void setOrgTransSeq(String orgTransSeq) {
        this.orgTransSeq = orgTransSeq == null ? null : orgTransSeq.trim();
    }

    public String getOrgTransAt() {
        return orgTransAt;
    }

    public void setOrgTransAt(String orgTransAt) {
        this.orgTransAt = orgTransAt == null ? null : orgTransAt.trim();
    }

    public String getSgnNo() {
        return sgnNo;
    }

    public void setSgnNo(String sgnNo) {
        this.sgnNo = sgnNo == null ? null : sgnNo.trim();
    }

    public String getPyerAcctInsCd() {
        return pyerAcctInsCd;
    }

    public void setPyerAcctInsCd(String pyerAcctInsCd) {
        this.pyerAcctInsCd = pyerAcctInsCd == null ? null : pyerAcctInsCd.trim();
    }

    public String getPyerAcctTp() {
        return pyerAcctTp;
    }

    public void setPyerAcctTp(String pyerAcctTp) {
        this.pyerAcctTp = pyerAcctTp == null ? null : pyerAcctTp.trim();
    }

    public String getPyerAcctNo() {
        return pyerAcctNo;
    }

    public void setPyerAcctNo(String pyerAcctNo) {
        this.pyerAcctNo = pyerAcctNo == null ? null : pyerAcctNo.trim();
    }

    public String getPyeeAcctInsCd() {
        return pyeeAcctInsCd;
    }

    public void setPyeeAcctInsCd(String pyeeAcctInsCd) {
        this.pyeeAcctInsCd = pyeeAcctInsCd == null ? null : pyeeAcctInsCd.trim();
    }

    public String getPyeeAcctTp() {
        return pyeeAcctTp;
    }

    public void setPyeeAcctTp(String pyeeAcctTp) {
        this.pyeeAcctTp = pyeeAcctTp == null ? null : pyeeAcctTp.trim();
    }

    public String getPyeeAcctNo() {
        return pyeeAcctNo;
    }

    public void setPyeeAcctNo(String pyeeAcctNo) {
        this.pyeeAcctNo = pyeeAcctNo == null ? null : pyeeAcctNo.trim();
    }

    public String getPrvBankIdCd() {
        return prvBankIdCd;
    }

    public void setPrvBankIdCd(String prvBankIdCd) {
        this.prvBankIdCd = prvBankIdCd == null ? null : prvBankIdCd.trim();
    }

    public String getPrvBankAcctNo() {
        return prvBankAcctNo;
    }

    public void setPrvBankAcctNo(String prvBankAcctNo) {
        this.prvBankAcctNo = prvBankAcctNo == null ? null : prvBankAcctNo.trim();
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

    public String getBtpNo() {
        return btpNo;
    }

    public void setBtpNo(String btpNo) {
        this.btpNo = btpNo == null ? null : btpNo.trim();
    }

    public String getRsvFld() {
        return rsvFld;
    }

    public void setRsvFld(String rsvFld) {
        this.rsvFld = rsvFld == null ? null : rsvFld.trim();
    }

    public String getRecnclSt() {
        return recnclSt;
    }

    public void setRecnclSt(String recnclSt) {
        this.recnclSt = recnclSt == null ? null : recnclSt.trim();
    }

    public String getRecnclDesc() {
        return recnclDesc;
    }

    public void setRecnclDesc(String recnclDesc) {
        this.recnclDesc = recnclDesc == null ? null : recnclDesc.trim();
    }

    public String getOperIn() {
        return operIn;
    }

    public void setOperIn(String operIn) {
        this.operIn = operIn == null ? null : operIn.trim();
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

    //自定义区
    public String getHeadEndFlag() {
        return headEndFlag;
    }
    public void setHeadEndFlag(String headEndFlag) {
        this.headEndFlag = headEndFlag;
    }
    public int getHeadLine() {
        return headLine;
    }
    public void setHeadLine(int headLine) {
        this.headLine = headLine;
    }
    public int getEndLine() {
        return endLine;
    }
    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }
    //自定义区 over

    @Override
    public String toString() {
        return "QpCupsFileFieldMap{" +
                "bussCd='" + bussCd + '\'' +
                ", transSeq='" + transSeq + '\'' +
                ", sndrInsIdCd='" + sndrInsIdCd + '\'' +
                ", settleDt='" + settleDt + '\'' +
                ", transTp='" + transTp + '\'' +
                ", bizFuncCd='" + bizFuncCd + '\'' +
                ", transAt='" + transAt + '\'' +
                ", transDt='" + transDt + '\'' +
                ", transTm='" + transTm + '\'' +
                ", bankTransSeq='" + bankTransSeq + '\'' +
                ", orgTransSeq='" + orgTransSeq + '\'' +
                ", orgTransAt='" + orgTransAt + '\'' +
                ", sgnNo='" + sgnNo + '\'' +
                ", pyerAcctInsCd='" + pyerAcctInsCd + '\'' +
                ", pyerAcctTp='" + pyerAcctTp + '\'' +
                ", pyerAcctNo='" + pyerAcctNo + '\'' +
                ", pyeeAcctInsCd='" + pyeeAcctInsCd + '\'' +
                ", pyeeAcctTp='" + pyeeAcctTp + '\'' +
                ", pyeeAcctNo='" + pyeeAcctNo + '\'' +
                ", prvBankIdCd='" + prvBankIdCd + '\'' +
                ", prvBankAcctNo='" + prvBankAcctNo + '\'' +
                ", settleNum='" + settleNum + '\'' +
                ", issAcq='" + issAcq + '\'' +
                ", btpNo='" + btpNo + '\'' +
                ", rsvFld='" + rsvFld + '\'' +
                ", recnclSt='" + recnclSt + '\'' +
                ", recnclDesc='" + recnclDesc + '\'' +
                ", operIn='" + operIn + '\'' +
                ", recUpdUsrId='" + recUpdUsrId + '\'' +
                ", recUpdTs='" + recUpdTs + '\'' +
                ", recCrtTs='" + recCrtTs + '\'' +
                '}';
    }

    public void switchField(String s, int i){
        switch (i) {
            case 0:
                break;
            case 1:
                setTransTp(s);
                break;
            case 2:
                setTransSeq(s);
                break;
            case 3:
                setTransAt(s);
                break;
            case 5:
                setSettleDt(s);
                break;
            case 6:
                setOrgTransSeq(s);
                break;
            case 7:
                setOrgTransAt(s);
                break;
            case 9:
                setSndrInsIdCd(s);
                break;
            case 10:
                setPyerAcctInsCd(s);
                break;
            case 11:
                setPyerAcctTp(s);
                break;
            case 12:
                setPyerAcctNo(s);
                break;
            case 15:
                setPyeeAcctInsCd(s);
                break;
            case 16:
                setPyeeAcctTp(s);
                break;
            case 17:
                setPyeeAcctNo(s);
                break;
            case 34:
                setSettleNum(s);
                break;
            case 36:
                if(s.length() == 16) {
                    setTransDt(s.substring(0, 8));
                    setTransTm(s.substring(8));
                }
                break;
            default:
                break;
        }
    }
}