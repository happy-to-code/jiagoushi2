package com.yida.test3.multi_thread.print_abc2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: yida
 * @Date: 2023/2/22 13:46
 * @Description:
 */
public class PrintABC_Lock {
	private volatile int value = 1;
	
	private Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	public void printA() {
		lock.lock();
		try {
			while (value != 1) {
				condition.await();
			}
			System.out.println(Thread.currentThread().getName() + ":A");
			value = 2;
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public void printB() {
		lock.lock();
		try {
			while (value != 2) {
				condition.await();
			}
			System.out.println(Thread.currentThread().getName() + ":B");
			value = 3;
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public void printC() {
		lock.lock();
		try {
			while (value != 3) {
				condition.await();
			}
			System.out.println(Thread.currentThread().getName() + ":C");
			value = 1;
			condition.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}
