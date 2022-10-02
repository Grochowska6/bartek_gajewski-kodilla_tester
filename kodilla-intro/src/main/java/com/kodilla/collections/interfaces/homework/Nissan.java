package com.kodilla.collections.interfaces.homework;

public class Nissan implements Car {

     private int speed;
     private int increase;
     private int decrease;

     public Nissan(int speed, int increase, int decrease) {
         this.speed = speed;
         this.increase = increase;
         this.decrease = decrease;
     }

    @Override
    public int getIncreaseSpeed() {
        return speed + increase;
    }

    @Override
    public int getDecreaseSpeed() {
        return speed - decrease;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
