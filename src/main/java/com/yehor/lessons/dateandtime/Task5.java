package com.yehor.lessons.dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period between = Period.between(prevDate, now);
        System.out.println(between.getDays());
        System.out.println(between.getMonths());
        System.out.println(between.getYears());

        long between1 = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(between1);
    }
}
