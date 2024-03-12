package com.yehor.lessons.threadstask;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Russian:
 * 1. Написать программу, бесконечно считывающую
 * пользовательские числа из консоли.
 * Эти числа представляют собой количество секунд.
 * При каждом вводе числа, должна создаваться задача,
 * которая засыпает на введённое число секунд и затем
 * выводит "Я спал N секунд".
 * Однако нужно сделать так, чтобы все задачи выполнялись в
 * одном и том же потоке в порядке ввода.
 * Т.е. в программе есть 2 потока: главный и поток для
 * выполнения всех задач по очереди.
 * При вводе отрицательного числа программа должна завершать свою работу.
 * Второе решение - несколько потоков в пуле. Посчитать кол-во
 * обработанных задач каждым потоком
 * ##################################################################
 * English:
 * Write a program that infinitely reads user numbers from the console.
 * These numbers represent the number of seconds.
 * Upon each number input, a task should be created that sleeps for the specified number of seconds and then outputs "I slept N seconds".
 * However, all tasks should be executed in the same thread in the order of input.
 * That is, the program has 2 threads: the main thread and a thread for executing all tasks sequentially.
 * When a negative number is input, the program should terminate.
 * The second solution involves multiple threads in a pool. Count the number of tasks processed by each thread.
 */

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type for how many seconds do you want to sleep?: ");
        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            threadExecutor.submit(() -> {
                Integer counter = threadLocal.get();
                threadLocal.set(counter == null ? 1 : ++counter);
                System.out.println(String.format("Thread '%s', tasks: '%d'", Thread.currentThread().getName(), threadLocal.get()));
                Thread.sleep(seconds * 1000);
                System.out.println(String.format("Thread '%s' slept '%d' seconds", Thread.currentThread().getName(), seconds));
                return seconds;
            });
        }
        threadExecutor.shutdown();
        threadExecutor.awaitTermination(10L, TimeUnit.SECONDS);
    }
}
