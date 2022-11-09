package com.yida.self.list_demo;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Boy> boys = new ArrayList<>(10);
        boys.add(new Boy("xm", 10));
//        boys.add(new Boy("xm", 20));
        boys.add(new Boy("xh", 11));
        boys.add(new Boy("xz", 13));
        boys.add(new Boy("xn", 18));
        boys.add(new Boy("xv", 18));

        List<String> names = boys.stream().map(Boy::getName).collect(Collectors.toList());
        System.out.println("names = " + names);
        Set<String> namesSet = boys.stream().map(Boy::getName).collect(Collectors.toSet());
        System.out.println("namesSet = " + namesSet);


        LinkedHashMap<String, List<Boy>> collect = boys.stream().collect(Collectors.groupingBy(Boy::getName, LinkedHashMap::new, Collectors.toList()));
        System.out.println("collect = " + collect);

        List<List<Boy>> lists = Lists.partition(boys, 2);
        System.out.println("lists = " + lists);


        ArrayList<String> strings = CollUtil.newArrayList(String.valueOf(1));
        System.out.println("strings = " + strings);

        List<Boy> xmList = boys.stream().filter(a -> "xm" == a.getName()).collect(Collectors.toList());
        System.out.println("xmList = " + xmList);
        System.out.println("----------------------------------------------------------------------------------");
        LocalDateTime now = LocalDateTime.now(ZoneId.systemDefault());
        System.out.println("now = " + now);
        LocalDateTime createStartTime = now.minusMinutes(35L);
        System.out.println("createStartTime = " + createStartTime);
        System.out.println("创建开始时间:" + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(createStartTime));
        System.out.println("创建结束时间:" + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now));
        System.out.println("===================================================================================");
        Boy b = new Boy("aha", 3);
        System.out.println(Objects.isNull(b));
        System.out.println("=====================");
        List<String> list =Arrays.asList("a","a","b","c","c");
        System.out.println("list = " + list);

        Map<String, Boy> collect1 = boys.stream().collect(Collectors.toMap(item -> item.getName().toLowerCase(), Function.identity()));
        System.out.println("collect1 = " + collect1);

    }
}

class Boy {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Boy{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public Boy(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}