package server.httpserver.schedule;


import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;
import server.httpserver.schedule.job.SimpleRecoveryJob;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.DateBuilder.futureDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;


@Component
public class SchedulerMain {
    private static Logger log = LoggerFactory.getLogger(SchedulerMain.class);

   @Autowired
   private SchedulerFactoryBean schedulerFactoryBean;

   private Scheduler scheduler;

    /**
     * 调度器初始化
     */
    public void init() throws SchedulerException {
        scheduler = schedulerFactoryBean.getScheduler();
    }

    /**
     * 开启定时任务
     */
//    @PostConstruct
    public void start() {
        log.info("定时任务开始启动.......................");
        try {
            init();
            String schedId = scheduler.getSchedulerInstanceId();
            log.info("schedId:{}",schedId);
            int count = 1;
            JobKey jobKey = new JobKey("job_" + count, Scheduler.DEFAULT_GROUP);
            TriggerKey triggerKey = new TriggerKey("trigger_" + count, Scheduler.DEFAULT_GROUP);
            JobDetail job =  scheduler.getJobDetail(jobKey);
            Trigger trigger =  scheduler.getTrigger(triggerKey);
            if(job != null){
                scheduler.deleteJob(jobKey);
                job = newJob(SimpleRecoveryJob.class).withIdentity("job_" + count, Scheduler.DEFAULT_GROUP) // put triggers in group
                        // named after the cluster
                        // node instance just to
                        // distinguish (in logging)
                        // what was scheduled from
                        // where
//                        .requestRecovery() // ask scheduler to re-execute this job if it was in progress when the scheduler went
                        // down...
                        .build();

                job.getJobDataMap().put("count", "0");
            }else {
                 job = newJob(SimpleRecoveryJob.class).withIdentity("job_" + count, Scheduler.DEFAULT_GROUP) // put triggers in group
                        // named after the cluster
                        // node instance just to
                        // distinguish (in logging)
                        // what was scheduled from
                        // where
                        .requestRecovery() // ask scheduler to re-execute this job if it was in progress when the scheduler went
                        // down...
                        .build();
                job.getJobDataMap().put("test", "test1");
                trigger = newTrigger().withIdentity("trigger_" + count, Scheduler.DEFAULT_GROUP)
                        .withSchedule(cronSchedule("0/3 * * * * ?").withMisfireHandlingInstructionDoNothing())
                        .build();


            }
            if(trigger != null){
                CronScheduleBuilder csb = CronScheduleBuilder.cronSchedule("0/5 * * * * ? *");

                csb.withMisfireHandlingInstructionDoNothing();

                trigger = newTrigger().withIdentity("trigger_" + count, Scheduler.DEFAULT_GROUP)
                        .withSchedule(csb)
                        .build();
                scheduler.rescheduleJob(triggerKey,trigger);
            }

            scheduler.scheduleJob(job, trigger);
            log.info("定时任务开始启动.......................");
            scheduler.start();




        } catch (Exception e) {
            log.error("启动实时补单定时任务出现异常：{}", e);
            shutdown();
        }

        log.info("实时补单定时任务已启动.......................");
    }


    /**
     * 关闭实时补单定时任务
     */
    @PreDestroy
    public void shutdown() {
        log.info("实时补单定时任务正在关闭.......................");
        try {
            if (scheduler != null) {
                scheduler.shutdown(true);
            }
        } catch (Exception e) {
            log.error("关闭实时补单定时任务出现异常：{}", e);
        }
        log.info("实时补单定时任务已关闭.......................");
    }


}
