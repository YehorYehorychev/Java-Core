package com.yehor.lessons.reflectionapi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/test100.txt"));) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;
            Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));

        } catch (IOException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
