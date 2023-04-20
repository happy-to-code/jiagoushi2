package com.yida.test.d3;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/17 14.sql:39
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 3;
        a[3] = 4;
        a[4] = 0;
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
