package com.yida.test.d7;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.net.URISyntaxException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/26 14.sql:15
 * @Version:
 */
public class Test {
    public static void main(String[] args) throws URISyntaxException {
        int cpus = Runtime.getRuntime().availableProcessors();
        System.out.println("cpus = " + cpus);

        // asyncServiceExecutor();
    }

    public static Executor asyncServiceExecutor() {
        //使用VisibleThreadPoolTaskExecutor
        ThreadPoolTaskExecutor executor = new VisibleThreadPoolTaskExecutor();
        //获取到服务器的cpu内核
        int cpus = Runtime.getRuntime().availableProcessors();
        //配置核心线程数
        executor.setCorePoolSize(cpus * 3);
        //配置最大线程数
        executor.setMaxPoolSize(50);
        //配置队列大小
        executor.setQueueCapacity(100);
        //用来设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        //设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住
        executor.setAwaitTerminationSeconds(3600);
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("async-service-");
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        // 使用预定义的异常处理类
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }
}
