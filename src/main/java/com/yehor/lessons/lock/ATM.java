package com.yehor.lessons.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Yehor", lock);
        new Employee("Oleg", lock);
        new Employee("Tanya", lock);
        Thread.sleep(5000);
        new Employee("Victor", lock);
        new Employee("John", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            System.out.println(name + " is using ATM now");
            try {
                Thread.sleep(2000);
                System.out.println(name + " is finished his tasks");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " doesn't want to wait in the line");
        }
//        System.out.println(name + " is waiting..");
//        lock.lock();
    }
}
