package com.yehor.lessons.filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("C:\\Users\\egory\\IdeaProjects\\JavaLessons\\files\\rubai.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
            System.out.println("Done");
        }
    }
}
