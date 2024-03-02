package com.yehor.lessons.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            CashBox cashBox = cashBoxes.take();
            System.out.println(Thread.currentThread().getName() + "Обсулживается в кассе " + cashBox);
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Освобождаю кассу " + cashBox);
            cashBoxes.add(cashBox);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
