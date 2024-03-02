package com.yehor.lessons.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("files", "test.txt").toFile().toPath();
        Files.write(path, List.of("Hello World!"));
//        try (BufferedReader fileWriter = Files.newBufferedReader(file) {
//            fileWriter.append("Hello World!");
//            fileWriter.append("Java!");
//        }
    }
}
