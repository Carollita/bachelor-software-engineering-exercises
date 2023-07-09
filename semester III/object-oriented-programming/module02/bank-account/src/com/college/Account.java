package com.college;
public class Account {
    int number;
    String owner;
    double balance;
    double limit;

    // Constructor
    Account(int number, String owner, double balance, double limit) {
        this.number = number;
        this.owner = owner;
        this.balance = balance;
        this.limit = limit;
    }

    boolean withdraw(double value) {
        if(value > limit || value > balance || value <= 0) {
            return false;
        }
        balance -= value;
        return true;
    }

    boolean deposit(double value) {
        if(value <= 0) {
            return false;
        }
        balance += value;
        return true;
    }

    boolean transfer(Account destinationAccount, double value) {
        if(value <= 0) {
            return false;
        }
        balance -= value;
        destinationAccount.balance += value;
        return true;
    }

    void info() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + owner);
        System.out.println("Balance: " + balance);
        System.out.println("Limit: " + limit);
        System.out.println("------------------------------------------");
    }

}











