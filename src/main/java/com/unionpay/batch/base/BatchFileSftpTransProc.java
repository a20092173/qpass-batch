package com.unionpay.batch.base;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import com.jcraft.jsch.*;

import static com.unionpay.batch.base.BatchErrorCode.*;
import static com.unionpay.batch.base.BatchGlobalVariable.*;

@Slf4j
@Setter
@Getter
public class BatchFileSftpTransProc {

    private String serverIp;       //服务IP

    private int serverPort;     //服务Port

    private String userName;

    private String passWord;

    private String remotePath;     //远端路径

    private String fileName;       //文件名称

    private String localPath;      //本地路径

    private int sessionTimeOut;    //会话超时时间

    private int channelTimeOut;    //渠道超时时间

    public boolean sftpDownLoadFile(){
        if(getServerIp().isEmpty()|| 0 == getServerPort()){
                log.error("【sftp】服务器IP/PORT为空");
                return BAT_FAIL;
        }
        if(getUserName().isEmpty()||getPassWord().isEmpty()){
            log.error("【sftp】用户名/密码路径为空");
            return BAT_FAIL;
        }
        if(getRemotePath().isEmpty()||getLocalPath().isEmpty()){
                log.error("【sftp】本地/远端路径为空");
                return BAT_FAIL;
        }
        if(getFileName().isEmpty()){
                log.error("【sftp】文件名为空");
                return BAT_FAIL;
        }
        boolean iResult = BAT_SUCC;
        String remoteFilePath = (getRemotePath().substring(getRemotePath().length()-1)).equals("/")?(getRemotePath() + getFileName()):(getRemotePath() + "/" + getFileName());
        log.info("【sftp】远端文件路径" + remoteFilePath);
        String localFilePath = (getLocalPath().substring(getLocalPath().length()-1)).equals("/")?(getLocalPath() + getFileName()):(getLocalPath() + "/" + getFileName());
        log.info("【sftp】本地文件路径" + remoteFilePath);

        Session jschSession = null;
        try{
            JSch jsch = new JSch();
            //jsch.setKnownHosts("/home/zimug/.ssh/known_hosts");
            jschSession = jsch.getSession(getUserName(), getServerIp(), getServerPort());
            //通过SSH私钥方式登入
            //jsch.addIdentity("/home/zimug/.ssh/id_rsa");
            //通过密码方式登入
            jschSession.setPassword(getPassWord());
            jschSession.connect(getSessionTimeOut());
            //建立sftp文件传输管道
            Channel sftp = jschSession.openChannel(SFTP_MARK);
            sftp.connect(getChannelTimeOut());
            ChannelSftp channelSftp = (ChannelSftp) sftp;
            channelSftp.get(remoteFilePath, localFilePath);
            channelSftp.exit();
        }catch(JSchException | SftpException e){
            e.printStackTrace();
            log.error("【sftp】文件下载发生异常");
            iResult = BAT_FAIL;
        }finally {
            if(null != jschSession){
                jschSession.disconnect();
            }
        }
        log.info("【sftp】文件"+getFileName()+"下载成功");
        return iResult;
    }

    public boolean sftpUpLoadFile(){
        if(getServerIp().isEmpty()|| 0 == getServerPort()){
            log.error("【sftp】服务器IP/PORT为空");
            return BAT_FAIL;
        }
        if(getUserName().isEmpty()||getPassWord().isEmpty()){
            log.error("【sftp】用户名/密码路径为空");
            return BAT_FAIL;
        }
        if(getRemotePath().isEmpty()||getLocalPath().isEmpty()){
            log.error("【sftp】本地/远端路径为空");
            return BAT_FAIL;
        }
        if(getFileName().isEmpty()){
            log.error("【sftp】文件名为空");
            return BAT_FAIL;
        }
        boolean iResult = BAT_SUCC;
        String remoteFilePath;
        if(getRemotePath().length() > 0){
            remoteFilePath = (getRemotePath().substring(getRemotePath().length()-1)).equals("/")?(getRemotePath() + getFileName()):(getRemotePath() + "/" + getFileName());
        }else{
            remoteFilePath = getFileName();
        }
        log.info("【sftp】远端文件路径" + remoteFilePath);

        String localFilePath = (getLocalPath().substring(getLocalPath().length()-1)).equals("/")?(getLocalPath() + getFileName()):(getLocalPath() + "/" + getFileName());
        log.info("【sftp】本地文件路径" + localFilePath);

        Session jschSession = null;
        try{
            JSch jsch = new JSch();
            //jsch.setKnownHosts("/home/zimug/.ssh/known_hosts");
            jschSession = jsch.getSession(getUserName(), getServerIp(), getServerPort());
            //通过SSH私钥方式登入
            //jsch.addIdentity("/home/zimug/.ssh/id_rsa");
            //通过密码方式登入
            jschSession.setPassword(getPassWord());
            jschSession.connect(getSessionTimeOut());
            //建立sftp文件传输管道
            Channel sftp = jschSession.openChannel(SFTP_MARK);
            sftp.connect(getChannelTimeOut());
            ChannelSftp channelSftp = (ChannelSftp) sftp;
            channelSftp.put(localFilePath,remoteFilePath);
            channelSftp.exit();
        }catch(JSchException | SftpException e){
            e.printStackTrace();
            log.error("【sftp】文件下载发生异常");
            iResult = BAT_FAIL;
        }finally {
            if(null != jschSession){
                jschSession.disconnect();
            }
        }
        log.info("【sftp】文件"+getFileName()+"上传成功");

        return iResult;
    }
}
