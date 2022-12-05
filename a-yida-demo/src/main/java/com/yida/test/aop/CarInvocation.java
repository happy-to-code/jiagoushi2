package com.yida.test.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: yida
 * @Date: 2022/11/28 21:56
 * @Description:
 */
public class CarInvocation<T> implements InvocationHandler {
	private T t;
	
	public CarInvocation(T t) {
		this.t = t;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		System.out.println("methodName = " + methodName);
		if (methodName.equals("use")) {
			method.invoke(t, args);
			System.out.println("use方法增强");
		}
		if (methodName.equals("colour")) {
			method.invoke(t, args);
			System.out.println("colour方法增强");
		}
		return null;
	}
}
