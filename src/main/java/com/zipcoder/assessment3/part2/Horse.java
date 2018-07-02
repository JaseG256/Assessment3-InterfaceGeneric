package com.zipcoder.assessment3.part2;

public class Horse extends Animal{

    public Horse(int yearOfBirth) {
        super(yearOfBirth);
    }
    public int getAge() {
        return (int)((CURRENT_YEAR - getYearOfBirth()) * 6.5);
    }

    public Boolean kickedMe(Boolean wasCareful) {
        boolean result = !wasCareful;
        return result;
    }
}
