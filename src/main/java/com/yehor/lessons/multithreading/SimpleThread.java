package com.yehor.lessons.multithreading;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
