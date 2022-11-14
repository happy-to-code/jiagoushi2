package com.yida.self.completablefuture_demo.d10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Type: Demo.java
 * @Desc: allOf / anyOf
 * allOf：CompletableFuture是多个任务都执行完成后才会执行，只要有一个任务执行异常，
 * 则返回的CompletableFuture执行get方法时会抛出异常，如果都是正常执行，则get返回null。
 * <p>
 * anyOf ：CompletableFuture是多个任务只要有一个任务执行完成，则返回的CompletableFuture执行get方法时会抛出异常，
 * 如果都是正常执行，则get返回执行完成任务的结果。
 * @author: zhangyifei
 * @Date: 2022/11/10 17:54
 * @Version:
 */
public class Demo {
    public static void main1(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf1 do something....");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf1 任务完成");
            return "cf1 任务完成";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                int a = 1 / 0;
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("e = " + e);
            }
            System.out.println("cf2 任务完成");
            return "cf2 任务完成";
        });

        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf3 任务完成");
            return "cf3 任务完成";
        });

        CompletableFuture<Void> cfAll = CompletableFuture.allOf(cf1, cf2, cf3);
        System.out.println("cfAll结果->" + cfAll.get());
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf1 do something....");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf1 任务完成");
            return "cf1 任务完成";
        });

        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf2 任务完成");
            return "cf2 任务完成";
        });

        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(Thread.currentThread() + " cf2 do something....");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cf3 任务完成");
            return "cf3 任务完成";
        });

        CompletableFuture<Object> cfAll = CompletableFuture.anyOf(cf1, cf2, cf3);
        System.out.println("cfAll结果->" + cfAll.get());
    }
}
