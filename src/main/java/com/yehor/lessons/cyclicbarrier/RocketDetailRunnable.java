package com.yehor.lessons.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final RocketDetails rocketDetails;

    public RocketDetailRunnable(RocketDetails rocketDetails, CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
        this.rocketDetails = rocketDetails;
    }

    @Override
    public void run() {
        System.out.println("Detail is preparing: " + rocketDetails);
        try {
            Thread.sleep(1000);
            System.out.println("Detail is ready to use and waiting: " + rocketDetails);
            cyclicBarrier.await();
            System.out.println("Detail is already used " + rocketDetails);
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
