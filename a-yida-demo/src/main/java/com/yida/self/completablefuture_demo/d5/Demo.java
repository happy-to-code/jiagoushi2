package com.yida.self.completablefuture_demo.d5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: thenRun和thenRunAsync thenRun表示某个任务执行完成后执行的动作，即回调方法，无入参，无返回值。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:32
 * @Version:
 */
public class Demo {
    public static void main2(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Void> cf2 = cf1.thenRun(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
        });

        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Void> cf2 = cf1.thenRunAsync(() -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
        });

        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }
}
