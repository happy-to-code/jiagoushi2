package com.yida.test3.multi_thread.dead_lock;

/**
 * @Auther: yida
 * @Date: 2023/2/22 14.sql:32
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		
		new Thread(()->{
			try {
				deadLock.leftRight();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"A").start();
		
		// new Thread(()->{
		// 	try {
		// 		deadLock.rightLeft();
		// 	} catch (InterruptedException e) {
		// 		e.printStackTrace();
		// 	}
		// },"B").start();
	}
}
