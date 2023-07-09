package com.college;

public class Student {
    int schoolEnrollmentId;
    String name;
    String cpf;

    void info() {
        System.out.println("------ School enrollment data ------");
        System.out.println("School Enrollment id: " + schoolEnrollmentId);
        System.out.println("Name: " + name);
        System.out.println("Cpf: " + cpf);
    }
}
