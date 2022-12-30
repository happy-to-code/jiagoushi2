package com.yida.service.impl;

import com.yida.service.SyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @Type: TestServiceImpl.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 9:35
 * @Version:
 */
@Service
public class SyncServiceImpl implements SyncService {



    @Override
    @Async
    public Future getList() throws InterruptedException {
        System.out.println("2222222222222");
        Thread.sleep(3000);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return new AsyncResult(list);
    }

    @Override
    public List<Integer> getIntegerList() throws InterruptedException {
        Thread.sleep(3000);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
}
