package com.unionpay.batch.base;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.SocketException;

import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Setter
@Getter
public class BatchFileFtpTransProc {

    private String serverIp;       //服务IP

    private int serverPort = 21;     //服务Port

    private String userName;

    private String passWord;

    private String remotePath;     //远端路径

    private String fileName;       //文件名称

    private int connectTimeOut = 60;

    private String localPath;      //本地路径

    private FTPClient ftpClient = null;  //ftp连接

    public boolean ftpConnectServer(){
        if(getServerIp().isEmpty()){
            log.error("【ftp】服务器IP为空");
            return BAT_FAIL;
        }
        boolean iResult = BAT_SUCC;
        if(null == ftpClient){
            int replyCode;
            try{
                ftpClient = new FTPClient();
                ftpClient.setControlEncoding(FTP_ENCODING);
                ftpClient.connect(getServerIp(),getServerPort());
                ftpClient.login(getUserName(), getPassWord());
                replyCode = ftpClient.getReplyCode();
                ftpClient.setDataTimeout(getConnectTimeOut());
                if(!FTPReply.isPositiveCompletion(replyCode)){
                    ftpClient.disconnect();
                    log.error("【ftp】服务器拒绝连接");
                    iResult = BAT_FAIL;
                }
            }catch(SocketException e){
                iResult = BAT_FAIL;
                //e.printStackTrace();
                log.error("【ftp】登录ftp服务器"+getServerIp()+"失败，连接超时！");
            }catch(IOException e){
                iResult = BAT_FAIL;
                //e.printStackTrace();
                log.error("【ftp】登录ftp服务器" + getServerIp() + "失败，ftp服务器无法打开！");
            }
        }
        return iResult;
    }
    /*
    *关闭ftp连接
    * */
    public void ftpConnectClose(){
        try{
            if(null != ftpClient){
                ftpClient.logout();
                ftpClient.disconnect();
            }
        }catch(Exception e){
            log.warn("【ftp】关闭ftp服务器"+ getServerIp() +"连接时发生异常");
        }
    }

    public void setFileType(int fileType){
        try{
            ftpClient.setFileType(fileType);
        }catch (Exception e){
            log.warn("【ftp】设置文件传输类型发生异常", e);
        }
    }

    public boolean makeDirectory(String directory) {
        boolean iResult = BAT_SUCC;
        try {
            iResult = ftpClient.makeDirectory(directory);
            if (iResult) {
                log.debug("【ftp】创建文件夹"+ directory + " 成功！");
            } else {
                log.debug("【ftp】创建文件夹"+ directory + " 失败！");
            }
        } catch (Exception e) {
            //e.printStackTrace();
            log.warn("【ftp】创建目录发生异常",e);
        }
        return iResult;
    }

    public boolean changeWorkingDirectory(String directory) {
        boolean iResult = BAT_SUCC;
        try {
            iResult = ftpClient.changeWorkingDirectory(directory);
            if (iResult) {
                log.debug("【ftp】进入文件夹"+ directory + " 成功！");
            } else {
                log.debug("【ftp】进入文件夹"+ directory + " 失败！");
            }
        } catch (IOException e) {
            //e.printStackTrace();
            log.warn("【ftp】改变工作路径发生异常",e);
        }
        return iResult;
    }

    /*
    * 创建远程路径
    * */
    public boolean ftpCreateDirecroty(String rmFilePath) throws IOException {
        boolean iResult = BAT_SUCC;
        String remotePath = rmFilePath.substring(0, rmFilePath.lastIndexOf("/") + 1);
        // 如果远程目录不存在，则递归创建远程服务器目录
        if (!remotePath.equalsIgnoreCase("/")&& !changeWorkingDirectory(new String(remotePath))) {
            int start = 0;
            int end = 0;
            if (remotePath.startsWith("/")) {
                start = 1;
            } else {
                start = 0;
            }
            end = remotePath.indexOf("/", start);
            while (true) {
                String subDirectory = new String(rmFilePath.substring(start, end).getBytes(FTP_ENCODING),"iso-8859-1");
                if (changeWorkingDirectory(subDirectory)) {
                    if (makeDirectory(subDirectory)) {
                        changeWorkingDirectory(subDirectory);
                    } else {
                        log.debug("【ftp】创建目录["+subDirectory+"]失败");
                        iResult = false;
                        return iResult;
                    }
                }
                start = end + 1;
                end = remotePath.indexOf("/", start);
                // 检查所有目录是否创建完毕
                if (end <= start) {
                    break;
                }
            }
        }
        return iResult;
    }

