package com.yida.test2.thread_local_1.demo1;

import java.util.stream.IntStream;

public class ThreadLocalTest02 {

    public static void main(String[] args) {
        // [0,9]
        // IntStream.range(0, 10).forEach(i -> {
        //     System.out.println("i = " + i);
        // });

        ThreadLocal<String> local = new ThreadLocal<>();

        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            local.set(Thread.currentThread().getName() + ":" + i);
            System.out.println("线程：" + Thread.currentThread().getName() + ",local:" + local.get());
        }).start());
    }
}
