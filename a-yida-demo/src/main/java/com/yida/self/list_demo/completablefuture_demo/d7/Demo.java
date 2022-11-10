package com.yida.self.list_demo.completablefuture_demo.d7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: .handle和handleAsync
 * 跟whenComplete基本一致，区别在于handle的回调方法有返回值。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:38
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread() + " cf1 do something....");
            int a = 1/0;
            return 1;
        });

        CompletableFuture<Integer> cf2 = cf1.handle((result, e) -> {
            System.out.println(Thread.currentThread() + " cf2 do something....");
            System.out.println("上个任务结果：" + result);
            System.out.println("上个任务抛出异常：" + e);
            return result + 2;
        });

        System.out.println("cf1结果->" + cf1.get());
        // 等待任务2执行完成
        System.out.println("cf2结果->" + cf2.get());
    }
}
