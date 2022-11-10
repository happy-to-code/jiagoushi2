package com.yida.self.list_demo.completablefuture_demo.d3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: 1.thenApply和thenApplyAsync
 * thenApply 表示某个任务执行完成后执行的动作，即回调方法，会将该任务的执行结果即方法返回值作为入参传递到回调方法中，带有返回值。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:19
 * @Version:
 * 从上面代码和测试结果我们发现thenApply和thenApplyAsync区别在于，
 * 使用thenApply方法时子任务与父任务使用的是同一个线程，而thenApplyAsync在子任务中是另起一个线程执行任务，
 * 并且thenApplyAsync可以自定义线程池，默认的使用ForkJoinPool.commonPool()线程池。
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Integer> cf2 = cf1.thenApplyAsync((result) -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            result += 2;
            return result;
        });
        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }

    public static void main3(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            return 1;
        });

        CompletableFuture<Integer> cf2 = cf1.thenApply((result) -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            result += 2;
            return result;
        });
        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }
}
