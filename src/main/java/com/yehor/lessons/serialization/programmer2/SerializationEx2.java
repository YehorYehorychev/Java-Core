package com.yehor.lessons.serialization.programmer2;

import com.yehor.lessons.serialization.programmer1.Employees;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        Employees bestEmployees;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("files/employees2.bin"))) {
            bestEmployees = (Employees) inputStream.readObject();
            System.out.println(bestEmployees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
