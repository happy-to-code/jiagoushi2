package com.yida.test3.test6;


import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: yida
 * @Date: 2023/5/18 16:14
 * @Description:
 */
public class Demo {
	public static void main(String[] args) throws Exception {
		List<Dog> list = new ArrayList<>();
		list.add(new Dog("xm",412));
		list.add(new Dog("xb",122));
		list.add(new Dog("xb",112));
		list.add(new Dog("sdf",4152));
		list.add(new Dog("xm",127));
		System.out.println("list = " + list);
		
		List<String> collect = list.stream().map(i -> i.getName()).collect(Collectors.toList());
		System.out.println("collect = " + collect);
		List<String> collect1 = list.stream().map(i -> i.getName()).distinct().collect(Collectors.toList());
		System.out.println("collect1 = " + collect1);
	}
	
	
}
