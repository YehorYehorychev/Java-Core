package com.yehor.lessons.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type a numer: ");
//        int i = scanner.nextInt();
//        System.out.println("The number is: " + i);
//        System.out.println("Type two numbers here: ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println(x/y);
//        System.out.println(x%y);
        System.out.println("Type a couple of words here: ");
        String s = scanner.nextLine();
        System.out.println("You typed: " + s);
    }
}
