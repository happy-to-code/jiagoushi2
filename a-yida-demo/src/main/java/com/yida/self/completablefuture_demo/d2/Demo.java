package com.yida.self.completablefuture_demo.d2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Type: Demo.java
 * @Desc: runAsync是创建没有返回值的异步任务。
 * 它有如下两个方法，一个是使用默认线程池（ForkJoinPool.commonPool()）的方法，一个是带有自定义线程池的重载方法
 * @author: zhangyifei
 * @Date: 2022/11/10 17:14.sql
 * @Version:
 */
public class Demo {
    public static void main1(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("do something....");
        });

        // 等待任务执行完成
        System.out.println("结果->" + cf.get());
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 自定义线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> {
            System.out.println("do something....");
        }, executorService);

        // 等待任务执行完成
        System.out.println("结果->" + cf.get());
    }
}
