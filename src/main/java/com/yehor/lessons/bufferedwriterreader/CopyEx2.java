package com.yehor.lessons.bufferedwriterreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\egory\\Downloads\\Java-Logo.png");
             FileOutputStream outputStream = new FileOutputStream("files/Java-Logo.png");) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
