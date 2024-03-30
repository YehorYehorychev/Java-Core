package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("com.yehor.lessons.reflectionapi.Employee");

        Employee o = (Employee) employeeClass.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee emp1 = constructor1.newInstance();

    }
}
