package com.kodilla.abstracts.homework;

public class Perimeter extends Shape{

    public Perimeter(){
        super(12);
    }

    @Override
    public double circleArea(double r) {
        return 0;
    }

    @Override
    public double circlePerimeter(double r) {
        System.out.println("Circle perimeter:");
        return 2 * PI * r;
    }
}
