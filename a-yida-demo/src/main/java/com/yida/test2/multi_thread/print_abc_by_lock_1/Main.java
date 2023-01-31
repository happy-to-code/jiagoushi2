package com.yida.test2.multi_thread.print_abc_by_lock_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintABC {
    private volatile int value = 1;
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    void printA() {
        try {
            lock.lock();
            for (int i = 0; i < 5; ) {
                if (value == 1) {
                    System.out.println(Thread.currentThread().getName() + ": A");
                    i++;
                    value = 2;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printB() {
        try {
            lock.lock();
            for (int i = 0; i < 5; ) {
                if (value == 2) {
                    System.out.println(Thread.currentThread().getName() + ": B");
                    i++;
                    value = 3;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printC() {
        try {
            lock.lock();
            for (int i = 0; i < 5; ) {
                if (value == 3) {
                    System.out.println(Thread.currentThread().getName() + ": C");
                    i++;
                    value = 1;
                    condition.signalAll();
                } else {
                    condition.await();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintABC printABC = new PrintABC();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printABC.printA();
            }
        }, "线程一").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                printABC.printB();
            }

        }, "线程二").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printABC.printC();
            }
        }, "线程三").start();
    }
}

