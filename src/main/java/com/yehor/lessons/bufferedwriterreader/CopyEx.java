package com.yehor.lessons.bufferedwriterreader;

import java.io.*;

public class CopyEx {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/rubai.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("files/rubai2.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
