package com.yehor.lessons.threadpractice;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removeValue = list.remove();
                    System.out.println("Consumer get value: " + removeValue + " Size: " + list.size());
                } else {
                    System.out.println("Consumer is waiting and list is empty");
                }
                try {
                    int random = 80;
                    System.out.println("Consumer wait: " + random);
                    list.wait(random);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
