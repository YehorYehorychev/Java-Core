package com.yehor.lessons.bufferedwriterreader;

import java.io.*;

public class DataStreamsEx {

    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("files/newfile.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("files/newfile.bin"))) {

            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(500);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(14.2f);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
