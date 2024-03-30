package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Field;

public class Example3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Max", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);

        double salaryValue = (double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 2000);
        System.out.println(employee);
    }
}
