package com.yehor.lessons.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
        String result = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(",", "Our Numbers: ", "."));

        System.out.println(result);
    }
}
