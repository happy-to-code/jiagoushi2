package com.yida.test.juc_1.count_down_lanch3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class GetDataSourceListTask  {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<String>> tasks = Arrays.asList(()->"Hello", ()->"World");
        List<Future<String>> futures = executorService.invokeAll(tasks);

        for (Future<String> future : futures) {
            String s = future.get();
            System.out.println("s = " + s);
        }
    }


}



