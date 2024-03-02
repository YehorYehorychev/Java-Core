package com.yehor.lessons.dateandtime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Task6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        LocalDateTime localDateTime = LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localDateTime1 = prevDate.atStartOfDay();

        Duration between = Duration.between(localDateTime1, localDateTime);
        System.out.println(between.getSeconds());
    }
}
