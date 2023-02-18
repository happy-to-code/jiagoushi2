package com.yida.test3.class_load;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {
	public static void main(String[] args) {
		ClassLoader loader = Test.class.getClassLoader();
		while (loader != null) {
			System.out.println(loader.toString());
			loader = loader.getParent();
		}
		
		// new ThreadPoolExecutor();
		// Executors.newFixedThreadPool()
	}
}
