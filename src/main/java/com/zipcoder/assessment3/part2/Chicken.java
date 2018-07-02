package com.zipcoder.assessment3.part2;

public class Chicken extends Animal{

    public Chicken(int yearOfBirth) {
        super(yearOfBirth);
    }

    public int getAge() {
        return (CURRENT_YEAR - getYearOfBirth()) * 10;
    }

    public String produce() {
        return "egg";
    }
}
