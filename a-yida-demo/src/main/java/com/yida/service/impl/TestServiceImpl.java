package com.yida.service.impl;

import com.yida.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @Type: TestServiceImpl.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 9:35
 * @Version:
 */
@Service
public class TestServiceImpl implements TestService {

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
