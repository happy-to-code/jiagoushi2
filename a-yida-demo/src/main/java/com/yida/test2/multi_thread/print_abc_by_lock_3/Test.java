package com.yida.test2.multi_thread.print_abc_by_lock_3;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/31 17:51
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Print_ABC print_abc = new Print_ABC();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    print_abc.printA();
                }
            }
        },"线程1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    print_abc.printB();
                }
            }
        },"线程2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    print_abc.printC();
                }
            }
        },"线程3").start();
    }
}
