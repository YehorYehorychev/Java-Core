package com.yehor.lessons.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
