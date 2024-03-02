package com.yehor.lessons.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Main start");
        try {
            System.out.println(finallyTest());
            unsafe(10);
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
            System.out.println("File not found, please try again");
        } catch ( Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("Main end");
        // code
    }

    public static int finallyTest(){
        try {
            return 2;
        } catch (Throwable throwable){
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("Unsafe start");
        if(value > 0) {
            throw new FileNotFoundException();
        }
        System.out.println("Unsafe end");
    }

    public static void runTime(int value) {
        System.out.println("Unsafe start");
        if(value > 0) {
            throw new RuntimeException();
        }
        System.out.println("Unsafe end");
    }
}
