package com.yida.test3.multi_thread.print_abc3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: yida
 * @Date: 2023/2/22 14.sql:05
 * @Description:
 */
public class PrintAbc_3 {
	private volatile int value = 1;
	private Lock lock = new ReentrantLock();
	Condition conditionA = lock.newCondition();
	Condition conditionB = lock.newCondition();
	Condition conditionC = lock.newCondition();
	
	void printA() {
		lock.lock();
		
		try {
			while (value != 1) {
				conditionA.await();
			}
			System.out.println(Thread.currentThread().getName() + " A");
			value = 2;
			conditionB.signal();
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
				conditionB.await();
			}
			System.out.println(Thread.currentThread().getName() + " B");
			value = 3;
			conditionC.signal();
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
				conditionC.await();
			}
			System.out.println(Thread.currentThread().getName() + " C");
			value = 1;
			conditionA.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
