package com.yehor.lessons.randomaccessfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("files/test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(80);
            String s2 = file.readLine();
            System.out.println(s2);

            long filePointer = file.getFilePointer();
            System.out.println(filePointer);

//            file.seek(0);
//            file.writeBytes("Hello World!");
            file.seek(file.length() - 1);
            file.writeBytes("\n \t \t \t \t \t James Butler Jr.");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
