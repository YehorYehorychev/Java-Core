package com.yehor.lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {
//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
        String s1 = "hello my name is Yehor!";
//        Pattern pattern1 = Pattern.compile("\\d");
//        Matcher matcher = pattern1.matcher(s1);
//        Pattern pattern1 = Pattern.compile("\\D");
//        Matcher matcher = pattern1.matcher(s1);
//        Pattern pattern1 = Pattern.compile("\\w");
//        Matcher matcher = pattern1.matcher(s1);
//        Pattern pattern1 = Pattern.compile("\\W");
//        Matcher matcher = pattern1.matcher(s1);
        Pattern pattern1 = Pattern.compile("\\w{5}");
        Matcher matcher = pattern1.matcher(s1);


        while (matcher.find()) {
            System.out.println( matcher.group() + " " + "Position: " + matcher.start());
        }

//        String phoneNubmer = "+375 (29) 898-12-13";
//        String regex = "(\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2})";
//        Pattern pattern2 = Pattern.compile(regex);
//        Matcher matcher2 = pattern2.matcher(phoneNubmer);
//        System.out.println(matcher2.matches());
//        System.out.println(Pattern.matches(regex, phoneNubmer));
//        System.out.println(phoneNubmer.matches(regex));
    }
}
