package com.yehor.lessons.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputRunner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = Path.of("files", "test.txt").toFile();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            String value = "Hi Bro!";
            fileOutputStream.write(value.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
