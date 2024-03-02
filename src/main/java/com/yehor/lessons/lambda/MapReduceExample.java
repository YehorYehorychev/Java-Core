package com.yehor.lessons.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    public static void main(String[] args) {
        Optional<Student> maybeStudent = Stream.of(
                new Student(18,"Ivan"),
                new Student(16,"Dima"),
                new Student(24,"Sveta"),
                new Student(31,"Mike"),
                new Student(25,"Grisha"),
                new Student(23,"John"),
                new Student(17,"Tanya")
        )
                .sequential()
                .filter(student -> student.getAge() > 18)
                //.map(Student::getAge)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
        maybeStudent.ifPresent(System.out::println);
        maybeStudent.map(Student::getAge)
                .filter(age -> age > 25)
                .ifPresent(System.out::println);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(2);
        numbers.add(4);
        numbers.add(11);
        numbers.add(17);
        numbers.add(3);

        int result = numbers.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);
    }
}
