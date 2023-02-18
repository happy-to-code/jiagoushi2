package com.yida.service.impl;

import com.yida.mapper.BoyMapper;
import com.yida.pojo.Boy;
import com.yida.service.IBoyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * @Auther: yida
 * @Date: 2023/2/18 21:32
 * @Description:
 */
@Service
public class BoyServiceImpl extends ServiceImpl<BoyMapper, Boy> implements IBoyService {
}
