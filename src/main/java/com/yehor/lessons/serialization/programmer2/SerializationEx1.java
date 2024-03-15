package com.yehor.lessons.serialization.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("files/employees1.bin"))) {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
