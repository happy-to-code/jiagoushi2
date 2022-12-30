package com.yida.service.impl;

import com.yida.service.SyncService;
import com.yida.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

/**
 * @Type: TestServiceImpl.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/13 9:35
 * @Version:
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private SyncService syncService;

    Executor poolTaskExecutor = Executors.newFixedThreadPool(3);

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

    @Override
    public String testSyncT() throws InterruptedException, ExecutionException, TimeoutException {
        long l = System.currentTimeMillis();


        Future future = syncService.getList();
        System.out.println("111111111111111111111");
        // 不是异步方法  时间1s
        List<String> list2 = this.getList2();
        System.out.println("list2 = " + list2);

        List<Integer> o = (List<Integer>) future.get();


        System.out.println("o = " + o);
        long end = System.currentTimeMillis();
        System.out.println("(end-l) = " + (end - l));
        return null;
    }

    @Override
    public String testSyncT2() {

        long start = System.currentTimeMillis();
        CompletableFuture<List<String>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
            List<String> list2 = null;
            try {
                list2 = this.getList2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return list2;
        }, poolTaskExecutor);

        CompletableFuture<List<Integer>> listCompletableFuture1 = CompletableFuture.supplyAsync(() -> {
            try {
                return syncService.getIntegerList();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, poolTaskExecutor);

        List<String> stringList;
        List<Integer> integerList;
        try {
            stringList = listCompletableFuture.get();
            integerList = listCompletableFuture1.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();

        System.out.println("(end-start = " + (end - start));


        System.out.println("stringList = " + stringList);
        System.out.println("integerList = " + integerList);

        return null;
    }


    @Override
    public List<String> getList2() throws InterruptedException {
        Thread.sleep(4000);
        List<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        return list1;
    }
}
