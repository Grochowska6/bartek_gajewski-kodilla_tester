package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Shape area = new Area();
        area.circleArea(12);

        Shape perimeter = new Perimeter();
        perimeter.circlePerimeter(12);

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(area);
        processor.process(perimeter);

    }
}
