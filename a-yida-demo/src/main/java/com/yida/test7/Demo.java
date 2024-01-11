package com.yida.test7;

import cn.hutool.core.util.StrUtil;

import java.time.LocalDateTime;

/**
 * @author zhangyifei
 * @Date 2024/1/9 14:33
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String orderDeadlineStr = StrUtil.removeAll("6个月", "个月");
        System.out.println("orderDeadlineStr = " + orderDeadlineStr);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime beforeDay = now.plusDays(-1);
        System.out.println("beforeDay = " + beforeDay);

        System.out.println("now = " + now.isAfter(beforeDay));

        System.out.println("============================");
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
