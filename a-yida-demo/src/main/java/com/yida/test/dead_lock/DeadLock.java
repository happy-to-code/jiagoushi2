package com.yida.test.dead_lock;

/**
 * @Auther: yida
 * @Date: 2022/11/28 21:26
 * @Description:
 */
public class DeadLock {
	private final Object left = new Object();
	private final Object right = new Object();
	
	public void leftRight() throws InterruptedException {
		synchronized (left) {
			Thread.sleep(2000);
			synchronized (right) {
				System.out.println("left right end");
			}
		}
	}
	
	public void rightLeft() throws InterruptedException {
		synchronized (right) {
			Thread.sleep(2000);
			synchronized (left) {
				System.out.println("left right end");
			}
		}
	}
}
