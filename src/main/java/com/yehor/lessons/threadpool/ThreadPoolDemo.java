package com.yehor.lessons.threadpool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
//        scheduledExecutorService.schedule(() -> System.out.println("Ok"), 3L, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("OK"), 2L, 4L, TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();
//        scheduledExecutorService.awaitTermination(1L, TimeUnit.HOURS);
    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Hello from Callable");
            return 1;
        });


        System.out.println("Result: " + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main Ends");
    }
}
