package com.yehor.lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {
        String s = "Yehor Yehorychev, USA, Mountain View, California ST, 2342, apt 10 " +
                "email: egor@email.com, ZIP: 94040, CellPhone: +189485856" +
                "Aaron Paul, USA, New-York, 50th ave ST, 5011, apt 34 " +
                "email: ddffw@email.com, ZIP: 45255 CellPhone: +184535669";

//        Pattern pattern = Pattern.compile("email:");
//        Matcher matcher = pattern.matcher(s);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com)");
//        Pattern pattern = Pattern.compile("\\w\\s+\\w");
//        Pattern pattern = Pattern.compile("\\D{2,6}");
        Pattern pattern = Pattern.compile("\\w+(AB)?");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
