package com.yida.test.yys;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/22 16:04
 * @Version:
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        // array[129] is 1
        array[130] = array[129];
        // Set 2 to be 1
        array[131] = array[129];
        // Set 3 to be 1
        Integer a = 1;
        if (a == (Integer) 1 && a == (Integer) 2 && a == (Integer) 3) {
            System.out.println("Success");
        }


        BigDecimal decimal = new BigDecimal("12.11531231231");
        System.out.println(decimal.setScale(2, RoundingMode.HALF_UP));
    }
}

