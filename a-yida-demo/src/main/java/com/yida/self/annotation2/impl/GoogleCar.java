package com.yida.self.annotation2.impl;

import com.yida.self.annotation2.ICar;

public class GoogleCar implements ICar {
	//饿汉式单例
	private final static GoogleCar car = new GoogleCar();
	
	private GoogleCar() {
	}
	
	public static GoogleCar getGoogleCar() {
		return car;
	}
	
	public void ok() {
		System.out.println("主人已入座!");
	}
	
	@Override
	public String start(int time, int speed) {
		System.out.println("GoogleCar启动中!");
		return "已设置" + time + "秒后启动," + "速度：" + speed + "码——主人请系好安全带!";
	}
	
	@Override
	public void run() {
		System.out.println("GoogleCar运行中!");
	}
	
	@Override
	public void stop() {
		System.out.println("GoogleCar停止中!");
	}
}
