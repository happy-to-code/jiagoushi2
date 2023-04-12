package com.yida.test3.list_1;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        String s = list.get(list.size() - 1);
        System.out.println("s = " + s);

        long l = System.currentTimeMillis();
        System.out.println("l = " + l);
        System.out.println("l = " + l / 1000);

        Map map = new HashMap<>(16);


        Calendar cal = Calendar.getInstance();
        int mouth = 11;
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, mouth);
        System.out.println("cal = " + cal);

        cal.add(Calendar.MONTH,-1);
        // 获取年
        int year = cal.get(Calendar.YEAR);
        // 获取月
        int month = cal.get(Calendar.MONTH);
        // 获取日
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.print(year + "年" + month + "月" + dayOfMonth + "日");




       /*  Date startTime;
        //处理日期 直接复制就可以用
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        //计算前一个月的日期
        calendar.add(Calendar.MONTH, -1);
        startTime = calendar.getTime();
        //计算后日期startTime 为 "2019-12-01 00:00:00" */
    }
}
