package com.yueda.driver.service;

import com.yueda.driver.model.Driver;

public interface DriverService {
	Driver findById(String id);
	
	void update(String id, Integer status);
}
