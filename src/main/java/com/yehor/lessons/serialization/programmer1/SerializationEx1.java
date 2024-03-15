package com.yehor.lessons.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Yehor");
        employees.add("Mike");
        employees.add("Greg");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("files/employees1.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
