package com.yehor.lessons.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a numer: ");
        int i = scanner.nextInt();
        System.out.println("The number is: " + i);
    }
}
