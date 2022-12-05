package com.yida.test.aop.impl;

import com.yida.test.aop.ICar;

public class Car implements ICar {
	@Override
	public void use() {
		System.out.println("汽车使用汽油");
	}
	
	@Override
	public void colour() {
		System.out.println("汽车颜色");
	}
}