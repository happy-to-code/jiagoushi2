package com.yida.test.juc_1.count_down_lanch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        System.out.println("主要线程开始等待其他子线程执行");
        countDownLatchTest();

        System.out.println("-------------------111212121----------------------");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }

    private static List<String> list1 = new ArrayList<>();
    private static List<String> list2 = new ArrayList<>();
    // private static List<Integer> list3 = new ArrayList<>();


    public static void countDownLatchTest() {
        int threadCount = 2;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            final int finalI = i + 1;
            new Thread(() -> {
                System.out.println("第 " + finalI + " 线程开始");
                Random random = new Random();
                try {
                    Thread.sleep(random.nextInt(10000) + 1000);
                    for (int j = 0; j < 10; j++) {

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("第 " + finalI + " 线程执行完毕");

                countDownLatch.countDown();
            }).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadCount + " 个线程全部执行完毕");
        System.out.println("主线程继续执行");
        // todo业务代码
    }
}

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    private List<String> data;

    public RunnableDemo(Thread t, String threadName, List<String> data) {
        this.t = t;
        this.threadName = threadName;
        this.data = data;
    }

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            this.data.add(this.threadName + "_" + j);
        }
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
