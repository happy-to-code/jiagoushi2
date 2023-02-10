package com.yida.test2.json_str_test;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/15 10:17
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("http://127.0.0.1/url1/download1");
        list.add("http://127.0.0.1/url2/download2");
        list.add("http://127.0.0.1/url3/download3");

        String s = JSONUtil.toJsonStr(list);
        System.out.println("s = " + s);
        List<String> list2 = JSONUtil.toList(s, String.class);
        System.out.println("list2 = " + list2);


        List<String> list3 = JSONUtil.toList(JSONUtil.parseArray(s), String.class);
        System.out.println("list3 = " + list3);


        Objects ss = null;
        System.out.println("ss.toString() = " + ss.toString());
    }
}
