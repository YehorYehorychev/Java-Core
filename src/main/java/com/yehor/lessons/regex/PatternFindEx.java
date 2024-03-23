package com.yehor.lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindEx {

    public static void main(String[] args) {
        String str = "Hello World! My name is Yehor and my phone number is: +650 858 44 23, and my second phone number is: +650 877 21 89";
        String regex = "\\+(\\d{3}) (\\d{3}) (\\d{2}) (\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println("Full number: " + matcher.group());
            System.out.println("Area code: " + matcher.group(1));
        }
    }
}
