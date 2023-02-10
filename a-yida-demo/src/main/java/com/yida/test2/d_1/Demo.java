package com.yida.test2.d_1;

import java.util.Date;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/2 17:55
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println(new Date());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i = " + i);
        }
        System.out.println(new Date());
    }
}
