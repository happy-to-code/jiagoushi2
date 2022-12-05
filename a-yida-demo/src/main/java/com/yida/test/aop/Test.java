package com.yida.test.aop;

import com.yida.test.aop.impl.Car;

import java.lang.reflect.Proxy;

/**
 * @Auther: yida
 * @Date: 2022/11/28 22:01
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		ICar car = new Car();
		
		CarInvocation carInvocation = new CarInvocation(car);
		ICar carProxy = (ICar) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), carInvocation);
		carProxy.use();
		
		System.out.println("------------------------");
		carProxy.colour();
	}
}
