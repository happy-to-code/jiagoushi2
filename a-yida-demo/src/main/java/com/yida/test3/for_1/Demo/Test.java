package com.yida.test3.for_1.Demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @Auther: yida
 * @Date: 2023/3/3 20:52
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach(item -> {
			if (item == 2) {
				return;
			}
		});
		
		Set set = new HashSet<>();
		
		set.add(1);
	}
}
