package com.unionpay.batch.configuration;

import com.unionpay.batch.jobs.BatchRecnclProcessCommonJob;
import com.unionpay.batch.jobs.StdRecncl2PartJob;
import org.quartz.JobDataMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

@Configuration
public class BatchQuartzConfig {

    @Bean
    JobDetailFactoryBean stdRecncl2PartJobDetailFactoryBean() {
        JobDetailFactoryBean jobBean = new JobDetailFactoryBean();
        jobBean.setJobClass(StdRecncl2PartJob.class);
        jobBean.setDurability(true);     //任务执行完毕做持久化
        JobDataMap datMap = new JobDataMap();
        datMap.put("SettleDt", "20210207");
        datMap.put("QPCUPSN01_Is_FILE_INDEX", "100000");
        datMap.put("STDBANK_FILE_INDEX", "200000");
        datMap.put("SYS_CODE","BAT");
        jobBean.setJobDataMap(datMap);
        return jobBean;
    }

    @Bean
    CronTriggerFactoryBean stdRecncl2PartCronTrigger1() {
        CronTriggerFactoryBean cronTrigBean = new CronTriggerFactoryBean();
        cronTrigBean.setCronExpression("0/10 * * * * ?");
        cronTrigBean.setJobDetail(stdRecncl2PartJobDetailFactoryBean().getObject());
        return cronTrigBean;
    }

}
