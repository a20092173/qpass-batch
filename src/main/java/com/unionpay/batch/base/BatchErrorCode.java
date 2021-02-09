package com.unionpay.batch.base;

public interface BatchErrorCode {
    public static String E1_BP_0001 = "E1PARM0001";    //参数不合法
    public static String E1_BP_0002 = "E1PARM0002";    //参数路径错误
    public static String E1_BP_0003 = "E1COMP0003";    //压缩文件失败错误
    public static String E1_BP_0004 = "E1UCOM0004";    //解压文件失败错误
}
