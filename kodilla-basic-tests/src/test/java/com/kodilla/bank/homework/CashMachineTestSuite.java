package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void ShouldHaveZeroLengthForDeposit() { //jeśli ma zero wpłat tablica
        CashMachine cash = new CashMachine();
        int [] deposit = cash.getDeposit();
        assertEquals(0, deposit.length);
        System.out.println(deposit.length);
    }
    @Test
    public void ShouldHaveZeroLengthForCredit() { //jeśli ma zero wypłat tablica
        CashMachine cash = new CashMachine();
        int [] credit = cash.getCredit();
        assertEquals(0, credit.length);
    }
    @Test

    public void shouldAddTwoElementsToArrayDeposit() { // należy dodoać dwa elelementy do wpłaty
        CashMachine cash = new CashMachine();
        cash.addDeposit(100);
        cash.addDeposit(200);

        int [] deposit = cash.getDeposit();
        assertEquals(2, deposit.length);
        assertEquals(100, deposit[0]);
        assertEquals(200, deposit[1]);
        System.out.println(deposit.length);
    }
    @Test
    public void shouldAddTwoElementsToArrayCredit() { // należy dodać dwa lelenty do wypłaty
        CashMachine cash = new CashMachine();
        cash.addCredit(100);
        cash.addCredit(200);

        int [] credit = cash.getCredit();
        assertEquals(2, credit.length);
        assertEquals(100, credit[0]);
        assertEquals(200, credit[1]);
        System.out.println(credit.length);
    }
    @Test
    public void shouldCalculateCreditAverage() { // powinien obliczyć średnią dla wypłaty
        CashMachine cash = new CashMachine();
        cash.addCredit(100);
        cash.addCredit(200);
        cash.addCredit(900);
        int [] credit = cash.getCredit();

        System.out.println(credit.length);
        assertEquals(400, cash.getPaycheck(),0.1);
        System.out.println(cash.getPaycheck());
    }
    @Test
    public void shouldCalculateDepositAverage() { // powinien obliczyć średnią dla wpląty
        CashMachine cash = new CashMachine();
        cash.addDeposit(95);
        cash.addDeposit(200);
        cash.addDeposit(350);
        int [] deposit = cash.getDeposit();


        assertEquals(215, cash.getPayment(),0.1);
        System.out.println(deposit.length);
        System.out.println(cash.getPayment());
    }
    @Test
    public void shouldReturnPaymentEqualsZeroIsArrayIsEmpty() {  // powinien zwrócioć wplatę równą 0, gdy tablica jest pusta
        CashMachine cash = new CashMachine();
        assertEquals(0, cash.getPayment(), 0.0001);
        System.out.println(cash.getPayment());
    }
    @Test
    public void shouldReturnPaycheckEqualsZeroIsArrayIsEmpty() { // powinien zwrócić wypłatę równą 0, gdy tablica jest piusta.
        CashMachine cash = new CashMachine();
        assertEquals(0, cash.getPaycheck(), 0.0001);
        System.out.println(cash.getPaycheck());
    }
}


