package com.yehor.lessons.exception;

public class Task2 {

    public static void main(String[] args) {

        int[] values = {1,4,5,7,8,};
        try {
            for (int i = 0; i <= values.length ; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
