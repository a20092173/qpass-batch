package com.unionpay.batch.base;

public class QpCupsFileFieldMap {

    private String bussCd;
    private String transSeq;
    private String sndrInsIdCd;

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd;
    }

    public String getTransSeq() {
        return transSeq;
    }

    public void setTransSeq(String transSeq) {
        this.transSeq = transSeq;
    }

    public String getSndrInsIdCd() {
        return sndrInsIdCd;
    }

    public void setSndrInsIdCd(String sndrInsIdCd) {
        this.sndrInsIdCd = sndrInsIdCd;
    }

    @Override
    public String toString() {
        return "QpCupsFileFieldMap{" +
                "bussCd='" + bussCd + '\'' +
                ", transSeq='" + transSeq + '\'' +
                ", sndrInsIdCd='" + sndrInsIdCd + '\'' +
                '}';
    }

    public void switchField(String s, int i){
        switch (i) {
            case 0:
                break;
            case 1:
                setTransSeq(s);
                break;
            case 2:
                setSndrInsIdCd(s);
                break;
            default:
                break;
        }
    }

}
