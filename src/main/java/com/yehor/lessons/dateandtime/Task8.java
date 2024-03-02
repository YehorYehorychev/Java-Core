package com.yehor.lessons.dateandtime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task8 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime with = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(with);
    }
}
