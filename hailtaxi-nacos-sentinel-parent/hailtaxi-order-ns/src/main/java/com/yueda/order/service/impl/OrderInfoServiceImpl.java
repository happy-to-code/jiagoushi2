package com.yueda.order.service.impl;

import com.yueda.order.mapper.OrderInfoMapper;
import com.yueda.order.model.OrderInfo;
import com.yueda.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	
	@Override
	public void add(OrderInfo orderInfo) {
		orderInfoMapper.add(orderInfo);
	}
}
