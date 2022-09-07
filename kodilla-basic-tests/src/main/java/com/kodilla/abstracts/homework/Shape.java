package com.kodilla.abstracts.homework;

public abstract class Shape {

    static double PI = 3.1415927;
    private double area;
    private double perimeter;

    private double r;

    public abstract double circleArea(double r);


    public abstract double circlePerimeter(double r);


    public Shape(double radius){
        this.r = radius;
    }
    public double getCircleArea(){
        return PI * r * r;
    }
    public double getCirclePerimeter(){
        return 2 * PI * r;
    }
}

