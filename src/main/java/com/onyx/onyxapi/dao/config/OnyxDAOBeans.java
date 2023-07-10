package com.onyx.onyxapi.dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class OnyxDAOBeans {


    @Bean
    public TaskExecutor persistenceTaskExecutor(){
        var exec = new ThreadPoolTaskExecutor();
        exec.setCorePoolSize(8);
        exec.setMaxPoolSize(24);
        exec.setQueueCapacity(128);
        return exec;
    }

}
