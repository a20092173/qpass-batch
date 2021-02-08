package com.unionpay.batch.service;

import com.unionpay.batch.base.BankFileFieldMap;
import com.unionpay.batch.dao.TblQpbatUpComtrxMapper;
import com.unionpay.batch.entity.TblQpbatUpComtrx;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;

@Slf4j
@Service
@Transactional
public class FileDeal {

//    String path = "D:\\test.txt";
//    String line = "123|hhsad|我是谁am|7岁hh";
    @Autowired
    TblQpbatUpComtrxMapper tblQpbatUpComtrxDao;

    public String[] singleLineResolveWithSep(String line, String sep) {
        //String tempAuthorStr = "张三|李四|拿破仑|王五|曹操";
        //空值也保留
        String[] str = line.split(sep,-1);

        int i=0;
        for(i=0;i<str.length;i++){
            log.info("str= "+str[i]);
        }

        return str;
//        String tempAuthorStr = "张三;李四,拿破仑，王五；曹操";
//        String[] tmpAuthors = tempAuthorStr.split(";|,|；|，");
//        for (String au : tmpAuthors) {
//            log.info("au= "+au);
//        }

    }



    /**
     * 一行一行读取文件，解决读取中文字符时出现乱码
     *
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     *   readBankFileAndInsert
     * @throws IOException
     */
    public boolean readFile(String fileNameWithPath, String code) throws IOException {
        FileInputStream fis = new FileInputStream(fileNameWithPath);
//        try {
//            fis = new FileInputStream(fileNameWithPath);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        InputStreamReader isr=null;
        if(code.equals("UTF-8")) {
            isr=new InputStreamReader(fis, "UTF-8");
        }
        else if(code.equals("GBK")){
            isr = new InputStreamReader(fis, "GBK");
        }
        else{
            //扩展
        }

        BufferedReader br = new BufferedReader(isr);
        BankFileFieldMap fileMap = new BankFileFieldMap();
        String line = "";
        String[] arrs = null;
        int i=0;
        while ((line = br.readLine()) != null) {
            arrs = singleLineResolveWithSep(line,"\\|;");
            log.info("line="+line);

            i=1;
            for (String au : arrs) {
                //log.info("arrs = "+au);
                fileMap.switchField(au,i);
                i++;
            }
            log.info("结束打印"+fileMap.toString());

            //银行文件单行入库
            if(isBankDeatilInsert(fileMap)){
                //
                //
                continue;
            }
            else{
                br.close();
                isr.close();
                fis.close();
                return false;
            }



        }
        br.close();
        isr.close();
        fis.close();

        return true;
    }

    /**
     * 一行一行读取文件，解决读取中文字符时出现乱码
     *
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     *   readBankFileAndInsert
     * @throws IOException
     */
    public boolean readQpCupsN01FileAndInsert(String fileNameWithPath, String code) throws IOException {
        FileInputStream fis = new FileInputStream(fileNameWithPath);
//        try {
//            fis = new FileInputStream(fileNameWithPath);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        InputStreamReader isr=null;
        if(code.equals("UTF-8")) {
            isr=new InputStreamReader(fis, "UTF-8");
        }
        else if(code.equals("GBK")){
            isr = new InputStreamReader(fis, "GBK");
        }
        else{
            //扩展
        }

        BufferedReader br = new BufferedReader(isr);

        //QpCupsN01File fileMap = new QpCupsN01File();
        //银联清算文件使用com/unionpay/batch/entity/TblQpbatUpComtrx类对接数据库实体
        TblQpbatUpComtrx fileMap = new TblQpbatUpComtrx();

        fileMap.setOperIn("i");
        fileMap.setRecUpdUsrId("user");
        String line = "";
        String[] arrs = null;
        int i=0,n=0;
        while ((line = br.readLine()) != null) {
            log.info("line="+line);
            arrs = singleLineResolveWithSep(line,";");

            if(n < 2) {
                n++;
                continue;
            }
            if(arrs.length == 2 && arrs[0].equals("END")){
                break;
            }


            i=1;
            for (String au : arrs) {
                //log.info("au["+ i +"]:" + au);
                //log.info("i = "+i);

                i++;
            }
            //银行文件单行入库

            fileMap.setBussCd("TESTBANK");
            fileMap.setIssAcq("0");
            log.info("结束打印"+fileMap.toString());
            if(isQpCupsDeatilInsert("tbl_qpbat_up_comtrx01",fileMap)){
                //
                log.info("【cups流水入库】记录流水号：" +fileMap.getTransSeq()+ "入库成功");
                //
                continue;
            }
            else{
                br.close();
                isr.close();
                fis.close();
                return false;
            }



        }
        br.close();
        isr.close();
        fis.close();

        return true;
    }


    //银联文件表单笔记录插入数据库
    public boolean isQpCupsDeatilInsert(String tableName, TblQpbatUpComtrx upComtrx){
        int iResult = 0;
        try{
            iResult = tblQpbatUpComtrxDao.insert(tableName,upComtrx);
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

    //银行文件表单笔记录插入数据库
    public boolean isBankDeatilInsert(BankFileFieldMap fileMap){

        return true;
    }

    //银联文件表单笔记录插入数据库
    public boolean isCupsDeatilInsert(BankFileFieldMap fileMap){

        return true;
    }

        /**
         *
         * 目录是否存在，若不存在创建目录
         *
         * @param folderName 目录路径
         * @return 如果目录存在或创建成功，则返回true，否则返回false
         */
    public boolean isFolderExitAndCreate(String folderName){
        File file = new File(folderName);
        if(!file.exists()){
            if(file.mkdir()) {
                log.debug("创建目录 " +folderName +" 成功!");
                return true;
            }
            else{
                log.debug("创建目录 " +folderName +" 失败!");
                return false;
            }
        }
        else{
            log.debug("目录存在 ");
            return true;
        }
    }

    /**
     *
     * 删除单个文件
     *
     * @param fileName 被删除的文件名
     * @return 如果删除成功，则返回true，否则返回false
     */
    public boolean deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                log.debug("删除单个文件 " +fileName +" 成功!");
                return true;
            } else {
                log.debug("删除单个文件 " +fileName +" 失败!");
                return false;
            }
        } else {
            log.debug(fileName+" 文件不存在!");
            return true;
        }
    }



}
