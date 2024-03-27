package com.yehor.lessons.enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("good"),
    FRIDAY("good"),
    SATURDAY("awesome"),
    SUNDAY("awesome");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Work day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("DayOff");
                break;
        }
    }
}
