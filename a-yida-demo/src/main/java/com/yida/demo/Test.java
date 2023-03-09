package com.yida.demo;

import java.util.*;

/**
 * @Auther: yida
 * @Date: 2023/3/8 11:28
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		int[] list1 = new int[]{3,44,555};
		int[] list2 = new int[]{1,2,3};
		
		
		List<Integer>  list = new ArrayList<>(10);
		for (int i : list1) {
			list.add(i);
		}
		for (int i : list2) {
			list.add(i);
		}
		
		// Collections.sort(list);
		System.out.println("list = " + list);
		System.out.println("list = " + list);
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("list = " + list);
		
	}
}
