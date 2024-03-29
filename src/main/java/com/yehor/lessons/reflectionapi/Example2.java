package com.yehor.lessons.reflectionapi;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("com.yehor.lessons.reflectionapi.Employee");

        Employee o = (Employee) employeeClass.newInstance();
        System.out.println(o);

    }
}
