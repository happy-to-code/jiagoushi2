package com.yida.test2.stream_test_1.test_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Type: FlatMapTest.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/2/1 9:21
 * @Version:
 */
public class FlatMapTest {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();

        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("d", "a");
        List<String> list3 = Arrays.asList("f", "e");

        lists.add(list1);
        lists.add(list2);
        lists.add(list3);

        // distinct() 去重
        List<String> collect = lists.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
