package com.yida.test.juc_1.count_down_lanch2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchModule {
    // 线程数
    private static int N = 2;

    // 单位：min
    private static int countDownLatchTimeout = 5;

    public static void main(String[] args) {
        // 创建CountDownLatch并设置计数值，该count值可以根据线程数的需要设置
        CountDownLatch countDownLatch = new CountDownLatch(N);

        // 创建线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

          List<Integer> list1 = new ArrayList<>();
          List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cachedThreadPool.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " do something!");


                } catch (Exception e) {
                    System.out.println("Exception: do something exception");
                } finally {
                    // 该线程执行完毕-1
                    countDownLatch.countDown();
                }
            });
        }

        System.out.println("main thread do something-1");
        try {
            countDownLatch.await(countDownLatchTimeout, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            System.out.println("Exception: await interrupted exception");
        } finally {
            System.out.println("----->countDownLatch: " + countDownLatch.toString());
        }
        System.out.println("main thread do something-2");
        // 若需要停止线程池可关闭;
        // cachedThreadPool.shutdown();

    }
}
