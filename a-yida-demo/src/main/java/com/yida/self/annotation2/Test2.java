package com.yida.self.annotation2;

import com.yida.self.annotation2.impl.GoogleCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test2 {
	public static void main(String[] args) {
		// 使用动态代理proxy
		ICar car1 = GoogleCar.getGoogleCar();
		ICar car2 = (ICar) Proxy.newProxyInstance(Test2.class.getClassLoader(), GoogleCar.class.getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (method.getName().equalsIgnoreCase("start")) {
					System.out.println("欢迎来到新能源汽车!");
					System.out.println(method.invoke(car1, args));
					//System.out.println(Arrays.toString(args));	将args,即参数打印
					System.out.println("自动驾驶已开启!");
				} else if (method.getName().equalsIgnoreCase("stop")) {
					method.invoke(car1, args);
					System.out.println("新能源汽车已关闭，再见!");
				} else {
					method.invoke(car1, args);
				}
				return null;
			}
		});
		car2.start(3, 80);
		car2.run();
		car2.stop();
	}
}
