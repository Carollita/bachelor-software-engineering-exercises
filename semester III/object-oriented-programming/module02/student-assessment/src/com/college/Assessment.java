package com.college;
public class Assessment {
    double grade1, grade2, grade3;

    // Constructor
    Assessment(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double arithmeticAverage() {
        return ((grade1 + grade2 + grade3) / 3);
    }

    public double weightedAverage() {
        return (((grade1 * 2) + (grade2 * 3) + (grade3 * 4)) / 9);
    }
}
