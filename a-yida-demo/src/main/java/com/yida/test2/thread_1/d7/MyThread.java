package com.yida.test2.thread_1.d7;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MyThread {
    static ExecutorService executorService = Executors.newFixedThreadPool(10);
    static Semaphore semaphore1 = new Semaphore(0);
    static Semaphore semaphore2 = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t1执行.....");
                semaphore1.release(); // 信号量1  +1
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                semaphore1.acquire(); // 信号量-1  总数为0时候会等待
                System.out.println("线程t2执行.....");
                semaphore2.release();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                semaphore2.acquire(); // 信号量-1  总数为0时候会等待
                System.out.println("线程t3执行.....");
            }
        });

        executorService.submit(thread1);  // 信号量1先-1
        executorService.submit(thread2);
        executorService.submit(thread3);

        executorService.shutdown();
    }
}
