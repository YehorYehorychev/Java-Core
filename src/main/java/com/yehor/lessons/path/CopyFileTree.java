package com.yehor.lessons.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    public static void main(String[] args) {

    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path desatination;

    public MyFileVisitor2(Path source, Path desatination) {
        this.source = source;
        this.desatination = desatination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
