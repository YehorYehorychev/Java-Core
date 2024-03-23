package com.yehor.lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCFABCGABCH";
        Pattern pattern1 = Pattern.compile("ABCD");
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
