package com.yida.test4.date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

/**
 * @author zhangyifei
 * @Date 2023/7/14 13:56
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        DateTime date = DateUtil.date();
        DateTime dateTime = date.setField(5, 15);
        System.out.println("dateTime = " + dateTime);

        System.out.println("======================================");
        DateTime date1 = DateUtil.date();
        System.out.println("date1 = " + date1);

        int compare = DateUtil.compare(dateTime, date1);
        System.out.println("compare = " + compare);

        String s = DateUtil.formatDate(dateTime);
        String s2 = DateUtil.formatDate(date1);
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);


        System.out.println("dateTime = " + dateTime);
        System.out.println("date1 = " + date1);
    }


}
