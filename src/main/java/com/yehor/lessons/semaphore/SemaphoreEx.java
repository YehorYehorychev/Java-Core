package com.yehor.lessons.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Yehor", callBox);
        new Person("John", callBox);
        new Person("Mike", callBox);
        new Person("Josh", callBox);
        new Person("Viktor", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " is using the phone now");
            Thread.sleep(2000);
            System.out.println(name + " is finished his call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
