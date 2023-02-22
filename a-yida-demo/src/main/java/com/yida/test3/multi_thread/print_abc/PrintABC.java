package com.yida.test3.multi_thread.print_abc;

/**
 * @Auther: yida
 * @Date: 2023/2/22 13:28
 * @Description:
 */
public class PrintABC {
	private volatile int value = 1;
	
	public void printA() throws InterruptedException {
		synchronized (this) {
			while (value != 1) {
				wait();
			}
			System.out.println("A");
			value = 2;
			notifyAll();
		}
	}
	
	public void printB() throws InterruptedException {
		synchronized (this) {
			while (value != 2) {
				wait();
			}
			System.out.println("B");
			value = 3;
			notifyAll();
		}
	}
	
	public void printC() throws InterruptedException {
		synchronized (this) {
			while (value != 3) {
				wait();
			}
			System.out.println("C");
			value = 1;
			notifyAll();
		}
	}
}
