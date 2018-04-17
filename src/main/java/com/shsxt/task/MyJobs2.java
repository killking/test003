package com.shsxt.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xlf on 2018/4/16.
 */
@Component
public class MyJobs2 {

    @Scheduled(cron="0/6 * * * * ?")
    public void job1(){
        System.out.println("任务3");
    }
    @Scheduled(cron="0/7 * * * * ?")
    public void job2(){
        System.out.println("任务4");
    }
}
