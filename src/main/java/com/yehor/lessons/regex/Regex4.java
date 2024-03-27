package com.yehor.lessons.regex;

public class Regex4 {

    public static void main(String[] args) {
        String s1 = "Hello   my    friend!,    how are you?";
        System.out.println(s1);
        s1 = s1.replace("friend", "buddy");
        System.out.println(s1);
        s1 = s1.replaceAll(" {2,}", " ");
        s1 = s1.replaceAll("\\bh\\w+", "4444");
        System.out.println(s1);
        s1 = s1.replaceFirst("\\bH\\w+", "4444");
        System.out.println(s1);
    }
}
