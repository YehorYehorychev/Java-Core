package com.yehor.lessons.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

public class Delete {

    public static void main(String[] args) {
        Path path = Paths.get("C:/Users/egory/IdeaProjects/JavaLessons/files/Copy");
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {

}
