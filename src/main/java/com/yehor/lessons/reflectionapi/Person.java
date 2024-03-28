package com.yehor.lessons.reflectionapi;

public abstract class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
