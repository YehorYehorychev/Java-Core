package com.yehor.lessons.dateandtime;

import java.time.LocalDateTime;

public class Task1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 31, 17, 20);
        LocalDateTime newLocalDayTime = localDateTime.plusMonths(3L);
        System.out.println(newLocalDayTime.toLocalDate());
        System.out.println(newLocalDayTime.toLocalTime());
    }
}
