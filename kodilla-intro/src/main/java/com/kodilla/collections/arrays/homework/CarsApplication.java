package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;
public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for(int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);

    }
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarName = random.nextInt(3);
        double a = getRandomSize(random);
        double b = getRandomSize(random);
        double c = getRandomSize(random);
        if (drawnCarName == 0)
            return new Mazda(a, b ,c);
        else if (drawnCarName == 1)
            return new Toyota(a, b, c);
        else {
            return new Nissan(a, b, c);
        }
    }
    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;
    }
}
