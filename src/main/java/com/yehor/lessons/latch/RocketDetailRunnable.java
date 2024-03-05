package com.yehor.lessons.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable {
    private final CountDownLatch countDownLatch;
    private final RocketDetails rocketDetails;

    public RocketDetailRunnable(RocketDetails rocketDetails, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.rocketDetails = rocketDetails;
    }

    @Override
    public void run() {
        System.out.println("Detail is preparing: " + rocketDetails);
        try {
            Thread.sleep(1000);
            System.out.println("Detail is ready to use: " + rocketDetails);
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
