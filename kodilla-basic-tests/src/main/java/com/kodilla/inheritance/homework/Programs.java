package com.kodilla.inheritance.homework;

public class Programs {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1999);
        system.turnOnSystem();

        Printer printer = new Printer(2004);
        printer.turnOnSystem();
        System.out.println(printer.getYear());

        Android android = new Android(2007);
        android.turnOnSystem();
        System.out.println("System was made in:" + " " + android.getYear());
    }
}
