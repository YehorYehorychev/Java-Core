package com.yehor.lessons.iterator;


import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");

//        for (String value : list) {
//            System.out.println(value);
//        }
        list.iterator().forEachRemaining(System.out::println);
//        list.forEach(System.out::println);
    }
}
