package com.zipcoder.assessment3.part2;

public abstract class Animal implements AnimalInterface, Eater {

    protected int yearOfBirth;

    public Animal(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void eat(Food food) {
        food.consume();
    }

    public abstract int getAge();
}
