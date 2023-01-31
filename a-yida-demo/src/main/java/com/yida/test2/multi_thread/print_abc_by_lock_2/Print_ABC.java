package com.yida.test2.multi_thread.print_abc_by_lock_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Type: Print_ABC.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/31 17:46
 * @Version:
 */
public class Print_ABC {
    private volatile Integer value = 1;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    void printA() {
        lock.lock();
        try {
            while (value != 1) {
                condition.await();
            }
            value = 2;
            System.out.println(Thread.currentThread().getName() + ":\tA");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printB() {
        lock.lock();
        try {
            while (value != 2) {
                condition.await();
            }
            value = 3;
            System.out.println(Thread.currentThread().getName() + ":\tB");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printC() {
        lock.lock();
        try {
            while (value != 3) {
                condition.await();
            }
            value = 1;
            System.out.println(Thread.currentThread().getName() + ":\tC");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
