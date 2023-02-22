package com.yida.test3.multi_thread.print_abc;

import lombok.SneakyThrows;

/**
 * @Auther: yida
 * @Date: 2023/2/22 13:32
 * @Description:
 */
public class Test {
	/* public static void main(String[] args) {
		PrintABC printABC = new PrintABC();
		
		new Thread(() -> {
			try {
				printABC.printA();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "A").start();
		new Thread(() -> {
			try {
				printABC.printB();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "B").start();
		new Thread(new Runnable() {
			@SneakyThrows
			@Override
			public void run() {
				printABC.printC();
			}
		}, "C").start();
	} */
	
	
	public static void main(String[] args) {
		PrintABC printABC = new PrintABC();
		
		new Thread(() -> {
			try {
				for (int i = 0; i < 3; i++) {
					printABC.printA();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "A").start();
		new Thread(() -> {
			try {
				for (int i = 0; i < 3; i++) {
					printABC.printB();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "B").start();
		new Thread(new Runnable() {
			@SneakyThrows
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					printABC.printC();
				}
			}
		}, "C").start();
	}
	
}
