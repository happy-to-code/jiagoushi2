package com.yida.self.annotation2;

import com.yida.self.annotation2.impl.GoogleCar;

public class Test {
	public static void main(String[] args) {
		GoogleCar car1 = GoogleCar.getGoogleCar();
		
		ICar car = new NewClearCar(car1);
		String start = car.start(1, 2);
		System.out.println("start = " + start);
		car.run();
		car.stop();
	}
}
