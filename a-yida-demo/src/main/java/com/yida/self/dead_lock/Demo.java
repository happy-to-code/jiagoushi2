package com.yida.self.dead_lock;

import java.util.concurrent.TimeUnit;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/11 15:08
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String lockA = "A";
        String lockB = "B";

        new Thread(new MyThread2(lockA, lockB)).start();
        new Thread(new MyThread2(lockB, lockA)).start();
    }
}

class MyThread2 implements Runnable {

    private String lockA;
    private String lockB;

    public MyThread2(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + " 锁" + lockA + " -> 想拿锁" + lockB);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + " 锁" + lockB + " -> 想拿锁" + lockA);
            }
        }
    }

}

