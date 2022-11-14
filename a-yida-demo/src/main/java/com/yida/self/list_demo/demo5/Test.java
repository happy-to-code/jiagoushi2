package com.yida.self.list_demo.demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/10 15:26
 * @Version:
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        long t1 = System.currentTimeMillis();
        List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        long t2 = System.currentTimeMillis();
        out.println(t2 - t1);
        List<Integer> collect1 = numbers.parallelStream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        long t3 = System.currentTimeMillis();
        out.println(t3 - t2);

    }
}
