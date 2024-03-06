package com.yehor.lessons.latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStuffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market stuff came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("John", countDownLatch);
        new Friend("Mike", countDownLatch);
        new Friend("Sean", countDownLatch);
        new Friend("Aaron", countDownLatch);
        new Friend("Josh", countDownLatch);
        new Friend("Will", countDownLatch);

        marketStuffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started purchase process");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
