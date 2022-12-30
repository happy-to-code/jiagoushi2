package com.yida.test2.thread_1.d4;

import lombok.Data;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/30 9:54
 * @Version:
 */
public class MyThread {
    static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        MyLock myLock = new MyLock();
        Runnable t1 = myLock::thread1;
        Runnable t2 = myLock::thread2;
        Runnable t3 = myLock::thread3;

        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);

        Thread.sleep(1000);
        myLock.getLock().lock();

        // 唤醒线程t1
        myLock.getCondition1().signal();

        myLock.getLock().unlock();

        executorService.shutdown();
    }

    @Data
    static class MyLock {
        private ReentrantLock lock = new ReentrantLock();
        private Condition condition1 = lock.newCondition();
        private Condition condition2 = lock.newCondition();
        private Condition condition3 = lock.newCondition();

        public void thread1() {
            lock.lock();
            try {
                // System.out.println("线程t1等待执行。。。。");
                condition1.await();// await()执行的前提是线程获取了对象的控制权，否则会报错:java.lang.IllegalMonitorStateException
                System.out.println("线程t1执行。。。。");
                condition2.signal(); // 唤醒线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void thread2() {
            lock.lock();
            try {
                // System.out.println("线程t2等待执行。。。。");
                condition2.await();// await()执行的前提是线程获取了对象的控制权，否则会报错:java.lang.IllegalMonitorStateException
                System.out.println("线程t2执行。。。。");
                condition3.signal();// 唤醒线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void thread3() {
            lock.lock();
            try {
                // System.out.println("线程t3等待执行。。。。");
                condition3.await();// await()执行的前提是线程获取了对象的控制权，否则会报错:java.lang.IllegalMonitorStateException
                System.out.println("线程t3执行。。。。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

}
