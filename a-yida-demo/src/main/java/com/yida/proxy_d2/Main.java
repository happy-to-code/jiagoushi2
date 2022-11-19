package com.yida.proxy_d2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		InvocationHandler handler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// System.out.println(method);
				if (method.getName().equals("morning")) {
					System.out.println("Good morning, " + args[0]);
				} else {
					System.out.println("lllllsdfsdfsdf");
					return "yida";
				}
				return null;
			}
		};
		Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), // 传入ClassLoader
				new Class[]{Hello.class}, // 传入要实现的接口
				handler); // 传入处理调用方法的InvocationHandler
		hello.morning("Bob");
		String hello1 = hello.hello();
		System.out.println("hello1 = " + hello1);
	}
}