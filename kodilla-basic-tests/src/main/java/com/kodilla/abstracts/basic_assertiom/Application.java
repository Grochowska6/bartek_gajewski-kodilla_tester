package com.kodilla.abstracts.basic_assertiom;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprwanie dla liczb" + " " + a + " " + "i" + " " + b);
        } else {
            System.out.println("Metoda sum nie dziła poprawnie dla liczb" + a + "i" + b);
        }
        int subResult = calculator.sub(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3, subResult);
        if (correct1) {
            System.out.println("Metoda sub działa poprawnie dla liczb" + " " + a + " " + "i" + " " + b);
        } else {
            System.out.println("Metoda sub nie działą poprawnie dla liczb" + " " + a + " " + "i" + " " +b);
        }
        int powResult = calculator.pow(a);
        boolean correct2 = ResultChecker.assertEquals(25, powResult);
        if (correct2) {
            System.out.println("Metoda pow działa poprawnie dla liczby" + " " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby" + " " + a);
        }
    }
}
