package com.yida.test2.date_util_test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/29 17:27
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String dateStr = "2023-11";
        String format = "yyyy-MM";

        DateTime time = DateUtil.parse(dateStr, format);
        System.out.println("time = " + time);

        System.out.println("isLegalDate(format.length(),dateStr) = " + isLegalDate(format.length(), dateStr, format));
    }

    /**
     * 根据时间 和时间格式 校验是否正确
     *
     * @param length 校验的长度
     * @param sDate  校验的日期
     * @param format 校验的格式
     * @return
     */
    public static boolean isLegalDate(int length, String sDate, String format) {
        int legalLen = length;
        if ((sDate == null) || (sDate.length() != legalLen)) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(sDate);
            return sDate.equals(formatter.format(date));
        } catch (Exception e) {
            return false;
        }
    }
}
