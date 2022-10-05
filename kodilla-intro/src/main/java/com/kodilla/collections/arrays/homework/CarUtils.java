package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar( Car car) {
        System.out.println("_____________________________");
        System.out.println("Car brand :" + getCarName(car));
        System.out.println("Car speed :" + car.getSpeed());
        System.out.println("Car increase speed: " + car.getIncreaseSpeed());

    }
    private static String getCarName(Car car) {
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Nissan)
            return "Nissan";
        else
            return "Unknown car name";
    }

}
