package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class employeeClass = Class.forName("com.yehor.lessons.reflectionapi.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee em = new Employee();
//        Class employeeClass3 = em.getClass();
        Field id = employeeClass.getField("id");
        System.out.println("Type of id field: " + id.getType());
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        System.out.println("--------------------------------------");
        Field[] allDeclaredFields = employeeClass.getDeclaredFields();
        for (Field field : allDeclaredFields) {
            System.out.println("Field: " + field);
        }
    }
}
