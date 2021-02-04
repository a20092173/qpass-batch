package com.unionpay.batch.service;

import com.unionpay.batch.base.BankFileFieldMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

@Slf4j
@Service
public class FileDeal {

//    String path = "D:\\test.txt";
//    String line = "123|hhsad|我是谁am|7岁hh";

    public String[] singleLineResolveWithSep(String line, String sep) {
        //String tempAuthorStr = "张三|李四|拿破仑|王五|曹操";
        //空值也保留
        String[] str = line.split(sep,-1);

//        int i=0;
//        for(i=0;i<str.length;i++){
//            log.info("str= "+str[i]);
//        }

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

            i=0;

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
