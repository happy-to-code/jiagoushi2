package com.yueda.driver.feign.fallback;

import com.yueda.driver.feign.DriverFeign;
import com.yueda.driver.model.Driver;
import org.springframework.stereotype.Component;

@Component
public class DriverFeignFallback implements DriverFeign {
	/**
	 * status()降级处理方法
	 */
	@Override
	public Driver status(String id, Integer status) {
		System.out.println("降级处理方法 id = " + id + ", status = " + status);
		Driver driver = new Driver();
		driver.setId(id);
		driver.setStatus(status);
		driver.setName("driver服务，DriverFeignFallback系统比较繁忙，请您稍后再试！");
		return driver;
	}
}
