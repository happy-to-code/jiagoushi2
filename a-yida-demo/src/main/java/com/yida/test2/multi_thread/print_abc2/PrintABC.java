package com.yida.test2.multi_thread.print_abc2;

/**
 * @Type: PrintABC.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/31 17:32
 * @Version:
 */
public class PrintABC {
    private volatile Integer value = 1;

    protected void printA() throws InterruptedException {
        synchronized (this) {
            while (value != 1) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + "\tA");

            value = 2;
            notifyAll();
        }
    }

    protected void printB() throws InterruptedException {
        synchronized (this) {
            while (value != 2) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + "\tB");

            value = 3;
            notifyAll();
        }
    }

    protected void printC() throws InterruptedException {
        synchronized (this) {
            while (value != 3) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + "\tC");

            value = 1;
            notifyAll();
        }
    }
}
