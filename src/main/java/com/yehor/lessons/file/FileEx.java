package com.yehor.lessons.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {

    public static void main(String[] args) throws IOException {
        File file = new File("files/test10.txt");
        File file2 = new File("files/file2.txt");
        File folder = new File("C:/Users/egory/IdeaProjects/JavaLessons/files");

        System.out.println("File: " + file.getAbsolutePath());
        System.out.println("Folder: " + folder.getAbsolutePath());
        System.out.println("---------------------------------------");

        System.out.println("File: " + file.isAbsolute());
        System.out.println("Folder: " + folder.isAbsolute());
        System.out.println("---------------------------------------");

        System.out.println("File: " + file.isDirectory());
        System.out.println("Folder: " + folder.isDirectory());
        System.out.println("---------------------------------------");

        System.out.println("File: " + file.exists());
        System.out.println("Folder: " + folder.exists());
        System.out.println("---------------------------------------");

        System.out.println("File: " + file.exists());
        System.out.println("Folder: " + folder.exists());
        System.out.println("---------------------------------------");

        System.out.println("New file created: " + file2.createNewFile());
        System.out.println("---------------------------------------");

        System.out.println("File2: " + file2.length());
        System.out.println("---------------------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
