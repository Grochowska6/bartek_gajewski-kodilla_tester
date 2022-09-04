package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {

    public Android(int year) {
        super(year);
    }


    @Override
    public void turnOnSystem(){
        System.out.println("Android is ON");
    }

    @Override
    public void turnOffSystem(){
        System.out.println("Android is Off");
    }


}
