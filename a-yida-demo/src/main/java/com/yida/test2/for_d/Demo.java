package com.yida.test2.for_d;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/9 14:09
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            try {
                double div = div(i, i);
                if (div != 0) {
                    return;
                }
                System.out.println("div = " + div);
            } catch (Exception e) {
                System.out.println("---->" + e.getMessage());
            }
        }
    }


    public static double div(int a, int b) {
        if (b % 3 == 0) {
            throw new RuntimeException(b + " is zero");
        }

        return a / b;
    }
}
