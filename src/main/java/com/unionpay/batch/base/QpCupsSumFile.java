package com.unionpay.batch.base;
import java.util.List;

public class QpCupsSumFile {
    private String SttlDate;
    private String SttlNum;
    private List<QpCupsSumfileSummryHead> SummryHead;

    public String getSttlDate() {
        return SttlDate;
    }

    public void setSttlDate(String sttlDate) {
        this.SttlDate = sttlDate;
    }

    public String getSttlNum() {
        return SttlNum;
    }

    public void setSttlNum(String sttlNum) {
        this.SttlNum = sttlNum;
    }

    public List<QpCupsSumfileSummryHead> getSummryHead() {
        return SummryHead;
    }

    public void setSummryHead(List<QpCupsSumfileSummryHead> summryHead) {
        SummryHead = summryHead;
    }

    @Override
    public String toString() {
        return "QpCupsSumFile{" +
                "sttlDate='" + SttlDate + '\'' +
                ", sttlNum='" + SttlNum + '\'' +
                ", summryHead=" + SummryHead.toString() +
                '}';
    }
}
