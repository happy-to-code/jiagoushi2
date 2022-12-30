package com.yida.test.topk;

import java.util.*;

/**
 * @Auther: yida
 * @Date: 2022/12/27 22:23
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10000000);
		
		for (int i = 0; i < 10000000; i++) {
			list.add(new Random(System.currentTimeMillis()).nextInt(100000));
		}
		long start = System.currentTimeMillis();
		List<Integer> l1 = getTopKBySort(list);
		long end1 = System.currentTimeMillis();
		System.out.println("排序 = " + (end1-start));
		
		System.out.println("l1 = " + l1);
		List<Integer> l2 = getTopKByPop(list);
		long end2 = System.currentTimeMillis();
		System.out.println("冒泡 = " + (end2-end1));
		
		System.out.println("l2 = " + l2);
		List<Integer> l3 = smallestK(list, 3);
		long end3 = System.currentTimeMillis();
		System.out.println("堆 = " + (end3-end2));
		System.out.println("l3 = " + l3);
	}
	
	public static List<Integer> getTopKBySort(List<Integer> list) {
		list.sort((a, b) -> b.compareTo(a));
		List<Integer> integers = list.subList(0, 3);
		return integers;
	}
	
	public static List<Integer> getTopKByPop(List<Integer> list) {
		List<Integer> ret = new ArrayList<>(3);
		for (int i = 0; i < 3; i++) {
			for (int j = list.size() - 1; j < i; j--) {
				if (list.get(j) > list.get(j + 1)) {
					Collections.swap(list, j, j + 1);
				}
			}
			ret.add(list.get(i));
		}
		return ret;
	}
	
	public static List<Integer> smallestK(List<Integer> arr, int k) {
		List<Integer> ret = new ArrayList<>(k);
		
		// 1,构建一个最大堆
		// JDK的优先级队列是最小堆， 就要用到我们比较器
		Queue<Integer> queue = new PriorityQueue<>(k,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		//2,遍历原数组，进行入队
		for (int value : arr) {
			if (queue.size() < k) {
				queue.add(value);
			} else {
				if (value > queue.peek()) {
					queue.poll();
					queue.add(value);
				}
			}
		}
		//3,将queue中存储的K个元素出队
		for (int i = 0; i < k; i++) {
			ret.add(queue.poll());
		}
		return ret;
	}
	
	
}
