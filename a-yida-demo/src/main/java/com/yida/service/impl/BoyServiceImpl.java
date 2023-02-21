package com.yida.service.impl;

import com.yida.mapper.BoyMapper;
import com.yida.pojo.Boy;
import com.yida.service.IBoyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: yida
 * @Date: 2023/2/18 21:32
 * @Description:
 */
@Service
public class BoyServiceImpl extends ServiceImpl<BoyMapper, Boy> implements IBoyService {
	@Autowired
	private BoyServiceImpl boyService;
	
	@Override
	@Transactional
	public boolean saveBoy() {
		Boy boy = new Boy();
		boy.setName("张三");
		this.save(boy);
		
		updateBoy(boy);
		return false;
	}
	
	@Transactional
	public void updateBoy(Boy boy) {
		boy.setAge(20);
		// this.updateById(boy);
		boyService.updateById(boy);
		int i = 1 / 0;
	}
	
}
