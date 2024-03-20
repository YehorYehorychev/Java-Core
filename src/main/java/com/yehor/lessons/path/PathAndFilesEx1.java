package com.yehor.lessons.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {

    public static void main(String[] args) {
        Path filePath = Paths.get("files/test15.txt");
        Path directoryPath = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files");

        System.out.println("filePath.getFileName(): " + filePath.getFileName());
        System.out.println("directoryPath.getFileName(): " + directoryPath.getFileName());
        System.out.println("----------------------------------------");
    }
}
