package com.xnpool.scheduler.quartz.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * 实现Job接口
 * @author yvan
 *
 */
@Component
@DisallowConcurrentExecution
public class SchedulerQuartzJob1 implements Job{
    private void before(){
        System.out.println("任务开始执行");
    }

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        before();
        System.out.println("开始："+System.currentTimeMillis());
        // TODO 业务
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束："+System.currentTimeMillis());
        after();
    }

    private void after(){
        System.out.println("任务开始执行");
    }

}