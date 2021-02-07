package com.unionpay.batch.base;

import com.unionpay.batch.entity.TblQpbatStdBankDetail;
import com.unionpay.batch.service.FileDeal;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@Slf4j
@Setter
@Getter
public class BankStdFile {
    private TblQpbatStdBankDetail fileMap;
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

    public void init(String fileIndex, String settleDt){
        setHeadEndFlag("0");
        setHeadLine(0);
        setEndLine(0);
        setFileTp("sep");
        setSep("\\|");
        setCode("GBK");
        setTableName("tbl_qpbat_std_bank_detail"+settleDt.substring(4,6));
        setFileIndex(fileIndex);
    }

    /**
     * 一行一行读取文件，解决读取中文字符时出现乱码
     *
     * 流的关闭顺序：先打开的后关，后打开的先关，
     *       否则有可能出现java.io.IOException: Stream closed异常
     *   readBankFileAndInsert
     * @throws IOException
     */
    public boolean readStdBankFileAndInsert(String fileNameWithPath) throws IOException {
        FileInputStream fis = new FileInputStream(fileNameWithPath);
        InputStreamReader isr=new InputStreamReader(fis, getCode());

        FileDeal filedeal= new FileDeal();
        BufferedReader br = new BufferedReader(isr);
        //QpCupsN01File fileMap = new QpCupsN01File();

        fileMap = new TblQpbatStdBankDetail();
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
                fileMap.switchField(au,i);
                i++;
            }

            //log.info("单行入库"+fileMap.toString());
            //银行文件单行入库
            fileMap.setBussCd("TESTBANK");
            //fileMap.setIssAcq("0");
            fileMap.setIssAcq(getIsIssAcq());

            if(isStdBankDeatilInsert(fileMap)){
                //log.info("【bank流水入库】记录流水号：" +fileMap.getTransSeq()+ "入库成功");
                continue;
            }
            else{
                br.close();
                isr.close();
                fis.close();
                return false;
            }

        }
        log.info("标准银行文件入库完成");
        br.close();
        isr.close();
        fis.close();

        return true;
    }

    //银联文件表单笔记录插入数据库
    public boolean isStdBankDeatilInsert(TblQpbatStdBankDetail stdBankDetail){

        return true;
    }

}
