package com.unionpay.batch.base;

import lombok.extern.slf4j.Slf4j;

import static com.unionpay.batch.base.BatchErrorCode.*;
import static com.unionpay.batch.base.BatchGlobalVariable.*;

import java.io.*;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Process;
import java.lang.Runtime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;


/*
 * 解压.zip  .rar   .tar文件
 * 压缩成。zip .rar  .tar文件
 * */
@Slf4j
public class BatchFileCommonProc {

    private String dstPath;    //目标路径
    private String winRarPath = "D:\\soft\\WinRar\\Rar.exe";//rar命令路径

    public String getDstPath() {
        return dstPath;
    }

    public void setDstPath(String dstPath) {
        this.dstPath = dstPath;
    }

    public String getwinRarPath(){
        return this.winRarPath;
    }

    public void setWinRarPath(String winRarPath){
        this.winRarPath = winRarPath;
    }

    public boolean unzipFileWithPath(String fileNamePath) throws Exception{
        if (fileNamePath.isEmpty() || !fileNamePath.endsWith(ZIP_SUFFIX)) {
            log.error(E1_BP_0001, "【zip文件解压】待解压zip文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【zip文件解压】zip文件" + fileNamePath + "解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【zip文件解压】开始文件解压处理");

        //解压。zip文件
        ZipArchiveInputStream zArchiveIn = null;
        FileOutputStream os = null;
        ArchiveEntry entry = null;
        try {
            zArchiveIn = new ZipArchiveInputStream(new FileInputStream(fileNamePath), "GBK");
            while ((entry = zArchiveIn.getNextEntry()) != null) {
                File dstFile = new File(dstPath + File.separator + entry.getName());

                log.info("解压：" + entry.getName() + "\n解压至：" + dstFile);
                //是个目录，则创建目录,包含空目录
                if(entry.isDirectory()){//识别不了空目录
                    if (!dstFile.getParentFile().exists()) {//父目录不存在
                        dstFile.getParentFile().mkdirs();
                    }
                    dstFile.mkdir();
                } else {
                    dstFile.getParentFile().mkdirs();
                    os = new FileOutputStream(dstFile);

                    int len;
                    byte[] buf = new byte[2048];
                    while ((len = zArchiveIn.read(buf)) != -1) {
                        os.write(buf, 0, len);
                    }
                    os.close();
                }
                log.info(entry.getName() + " 解压成功！");
            }
        } catch (Exception e) {
            log.error(E1_BP_0004, "【zip文件解压】" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        }finally {
            if(os != null){
                os.close();
            }
            if(zArchiveIn != null){
                zArchiveIn.close();
            }
        }

        log.info("【zip文件解压】文件解压处理完成");
        return BAT_SUCC;
    }

    private boolean ZipCompress(ZipArchiveOutputStream zOut, File unZipFile, String name) throws IOException {
        if (name == null) {
            name = unZipFile.getName();
        }
        FileInputStream in = null;
        if (unZipFile.isDirectory()) {
            File[] flist = unZipFile.listFiles();

            if (flist.length == 0) {//空文件夹,在目的zip文件中写入一个目录
                log.info("压缩空文件：" + name + File.separator);
                zOut.putArchiveEntry(new ZipArchiveEntry(name + File.separator));
                zOut.closeArchiveEntry();
            } else {
                for (int i = 0; i < flist.length; i++) {
                    if(ZipCompress(zOut, flist[i], name + File.separator + flist[i].getName()) != BAT_SUCC){
                        log.error(E1_BP_0003,"【zip文件压缩】fList[:" + i + "]" + flist[i] +"失败!");
                        return BAT_FAIL;
                    }
                }
            }
        } else {//是文件
            try {
                log.info("【zip文件压缩】：" + unZipFile);
                zOut.putArchiveEntry(new ZipArchiveEntry(name));

                int len = 0;
                byte[] buf = new byte[2048];
                while ((len = in.read(buf)) != -1) {
                    zOut.write(buf, 0, len);
                }
            }catch (Exception e){
                log.error(E1_BP_0003,"【zip文件压缩】：" + unZipFile + "失败！");
                log.error(e.getMessage());
                return BAT_FAIL;
            }finally{
                if(zOut != null) {
                    zOut.closeArchiveEntry();
                }
                if(in != null) {
                    in.close();
                }
            }
        }
        return BAT_SUCC;
    }

    public boolean zipFileWithPath(String fileNamePath) throws IOException {
        if (fileNamePath.isEmpty()) {
            log.error(E1_BP_0001, "【zip文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【zip文件压缩】zip文件" + fileNamePath + "压缩后目标路径为空，请设置路径!");
            return BAT_FAIL;
        }

        log.info("【zip文件压缩】开始文件压缩处理");
        //压缩成.zip文件
        File srcFile = new File(fileNamePath);
        //ZipOutputStream zOut = null;
        ZipArchiveOutputStream zOut = null;
        //压缩路径为目录，不含压缩后的文件名，如XXX.zip
        if (!dstPath.endsWith(ZIP_SUFFIX)) {
            setDstPath(dstPath + File.separator + srcFile.getName() + ZIP_SUFFIX);
            log.info("【zip文件压缩】压缩后的目标文件为：" + dstPath);
        }
        try {
            zOut = new ZipArchiveOutputStream(new FileOutputStream(dstPath));
            if(ZipCompress(zOut, srcFile, null) != BAT_SUCC){
                log.error(E1_BP_0003, "【zip文件压缩】zip文件" + fileNamePath + "失败");
                return BAT_FAIL;
            }
        } catch (Exception e) {
            log.error(E1_BP_0003, "【zip文件压缩】zip文件" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        } finally {
            if (zOut != null) {
                zOut.close();
            }
        }
        log.info(fileNamePath + " 压缩成功！");
        log.info("【zip文件压缩】文件压缩处理完成");
        return BAT_SUCC;
    }
    private boolean existChinese(String str){
        String regEx = "[\\u4e00-\\u9fa5]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        while(m.find()){
            return true;
        }
        return false;
    }

    public boolean unrarFileWithPath(String fileNamePath) throws Exception {
        if (fileNamePath.isEmpty() || !fileNamePath.endsWith(RAR_SUFFIX)) {
            log.error(E1_BP_0001, "【rar文件解压】待解压rar文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【rar文件解压】rar文件" + fileNamePath + "所在源路径或解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【rar文件解压】开始文件解压处理");
        System.out.println("【rar文件解压】开始文件解压处理");

        //解压。rar文件
        File dstFile = new File(dstPath);
        if (!dstFile.exists()) {
            dstFile.mkdirs();
        }

        String cmd = winRarPath + " x -r -o+ " + fileNamePath + " " + dstPath;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(cmd);
        BufferedReader buffRead = null;
        System.out.println("【rar文件解压】文件解压处理");

        try {
            if (process.waitFor() != 0) {
                log.info("rar文件解压失败,exit value: " + process.exitValue());
                return BAT_FAIL;
            }

            /*打印*/
            buffRead = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.forName("GBK")));
            String str = null;

            while ((str = buffRead.readLine()) != null) {
                if (!"".equals(str.trim()) && str != null) {
                    log.info("rar文件解压:" + str);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            if (buffRead != null) {
                buffRead.close();
            }
            if (process != null) {
                process.destroy();
            }
        }

        log.info("【rar文件解压】文件解压处理完成");

        return BAT_SUCC;
    }

    public boolean rarFileWithPath(String fileNamePath) throws Exception {
        if (fileNamePath.isEmpty()) {
            log.error(E1_BP_0001, "【rar文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【rar文件压缩】rar文件" + fileNamePath + "压缩后目标路径为空，请设置路径!");
            return BAT_FAIL;
        }

        log.info("【rar文件压缩】开始文件压缩处理");
        //压缩成。rar文件
        if (!dstPath.endsWith(RAR_SUFFIX)) {
            setDstPath(dstPath + fileNamePath.substring(fileNamePath.lastIndexOf(File.separator)) + RAR_SUFFIX);
            log.info("压缩后的目标文件为：" + dstPath);
            System.out.println("压缩后的目标文件为：" + dstPath);
        }
        File dstFile = new File(dstPath);
        System.out.println(dstFile.getParentFile());
        if (!dstFile.getParentFile().exists()) {
            dstFile.getParentFile().mkdirs();
        }

        String cmd = winRarPath + " a -r -o+ -ep1 " + dstPath + " " + fileNamePath;
        log.info("rar 文件压缩命令cmd: " + cmd);
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(cmd);
        BufferedReader buffRead = null;

        try {
            if (process.waitFor() != 0) {
                log.error(E1_BP_0004,"文件解压失败,exit value: " + process.exitValue());
                return BAT_FAIL;
            }
            /*打印*/
            buffRead = new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.forName("GBK")));
            String str = null;

            while ((str = buffRead.readLine()) != null) {
                if (!"".equals(str.trim()) && str != null) {
                    log.info("rar 文件解压:" + str);
                }
            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            if (buffRead != null) {
                buffRead.close();
            }
            if (process != null) {
                process.destroy();
            }
        }
        log.info("【rar文件压缩】文件压缩处理完成");

        return BAT_SUCC;
    }

    public boolean untarFileWithPath(String fileNamePath) throws Exception {
        if (fileNamePath.isEmpty() || !fileNamePath.endsWith(TAR_SUFFIX)) {
            log.error(E1_BP_0001, "【tar文件解压】待解压tar文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【tar文件解压】tar文件" + fileNamePath + "所在源路径或解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar文件解压】开始文件解压处理");

        //解压。tar文件
        File srcFile = new File(fileNamePath);
        TarArchiveInputStream tIn = null;
        FileOutputStream os = null;
        try {
            tIn = new TarArchiveInputStream(new FileInputStream(srcFile), "GBK");
            TarArchiveEntry tarEntry = null;
            while ((tarEntry = tIn.getNextTarEntry()) != null) {
                File dstFile = new File(dstPath + File.separator + tarEntry.getName());

                log.info("【tar文件解压】解压：" + tarEntry.getName() + "\n解压至：" + dstFile);
                //是个目录，则创建目录,包含空目录
                if (tarEntry.isDirectory()) {
                    if (!dstFile.getParentFile().exists()) {//父目录不存在
                        dstFile.getParentFile().mkdirs();
                    }
                    dstFile.mkdir();
                } else {
                    dstFile.getParentFile().mkdirs();

                    os = new FileOutputStream(dstFile);

                    int len = 0;
                    byte[] buf = new byte[2048];
                    while ((len = tIn.read(buf)) != -1) {
                        os.write(buf, 0, len);
                    }
                    os.close();
                }
                log.info("【tar文件解压】"+tarEntry.getName() + " 解压成功！");
            }
            tIn.close();
        } catch (Exception e) {
            log.error(E1_BP_0004, "【tar文件解压】tar文件" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        }finally{
            if(tIn != null){
                tIn.close();
            }
            if(os != null){
                os.close();
            }
        }

        log.info("【tar文件解压】文件解压处理完成");

        return BAT_SUCC;
    }

    private boolean TarCompress(TarArchiveOutputStream zOut, File unTarFile, String name) throws IOException {
        if (name == null) {
            name = unTarFile.getName();
        }
        TarArchiveEntry entry = null;
        FileInputStream in = null;
        if (unTarFile.isDirectory()) {
            File[] flist = unTarFile.listFiles();

            if (flist.length == 0) {//空文件夹,在目的zip文件中写入一个目录
                log.info("【tar文件压缩】压缩空文件：" + name + File.separator);
                zOut.putArchiveEntry(new TarArchiveEntry(name + File.separator));
            } else {
                for (int i = 0; i < flist.length; i++) {
                    if(TarCompress(zOut, flist[i], name + File.separator + flist[i].getName()) != BAT_SUCC){
                        log.error(E1_BP_0003,"【tar文件压缩】flist[" + i + "] = " + flist[i] + "为tar包失败！");
                        return BAT_FAIL;
                    }
                }
            }
        } else {//是文件

            log.info("【tar文件压缩】：" + unTarFile);

            entry = new TarArchiveEntry(name);
            entry.setSize(unTarFile.length());
            zOut.putArchiveEntry(entry);
            in = new FileInputStream(unTarFile);

            int len = 0;
            byte[] buf = new byte[2048];
            while ((len = in.read(buf)) != -1) {
                zOut.write(buf, 0, len);
            }
            in.close();
            zOut.closeArchiveEntry();
        }
        return BAT_SUCC;
    }


    public boolean tarFileWithPath(String fileNamePath) throws  Exception{
        if (fileNamePath.isEmpty()) {
            log.error(E1_BP_0001, "【tar文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【tar文件压缩】tar文件" + fileNamePath + "压缩后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar文件压缩】开始文件压缩处理");

        //压缩成。tar文件
        File srcFile = new File(fileNamePath);
        TarArchiveOutputStream tarOut = null;
        //压缩路径为目录，不含压缩后的文件名，如XXX.tar
        if (!dstPath.endsWith(TAR_SUFFIX)) {
            setDstPath(dstPath + File.separator + srcFile.getName() + TAR_SUFFIX);
            log.info("【tar文件压缩】压缩后的目标文件为：" + dstPath);
        }
        try {
            tarOut = new TarArchiveOutputStream(new FileOutputStream(dstPath), "GBK");

            if(TarCompress(tarOut, srcFile, null) != BAT_SUCC){

            }
        } catch (Exception e) {
            log.error(E1_BP_0003, "【tar文件压缩】" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        } finally {
            if(tarOut != null) {
                tarOut.close();
            }
        }

        log.info("【tar文件压缩】文件压缩处理完成");
        return BAT_SUCC;
    }

    public boolean untarGzFileWithPath(String fileNamePath) throws Exception {
        if (fileNamePath.isEmpty() || !fileNamePath.endsWith(GZ_SUFFIX)) {
            log.error(E1_BP_0001, "【tar.gz文件解压】待解压tar.gz文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【tar.gz文件解压】tar.gz文件" + fileNamePath + "解压后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar.gz文件解压】开始文件解压处理");

        //开始解压tar.gz
        //先解压为.tar文件 *.tar.gz--->*.tar
        //destTarFilePath为中间文件tar包的路径
        String destTarFilePath = fileNamePath.substring(0, fileNamePath.lastIndexOf(GZ_SUFFIX));
        GzipCompressorInputStream gzIn = null;
        FileOutputStream out = null;
        try {
            gzIn = new GzipCompressorInputStream(new FileInputStream(fileNamePath));
            out = new FileOutputStream(destTarFilePath);

            byte[] buf = new byte[2048];
            int len = 0;
            while ((len = gzIn.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
        } catch (Exception e) {
            log.error(E1_BP_0004, "【tar.gz文件解压】" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        } finally {
            if(out != null) {
                out.close();
            }
            if(gzIn != null) {
                gzIn.close();
            }
        }
        //将tar包解压
        if (untarFileWithPath(destTarFilePath) == BAT_FAIL) {
            log.error(E1_BP_0004,fileNamePath + "【tar.gz文件解压】失败！");
            return BAT_FAIL;
        }
        File dstTarFilePath = new File(destTarFilePath);
        if (dstTarFilePath.exists()) {
            dstTarFilePath.delete();//删除中间tar包
        }
        log.info("【tar.gz文件解压】文件解压处理完成");
        return BAT_SUCC;

    }

    public boolean tarGzFileWithPath(String fileNamePath) throws Exception {
        if (fileNamePath.isEmpty()) {
            log.error(E1_BP_0001, "【tar.gz文件压缩】待压缩文件不合法，请检查");
            return BAT_FAIL;
        }
        if (getDstPath().isEmpty()) {
            log.error(E1_BP_0002, "【tar.gz文件压缩】tar.gz文件" + fileNamePath + "压缩后目标路径为空，请设置路径");
            return BAT_FAIL;
        }

        log.info("【tar.gz文件压缩】开始文件压缩处理");
        //开始压缩tar.gz
        //先压缩为.tar文件
        if (tarFileWithPath(fileNamePath) == BAT_FAIL) {
            log.error(E1_BP_0004,"【tar.gz文件压缩】"+fileNamePath + "失败！");
            return BAT_FAIL;
        }
        //dstPath为压缩tar包后tar文件的路径
        File srcFile = new File(dstPath);
        GzipCompressorOutputStream gzOut = null;
        FileInputStream in = null;
        //压缩路径为目录，不含压缩后的文件名，如XXX.tar.gz
        if (!dstPath.endsWith(GZ_SUFFIX)) {
            setDstPath(dstPath + GZ_SUFFIX);
            log.info("【tar.gz文件压缩】压缩后的目标文件为：" + dstPath);
        }
        try {
            gzOut = new GzipCompressorOutputStream(new FileOutputStream(dstPath));
            in = new FileInputStream(srcFile);

            byte[] buf = new byte[2048];
            int len = 0;
            while ((len = in.read(buf)) != -1) {
                gzOut.write(buf, 0, len);
            }
        } catch (Exception e) {
            log.error(E1_BP_0003, "【tar.gz文件压缩】" + fileNamePath + "失败");
            log.error(e.getMessage());
            return BAT_FAIL;
        } finally {
            if(in != null) {
                in.close();
            }
            if(gzOut != null) {
                gzOut.close();
            }
            if (srcFile.exists()) {
                srcFile.delete();//删除中间的tar包
            }
        }

        log.info("【tar.gz文件压缩】文件" + fileNamePath + "压缩处理完成");
        return BAT_SUCC;
    }

}

