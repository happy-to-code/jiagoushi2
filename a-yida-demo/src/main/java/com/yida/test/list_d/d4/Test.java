package com.yida.test.list_d.d4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/12 9:56
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        LocalDate startLocalDate = LocalDate.parse("2022-11-11", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate endLocalDate = LocalDate.parse("2023-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        while (!startLocalDate.isAfter(endLocalDate)) {
            LocalDate loopEndDate = startLocalDate.with(lastDayOfMonth());
            if (loopEndDate.isAfter(endLocalDate)) {
                loopEndDate = endLocalDate;
            }
            LocalDate finalStartLocalDate = startLocalDate;
            LocalDate finalLoopEndDate = loopEndDate;

            System.out.println("finalStartLocalDate = " + finalStartLocalDate);
            System.out.println("finalLoopEndDate = " + finalLoopEndDate);
            startLocalDate = startLocalDate.plusMonths(1).with(firstDayOfMonth());
        }

        System.out.println("--------------------------------------------------------" );
    }
}
