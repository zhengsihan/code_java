package org.minus.prac2.job;

import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by zhengsihan, on 2019-10-29
 */
public class TestQuartz extends QuartzJobBean {
    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
