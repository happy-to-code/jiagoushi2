package com.yida.self.list_demo.demo3;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/10 9:47
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(10);
        list.add(new Person(" xm", 1));
        list.add(new Person("hh", 2));
        list.add(new Person("ks", 3));
        list.add(new Person("li ", 4));
        list.add(new Person(" ", 4));
        System.out.println("list = " + list);
        list.stream().filter(item -> StrUtil.isNotBlank(item.getName().trim())).forEach(item -> {
            item.setName("aa" + item.getName().trim());
        });
        System.out.println("after deal list = " + list);

        // list.stream().forEach(item -> {
        //     item.setName(item.getName().trim());
        // });
        // list = list.stream().filter(item -> StrUtil.isNotBlank(item.getName().trim())).collect(Collectors.toList());
        //
        // System.out.println("list = " + list);
        // List<String> names = list.parallelStream().map(item -> item.getName()).collect(Collectors.toList());
        // System.out.println("names = " + names);
        // names.forEach(name -> System.out.println("name = " + name));
    }
}

@Data
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}
