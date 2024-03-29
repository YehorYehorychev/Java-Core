package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Field;

public class Example1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class employeeClass = Class.forName("com.yehor.lessons.reflectionapi.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee em = new Employee();
//        Class employeeClass3 = em.getClass();
        Field id = employeeClass.getField("id");
        System.out.println("Type of id field: " + id.getType());
    }
}
