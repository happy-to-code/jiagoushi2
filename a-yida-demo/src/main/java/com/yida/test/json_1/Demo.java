package com.yida.test.json_1;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/14.sql 19:17
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String s = "[{\"msg\":\"shipment sealed successfully\",\"items\":[{\"consignment_id\":\"EWEUE2211000002YQ\",\"pdf_url\":\"https://jerrytest.ewe.com.au/eweApi/ewe/aupost/v2/printSingleLabel?labelCode=gjP0Vvjdkt8CKutZ7x0vwIHLb8CiUt%2BrvQixev0%2Fi0M=\"}],\"sender_references\":\"sak-test-002\",\"isSuccess\":true}]";
        System.out.println(JSONUtil.isJson(s));
        System.out.println(JSONUtil.isJsonArray(s));

        JSONObject jsonObject = null;
        if (JSONUtil.isJsonArray(s)) {
            JSONArray objects = JSONUtil.parseArray(s);
            System.out.println("objects = " + objects);
            Object o = objects.get(0);
            jsonObject = JSONUtil.parseObj(o);
        } else if (JSONUtil.isJson(s)) {
            jsonObject = JSONUtil.parseObj(s);
        } else {
            System.out.println("------------");
        }


        EweData eweData = JSONUtil.toBean(jsonObject.toString(), EweData.class);
        System.out.println("eweData = " + eweData);

    }
}

@Data
class EweData {
    private String msg;
    private String sender_references;
    private Boolean isSuccess;
    private List<Item> items;
}

@Data
class Item {
    private String consignment_id;
    private String pdf_url;
}