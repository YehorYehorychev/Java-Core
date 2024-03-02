package com.yehor.lessons.map;

import com.yehor.lessons.persons.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1,"Ivan","Ivanov");
        Person petr = new Person(7,"Petr","Petrov");
        Person sveta = new Person(5,"Sveta","Svetkova");
        Person vova = new Person(2,"Vova","Vovochkin");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);
        map.put(vova.getId(), vova);

        for(Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
