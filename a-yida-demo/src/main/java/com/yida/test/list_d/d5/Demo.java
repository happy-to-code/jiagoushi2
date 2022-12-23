package com.yida.test.list_d.d5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/19 10:45
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // list = null;
        // System.out.println("new LinkedHashSet<>(list) = " + new LinkedHashSet<>(list));

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        System.out.println("list = " + list);
        HashSet<String> strings = new HashSet<>(list);
        System.out.println("strings = " + strings);

        BigDecimal revenueZbDecimal = new BigDecimal("25").divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("revenueZbDecimal.toPlainString() = " + revenueZbDecimal.toPlainString());
        System.out.println("revenueZbDecimal.toString() = " + revenueZbDecimal.toString());
    }
}
