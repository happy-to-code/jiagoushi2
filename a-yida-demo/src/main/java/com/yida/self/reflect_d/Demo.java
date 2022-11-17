package com.yida.self.reflect_d;

import java.lang.reflect.Field;

/**
 * @Auther: yida
 * @Date: 2022/11/13 01:07
 * @Description:
 */
public class Demo {
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		Object boy = new Boy("小明", 12);
		System.out.println("boy = " + boy);
		
		Class<Boy> boyClass = Boy.class;
		Field field = boyClass.getDeclaredField("name");
		field.setAccessible(true);
		
		Object o = field.get(boy);
		System.out.println("o = " + o);
	}
}


class Boy {
	private String name;
	private Integer age;
	
	public Boy(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Boy{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
