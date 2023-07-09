package com.college;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student a = new Student();

        a.schoolEnrollmentId = 101;
        a.name = "Doug";
        a.cpf = "10034598743";

        Student b = new Student(102, "Ana", "45365786542");

        a.info();
        b.info();

        Student c = new Student(103);
        c.info();

        //!Error Student d = new Student(104, "Lari"); constructor not created for just one parameter


        Student e = new Student(105);
        ArrayList<Student> students = new ArrayList<>();
        students.add(e);

        students.add(new Student(106, "Yasmin", "23456785409"));

        System.out.println("----- Student List -----");
        System.out.println(students.get(0).schoolEnrollmentId);
        System.out.println(students.get(0).name);
        System.out.println(students.get(0).cpf);

        System.out.println("----- Student List -----");
        System.out.println(students.get(1).schoolEnrollmentId);
        System.out.println(students.get(1).name);
        System.out.println(students.get(1).cpf);
    }
}