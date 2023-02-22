package com.yida.test3.multi_thread.print_abc3;

/**
 * @Auther: yida
 * @Date: 2023/2/22 14:11
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		PrintAbc_3 print = new PrintAbc_3();
		
		new Thread(()->{
			print.printA();
		},"A").start();
		
		new Thread(()->{
			print.printB();
		},"B").start();
		
		new Thread(()->{
			print.printC();
		},"C").start();
	}
}
