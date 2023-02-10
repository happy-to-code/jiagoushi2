package com.yida.test2.multi_thread.print_abc_by_lock_3;

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
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    void printA() {
        lock.lock();
        try {
            while (value != 1) {
                condition1.await();
            }
            value = 2;
            System.out.println(Thread.currentThread().getName() + ":\tA");
            condition2.signal();
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
                condition2.await();
            }
            value = 3;
            System.out.println(Thread.currentThread().getName() + ":\tB");
            condition3.signal();
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
                condition3.await();
            }
            value = 1;
            System.out.println(Thread.currentThread().getName() + ":\tC");
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
