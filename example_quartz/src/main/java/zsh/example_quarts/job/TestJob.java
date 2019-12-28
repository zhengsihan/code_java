package zsh.example_quarts.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestJob {

    @Scheduled(cron="0/1 * * * * *")
    public void printTime() {
        System.out.println("现在时间 " + new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()));
    }

}
