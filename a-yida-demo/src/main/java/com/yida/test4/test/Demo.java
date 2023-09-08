package com.yida.test4.test;

import cn.hutool.core.util.ObjUtil;
import com.yida.util.HttpUtil;

/**
 * @author zhangyifei
 * @Date 2023/8/28 15:41
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Integer i = 10;
        // System.out.println("(i==10 = " + (i==10));
        // System.out.println("(i==10 = " + (i.equals(10)));

        boolean equals = ObjUtil.equals(i, 10);
        System.out.println("equals = " + equals);

        //   random number
        for (int j = 0; j < 100; j++) {
            int i1 = (int) (Math.random() * 100);
            System.out.println("i1 = " + i1);
        }
        int i1 = (int) (Math.random() * 100);
        System.out.println("i1 = " + i1);

        // 1000以内的随机数  循环打印10次
        for (int j = 0; j < 10; j++) {
            int i2 = (int) (Math.random() * 1000);
            System.out.println("i2 = " + i2);
        }
        //  冒泡算法
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        System.out.println(arr);


    }
}
