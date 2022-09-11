package com.yida.self.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyAnnotation {
	@MyAnnotation
	public void addUser() {
		System.out.println("增加用户");
	}
	
	@MyAnnotation(num = 2)
	public void delUser() {
		System.out.println("删除用户");
	}
	
	@MyAnnotation(num = 1, name = "XiaoHua")
	public void updateUser() {
		System.out.println("更新用户");
	}
	
	// @MyAnnotation(name = "zhangsan")
	public void findUser() {
		System.out.println("查询用户");
	}
	
	
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		TestMyAnnotation myAnnotation = new TestMyAnnotation();
		Method[] methods = myAnnotation.getClass().getMethods();
		
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyAnnotation.class)) {
				method.invoke(myAnnotation);
			}
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println("((MyAnnotation)annotation).name() = " + ((MyAnnotation) annotation).name() + "<====>" + ((MyAnnotation) annotation).num());
			}
		}
	}
}
