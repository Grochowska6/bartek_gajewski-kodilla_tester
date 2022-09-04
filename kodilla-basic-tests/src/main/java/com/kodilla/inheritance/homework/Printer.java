package com.kodilla.inheritance.homework;

public class Printer extends OperatingSystem {


    public Printer(int year) {
        super(year);
    }

    public void printing() {
        System.out.println("Print new page");
    }

    public void copying() {
        System.out.println("New Copy");
    }

    @Override
    public void turnOnSystem() {
        System.out.println("Printer is ON");
    }
}
