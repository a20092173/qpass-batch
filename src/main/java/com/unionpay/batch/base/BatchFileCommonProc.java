package com.unionpay.batch.base;

import lombok.extern.slf4j.Slf4j;
import static com.unionpay.batch.base.BatchGlobalVariable.*;
import static com.unionpay.batch.base.BatchErrorCode.*;
/*
* 解压.zip  .rar   .tar文件
* 压缩成。zip .rar  .tar文件
* */
@Slf4j
public class BatchFileCommonProc {

    private String dstPath;    //目标路径

    public String getDstPath() {
        return dstPath;
    }

    public void setDstPath(String dstPath) {
        this.dstPath = dstPath;
    }

    public boolean unzipFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty() || !fileNamePath.matches(ZIP_SUFFIX)){
            log.error(E1_BP_0001,"【zip文件解压】待解压zip文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【zip文件解压】zip文件"+fileNamePath+"解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【zip文件解压】开始文件解压处理");

        //解压。zip文件
        /*
        *
        *
        * */

        log.info("【zip文件解压】文件解压处理完成");
        return BAT_SUCC;
    }

    public boolean zipFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty()){
            log.error(E1_BP_0001,"【zip文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【zip文件压缩】zip文件"+fileNamePath+"压缩后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【zip文件压缩】开始文件压缩处理");

        //压缩成.zip文件
        /*
        *
        * */

        log.info("【zip文件压缩】文件压缩处理完成");
        return BAT_SUCC;
    }

    public boolean unrarFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty() || !fileNamePath.matches(RAR_SUFFIX)){
            log.error(E1_BP_0001,"【rar文件解压】待解压rar文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【rar文件解压】rar文件"+fileNamePath+"所在源路径或解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【rar文件解压】开始文件解压处理");

        //解压。rar文件
        /*
         *
         *
         * */

        log.info("【rar文件解压】文件解压处理完成");

        return BAT_SUCC;
    }

    public boolean rarFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty()){
            log.error(E1_BP_0001,"【rar文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【rar文件压缩】rar文件"+fileNamePath+"压缩后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【rar文件压缩】开始文件压缩处理");
        //压缩成。rar文件
        /*
        *
        *
        * */

        log.info("【rar文件压缩】文件压缩处理完成");

        return BAT_SUCC;
    }

    public boolean untarFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty() || !fileNamePath.matches(RAR_SUFFIX)){
            log.error(E1_BP_0001,"【tar文件解压】待解压tar文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【tar文件解压】tar文件"+fileNamePath+"所在源路径或解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar文件解压】开始文件解压处理");

        //解压。tar文件
        /*
         *
         *
         * */

        log.info("【tar文件解压】文件解压处理完成");

        return BAT_SUCC;
    }

    public boolean tarFileWithPath(String fileNamePath){
        if(fileNamePath.isEmpty()){
            log.error(E1_BP_0001,"【tar文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if(getDstPath().isEmpty()) {
            log.error(E1_BP_0002,"【tar文件压缩】zip文件"+fileNamePath+"压缩后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar文件压缩】开始文件压缩处理");

        //压缩成。tar文件
        /*
         *
         * */

        log.info("【tar文件压缩】文件压缩处理完成");
        return BAT_SUCC;
    }
}
