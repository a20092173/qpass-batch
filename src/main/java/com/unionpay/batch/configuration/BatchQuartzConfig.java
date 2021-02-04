package com.unionpay.batch.configuration;

import com.unionpay.batch.jobs.BatchRecnclProcessCommonJob;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDataMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
@Slf4j
@Configuration
public class BatchQuartzConfig {

    @Bean
    JobDetailFactoryBean jobDetailFactoryBean() {
        JobDetailFactoryBean jobBean = new JobDetailFactoryBean();
        jobBean.setJobClass(BatchRecnclProcessCommonJob.class);
        jobBean.setDurability(true);     //任务执行完毕做持久化
        JobDataMap datMap = new JobDataMap();
        datMap.put("SettleDt", "20210127");
        datMap.put("name","abcde");
        jobBean.setJobDataMap(datMap);
        return jobBean;
    }

    @Bean
    CronTriggerFactoryBean cronTrigger() {
        CronTriggerFactoryBean cronTrigBean = new CronTriggerFactoryBean();
        cronTrigBean.setCronExpression("0/5 * * * * ?");
        cronTrigBean.setJobDetail(jobDetailFactoryBean().getObject());
        return cronTrigBean;
    }

}
