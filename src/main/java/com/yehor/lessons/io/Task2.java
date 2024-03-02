package com.yehor.lessons.io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("files", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualsLastSymbolandFirstSymbol(prev,current)) {
                    System.out.println(prev + " " + current);
                }
                prev = current;
            }
        }
    }

    private static boolean isEqualsLastSymbolandFirstSymbol(String prev, String current) {
        return prev.charAt(prev.length()-1) == current.charAt(0);
    }
}
