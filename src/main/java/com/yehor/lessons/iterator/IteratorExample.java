package com.yehor.lessons.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list = new ArrayList<>(sourceList);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//        list.forEach(System.out::println);
    }
}
