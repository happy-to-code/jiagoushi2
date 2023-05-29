package com.yida.test3.demo1;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: yida
 * @Date: 2023/2/22 15:31
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);
        new Demo().func1(a);
        System.out.println("a = " + a);

        List<String> list = new ArrayList();

        System.out.println("list = " + list);

    }


    private void func1(int a) {
        System.out.println("func1 a 1= " + a);
        a = 20;
        System.out.println("func1 a 2= " + a);
    }
}
