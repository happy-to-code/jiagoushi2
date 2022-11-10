package com.yida.self.list_demo.demo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LocalDate begin = LocalDate.now();
        LocalDate end = begin.plusDays(10);
        System.out.println("begin = " + begin);
        System.out.println("end = " + end);

        List<LocalDate> middleDate = getMiddleDate(begin, end);
        System.out.println("middleDate = " + middleDate);
    }

    public static List<LocalDate> getMiddleDate(LocalDate begin, LocalDate end) {
        List<LocalDate> localDateList = new ArrayList<>();
        long length = end.toEpochDay() - begin.toEpochDay();
        for (long i = length; i >= 0; i--) {
            localDateList.add(end.minusDays(i));
        }
        return localDateList;
    }
}
