package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;

    }
    public int getYear(){
        return year;
    }


    public void turnOnSystem() {
        System.out.println("System is ON");
    }

    public void turnOffSystem() {
        System.out.println("System is Off");
    }

    public void displayYearOfOperatingSystem() {
        System.out.println("Android made in year:" + year);
    }
}
