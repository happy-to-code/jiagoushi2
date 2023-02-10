package com.yida.test2.rand_1;

import cn.hutool.json.JSONUtil;

import java.util.*;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/12 14:28
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            System.out.println("random = " + random.nextInt(10000000));
        }

        List<Map<String,String>> list = new ArrayList<>();

        Map<String,String> map1 = new HashMap<>();
        map1.put("id","1");
        map1.put("name","2");
        map1.put("age","3");

        Map<String,String> map2 = new HashMap<>();
        map2.put("id","4");
        map2.put("name","5");
        map2.put("age","6");

        list.add(map1);
        list.add(map2);

        System.out.println("list = " + list);

        String s = JSONUtil.toJsonStr(list);
        System.out.println("s = " + s);
    }
}
