package com.yida.test2.thread_1.d6;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;

/**
 * 计数器CountDownLatch
 * 检测到CountDownLatch计数器为0时就可以继续向下执行 不用管thread是否执行完毕。
 * countDown()每调用一次 计数器减一
 * await()计数器减到0时候唤醒当前线程继续执行
 */
public class MyThread {
    private static CountDownLatch countDownLatch1 = new CountDownLatch(1);
    private static CountDownLatch countDownLatch2 = new CountDownLatch(1);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1线程执行.....");
                countDownLatch1.countDown();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                countDownLatch1.await();
                System.out.println("t2线程执行.....");
                countDownLatch2.countDown();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                countDownLatch2.await();
                System.out.println("t3线程执行.....");
                countDownLatch1.countDown();
            }
        });

        thread3.start();
        thread2.start();
        thread1.start();
    }
}
