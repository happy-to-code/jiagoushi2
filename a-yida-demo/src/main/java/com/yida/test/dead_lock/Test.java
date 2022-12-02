package com.yida.test.dead_lock;

/**
 * @Auther: yida
 * @Date: 2022/11/28 21:25
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
		}).start();
		
		new Thread(()->{
			try {
				deadLock.rightLeft();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		
		while (true);
	
	}
	
	
}
