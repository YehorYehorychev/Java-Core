package com.yehor.lessons.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Yehor");
        arrayList1.add("Zaur");
        arrayList1.add("Tanya");
        arrayList1.add("John");
        arrayList1.add("Lincoln");
        System.out.println(arrayList1);
        arrayList1.forEach(el -> System.out.println(el.toUpperCase()));

        List<String> arrayList2 = new ArrayList<>(50);
        arrayList2.add("Sergey");
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>(arrayList2);
        System.out.println(arrayList3);

        System.out.println(arrayList2 == arrayList3);

    }
}
