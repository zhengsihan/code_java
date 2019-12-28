package zsh.job;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by zhengsihan, on 2019-10-29
 */
@DisallowConcurrentExecution
public class TestQuartz extends QuartzJobBean {
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext) {
        System.out.println("Quarts执行");
    }
}
