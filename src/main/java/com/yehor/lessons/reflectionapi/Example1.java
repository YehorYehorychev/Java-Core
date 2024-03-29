package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
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
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        Field[] allDeclaredFields = employeeClass.getDeclaredFields();
        for (Field field : allDeclaredFields) {
            System.out.println("Field: " + field);
        }
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        Method[] methods = employeeClass.getDeclaredMethods();
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers()) | Modifier.isPrivate(method.getModifiers())) {
                System.out.println("Method: " + method);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        Method setSalary = employeeClass.getMethod("setSalary", double.class);
        System.out.println(setSalary.getReturnType() + " and " + Arrays.toString(setSalary.getParameterTypes()));
    }
}
