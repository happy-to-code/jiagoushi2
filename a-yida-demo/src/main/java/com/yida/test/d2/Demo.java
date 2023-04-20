package com.yida.test.d2;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/17 14.sql:39
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println("now = " + now);


        // "摩羯座"
        String zodiac = DateUtil.getZodiac(Month.FEBRUARY.getValue(), 14);
        System.out.println("zodiac = " + zodiac);

        // "狗"
        String chineseZodiac = DateUtil.getChineseZodiac(1990);
        System.out.println("chineseZodiac = " + chineseZodiac);
        System.out.println("DateUtil.ageOfNow(\"1990-01-30\") = " + DateUtil.ageOfNow("1990-02-17"));
    }
}
