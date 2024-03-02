package com.yehor.lessons.exception;

public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (MyExeption e) {
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws MyExeption {
        throw new MyExeption("My exeption msg");
    }
}
