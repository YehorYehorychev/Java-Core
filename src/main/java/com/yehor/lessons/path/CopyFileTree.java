package com.yehor.lessons.path;

import java.io.IOException;
import java.nio.file.*;
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
        Path newDestination = desatination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path newDestination = desatination.resolve(source.relativize(file));
        Files.copy(file, newDestination);
        return FileVisitResult.CONTINUE;
    }
}
