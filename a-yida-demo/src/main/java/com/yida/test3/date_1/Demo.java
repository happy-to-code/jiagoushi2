package com.yida.test3.date_1;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Calendar;

/**
 * @author: zhangyifei
 * @version: 1.0
 * @since: 2023/3/28 14.sql:30
 */
public class Demo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int mouth = 1;
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, mouth - 1);

        System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + 1 + "\t " + cal.getTime());

        cal.add(Calendar.MONTH, -1);
        System.out.println(cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "\t " + cal.getTime());

        DateTime date = DateUtil.date(cal);
        System.out.println("date = " + date);
boolean b = true;
    }
}
