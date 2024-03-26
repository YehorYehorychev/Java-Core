package com.yehor.lessons.regex;

public class Regex3 {

    public static void main(String[] args) {
        String s = "Yehor Yehorychev, USA, Mountain View, California ST, 2342, apt 10 " +
                "email: egor@email.com, ZIP: 94040, CellPhone: +189485856" +
                "Aaron Paul, USA, New-York, 50th ave ST, 5011, apt 34 " +
                "email: ddffw@email.com, ZIP: 45255 CellPhone: +184535669";
        String s2 = "egor@email.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com)");
        System.out.println(result);
    }
}
