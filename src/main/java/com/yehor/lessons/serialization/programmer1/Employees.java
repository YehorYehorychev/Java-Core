package com.yehor.lessons.serialization.programmer1;

import java.io.Serializable;
import java.rmi.server.UID;

public class Employees implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String lastName;
    String department;
//    int age;
    transient double salary;
    Car car;

    public Employees(String name,
                     String lastName,
                     String department,
//                     int age,
                     double salary,
                     Car car) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                "last name='" + lastName + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car =" + car +
                '}';
    }
}
