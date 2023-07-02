package college;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Age: ");
        int age = keyboard.nextInt();

        System.out.print("Weight: ");
        double weight = keyboard.nextDouble();

        System.out.print("Name: ");
        String name = keyboard.next();
    }
}
