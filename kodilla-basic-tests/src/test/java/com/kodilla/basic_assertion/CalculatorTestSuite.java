package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertiom.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double subResult = calculator.sub(5,8);
        assertEquals(-3, subResult);
    }
    @Test
    public void testPowerLessThanZero() {
        Calculator calculator = new Calculator();
        double powResult = calculator.pow(-2);
        assertEquals(4.0,powResult,0.1);
    }
    @Test
    public void testPowerForNumberZero() {
        Calculator calculator = new Calculator();
        double powResult = calculator.pow(0);
        assertEquals(0, powResult,0.01);
    }
    @Test
    public void testPowerGreaterThanZero() {
        Calculator calculator = new Calculator();
        double powResult = calculator.pow(2);
        assertEquals(4.0, powResult,0.1);
        System.out.println(calculator.pow(2));
    }
}
