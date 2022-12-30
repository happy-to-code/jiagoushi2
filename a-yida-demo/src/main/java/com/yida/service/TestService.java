package com.yida.service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @Type: TestService.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/11 14:22
 * @Version:
 */
public interface TestService {

    /**
     * testGet 测试
     *
     * @param param1
     * @param param2
     * @return
     */
     String testGet(String param1, Integer param2) ;

    String testSyncT() throws InterruptedException, ExecutionException, TimeoutException;
    String testSyncT2() throws InterruptedException, ExecutionException, TimeoutException;
    List<String> getList2() throws InterruptedException;
}
