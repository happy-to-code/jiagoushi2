package com.yida.test2.date_1;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/10 17:52
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String now = DateUtil.now();
        Date date = DateUtil.parse(now);

        Date newDate = DateUtil.offset(date, DateField.DAY_OF_MONTH, 2);

        DateTime newDate2 = DateUtil.offsetDay(date, -1);
        System.out.println("newDate2 = " + newDate2);


        DateTime dateTime = DateUtil.offsetDay(new Date(), -1);

        System.out.println("dateTime = " + dateTime);
        String format = DateUtil.format(dateTime, DatePattern.NORM_DATE_FORMATTER);
        System.out.println("format = " + format);
        System.out.println("-------------------------------------------------------------");
        DateTime lastMonth = DateUtil.offsetMonth(new Date(), -1);
        System.out.println("lastMonth = " + lastMonth);

        // 获取当前日期
        DateTime now2 = DateUtil.date();
        DateTime lastMonth2 = DateUtil.offsetMonth(now2, -1);

        String currentTimeStr = DateUtil.format(now2, DatePattern.NORM_DATE_PATTERN);
        System.out.println("currentTimeStr = " + currentTimeStr);
        String lastMonthTimeStr = DateUtil.format(lastMonth2, DatePattern.NORM_DATE_PATTERN);
        System.out.println("lastMonthTimeStr = " + lastMonthTimeStr);
    }
}
