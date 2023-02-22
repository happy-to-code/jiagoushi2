package com.yida.test3.multi_thread.print_abc2;

/**
 * @Auther: yida
 * @Date: 2023/2/22 13:52
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		PrintABC_Lock printABC_lock = new PrintABC_Lock();
		
		new Thread(() -> {
			printABC_lock.printA();
		}, "Thread_A").start();
		new Thread(() -> {
			printABC_lock.printB();
		}, "Thread_B").start();
		new Thread(() -> {
			printABC_lock.printC();
		}, "Thread_C").start();
	}
}
