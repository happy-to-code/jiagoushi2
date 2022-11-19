package com.yida.test;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.Map;

/**
 * @Auther: yida
 * @Date: 2022/11/14 21:58
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		String s = "{\n" + "    \"code\": 1,\n" + "    \"data\": [\n" + "        {\n" + "            \"msg\": \"shipment sealed successfully\",\n" + "            \"items\": [\n" + "                {\n" + "                    \"consignment_id\": \"EWEUE2211000002YQ\",\n" + "                    \"pdf_url\": \"https://jerrytest.ewe.com.au/eweApi/ewe/aupost/v2/printSingleLabel?labelCode=gjP0Vvjdkt8CKutZ7x0vwIHLb8CiUt+rvQixev0/i0M=\"\n" + "                }\n" + "            ],\n" + "            \"sender_references\": \"sak-test-002\",\n" + "            \"isSuccess\": true\n" + "        }\n" + "    ]\n" + "}";

//		String s1 = JSONUtil.toJsonStr(s);
//		System.out.println("s1 = " + s1);
//		JSONArray objects = JSONUtil.parseArray(s1);
//		System.out.println("objects = " + objects);
//		List<Map> maps = JSONUtil.toList(objects, Map.class);
//		System.out.println("maps = " + maps);
//		JSONObject jsonObject = JSONUtil.parseObj(s);
//		System.out.println("jsonObject = " + jsonObject);
//		System.out.println("--------------");
		Temp temp = JSONUtil.toBean(s, Temp.class);
		System.out.println("temp = " + temp);
	}
}
