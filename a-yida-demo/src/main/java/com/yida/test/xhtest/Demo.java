package com.yida.test.xhtest;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Auther: yida
 * @Date: 2022/12/12 23:19
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		Integer size = 1000000;
		List<Integer> list1 = new ArrayList<>(size);
		
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		List<Integer> list4 = new ArrayList<>();
		List<Integer> list5 = new ArrayList<>();
		List<Integer> list6 = new ArrayList<>();
		List<Integer> list7 = new CopyOnWriteArrayList<>();
		
		long l1 = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list1.add(i);
		}
		long l2 = System.currentTimeMillis();
		System.out.println("add item:" + (l2 - l1));
		System.out.println();
		
		long l3 = System.currentTimeMillis();
		for (int i = 0; i < list1.size(); i++) {
			list2.add(list1.get(i));
		}
		long l4 = System.currentTimeMillis();
		System.out.println("for:" + (l4 - l3) + "\t" + list2.size());
		
		for (Integer integer : list1) {
			list3.add(integer);
		}
		long l5 = System.currentTimeMillis();
		System.out.println("for zq:" + (l5 - l4) + "\t" + list3.size());
		
		list1.forEach(i -> {
			list4.add(i);
		});
		long l6 = System.currentTimeMillis();
		System.out.println("for each:" + (l6 - l5) + "\t" + list4.size());
		
		Iterator<Integer> iterator = list1.iterator();
		while (iterator.hasNext()) {
			list5.add(iterator.next());
		}
		long l7 = System.currentTimeMillis();
		System.out.println("iterator:" + (l7 - l6) + "\t" + list5.size());
		
		list1.stream().forEach(item -> {
			list6.add(item);
		});
		long l8 = System.currentTimeMillis();
		System.out.println("stream:" + (l8 - l7) + "\t" + list6.size());
		
		list1.parallelStream().forEach(item -> {
			list7.add(item);
		});
		long l9 = System.currentTimeMillis();
		System.out.println("parallelStream:" + (l9 - l8) + "\t" + list7.size());
		
	}
}
