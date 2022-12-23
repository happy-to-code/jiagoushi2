package com.yida.test.list_d.d2;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/8 16:15
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        final DateTimeFormatter DF_YMD = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String startDate = "2022-12-01";
        String endDate = "2023-01-28";
        LocalDate startLocalDate = LocalDate.parse(startDate, DF_YMD);
        LocalDate endLocalDate = LocalDate.parse(endDate, DF_YMD);


        List<Rq> list = new ArrayList<>();
        while (endLocalDate.isAfter(startLocalDate)) {
            LocalDate lastDayOfMonth = startLocalDate.with(lastDayOfMonth());
            if (endLocalDate.getYear() == startLocalDate.getYear() && endLocalDate.getMonth() == startLocalDate.getMonth()){
                lastDayOfMonth = endLocalDate;
            }

            Rq rq = new Rq();
            rq.setStartDate(startLocalDate.format(DF_YMD));
            rq.setEndDate(lastDayOfMonth.format(DF_YMD));
            list.add(rq);

            startLocalDate = lastDayOfMonth.plusDays(1);
        }

        System.out.println(list);

        Map<String, String> mouthList = getMouthList(startDate, endDate);
        for (String k : mouthList.keySet()) {
            System.out.println("k = " + k +"   "+ mouthList.get(k));
        }

    }

    public static Map<String,String> getMouthList(String startTime, String endTime){
        DateTimeFormatter DF_YMD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startLocalDate = LocalDate.parse(startTime, DF_YMD);
        LocalDate endLocalDate = LocalDate.parse(endTime, DF_YMD);

        Map<String,String> map = new HashMap<>();
        while (endLocalDate.isAfter(startLocalDate)) {
            LocalDate lastDayOfMonth = startLocalDate.with(lastDayOfMonth());
            if (endLocalDate.getYear() == startLocalDate.getYear() && endLocalDate.getMonth() == startLocalDate.getMonth()){
                lastDayOfMonth = endLocalDate;
            }

            map.put(startLocalDate.format(DF_YMD),lastDayOfMonth.format(DF_YMD));

            startLocalDate = lastDayOfMonth.plusDays(1);
        }
        return map;
    }

    public static List<String> getDayList(String startTime, String endTime) {
        List<String> dayList = new ArrayList<>();
        if (StrUtil.isBlank(startTime) || StrUtil.isBlank(endTime)) {
            return dayList;
        }
        if (startTime.length() > 10) {
            startTime = startTime.substring(0, 10);
        }
        if (endTime.length() > 10) {
            endTime = endTime.substring(0, 10);
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startTime, df);
        LocalDate endDate = LocalDate.parse(endTime, df);
        while (!startDate.isAfter(endDate)) {
            dayList.add(startDate.format(df));
            startDate = startDate.plusDays(1);
        }
        return dayList;
    }


    @Data
    static
    class Rq {
        private String startDate;
        private String endDate;

        public Rq() {
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Rq.class.getSimpleName() + "[", "]")
                    .add("startDate='" + startDate + "'")
                    .add("endDate='" + endDate + "'")
                    .toString();
        }
    }
}
