package com.yehor.lessons.atomic;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(24);
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);

        atomicInteger.addAndGet(20);
        System.out.println(atomicInteger);
    }
}
