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
        System.out.println("filePath.getParent(): " + filePath.getParent());
        System.out.println("directoryPath.getParent(): " + directoryPath.getParent());
        System.out.println("----------------------------------------");
        System.out.println("filePath.getRoot(): " + filePath.getRoot());
        System.out.println("directoryPath.getRoot(): " + directoryPath.getRoot());
        System.out.println("----------------------------------------");
        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute(): " + directoryPath.isAbsolute());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath(): " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath: " + directoryPath.toAbsolutePath());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath().getParent()): " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getParent()): " + directoryPath.toAbsolutePath().getParent());
        System.out.println("----------------------------------------");
        System.out.println("filePath.toAbsolutePath().getParent()): " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.resolve(filePath): " + directoryPath.resolve(filePath));
        System.out.println("----------------------------------------");
    }
}
