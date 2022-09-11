package com.yueda.order.controller;

import com.yueda.driver.feign.DriverFeign;
import com.yueda.driver.model.Driver;
import com.yueda.order.model.OrderInfo;
import com.yueda.order.service.OrderInfoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(value = "/order")
@GlobalTransactional
public class OrderInfoController {
	
	
	@Autowired
	private OrderInfoService orderInfoService;
	
	@Autowired
	private DriverFeign driverFeign;
	
	
	/***
	 * v
	 */
	@PostMapping
	public OrderInfo add(String id) {
		System.out.println("id ==========>>>>> " + id);
		//修改司机信息  司机ID=1
		Driver driver = driverFeign.status(id, 2);
		//创建订单
		OrderInfo orderInfo = new OrderInfo("No" + ((int) (Math.random() * 10000)), (int) (Math.random() * 100), new Date(), "深圳北站" + UUID.randomUUID().toString().substring(0, 4), "罗湖港" + UUID.randomUUID().toString().substring(0, 4), driver);
		orderInfoService.add(orderInfo);
		int i = 1/0;
		return orderInfo;
	}
	
}
