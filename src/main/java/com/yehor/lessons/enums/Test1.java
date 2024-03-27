package com.yehor.lessons.enums;

public class Test1 {
    void method(String dayofWeek) {
        System.out.println("Today is " + dayofWeek);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.method("Hello World!");
    }
}
