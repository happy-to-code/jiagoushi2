package com.yida.self.completablefuture_demo.d1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Type: Demo1.java
 * @Desc: supplyAsync是创建带有返回值的异步任务。它有如下两个方法，
 * 一个是使用默认线程池（ForkJoinPool.commonPool()）的方法，一个是带有自定义线程池的重载方法
 * @author: zhangyifei
 * @Date: 2022/11/10 17:07
 * @Version:
 */
public class Demo1 {
    public static void main2(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("do something....");
            return "result";
        });

        // 等待任务执行完成
        System.out.println("结果->" + cf.get());
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 自定义线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("do something....");
            return "result";
        }, executorService);

        // 等待子任务执行完成
        System.out.println("结果->" + cf.get());
        executorService.shutdown();
    }
}
