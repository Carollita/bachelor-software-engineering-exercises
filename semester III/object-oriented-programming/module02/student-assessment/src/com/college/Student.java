package com.college;

public class Student {
    String name;
    String course;
    Assessment grade;

    public Student(String name, String course, Assessment grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    void info() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Arithmetic Average: " + grade.arithmeticAverage());
        System.out.println("Weighted Average: " + grade.weightedAverage());
        System.out.println("--------------------------------------------");
    }
}
