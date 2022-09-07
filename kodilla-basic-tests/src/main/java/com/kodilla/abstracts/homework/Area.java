package com.kodilla.abstracts.homework;

public class Area extends Shape{

    public Area() {
        super(12);
    }

    @Override
    public double circleArea(double r) {
        System.out.println("Circle area:");
        return PI * r * r;
    }

    @Override
    public double circlePerimeter(double r) {
        return 0;
    }
}
