package com.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class MyJobListener implements JobExecutionListener
{

    public void beforeJob(JobExecution jobExecution)
    {
        System.out.println("Job Started");
    }

    public void afterJob(JobExecution jobExecution)
    {
        System.out.println("Job Ended"+jobExecution.getStatus().toString());
    }


}
