package com.yida.test2.d1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
    /**
     * CompletableFuture
     * 提供函数式编程的能力，可帮助我们完成复杂的线程的阶段行编程(CompletionStage)
     *
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable t1 = () -> System.out.println("线程t1执行...");
        Runnable t2 = () -> System.out.println("线程t2执行...");
        Runnable t3 = () -> System.out.println("线程t3执行...");
        Runnable t4 = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程t4执行..." );
            }
        };

        // 异步执行
        CompletableFuture.runAsync(t1, executorService).thenRun(t2).thenRun(t3).thenRun(t4);
        // 停止接受新任务,当已有任务将执行完,关闭线程池
        executorService.shutdown();
    }


}
