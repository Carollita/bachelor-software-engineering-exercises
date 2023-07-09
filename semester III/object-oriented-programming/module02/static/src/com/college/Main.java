package com.college;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car Beetle = new Car();

        System.out.println(Beetle.milesToMeters(10)); // accessed via instance reference
        System.out.println(Car.milesToMeters(5)); // not accessed via instance reference

        System.out.println(Beetle.BRAND); // accessed via instance reference
        System.out.println(Car.BRAND); // not accessed via instance reference
        //!Error Car.BRAND = "Fiat"; because added final
    }
}