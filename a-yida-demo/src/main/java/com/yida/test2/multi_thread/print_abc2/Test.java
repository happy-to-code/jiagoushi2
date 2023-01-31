package com.yida.test2.multi_thread.print_abc2;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/31 17:36
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        PrintABC printABC = new PrintABC();


        new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    printABC.printA();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "线程一").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    printABC.printB();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "线程二").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 3; i++) {
                    printABC.printC();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "线程三").start();
    }
}
