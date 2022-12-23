package com.yida.test.serial;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;

import java.util.*;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 16:26
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String s = "{\n" +
                "    \"code\": 0,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"access_token\": \"559bfc3f-9602-4cfc-ad8b-dd8b467356f2\",\n" +
                "        \"expires_in\": 78497733\n" +
                "    },\n" +
                "    \"requestId\": \"edf41e55-40a4-492f-98a6-baa1ae2d9133\"\n" +
                "}";


        SellfoxTokenModel model = JSONUtil.toBean(s, SellfoxTokenModel.class);
        System.out.println("model = " + model);
        SellfoxData data = model.getData();
        System.out.println("data = " + data);

        // String nonce = String.valueOf(System.currentTimeMillis() - 10000000);
        // System.out.println("nonce = " + nonce);


        String nonce = UUID.randomUUID().toString().replace("-", "");

        System.out.println("nonce = " + nonce);

        long l = System.currentTimeMillis();
        System.out.println("l = " + l);

        String[] a = new String[2];
        a[0] = "aa";
        a[1] = "bb";
        System.out.println("a.toString() = " + a.toString());
        System.out.println("a.toString() = " + JSONUtil.toJsonStr(a));

        List<String> list = new ArrayList<>();
        list.add("cc");
        list.add("dd");
        System.out.println("list = " + list);
        System.out.println("JSONUtil.toJsonStr(list) = " + JSONUtil.toJsonStr(list));


        Map<String, String> paramsMap = new HashMap<>();
        paramsMap.put("adTypeCode", "sp");
        paramsMap.put("reportTypeCode", "adProductReport");
        paramsMap.put("reportStartDate", "2022-12-12");
        paramsMap.put("reportEndDate", "2022-12-13");
        paramsMap.put("shopIds", JSONUtil.toJsonStr(list));
        paramsMap.put("timeUnit", "daily");

        System.out.println("paramsMap = " + paramsMap);
        System.out.println("JSONUtil.toJsonStr(paramsMap) = " + JSONUtil.toJsonStr(paramsMap));


        String startDate = DateUtil.formatDate(DateUtil.offsetMonth(DateUtil.date(), -1));
        System.out.println("startDate = " + startDate);
    }
}
