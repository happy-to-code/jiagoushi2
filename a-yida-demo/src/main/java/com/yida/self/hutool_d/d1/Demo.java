package com.yida.self.hutool_d.d1;

import cn.hutool.core.convert.Convert;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/24 16:13
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        int a = 1;
        // aStr为"1"
        String aStr = Convert.toStr(a);
        System.out.println("aStr = " + aStr);

        long[] b = {1, 2, 3, 4, 5};
        // bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);
        System.out.println("bStr = " + bStr);
    }
}
