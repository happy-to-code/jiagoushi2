package com.yida.test2.json_str_demo;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        boys.add(new Boy("xm",10));
        boys.add(new Boy("HH",11));

        String boyJsonStr = JSONUtil.toJsonStr(boys);
        System.out.println("boyJsonStr = " + boyJsonStr);
        System.out.println("---------------------1----------------------");
        JSONArray objects1 = JSONUtil.parseArray(boyJsonStr);
        System.out.println("objects1 = " + objects1);
        System.out.println("objects1.size() = " + objects1.size());
        Object o1 = objects1.get(0);
        System.out.println("o1 = " + o1);
        JSONObject entries = JSONUtil.parseObj(o1);
        System.out.println("entries = " + entries);
        // entries.


        Map<String,Object> m = (Map<String,Object>) o1;
        System.out.println("m = " + m);
        Object name = m.get("name");
        System.out.println("name = " + name);


        System.out.println("----------------------2---------------------");


        // JSONUtil.toJsonStr(spAdProductReportList)
        List<Boy> boyList = JSONUtil.toList(JSONUtil.parseArray(boyJsonStr), Boy.class);
        System.out.println("boyList = " + boyList);


        JSONArray objects = JSONUtil.parseArray(boyJsonStr);
        System.out.println("objects = " + objects);
        Object[] array = objects.stream().toArray();
        for (Object o : array) {
            System.out.println("o = " + o);
        }

    }
}

class  Boy {
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return new StringJoiner(", ", Boy.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
