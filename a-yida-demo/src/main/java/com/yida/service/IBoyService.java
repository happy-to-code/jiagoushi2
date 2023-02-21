package com.yida.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yida.pojo.Boy;

public interface IBoyService extends IService<Boy> {
	boolean saveBoy();
}
