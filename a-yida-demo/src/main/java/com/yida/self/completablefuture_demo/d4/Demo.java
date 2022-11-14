package com.yida.self.completablefuture_demo.d4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: thenAccep表示某个任务执行完成后执行的动作，即回调方法，会将该任务的执行结果即方法返回值作为入参传递到回调方法中，无返回值。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:28
 * @Version:
 */
public class Demo {
    public static void main1(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Void> cf2 = cf1.thenAccept((result) -> {
            System.out.println(Thread.currentThread() + " cf2 do something...."+ result);
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

        CompletableFuture<Void> cf2 = cf1.thenAcceptAsync((result) -> {
            System.out.println(Thread.currentThread() + " cf2 do something........"+result);
        });

        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }
}
