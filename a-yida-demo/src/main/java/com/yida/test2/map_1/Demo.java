package com.yida.test2.map_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/9 15:25
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i < 10; i++) {
            if (i%2==0){
                continue;
            }
            if (i%3==0){
               a = i+10;
               break;
            }
        }

        System.out.println("a = " + a);


        Map<String,Object> map = new HashMap<>(16);

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        // list= null;

        map.put("list",list);
        map.put("k1","k1");
        List<String> t = (List<String>) map.get("list");

        System.out.println("t = " + t);
    }
}
