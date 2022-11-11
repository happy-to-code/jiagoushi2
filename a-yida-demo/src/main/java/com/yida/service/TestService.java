package com.yida.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Type: TestService.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/11 14:22
 * @Version:
 */
@Service
public class TestService {

    @Transactional(rollbackFor = Exception.class)
    public String testGet() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
