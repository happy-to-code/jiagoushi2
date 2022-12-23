package com.yida.test;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
// 		Temp temp = JSONUtil.toBean(s, Temp.class);
// 		System.out.println("temp = " + temp);


        DateTimeFormatter DTF_YMD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime lastDay = LocalDateTime.now().minusDays(1);
        System.out.println("lastDay = " + lastDay);
        LocalDateTime last30Date = lastDay.minusDays(30);
        String startDate = last30Date.format(DTF_YMD);
        System.out.println("startDate = " + startDate);
        String endDate = lastDay.format(DTF_YMD);
        System.out.println("endDate = " + endDate);

        System.out.println("----");
        endDate = DateUtil.format(DateUtil.yesterday(), DatePattern.NORM_DATE_PATTERN);
        // startDate = DateUtil.format(DateUtil.offset(DateUtil.yesterday(), DateField.DAY_OF_MONTH, -15), DatePattern.NORM_DATE_PATTERN);
        startDate = endDate;
        System.out.println("endDate = " + endDate);
        System.out.println("startDate = " + startDate);

        List<String> dayList = getDayList(startDate, endDate);
        System.out.println("dayList = " + dayList);
    }

    public static List<String> getDayList(String startTime, String endTime) {
        List<String> dayList = new ArrayList<>();
        if(StrUtil.isBlank(startTime) || StrUtil.isBlank(endTime)) {
            return dayList;
        }
        if(startTime.length() > 10) {
            startTime = startTime.substring(0, 10);
        }
        if(endTime.length() > 10) {
            endTime = endTime.substring(0, 10);
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startTime, df);
        LocalDate endDate = LocalDate.parse(endTime, df);
        while (!startDate.isAfter(endDate)) {
            dayList.add(startDate.format(df));
            startDate = startDate.plusDays(1);
        }
        return dayList;
    }
}
