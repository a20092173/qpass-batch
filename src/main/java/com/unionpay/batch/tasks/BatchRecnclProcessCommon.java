package com.unionpay.batch.tasks;

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
@Slf4j
public class BatchRecnclProcessCommon{

    @Autowired
    FileDeal filedeal;

    public boolean exeBatchRecnclCommonFlow(JobDataMap datMap){
        //FileDeal filedeal= new FileDeal();
        //log.info("123|hhsad|我是谁am|7岁hh");
        //String line = "123|;hhsad|;我是谁am|7岁hh";
        //filedeal.singleLineResolveWithSep(line,"\\|;");
        //filedeal.readFile("D:\\新建文本文档.txt","UTF-8");
<<<<<<< HEAD:src/main/java/com/unionpay/batch/tasks/BatchRecnclProcessCommon.java
        try{
            filedeal.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23","UTF-8");
        }catch (Exception e){
            log.error("【cups入库】发生异常",e);
            return false;
        }
        log.info("byebye");
=======
//       filedeal.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23","GBK");
//        log.info("byebye");
>>>>>>> 9b0b3554c7e678462db531d0f2fb9a5aeef7d7b1:src/main/java/com/unionpay/batch/jobs/BatchRecnclProcessCommon.java
//        XmlInterfaceUtils xm = new XmlInterfaceUtils();
//        QpCupsSumFile o = (QpCupsSumFile) xm.dataXmltoEntity(QpCupsSumFile.class,  "D:\\新建文本文档1.txt");
//        System.out.println(o.toString());
//        System.out.println(o.getSummryHead().get(0).getAccCntPyAmt());
<<<<<<< HEAD:src/main/java/com/unionpay/batch/tasks/BatchRecnclProcessCommon.java

=======
        QpCupsN01File file = new QpCupsN01File();
        file.readQpCupsN01FileAndInsert("D:\\20200610_01_IS_NCOMTRX_23");

        log.error(E1_BP_0001,"【tar文件压缩】待压缩文件不合法，请检查");
>>>>>>> 9b0b3554c7e678462db531d0f2fb9a5aeef7d7b1:src/main/java/com/unionpay/batch/jobs/BatchRecnclProcessCommon.java
        log.info("执行通用对账任务"+datMap.get("SettleDt").toString());
        return true;
    }
}