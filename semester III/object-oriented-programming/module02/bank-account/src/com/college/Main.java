package com.college;

public class Main {
    public static void main(String[] args) {
        Account c1 = new Account(1, "Yato", 50, 20);

        System.out.println(".............. Initial Info ..............");
        c1.info();

        System.out.println(".......... Withdraw and Deposit ..........");
        if(!c1.withdraw(1)) {
            System.out.println("Withdraw Error!");
        };

        if(!c1.deposit(10)) {
            System.out.println("Deposit Error!");
        };

        c1.info();

        Account c2 = new Account(2, "Yuki", 1000, 200);

        System.out.println(".............. Transference ..............");
        if(!c1.transfer(c2, 23)) {
            System.out.println("Transfer Error!");
        };

        c1.info();
        c2.info();

    }
}