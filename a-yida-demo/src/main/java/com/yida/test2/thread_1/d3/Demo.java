package com.yida.test2.thread_1.d3;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/30 9:51
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Thread2 t2 = new Thread2();
        Thread1 t1 = new Thread1(t2);

//        Thread t3 = new Thread(t2);

        // 期望顺序 t1->t2->t3
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 这里必须要让t2先执行才能正常执行，否则会一直处于wait()

        // 如果t1先拿到对象锁执行notify()无法唤醒t2，因为t2还没有拿到对象锁，未执行wait()
        // 因此同一个锁的执行顺序：wait()->notify()
        executorService.execute(t2);
        Thread.sleep(100);
        executorService.execute(t1);

        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // 等待所有线程执行结束
        }
        System.exit(0);
    }

    static class Thread2 implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            synchronized (this) {
                System.out.println("t2线程等待t1线程执行。。。");
                this.wait();
                System.out.println("t2线程等待t1线程执行。。。执行结束");
                System.out.println("t2线程执行");
            }
        }
    }

    static class Thread1 implements Runnable {
        private final Object obj;

        public Thread1(Object obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            synchronized (obj) {
                // notify()不会立马释放对象锁,释放情景: 1.synchronized代码块执行完成; 2.主动释放 wait();
                obj.notify();
                System.out.println("t1线程开始执行");
                System.out.println("t1线程执行结束");
            }
        }
    }
}
