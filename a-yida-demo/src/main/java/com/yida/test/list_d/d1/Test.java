package com.yida.test.list_d.d1;

import cn.hutool.core.date.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/5 10:17
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        // List<Object> objects = Collections.singletonList("123");
        // System.out.println("objects = " + objects);
        // objects.add("!");
        // System.out.println("objects = " + objects);

        System.out.println(DateUtil.format(DateUtil.yesterday(), DatePattern.NORM_DATE_PATTERN));
        BigDecimal skuIn24DeliveryRate = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(20), 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        System.out.println("skuIn24DeliveryRate = " + skuIn24DeliveryRate);
        String format = String.format("%s(%s%%)", 10, skuIn24DeliveryRate);
        System.out.println("format = " + format);


        DateTimeFormatter DTF_YMD = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime lastDay = LocalDateTime.now();
        String format1 = lastDay.format(DTF_YMD);
        System.out.println("format1 = " + format1);
        System.out.println("lastDay = " + lastDay);

        String purchaseDate = "2020-12-26 00:00:00";
        String storageDate = "2020-12-26 00:10:00";

        DateTime start = DateUtil.parse(purchaseDate);
        DateTime end = DateUtil.parse(storageDate);
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        long s1 = start.getTime();
        long e1 = end.getTime();
        System.out.println("e1 = " + e1);


        System.out.println("e1-s1 = " + (e1-s1)/1000/3600/24);

        // 相差毫秒数
        long millis = DateUtil.between(start, end, DateUnit.MS);
        // 相差1天(天)
        String formatDay = DateUtil.formatBetween(millis, BetweenFormater.Level.DAY);
        System.out.println("formatDay = " + formatDay);


        // DateUtil.to

        // long l = DateUtil.betweenDay(start, end, false);
        // System.out.println("l = " + l);


        // LocalDate date = LocalDate.parse(storageDate);
        // System.out.println(date);
        // LocalDateTime dateTime = date.atTime(LocalTime.now());
        // System.out.println(dateTime.getNano());

    }
}
