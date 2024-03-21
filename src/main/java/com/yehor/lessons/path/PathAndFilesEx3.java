package com.yehor.lessons.path;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx3 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("files/test10.txt");
        Files.createFile(filePath);
        String dialog = "-Hello\n-Hello\n-How are you?\nI'm good, you?\nI'm good, thanks!";
        Files.write(filePath, dialog.getBytes(StandardCharsets.UTF_8));
    }
}
