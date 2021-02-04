package com.unionpay.batch.base;

public class QpCupsSumfileSummryHead {
    private String CntPyNb;
    private String CntPyAmt;
    private String AccCntPyAmt;
    private String IssCntPyAmt;
    private String CntPyerNb;
    private String CntPyerAmt;
    private String AccCntPyerAmt;
    private String IssCntPyerAmt;
    private String CntIntc;
    private String CntLogoFee;
    private String ContErrTrxFee;

    public String getAccCntPyAmt() {
        return AccCntPyAmt;
    }

    public void setAccCntPyAmt(String accCntPyAmt) {
        AccCntPyAmt = accCntPyAmt;
    }

    public String getIssCntPyAmt() {
        return IssCntPyAmt;
    }

    public void setIssCntPyAmt(String issCntPyAmt) {
        IssCntPyAmt = issCntPyAmt;
    }

    public String getCntPyerNb() {
        return CntPyerNb;
    }

    public void setCntPyerNb(String cntPyerNb) {
        CntPyerNb = cntPyerNb;
    }

    public String getCntPyerAmt() {
        return CntPyerAmt;
    }

    public void setCntPyerAmt(String cntPyerAmt) {
        CntPyerAmt = cntPyerAmt;
    }

    public String getAccCntPyerAmt() {
        return AccCntPyerAmt;
    }

    public void setAccCntPyerAmt(String accCntPyerAmt) {
        AccCntPyerAmt = accCntPyerAmt;
    }

    public String getIssCntPyerAmt() {
        return IssCntPyerAmt;
    }

    public void setIssCntPyerAmt(String issCntPyerAmt) {
        IssCntPyerAmt = issCntPyerAmt;
    }

    public String getCntIntc() {
        return CntIntc;
    }

    public void setCntIntc(String cntIntc) {
        CntIntc = cntIntc;
    }

    public String getCntLogoFee() {
        return CntLogoFee;
    }

    public void setCntLogoFee(String cntLogoFee) {
        CntLogoFee = cntLogoFee;
    }

    public String getContErrTrxFee() {
        return ContErrTrxFee;
    }

    public void setContErrTrxFee(String contErrTrxFee) {
        ContErrTrxFee = contErrTrxFee;
    }

    public String getCntPyNb() {
        return CntPyNb;
    }

    public void setCntPyNb(String cntPyNb) {
        this.CntPyNb = cntPyNb;
    }

    public String getCntPyAmt() {
        return CntPyAmt;
    }

    public void setCntPyAmt(String cntPyAmt) {
        this.CntPyAmt = cntPyAmt;
    }

    @Override
    public String toString() {
        return "QpCupsSumfileSummryHead{" +
                "CntPyNb='" + CntPyNb + '\'' +
                ", CntPyAmt='" + CntPyAmt + '\'' +
                ", AccCntPyAmt='" + AccCntPyAmt + '\'' +
                ", IssCntPyAmt='" + IssCntPyAmt + '\'' +
                ", CntPyerNb='" + CntPyerNb + '\'' +
                ", CntPyerAmt='" + CntPyerAmt + '\'' +
                ", AccCntPyerAmt='" + AccCntPyerAmt + '\'' +
                ", IssCntPyerAmt='" + IssCntPyerAmt + '\'' +
                ", CntIntc='" + CntIntc + '\'' +
                ", CntLogoFee='" + CntLogoFee + '\'' +
                ", ContErrTrxFee='" + ContErrTrxFee + '\'' +
                '}';
    }
}
