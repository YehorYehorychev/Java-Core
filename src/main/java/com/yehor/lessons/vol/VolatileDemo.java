package com.yehor.lessons.vol;

public class VolatileDemo {

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("Still false");
            }
        });
        thread1.start();

        Thread.sleep(5l);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("Flag is true");
        });
        thread2.start();
    }
}