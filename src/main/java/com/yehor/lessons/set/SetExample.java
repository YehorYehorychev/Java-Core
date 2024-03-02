package com.yehor.lessons.set;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        new HashSet<>();
        new LinkedHashSet<>();
        new TreeSet<>();

        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("bbb");
        set.add("ddd");

        System.out.println(set);

        for (String value : set) {
            System.out.println(value);
        }
    }
}
