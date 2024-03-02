package com.yehor.lessons.multithreading;

import javax.swing.plaf.TableHeaderUI;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
        var simpleRunnable = new SimpleRunnable();
        var runnableThread = new Thread(new SimpleRunnable(), "My name");
        var lambdaThread = new Thread(() -> System.out.println("Hello form lambda: " + Thread.currentThread().getName()));


        simpleThread.start();
        System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
        runnableThread.start();
        lambdaThread.start();

        try {
            simpleThread.join(100L);
            System.out.println(simpleThread.getName() + " : " + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
