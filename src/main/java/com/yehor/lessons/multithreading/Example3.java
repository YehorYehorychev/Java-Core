package com.yehor.lessons.multithreading;

public class Example3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Hello from Lambda-Thread")).start();
        Thread thread = new Thread(new Example3());
        thread.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);

//        Thread thread1 = new Thread(new MyThread3());
//        Thread thread2 = new Thread(new MyThread4());
//        thread1.start();
//        thread2.start();

        }
    }
}

//class MyThread3 implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i = 1000; i > 0 ; i--) {
//            System.out.println(i);
//        }
//    }
//}