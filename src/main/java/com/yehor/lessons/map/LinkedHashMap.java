package com.yehor.lessons.map;

import com.yehor.lessons.persons.Person;

import java.util.HashMap;
import java.util.Map;


public class LinkedHashMap {

    public static void main(String[] args) {

        Person ivan = new Person(6,"Ivan","Ivanov");
        Person petr = new Person(7,"Petr","Petrov");
        Person tanya = new Person(8,"Tanya","Yehorycheva");

        Map<Integer, Person> map = new java.util.LinkedHashMap<>();

        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(tanya.getId(), tanya);

        for (Map.Entry<Integer,Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