    public boolean uploadFile(String remoteFile, File localFile) throws IOException {
        boolean iResult = BAT_FAIL;
        InputStream inFile = new FileInputStream(localFile);
        String rmFile = new String(remoteFile.getBytes(FTP_ENCODING),"iso-8859-1");
        if(ftpClient.storeFile(rmFile, inFile)){
            iResult = BAT_SUCC;
            log.info("【ftp】"+localFile.getAbsolutePath()+"上传文件成功！");
        }else{
            log.error("【ftp】"+localFile.getAbsolutePath()+"上传文件失败！");
        }
        inFile.close();
        return iResult;
    }

    /*
    * 下载文件
    * */
    public boolean ftpDownLoadFile() throws Exception{
        if(getLocalPath().isEmpty()){
            log.error("【ftp】本地路径为空");
            return BAT_FAIL;
        }
        if(getFileName().isEmpty()){
            log.error("【ftp】文件名为空");
            return BAT_FAIL;
        }
        String remoteFilePath;
        if(getRemotePath().length() > 0){
            remoteFilePath = (getRemotePath().substring(getRemotePath().length()-1)).equals("/")?(getRemotePath() + getFileName()):(getRemotePath() + "/" + getFileName());
        }else{
            remoteFilePath = getFileName();
        }
        log.info("【ftp】远端文件路径" + remoteFilePath);

        String localFilePath = (getLocalPath().substring(getLocalPath().length()-1)).equals("/")?(getLocalPath() + getFileName()):(getLocalPath() + "/" + getFileName());
        log.info("【ftp】本地文件路径" + localFilePath);

        boolean iResult = BAT_SUCC;
        BufferedOutputStream bufOut = null;
        try{
            bufOut = new BufferedOutputStream(new FileOutputStream(localFilePath));
            iResult = ftpClient.retrieveFile(remoteFilePath, bufOut);
        }catch (Exception e){
            log.error("【ftp】下载远端文件" + remoteFilePath +"失败", e);
        }finally {
            try{
                if( null != bufOut){
                    bufOut.close();
                }
            }catch (Exception e){
                log.warn("【ftp】关闭bufOut发生异常", e);
            }
        }
        return iResult;
    }

    public boolean ftpUpLoadFile() throws Exception{
        if(getLocalPath().isEmpty()){
            log.error("【ftp】本地路径为空");
            return BAT_FAIL;
        }
        if(getFileName().isEmpty()){
            log.error("【ftp】文件名为空");
            return BAT_FAIL;
        }
        boolean iResult = BAT_SUCC;
        String remoteFilePath;
        if(getRemotePath().length() > 0){
            remoteFilePath = (getRemotePath().substring(getRemotePath().length()-1)).equals("/")?(getRemotePath() + getFileName()):(getRemotePath() + "/" + getFileName());
        }else{
            remoteFilePath = getFileName();
        }
        log.info("【ftp】远端文件路径" + remoteFilePath);

        String localFilePath = (getLocalPath().substring(getLocalPath().length()-1)).equals("/")?(getLocalPath() + getFileName()):(getLocalPath() + "/" + getFileName());
        log.info("【ftp】本地文件路径" + localFilePath);

        String rmFileName = getFileName();
        if(remoteFilePath.contains("/")){
            //创建服务器目录
            if(!ftpCreateDirecroty(remoteFilePath)){
                return BAT_FAIL;
            }
        }
        FTPFile[] listFiles = ftpClient.listFiles(new String(remoteFilePath));
        File lcFileStream = new File(localFilePath);
        if(!uploadFile(rmFileName, lcFileStream)) {
            iResult = BAT_FAIL;
        }
        return iResult;
    }
}
