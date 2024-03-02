package com.yehor.lessons.threadpractice;

import java.util.Queue;

public class ProducerThread implements Runnable {
    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    System.out.println("Producer adds value: " + random + " Size: " + list.size());
                    list.add(random);
                } else {
                    System.out.println("Producer does nothing ");
                }
                try {
                    int randomWait = 20;
                    System.out.println("Produce is waiting: " + randomWait);
                    list.wait(randomWait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
