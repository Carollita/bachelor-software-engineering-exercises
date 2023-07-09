package com.college;

public class Student {
    int schoolEnrollmentId;
    String name;
    String cpf;

// Constructors
//    Student(int pSchoolEnrollmentId, String pName, String pCpf) {
//        schoolEnrollmentId = pSchoolEnrollmentId;
//        name = pName;
//        cpf = pCpf;
//    }

    Student(int schoolEnrollmentId, String name, String cpf) {
        this.schoolEnrollmentId = schoolEnrollmentId;
        this.name = name;
        this.cpf = cpf;
    }

// automatically created Student(){} but it is replaced when creating another constructor, being necessary to write in the code
    Student(){

    }

    Student(int schoolEnrollmentId) {
        this.schoolEnrollmentId = schoolEnrollmentId;
        this.cpf = "00000000000";
    }

    void info() {
        System.out.println("------ School enrollment data ------");
        System.out.println("School Enrollment id: " + schoolEnrollmentId);
        System.out.println("Name: " + name);
        System.out.println("Cpf: " + cpf);
    }
}
