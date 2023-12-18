package com.yida.test5.map_json;

import cn.hutool.json.JSONUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyifei
 * @Date 2023/9/13 14:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>(16);
        map.put("method", "checkRegInfo");
        map.put("creditCode", "123cdsdf");

        System.out.println("map = " + map);
        String s = JSONUtil.toJsonStr(map);
        System.out.println("s = " + s);

    }
}
