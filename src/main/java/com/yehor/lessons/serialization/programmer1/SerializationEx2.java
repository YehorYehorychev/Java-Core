package com.yehor.lessons.serialization.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {

    public static void main(String[] args) {
        Car car = new Car("Chevy Bolt EV", "Black");
        Employees employees = new Employees("Maria", "IT", 28, 6.200, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("files/employees2.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
