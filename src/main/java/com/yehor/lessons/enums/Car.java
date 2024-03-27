package com.yehor.lessons.enums;

public class Car {
    CarBrands carBrands;

    public Car(CarBrands carBrands) {
        this.carBrands = carBrands;
    }

    public static void main(String[] args) {
        Car car = new Car(CarBrands.Chevrolet);
        Car ca2 = new Car(CarBrands.ALPINE);
        Car ca3 = new Car(CarBrands.BMW);
    }
}

enum CarBrands {
    BMW,
    MERCEDES,
    AUDI,
    HONDA,
    ALPINE,
    Chevrolet
}
