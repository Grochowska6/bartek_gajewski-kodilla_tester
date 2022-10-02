package com.kodilla.collections.interfaces.homework;

public class Mazda implements Car {
    public int speed;
    private int increase;

    private int decrease;

    public Mazda(int speed, int increase, int decrease) {
        this.increase = increase;
        this.decrease = decrease;
        this.speed = speed;
    }
    public int getIncreaseSpeed() {
        return speed + increase;
    }
    public int getDecreaseSpeed() {
        return speed - decrease;
    }
    public int getSpeed() {
        return speed;
    }
}
