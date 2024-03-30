package com.yehor.lessons.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("com.yehor.lessons.reflectionapi.Employee");

        Employee o = (Employee) employeeClass.newInstance();
        System.out.println(o);

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee emp1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Yehor", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 7.706);
        System.out.println(obj2);

    }
}
