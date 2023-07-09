package com.college;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SchoolClass class2B = new SchoolClass();

        class2B.teacher = new Teacher();
        class2B.teacher.name = "Marcia";

        class2B.students = new ArrayList<>();
        class2B.students.add(new Student());
        class2B.students.get(0).name = "Carolina";

        System.out.println( class2B.students.get(0).name); // Carolina
        System.out.println( class2B.students.get(0).cpf); // null
    }
}