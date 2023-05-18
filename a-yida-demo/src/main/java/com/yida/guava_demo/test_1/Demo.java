package com.yida.guava_demo.test_1;

import com.google.common.collect.*;

import java.util.Date;

/**
 * @Auther: yida
 * @Date: 2023/5/9 17:05
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		Multimap<String, Integer> map = ArrayListMultimap.create();
		map.put("aa", 1);
		map.put("aa", 2);
		map.put("aa", 3);
		System.out.println(map.get("aa"));
		
		
		long l = System.currentTimeMillis()/1000;
		System.out.println("l = " + l);
		Date date = new Date(l + 120);
		System.out.println("date = " + date);
		System.out.println("date = " + date.getTime());
	}
}
