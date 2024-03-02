package com.yehor.lessons.map;

import com.yehor.lessons.persons.Person;

import java.util.*;

public class SortExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");

//        Collections.sort(strings);
//        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(27, "Sveta", "Svetkova"),
                new Person(3, "Petr", "Petrov")
        );
        Collections.sort(personList);
        System.out.println(personList);

        personList.sort(new FirstNameComparator());
        System.out.println(personList);
    }

    public static class FirstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
