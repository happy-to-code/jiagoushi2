package com.yida.self.demo;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14 11:00
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        int i = 0;
        t.incr(i);
        i = i++;
        // i = i + 1;
        System.out.println("i = " + i);
    }

    private void incr(int i) {
        i++;
        System.out.println("func incr i = " + i);
    }
}
