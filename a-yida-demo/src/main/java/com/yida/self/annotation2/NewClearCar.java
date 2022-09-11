package com.yida.self.annotation2;

public class NewClearCar implements ICar {
	public ICar goodCar = null;
	
	public NewClearCar() {
	}
	
	public NewClearCar(ICar car) {
		//懒汉式单例
		if (goodCar == null) {
			goodCar = car;
		}
	}
	
	@Override
	public String start(int time, int speed) {
		System.out.println("欢迎来到新能源汽车!");
		return goodCar.start(time, speed);
	}
	
	@Override
	public void run() {
		goodCar.run();
	}
	
	@Override
	public void stop() {
		goodCar.stop();
		System.out.println("新能源汽车已关闭，再见!");
	}
}
