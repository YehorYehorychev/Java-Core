package com.yehor.lessons.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {

    public static void main(String[] args) {
        String formattedDate = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate,dateTimeFormatter);

        System.out.println(localDateTime);
    }
}
