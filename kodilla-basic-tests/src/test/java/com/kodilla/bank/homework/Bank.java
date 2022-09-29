package com.kodilla.bank.homework;


public class Bank {


    private String name;
    private CashMachine Atm1;
    private CashMachine Atm2;
    private CashMachine Atm3;
    private CashMachine Atm4;


    public Bank(String name) {
        this.name = name;
        this.Atm1 = new CashMachine();
        this.Atm2 = new CashMachine();
        this.Atm3 = new CashMachine();
        this.Atm4 = new CashMachine();

    }
    public void addDepositAtm1CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm1.addDeposit(cash);
        }
    }
    public void addDepositAtm2CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm2.addDeposit(cash);
        }
    }
    public void addDepositAtm3CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm3.addDeposit(cash);
        }
    }
    public void addDepositAtm4CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm4.addDeposit(cash);
        }
    }
    public void addCreditAtm1CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm1.addCredit(cash);
        }
    }
    public void addCreditAtm2CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm2.addCredit(cash);
        }
    }
    public void addCreditAtm3CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm3.addCredit(cash);
        }
    }
    public void addCreditAtm4CashMachine(int cash) {
        if (cash > 0 && cash < 1000) {
            this.Atm4.addCredit(cash);
        }
    }
    public double getAtm1Payment(){
        return this.Atm1.getPayment();
    }
    public double getAtm2Payment(){
        return this.Atm2.getPayment();
    }
    public double getAtm3Payment(){
        return this.Atm3.getPayment();
    }
    public double getAtm4Payment(){
        return this.Atm4.getPayment();
    }
    public double getAtm1Paycheck() {
        return this.Atm1.getPaycheck();
    }
    public double getAtm2Paycheck() {
        return this.Atm2.getPaycheck();
    }
    public double getAtm3Paycheck() {
        return this.Atm3.getPaycheck();
    }
    public double getAtm4Paycheck() {
        return this.Atm4.getPaycheck();
    }

    public double getBalancePayment(){
        double sum = this.Atm1.getPayment() + this.Atm2.getPayment() + this.Atm3.getPayment() + this.Atm4.getPayment();
        return sum/4;
    }
    public double getBalancePaycheck() {
        double sum = this.Atm1.getPaycheck() + this.Atm2.getPaycheck() + this.Atm3.getPaycheck() + this.Atm4.getPaycheck();
        return sum/4;
    }
    public double getBalance(){
        return (this.Atm1.getPayment() + this.Atm2.getPayment() + this.Atm3.getPayment() + this.Atm4.getPayment()) - (this.Atm1.getPaycheck() + this.Atm2.getPaycheck() + this.Atm3.getPaycheck() + this.Atm4.getPaycheck());
    }

}




