package com.yida.test2.multi_thread.dead_lock_3;

/**
 * @Type: DeadLockTest.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/1 9:47
 * @Version:
 */
public class DeadLockTest {
    public static String lockA = "lock_a";
    public static String lockB = "lock_b";

    public static void main(String[] args) {
        new Thread(new Lock1()).start();
        new Thread(new Lock2()).start();
    }
}


class Lock1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("lock1开始执行");
            synchronized (DeadLockTest.lockA) {
                System.out.println("Lock1 锁住了 lockA");
                Thread.sleep(2000);
                synchronized (DeadLockTest.lockB) {
                    System.out.println("Lock1 锁住了 lockB");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Lock2 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("lock2开始执行");
            synchronized (DeadLockTest.lockB) {
                System.out.println("Lock2 锁住了 lockB");
                Thread.sleep(2000);
                synchronized (DeadLockTest.lockA) {
                    System.out.println("Lock2 锁住了 lockA");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
