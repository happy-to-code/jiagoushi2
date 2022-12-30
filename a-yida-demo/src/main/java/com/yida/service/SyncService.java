package com.yida.service;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @Type: TestService.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/11 14:22
 * @Version:
 */
public interface SyncService {

    Future getList() throws InterruptedException;
    List<Integer> getIntegerList() throws InterruptedException;
}
