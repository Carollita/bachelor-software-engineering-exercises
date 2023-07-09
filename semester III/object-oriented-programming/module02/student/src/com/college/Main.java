package com.college;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, mom! My school data!");
        Student a = new Student();

        a.schoolEnrollmentId = 1;
        a.name = "Mario";
        a.cpf = "60097867921";

        System.out.println(a.schoolEnrollmentId);
        System.out.println(a.name);
        System.out.println(a.cpf);

        a.name = "Luigi";
        System.out.println(a.name);
        a.info();

        Student b = new Student();

        b.schoolEnrollmentId = 2;
        b.name = "Yoshi";
        b.cpf = "87096837952";
        b.info();
    }
}