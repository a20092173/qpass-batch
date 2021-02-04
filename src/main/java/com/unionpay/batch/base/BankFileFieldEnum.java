package com.unionpay.batch.base;

public enum BankFileFieldEnum {

    BAT_BANK_TRANS_SEQ("bank_trans_seq", "field1"),
    BAT_SETTLE_DT("settle_dt", "field2");

    private String method;
    private String name;

    BankFileFieldEnum(String method, String name) {
        this.method = method;
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static BankFileFieldEnum conver2Method(String method) {
        for (BankFileFieldEnum methodEnum : BankFileFieldEnum.values()) {
            if (methodEnum.method.equals(method)) {
                return methodEnum;
            }
        }
        return null;
    }

}
