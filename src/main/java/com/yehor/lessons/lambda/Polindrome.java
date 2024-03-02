package com.yehor.lessons.lambda;

import java.util.Locale;

public class Polindrome {

    public static void main(String[] args) {

        String str = "radаr";
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("ДА НАХУЙ");
        } else {
            System.out.println("НЕТ НАХУЙ");
        }


//        ===================================================================

        String s = "abccba";
        s = s.toUpperCase();
        String reverse = "";

        for (int i = s.length() -1; i > 0; i--) {
            reverse += s.charAt(i);
        }
        if(reverse.equals(s)){
            System.out.println("ДА ЕБАТЬ!");
        } else {
            System.out.println("НЕТ ЕБАТЬ!");
        }
    }
}
