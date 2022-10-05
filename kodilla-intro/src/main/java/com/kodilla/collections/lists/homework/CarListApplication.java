package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Mazda(97.7, 45, 50));
        cars.add(new Toyota(88.6, 46.6, 50));
        cars.add(new Nissan(90.1, 50, 50));

        cars.remove(0);


        Nissan nissan = new Nissan(90.1, 50, 50);
        cars.remove(nissan);

        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + ", speed: " + car.getSpeed() + ", Speed increase: " + car.getIncreaseSpeed() + ", Speed decrease: " + car.getDecreaseSpeed());
        }
    }
}
