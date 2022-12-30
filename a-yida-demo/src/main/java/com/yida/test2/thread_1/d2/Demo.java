package com.yida.test2.thread_1.d2;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/30 9:48
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("T1 执行完成...");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("T2 执行完成...");
        });
        Thread t3 = new Thread(() -> {
            System.out.println("T3 执行完成...");
        });

        // 使用 Thread.join() 等待线程执行完毕, 这种方式不优雅
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
