package com.zipcoder.assessment3.part3;

import java.util.ArrayList;
import java.util.List;

public class Shelter<T extends Ageable> {

    List<T> shelter;

    public Shelter() {
        shelter = new ArrayList<>();
    }

    public void add(T ager) {
        shelter.add(ager);
    }

    public int size() {
        return shelter.size();
    }

    public T removeFirst() {
        T first = null;
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.isEmpty()) {
                first = null;
            } else {
                first = shelter.get(0);
                shelter.remove(first);
            }
        }
        return first;
    }

    public T getOldest() {
        T oldest = shelter.get(0);
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getYearOfBirth() > oldest.getYearOfBirth()) {
                oldest = shelter.get(i);
            }
        }
        return oldest;
    }

}
