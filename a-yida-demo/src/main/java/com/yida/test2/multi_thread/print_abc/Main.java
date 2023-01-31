package com.yida.test2.multi_thread.print_abc;

import lombok.SneakyThrows;

class PrintABC {
    private volatile int value = 1;

    void printA() throws InterruptedException {
        synchronized (this) {
            while (value != 1) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": A");
            value = 2;
            notifyAll();
        }

    }

    void printB() throws InterruptedException {
        synchronized (this) {
            while (value != 2) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": B");
            value = 3;
            notifyAll();
        }
    }

    void printC() throws InterruptedException {
        synchronized (this) {
            while (value != 3) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + ": C");
            value = 1;
            notifyAll();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintABC printABC = new PrintABC();
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printA();
                }
            }
        }, "线程一").start();

        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printB();
                }
            }
        }, "线程二").start();

        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printC();
                }
            }
        }, "线程三").start();
    }
}
