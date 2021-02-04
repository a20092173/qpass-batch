package com.unionpay.batch.base;

public interface BatchGlobalVariable {
    public static final boolean BAT_SUCC = true; //返回成功

    public static final boolean BAT_FAIL = false; //返回失败
    public static final String BAT_FAILURE = "failed"; //返回失败

    public static final String ZIP_SUFFIX = ".zip";  //.zip

    public static final String RAR_SUFFIX = ".rar";  //.rar

    public static final String SFTP_MARK = "sftp";

    public static final String FTP_ENCODING = "GBK";
}
