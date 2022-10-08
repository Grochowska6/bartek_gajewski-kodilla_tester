package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    private String schoolName;

    private List<Double> schools = new ArrayList<>();

    public School (List<Double> schools) {
        this.schools = schools;
    }
    public double getAverage() {
        double sum = 0.0;
        for (double school : schools)
            sum += school;
            return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schools=" + schools +
                '}';
    }
}
