package com.college;

public class Main {
    public static void main(String[] args) {
        Assessment naruto = new Assessment(2, 4, 5);

        System.out.println("Arithmetic Average: " + naruto.arithmeticAverage());
        System.out.println("Weighted Average: " + naruto.weightedAverage());
    }
}