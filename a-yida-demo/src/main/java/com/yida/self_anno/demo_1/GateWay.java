package com.yida.self_anno.demo_1;

import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GateWay {
	
	public ResponseInfo gateWay(RequestInfo requestInfo) {
		ResponseInfo responseInfo = new ResponseInfo();
		Reflections reflections = new Reflections("com.yida.service");
		//获取带Service注解的类
		Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(Service.class);
		for (Class clazz : typesAnnotatedWith) {
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				//判断带自定义注解MyAnnontation的method
				if (method.isAnnotationPresent(MyAnnotation.class)) {
					MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
					//根据入参WayCode比较method注解上的WayCode,两者值相同才执行该method
					if (null != annotation.name() && annotation.name().equals(requestInfo.getWayCode())) {
						System.out.println("WayCode = " + annotation.name());
						try {
							//执行method
							responseInfo = (ResponseInfo) method.invoke(clazz.newInstance(), requestInfo.getMap());
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return responseInfo;
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap();
		map.put("Key1", "参数1");
		map.put("Key2", "参数2");
		RequestInfo requestInfo = new RequestInfo();
		requestInfo.setWayCode("b");//自定义注解的WayCode值，调用不同的方法
		requestInfo.setWayName("调测试方法1");
		requestInfo.setMap(map);
		
		GateWay gate = new GateWay();
		ResponseInfo responseInfo = gate.gateWay(requestInfo);
	}
}