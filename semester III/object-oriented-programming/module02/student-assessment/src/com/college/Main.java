package com.college;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Deku", "Hero", new Assessment(9, 9, 10));
        Student b = new Student("Todoroki", "Hero", new Assessment(10, 10, 10));

        a.info();
        b.info();
    }
}