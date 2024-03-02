package com.yehor.lessons.dateandtime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Instant instant = now.toInstant();
        System.out.println(instant);

        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);

        int dayOfYear = now.getDayOfYear();
        System.out.println(dayOfYear);

        ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);

        ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(zonedDateTime);

        LocalDateTime now1 = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(now1);

        LocalTime now2 = LocalTime.now();
        System.out.println(now2 + " +++++++++");
    }
}
