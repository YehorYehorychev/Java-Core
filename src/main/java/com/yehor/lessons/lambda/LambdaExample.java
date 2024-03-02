package com.yehor.lessons.lambda;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1,o2);
        System.out.println(comparator.compare(77,100));
    }

//    private static class IntegerComparator implements Comparator<Integer>{
//
////        @Override
////        public int compare(Integer o1, Integer o2) {
////            return Integer.compare(o1,o2);
////        }
//
//    }
}
