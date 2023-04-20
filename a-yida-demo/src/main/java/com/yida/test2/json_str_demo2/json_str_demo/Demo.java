package com.yida.test2.json_str_demo2.json_str_demo;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/16 14.sql:08
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<Boy> boys = new ArrayList<>();
        boys.add(new Boy("xm", 10, Arrays.asList(1, 2, 3)));
        boys.add(new Boy("HH", 11, Arrays.asList(11, 22, 33)));

        String boyJsonStr = JSONUtil.toJsonStr(boys);
        System.out.println("boyJsonStr = " + boyJsonStr);
        System.out.println("---------------------1----------------------");
        List<Boy2> boy2s = JSONUtil.toList(boyJsonStr, Boy2.class);
        System.out.println("boy2s = " + boy2s);

        for (Boy2 boy2 : boy2s) {
            System.out.println("boy2 = " + boy2);
            System.out.println("boy2 = " + boy2.getIds());
        }


    }
}

class Boy2 {
    private String name;
    private Integer age;

    private String ids;

    @Override
    public String toString() {
        return new StringJoiner(", ", Boy2.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("ids='" + ids + "'")
                .toString();
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

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}

class Boy {
    private String name;
    private Integer age;

    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Boy(String name, Integer age, List<Integer> ids) {
        this.name = name;
        this.age = age;
        this.ids = ids;
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

    @Override
    public String toString() {
        return new StringJoiner(", ", Boy.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("age=" + age).add("ids=" + ids).toString();
    }
}
