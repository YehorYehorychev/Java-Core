package com.yehor.lessons.exception;

public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try{
            value.length();
        } catch (NullPointerException exception){
            exception.printStackTrace();
            System.err.println("Your value is NULL. Try again");
        }
    }
}
