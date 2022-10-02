package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Mazda mazda= new Mazda(100, 60, 75);
        doRace(mazda);

        Toyota toyota = new Toyota(100, 52, 73);
        doRace(toyota);

        Nissan nissan = new Nissan(100, 79, 80);
        doRace(nissan);
    }
    public static void doRace( Car car) {
        System.out.println(car.getSpeed());
        System.out.println(car.getIncreaseSpeed());
        System.out.println(car.getDecreaseSpeed());
    }
}
