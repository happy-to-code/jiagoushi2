package com.yida.test2.thread_1.d8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Object t1 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t1执行。。。。");
            }
        }).get();

        Object t2 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t2执行。。。。");
            }
        }).get();

        Object t3 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t3执行。。。。");
            }
        }).get();
        executorService.shutdown();
    }
}
