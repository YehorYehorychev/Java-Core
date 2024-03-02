package com.yehor.lessons.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsForEach {

    public static void main(String[] args) {

        Student st1 = new Student(18,"Yehor");
        Student st2 = new Student(16,"John");
        Student st3 = new Student(22,"William");
        Student st4 = new Student(26,"Chris");
        Student st5 = new Student(31,"Alex");
        Student st6 = new Student(36,"Adam");
        Student st7 = new Student(21,"Anthony");
//
//        List<Student> list = new ArrayList<>();
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        list.add(st6);
//        list.add(st7);

        Stream <Student> myStream = Stream.of(st1,st2,st3,st4,st5,st6,st7);

        int[] array = {1,5,6,8,9,2,11,4,15};
//        Arrays.stream(array).forEach(el -> { el*= 2; System.out.println(el);});
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}
