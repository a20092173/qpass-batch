package com.unionpay.batch.base;

import com.unionpay.batch.service.FileDeal;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class QpCupsN01File extends QpCupsFileFieldMap{

    //文件索引
    private String fileIndex;
    //文件名
    private String fileName;
    //压缩文件名
    private String compressFileName;
    //远程路径
    private String remotePath;
    //本地路径
    private String localPath;
    //本地文件名带路径
    private String localFile;
    //数据库
    private String dataBase;
    //压缩标志
    private String isCompress;

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    //文件压缩
    public boolean fileCompress(){
        return true;
    }

    //文件解压
    public boolean fileUnCompress(){
        return true;
    }

    //文件索取
    public boolean fileGet(){
        return true;
    }

    //文件下发
    public boolean filePut(){
        return true;
    }

    public QpCupsN01File() {
        super.setHeadEndFlag("3");
        super.setHeadLine(2);
        super.setEndLine(1);
        super.setFileTp("sep");
        super.setSep(";");
        super.setCode("GBK");
    }

    public String getFileIndex() {
        return fileIndex;
    }

    public void setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCompressFileName() {
        return compressFileName;
    }

    public void setCompressFileName(String compressFileName) {
        this.compressFileName = compressFileName;
    }

    public String getRemotePath() {
        return remotePath;
    }

    public void setRemotePath(String remotePath) {
        this.remotePath = remotePath;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getLocalFile() {
        return localFile;
    }

    public void setLocalFile(String localFile) {
        this.localFile = localFile;
    }

    public String getIsCompress() {
        return isCompress;
    }

    public void setIsCompress(String isCompress) {
        this.isCompress = isCompress;
    }

    /**
     * 一行一行读取文件，解决读取中文字符时出现乱码
     *
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     *   readBankFileAndInsert
     * @throws IOException
     */
    public boolean readQpCupsN01FileAndInsert(String fileNameWithPath) throws IOException {
        FileInputStream fis = new FileInputStream(fileNameWithPath);
        InputStreamReader isr=new InputStreamReader(fis, getCode());;
//        if(code.equals("UTF-8")) {
//            isr=new InputStreamReader(fis, "UTF-8");
//        }
//        else if(code.equals("GBK")){
//            isr = new InputStreamReader(fis, "GBK");
//        }
//        else{
//            //扩展
//        }

        FileDeal filedeal= new FileDeal();
        BufferedReader br = new BufferedReader(isr);
        //QpCupsN01File fileMap = new QpCupsN01File();
        String line = "";
        String[] arrs = null;
        int i=0,n=0;
        while ((line = br.readLine()) != null) {
            arrs = filedeal.singleLineResolveWithSep(line,getSep());
            log.info("line="+line);

            if(n < getHeadLine()) {
                n++;
                continue;
            }
            if(arrs.length == 2 && arrs[0].equals("END")){
                break;
            }

            i=1;
            for (String au : arrs) {

                //log.info("i = "+i);
                switchField(au,i);
                i++;
            }

            log.info("单行入库"+toString());
            //银行文件单行入库
            //if(isQpCupsDeatilInsert(fileMap)){
//                log.info("单行入库"+fileMap.toString());
//                continue;
//            }
//            else{
//                br.close();
//                isr.close();
//                fis.close();
//                return false;
//            }

        }
        br.close();
        isr.close();
        fis.close();

        return true;
    }

//    @Override
//    public String toString() {
//        return "QpCupsN01File{" +
//                "headEndFlag='" + headEndFlag + '\'' +
//                ", headLine=" + headLine +
//                ", endLine=" + endLine +
//                '}';
//    }
}
