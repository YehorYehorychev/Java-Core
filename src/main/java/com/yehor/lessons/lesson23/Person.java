package com.yehor.lessons.lesson23;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // Getters and setters (if needed)

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
