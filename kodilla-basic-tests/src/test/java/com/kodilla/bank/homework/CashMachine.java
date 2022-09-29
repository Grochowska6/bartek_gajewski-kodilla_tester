package com.kodilla.bank.homework;

public class CashMachine {
    public static void main(String[] args) {

    }

    private int[] deposit;
    private int size;

    private int size2;

    private int[] credit;



    public CashMachine() {
        this.size = 0;
        this.size2 = 0;
        this.deposit = new int[0];
        this.credit = new int[0];


    }
    public void addDeposit(int depo) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(deposit, 0, newTab, 0, deposit.length);
        newTab[this.size - 1] = depo;
        this.deposit = newTab;

    }
    public void addCredit(int credo) {
        this.size2++;
        int[] newTab2 = new int[this.size2];
        System.arraycopy(credit, 0, newTab2, 0, credit.length);
        newTab2[this.size2 - 1] = credo;
        this.credit = newTab2;
    }
    public int[] getDeposit() {
        return deposit;

    }
    public int[] getCredit() {
        return credit;
    }


    public double getPayment() {
        if (this.deposit.length == 0){
           return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.deposit.length; i++) {
            sum += this.deposit[i];
        }
        return sum/this.deposit.length;

    }
    public double getPaycheck() {
        if (this.credit.length == 0){
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.credit.length; i++) {
            sum += this.credit[i];
        }
        return sum/this.credit.length;
    }
}
