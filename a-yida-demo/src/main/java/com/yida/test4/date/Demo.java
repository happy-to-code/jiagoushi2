package com.yida.test4.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

import java.util.Calendar;

/**
 * @author zhangyifei
 * @Date 2023/7/14 13:20
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String now = DateUtil.now();
        System.out.println("now = " + now);
        DateTime date = DateUtil.date();
        System.out.println("date = " + date);

        int year = DateUtil.year(date);
        System.out.println("year = " + year);
        int month = DateUtil.month(date);
        System.out.println("month = " + month);
        Month month1 = DateUtil.monthEnum(date);
        System.out.println("month1 = " + month1);
        int i2 = DateUtil.dayOfMonth(date);
        System.out.println("i2 = " + i2);


        int hour = date.hour(true);
        System.out.println("hour = " + hour);
        int minute = date.minute();
        System.out.println("minute = " + minute);
        int seconds = date.getSeconds();
        System.out.println("seconds = " + seconds);
        // System.out.println("--------------------------------------------");
        // Calendar instance = Calendar.getInstance();
        // System.out.println("instance = " + instance);
        // int i = instance.get(Calendar.YEAR);
        // System.out.println("i = " + i);
        // int i1 = instance.get(Calendar.MONTH);
        // System.out.println("i1 = " + i1);


    }
}
