package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.abstracts.basic_assertiom.ResultChecker.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldCalculatePaymentIfValuesAreInRangePayment() { // należy obliczyć wartość wpłat, jeżeli wpłaty są w granicach wartości
        Bank  bank = new Bank("Euronet");
        bank.addDepositAtm1CashMachine(0);
        bank.addDepositAtm1CashMachine(450);
        bank.addDepositAtm1CashMachine(0);

        bank.addDepositAtm3CashMachine(500);

        bank.addDepositAtm4CashMachine(800);
        bank.addDepositAtm4CashMachine(100);

        double Atm1Payment = bank.getAtm1Payment();
        double Atm2Payment = bank.getAtm2Payment();
        double Atm3Payment = bank.getAtm3Payment();
        double Atm4Payment = bank.getAtm4Payment();


        assertEquals(150, Atm1Payment, 0.1);
        System.out.println(Atm1Payment);
        assertEquals(0, Atm2Payment, 0.1);
        System.out.println(Atm2Payment);
        assertEquals(500, Atm3Payment, 0.1);
        System.out.println(bank.getAtm3Payment());
        assertEquals(450, Atm4Payment, 0.1);
        System.out.println(Atm4Payment);
    }
    @Test
    public void shouldCalculatePayoffIfValuesAreInRangePayouts() { // należy obliczyć wartość wypłaty, jeżeli wypłaty są w granicach wartości
        Bank  cash = new Bank("Euronet");
        cash.addCreditAtm1CashMachine(100);
        cash.addCreditAtm1CashMachine(200);
        cash.addCreditAtm1CashMachine(150);

        cash.addCreditAtm2CashMachine(500);

        cash.addCreditAtm4CashMachine(600);
        cash.addCreditAtm4CashMachine(300);

        double Atm1Paycheck = cash.getAtm1Paycheck();
        double Atm2Paycheck = cash.getAtm2Paycheck();
        double Atm3Paycheck = cash.getAtm3Paycheck();
        double Atm4Paycheck = cash.getAtm4Paycheck();


        assertEquals(150, Atm1Paycheck, 0.1);
        System.out.println(Atm1Paycheck);
        assertEquals(500, Atm2Paycheck, 0.1);
        System.out.println(Atm2Paycheck);
        assertEquals(0, Atm3Paycheck, 0.1);
        System.out.println(Atm3Paycheck);
        assertEquals(450, Atm4Paycheck, 0.1);
        System.out.println(Atm4Paycheck);
    }
    @Test
    public void shouldCalculatePaymentIfValuesAreOutsideRange() { //należy obliczyć wartość wpłat, jeżeli wartości sa poza granicami
        Bank  cash = new Bank("Euronet");
        cash.addDepositAtm1CashMachine(-100);
        cash.addDepositAtm1CashMachine(200);
        cash.addDepositAtm1CashMachine(300);

        cash.addDepositAtm2CashMachine(500);

        cash.addDepositAtm4CashMachine(1200);
        cash.addDepositAtm4CashMachine(300);

        double Atm1Payment = cash.getAtm1Payment();
        double Atm2Payment = cash.getAtm2Payment();
        double Atm3Payment = cash.getAtm3Payment();
        double Atm4Payment = cash.getAtm4Payment();

        assertEquals(250, Atm1Payment, 0.1);
        System.out.println(Atm1Payment);
        assertEquals(500, Atm2Payment, 0.1);
        System.out.println(Atm2Payment);
        assertEquals(0, Atm3Payment, 0.1);
        System.out.println(Atm3Payment);
        assertEquals(300, Atm4Payment, 0.1);
        System.out.println(Atm4Payment);
    }
    @Test
    public void shouldCalculatePayoffIfValuesAreOutsideRange() { //należy obliczyć wartość wypłat, jeżeli wartości sa poza granicami
        Bank  cash = new Bank("Euronet");
        cash.addCreditAtm2CashMachine(-100);
        cash.addCreditAtm1CashMachine(200);
        cash.addCreditAtm1CashMachine(300);

        cash.addCreditAtm2CashMachine(500);

        cash.addCreditAtm4CashMachine(1200);
        cash.addCreditAtm4CashMachine(300);
        cash.addCreditAtm4CashMachine(-1);
        cash.addCreditAtm4CashMachine(900);

        double Atm1Paycheck = cash.getAtm1Payment();
        double Atm2Paycheck = cash.getAtm2Payment();
        double Atm3Paycheck = cash.getAtm3Payment();
        double Atm4Paycheck = cash.getAtm4Payment();

        assertEquals(250, Atm1Paycheck, 0.1);
        assertEquals(500, Atm2Paycheck, 0.1);
        assertEquals(0, Atm3Paycheck, 0.1);
        assertEquals(600, Atm4Paycheck, 0.1);
    }

    @Test
    public void balancePaymentShouldBeZeroWhenDontHavePayments() { // Saldo wplat powinno wynosić zero, gdy nie ma płatności
        Bank cash = new Bank("Eurocash");
        assertEquals(0, cash.getBalancePayment(), 0.001);
        System.out.println(cash.getBalancePayment());

    }
    @Test
    public void balancePayOutsShouldBeZeroWhenDontHavePayments() { // Saldo wypłat powinno wynosić zero, gdy nie ma płatności
        Bank cash = new Bank("Eurocash");
        assertEquals(0, cash.getBalancePaycheck(), 0.001);
    }
    @Test
    public void shouldCalculateBankPayments() { // powinien obliczyć średnią wartość wpłat.
        Bank cash = new Bank("Eurocash");

        cash.addDepositAtm1CashMachine(100);
        cash.addDepositAtm1CashMachine(100);
        cash.addDepositAtm1CashMachine(0);

        cash.addDepositAtm2CashMachine(200);
        cash.addDepositAtm2CashMachine(0);

        cash.addDepositAtm3CashMachine(200);
        cash.addDepositAtm3CashMachine(500);

        cash.addDepositAtm4CashMachine(0);
        assertEquals(357.142, cash.getBalancePayment(), 0.001);
        System.out.println(cash.getBalancePayment());
    }
    @Test
    public void shouldCalculateBankPayOuts() { // powinien obliczyć średnią wartość wypłat.
        Bank cash = new Bank("Eurocash");
        cash.addCreditAtm1CashMachine(100);
        cash.addCreditAtm1CashMachine(100);
        cash.addCreditAtm1CashMachine(0);

        cash.addCreditAtm2CashMachine(100);
        cash.addCreditAtm2CashMachine(10);

        cash.addCreditAtm3CashMachine(0);
        cash.addCreditAtm3CashMachine(0);

        cash.addCreditAtm4CashMachine(0);
        assertEquals(400, cash.getBalancePaycheck(), 0.001);
        System.out.println(cash.getBalancePaycheck());
    }
    @Test
    public void shouldCalculateBankBalance() {
        Bank cash = new Bank("Eurocash");
        cash.getBalancePayment();
        cash.getBalancePaycheck();

        assertEquals(0,cash.getBalance(),0.01);
    }
}



