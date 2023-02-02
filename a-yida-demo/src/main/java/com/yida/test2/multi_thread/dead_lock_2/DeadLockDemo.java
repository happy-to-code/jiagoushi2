package com.yida.test2.multi_thread.dead_lock_2;

public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) throws InterruptedException {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.currentThread().sleep(2000);  // 睡两秒确保了阻塞，不然可能直接运行下去了
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("AB");
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (A) {
                        System.out.println("BA");
                    }
                }
            }
        });
        threadA.start();
        Thread.currentThread().sleep(1000);
        threadB.start();
    }
}
