package com.yehor.lessons.serialization.programmer1;

import java.io.Serializable;

public class Employees implements Serializable {
    String name;
    String department;
    int age;
    double salary;

    public Employees(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
