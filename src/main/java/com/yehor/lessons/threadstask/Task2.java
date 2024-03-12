package com.yehor.lessons.threadstask;

import java.util.stream.IntStream;

/**
 * Russian:
 * 1.  Задан массив случайных целых чисел (от 1 до 300)
 * случайной длины (до 1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами: в
 * одном потоке и используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 * ##################################################################
 * English:
 * Given an array of random integers (from 1 to 300) of random length
 * (up to 1 million elements). Find the maximum element in the array
 * using two methods: in one thread and using 10 threads.
 * Compare the time spent in both cases.
 */

public class Task2 {

    public static void main(String[] args) {

    }

    private static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    private static int findMaxParallel(int[] values) {
        return IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE);
    }
}
