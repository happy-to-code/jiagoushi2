package com.yida.test.date_d;

import cn.hutool.core.date.DateUtil;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/15 22:57
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        long purchaseTime = DateUtil.parse("2022-11-12").getTime() / 1000;
        long storageTime = DateUtil.parse("2022-11-15").getTime() / 1000;
        long day = (storageTime - purchaseTime) / 3600 / 24;
        System.out.println("day = " + day);
    }
}
