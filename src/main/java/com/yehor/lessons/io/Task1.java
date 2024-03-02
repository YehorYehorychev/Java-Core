package com.yehor.lessons.io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {

    private static final String VOWELS = "aeiouy";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("files", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                String firstSymbol = String.valueOf(word.charAt(0));
                if (VOWELS.contains(firstSymbol)) {
                    System.out.println(word);
                }
            }
        }
    }
}
