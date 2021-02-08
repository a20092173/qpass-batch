package com.unionpay.batch.base;

import com.unionpay.batch.dao.TblQpbatUpComtrxMapper;
import com.unionpay.batch.entity.TblQpbatUpComtrx;
import com.unionpay.batch.service.FileDeal;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@Slf4j
public class QpCupsN01File {

    @Autowired
    TblQpbatUpComtrxMapper tblQpbatUpComtrxDao;

    private TblQpbatUpComtrx fileMap;
    //文件索引
    private String fileIndex;
    //文件名
    private String fileName;
    //压缩文件名
    private String compressFileName;
    //压缩标志
    private String isCompress;
    //远程路径
    private String remotePath;
    //本地路径
    private String localPath;
    //本地文件名带路径
    private String localFile;
    //数据库
    private String dataBase;
    //表名
    private String tableName;
    //表名
    private String settleDt;

    private String headEndFlag;
    //0:无头尾 1：有头无尾 2：无头有尾  3：有头有尾
    private int headLine;
    private int endLine;

    //文件类型（xml，sep）
    private String fileTp;
    //分隔符
    private String sep;
    //编码格式(GBK,UTF-8)
    private String code;
    //发卡受理标志 发卡0，受理1
    private String isIssAcq;

//    public QpCupsN01File() {
//        setHeadEndFlag("3");
//        setHeadLine(2);
//        setEndLine(1);
//        setFileTp("sep");
//        setSep(";");
//        setCode("GBK");
//    }

    public void init(String fileIndex, String settleDt){
        setHeadEndFlag("3");
        setHeadLine(2);
        setEndLine(1);
        setFileTp("sep");
        setSep(";");
        setCode("GBK");
        setTableName("tbl_qpbat_up_comtrx"+settleDt.substring(4,6));
        setFileIndex(fileIndex);
    }

    public String getIsIssAcq() {
        return isIssAcq;
    }

    public void setIsIssAcq(String isIssAcq) {
        this.isIssAcq = isIssAcq;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSettleDt() {
        return settleDt;
    }

    public void setSettleDt(String settleDt) {
        this.settleDt = settleDt;
    }

    public String getHeadEndFlag() {
        return headEndFlag;
    }

    public void setHeadEndFlag(String headEndFlag) {
        this.headEndFlag = headEndFlag;
    }

    public int getHeadLine() {
        return headLine;
    }

    public void setHeadLine(int headLine) {
        this.headLine = headLine;
    }

    public int getEndLine() {
        return endLine;
    }

    public void setEndLine(int endLine) {
        this.endLine = endLine;
    }

    public String getFileTp() {
        return fileTp;
    }

    public void setFileTp(String fileTp) {
        this.fileTp = fileTp;
    }

    public String getSep() {
        return sep;
    }

    public void setSep(String sep) {
        this.sep = sep;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Logger getLog() {
        return log;
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
        InputStreamReader isr=new InputStreamReader(fis, getCode());

        FileDeal filedeal= new FileDeal();
        BufferedReader br = new BufferedReader(isr);
        //QpCupsN01File fileMap = new QpCupsN01File();

        fileMap = new TblQpbatUpComtrx();
        fileMap.setOperIn("i");
        fileMap.setRecUpdUsrId("user");

        String line = "";
        String[] arrs = null;

        int i=0,n=0;
        while ((line = br.readLine()) != null) {
            arrs = filedeal.singleLineResolveWithSep(line,getSep());
            //log.info("line="+line);

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
                switchField(fileMap,au,i);
                i++;
            }

            //log.info("单行入库"+fileMap.toString());
            //银行文件单行入库
            fileMap.setBussCd("TESTBANK");
            //fileMap.setIssAcq("0");
            fileMap.setIssAcq(getIsIssAcq());
            //log.info("结束打印"+fileMap.toString());
//            if(isQpCupsN01DeatilInsert(fileMap)){
//                log.info("【cups流水入库】记录流水号：" +fileMap.getTransSeq()+ "入库成功");
//                continue;
//            }
//            else{
//                br.close();
//                isr.close();
//                fis.close();
//                return false;
//            }

        }
        log.info("银联清算文件解析入库完成");
        br.close();
        isr.close();
        fis.close();

        return true;
    }

    //银联文件表单笔记录插入数据库
    public boolean isQpCupsN01DeatilInsert(TblQpbatUpComtrx upComtrx){
        int iResult = 0;
        try{
            iResult = tblQpbatUpComtrxDao.insert(getTableName(),upComtrx);
            if(0 >= iResult){
                log.error("【cups流水入库】记录流水号:"+ upComtrx.getTransSeq() +"入库失败"+iResult);
                return false;
            }
        }catch (Exception e){
            log.error("【cups流水入库】记录流水号：" +upComtrx.getTransSeq()+ "入库发生异常",e);
            return false;
        }
        return true;
    }

    public void switchField(TblQpbatUpComtrx upComtrx, String s, int i){
        switch (i) {
            case 0:
                break;
            case 1:
                upComtrx.setTransTp(s);
                break;
            case 2:
                upComtrx.setTransSeq(s);
                break;
            case 3:
                upComtrx.setTransAt(s);
                break;
            case 5:
                upComtrx.setSettleDt(s);
                break;
            case 6:
                upComtrx.setOrgTransSeq(s);
                break;
            case 7:
                upComtrx.setOrgTransAt(s);
                break;
            case 9:
                upComtrx.setSndrInsIdCd(s);
                break;
            case 10:
                upComtrx.setPyerAcctInsCd(s);
                break;
            case 11:
                upComtrx.setPyerAcctTp(s);
                break;
            case 12:
                upComtrx.setPyerAcctNo(s);
                break;
            case 15:
                upComtrx.setPyeeAcctInsCd(s);
                break;
            case 16:
                upComtrx.setPyeeAcctTp(s);
                break;
            case 17:
                upComtrx.setPyeeAcctNo(s);
                break;
            case 34:
                upComtrx.setSettleNum(s);
                break;
            case 36:
                if(s.length() == 16) {
                    upComtrx.setTransDt(s.substring(0, 8));
                    upComtrx.setTransTm(s.substring(8));
                }
                break;
            default:
                break;
        }
    }
}
