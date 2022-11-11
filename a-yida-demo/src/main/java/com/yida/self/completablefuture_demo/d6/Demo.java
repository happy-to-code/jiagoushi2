package com.yida.self.completablefuture_demo.d6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: whenComplete和whenCompleteAsync
 * whenComplete是当某个任务执行完成后执行的回调方法，会将执行结果或者执行期间抛出的异常传递给回调方法，
 * 如果是正常执行则异常为null，回调方法对应的CompletableFuture的result和该任务一致，
 * 如果该任务正常执行，则get方法返回执行结果，如果是执行异常，则get方法抛出异常。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:33
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            // int a = 1 / 0;
            return 1;
        });

        CompletableFuture<Integer> cf2 = cf1.whenComplete((result, e) -> {
            System.out.println("上个任务结果：" + result);
            System.out.println("上个任务抛出异常：" + e);
            System.out.println(Thread.currentThread() + " cf2 do something....");
        });

        // 等待任务1执行完成
        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }
}
