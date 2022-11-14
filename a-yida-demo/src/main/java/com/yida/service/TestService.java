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

    /**
     * testGet 测试
     *
     * @param param1
     * @param param2
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public String testGet(String param1, Integer param2) {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
