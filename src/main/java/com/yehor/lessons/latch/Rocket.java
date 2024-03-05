package com.yehor.lessons.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {
    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("The Rocket is prepared to be launched");
        try {
            countDownLatch.await();
            System.out.println("Launch!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
