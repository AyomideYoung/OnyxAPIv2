package com.onyx.onyxapi.config;

import com.onyx.onyxapi.exception.OnyxApiControllerAdvice;
import com.onyx.onyxapi.service.config.OnyxServiceBeans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@EnableAsync
@Import({
        RestAPIControllers.class,
        OnyxApiControllerAdvice.class,
        OnyxServiceBeans.class,
})
@Configuration
public class OnyxApiBeans {

    //previously callbackExecutorService
    @Bean
    public TaskExecutor executorService(){
       var executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(8);
        executor.setMaxPoolSize(24);
        executor.setQueueCapacity(128);
        return executor;
    }
}
