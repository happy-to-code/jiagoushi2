package com.yida.test3.transaction_1;

import cn.hutool.core.date.DateUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: yida
 * @Date: 2023/5/16 10:32
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setAge(1);
		dog.setName("xw");
		dog.setCreateTime(LocalDateTime.now());
		dog.setUpdateTime(LocalDateTime.now());
		System.out.println("dog = " + dog);
		
		System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
		
		
		String format = DateUtil.format(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss");
		System.out.println("format = " + format);
		
		
		String path3 = System.getProperty("user.dir");
		System.out.println("path3 = " + path3);
		
		// System.getProperty("os.name").toLowerCase().contains("windows")
		String s = System.getProperty("os.name").toLowerCase();
		System.out.println("s = " + s);
		
		
		String s1 = UUID.randomUUID().toString().replaceAll("-","");
		System.out.println("s1 = " + s1);
		
		System.out.println("LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"yyyy-MM-dd HH:mmss\")) = " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		List<String> list = Arrays.asList("a","bb","c","d");
		System.out.println("list = " + list);
		System.out.println(list.subList(0,3));
	}
}
