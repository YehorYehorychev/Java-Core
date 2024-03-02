package com.yehor.lessons.multithreading;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: trying to capture monitor of lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread10: Lock1 monitor is captured");
            System.out.println("Thread10: trying to capture monitor of lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread10: Lock1 and Lock2 monitor are captured");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: trying to capture monitor of lock2");
        synchronized (DeadLockExample.lock1) {
            System.out.println("Thread20: Lock2 monitor is captured");
            System.out.println("Thread20: trying to capture monitor of lock1");
            synchronized (DeadLockExample.lock2) {
                System.out.println("Thread20: Lock1 and Lock2 monitor are captured");
            }
        }
    }
}