package org.minus.prac2.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengsihan, on 2019-10-29
 */
@Component
public class TestJob {

    @Scheduled(cron = "0/2 * * * * *")
    public void job(){
        System.out.println(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()));
    }

}
