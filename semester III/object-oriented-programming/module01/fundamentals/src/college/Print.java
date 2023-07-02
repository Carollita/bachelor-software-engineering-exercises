package college;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        int age = 18;
        age = age + 1;
        double weight = 41.8;
        //!Wrong float weight2 = 72.5;
        float weight2 = 41.8F;

        System.out.print("Age: " + age + "\n");
        // Adding a new line (\n)
        System.out.println("Age: " + age);
        System.out.printf("Age: %d\n", age);
        // s formats strings.
        // d formats decimal integers.
        // f formats floating-point numbers.
        // t formats date/time values.

        System.out.printf("Weight: %f\n", weight); // Weight: 41,800000
        System.out.printf("Weight: %.2f\n", weight); // Weight: 41,80
    }
}
