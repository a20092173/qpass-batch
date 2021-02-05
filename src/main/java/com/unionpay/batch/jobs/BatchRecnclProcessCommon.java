package com.unionpay.batch.jobs;

import com.unionpay.batch.base.QpCupsN01File;
import com.unionpay.batch.base.QpCupsSumFile;
import com.unionpay.batch.base.QpCupsSumfileSummryHead;
import com.unionpay.batch.base.XmlInterfaceUtils;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import com.unionpay.batch.service.FileDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.unionpay.batch.base.BatchErrorCode.E1_BP_0001;

@Component
@Configurable
@Slf4j
public class BatchRecnclProcessCommon{

    //@Autowired
    //public FileDeal filedeal;

    public void exeBatchRecnclCommonFlow(JobDataMap datMap) throws IOException {
        FileDeal filedeal= new FileDeal();
        log.info("123|hhsad|我是谁am|7岁hh");
        String line = "123|;hhsad|;我是谁am|7岁hh";
        //filedeal.singleLineResolveWithSep(line,"\\|;");
        //filedeal.readFile("D:\\新建文本文档.txt","UTF-8");
//       filedeal.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23","GBK");
//        log.info("byebye");
//        XmlInterfaceUtils xm = new XmlInterfaceUtils();
//        QpCupsSumFile o = (QpCupsSumFile) xm.dataXmltoEntity(QpCupsSumFile.class,  "D:\\新建文本文档1.txt");
//        System.out.println(o.toString());
//        System.out.println(o.getSummryHead().get(0).getAccCntPyAmt());
        QpCupsN01File file = new QpCupsN01File();
        file.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23");

        log.error(E1_BP_0001,"【tar文件压缩】待压缩文件不合法，请检查");
        log.info("执行通用对账任务"+datMap.get("SettleDt").toString());

    }
}