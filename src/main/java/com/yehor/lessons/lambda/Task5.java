package com.yehor.lessons.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Task5 {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 25),
                new Person("Semen", "Semenovich", 34),
                new Person("Yehor", "Yehorcyev", 27),
                new Person("John", "Marston", 41),
                new Person("Will", "Iam", 39),
                new Person("Susan", "Carry", 57),
                new Person("Paul", "Hammond", 51)
        );
        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max((x,y) -> x.getAge() - y.getAge())
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> map = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map);
    }
}
