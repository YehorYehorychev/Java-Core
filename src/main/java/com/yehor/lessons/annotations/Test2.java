package com.yehor.lessons.annotations;

import java.lang.annotation.*;

public class Test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("com.yehor.lessons.annotations.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info for Xiaomi claas: " + sm1.OS() + " " + sm1.yearOfCompanyCreation());

        Class iPhoneClass = Class.forName("com.yehor.lessons.annotations.Iphone");
        Annotation annotation2 = iPhoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info for iPhone claas: " + sm2.OS() + " " + sm2.yearOfCompanyCreation());
    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "iOS", yearOfCompanyCreation = 1990)
class Iphone {
    String model;
    double price;
}
