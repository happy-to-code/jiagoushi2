package com.yida.test3.multi_thread.dead_lock;

import com.yida.test3.multi_thread.print_abc3.PrintAbc_3;

/**
 * @Auther: yida
 * @Date: 2023/2/22 14:29
 * @Description:
 */
public class DeadLock {
	private Object left = new Object();
	private Object right = new Object();
	
	public void leftRight() throws InterruptedException {
		synchronized (left) {
			Thread.sleep(1000);
			System.out.println("leftRight-->1");
			synchronized (right) {
				System.out.println("leftRight-->2");
			}
		}
	}
	
	public void rightLeft() throws InterruptedException {
		synchronized (right) {
			Thread.sleep(1000);
			System.out.println("rightLeft-->1");
			synchronized (left) {
				System.out.println("rightLeft-->2");
			}
		}
	}
}
