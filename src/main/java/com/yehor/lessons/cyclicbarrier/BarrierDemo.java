package com.yehor.lessons.cyclicbarrier;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BarrierDemo {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(RocketDetails.values().length, () -> System.out.println("Launch!"));

        ExecutorService executorService = Executors.newCachedThreadPool();
        Arrays.stream(RocketDetails.values())
                .map(detail -> new RocketDetailRunnable(detail, cyclicBarrier))
                .forEach(executorService::submit);

        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.MINUTES);
    }
}
