package com.unionpay.batch.base;

public class BankFileFieldMap {
    private String bussCd;
    private String bankTransSeq;
    private String settleDt;

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd;
    }

    public String getBankTransSeq() {
        return bankTransSeq;
    }

    public void setBankTransSeq(String bankTransSeq) {
        this.bankTransSeq = bankTransSeq;
    }

    public String getSettleDt() {
        return settleDt;
    }

    public void setSettleDt(String settleDt) {
        this.settleDt = settleDt;
    }

    @Override
    public String toString() {
        return "BankFileFieldMap{" +
                "bussCd='" + bussCd + '\'' +
                ", bankTransSeq='" + bankTransSeq + '\'' +
                ", settleDt='" + settleDt + '\'' +
                '}';
    }

    /* *
    * 字段映射
    * 不同银行的文件，修改这个方法
    * s 字段内容  i 字段序号，从0开始
    * */
    public void switchField(String s, int i){
        switch (i) {
            case 0:
                break;
            case 1:
                setBankTransSeq(s);
                break;
            case 2:
                setSettleDt(s);
                break;
            default:
                break;
        }
    }
}
