package com.yehor.lessons.reflectionapi;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum a and b = " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("a - b = " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println(" a * b = " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("a / b = " + result);
    }
}
