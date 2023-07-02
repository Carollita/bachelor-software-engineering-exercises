package college;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        double height;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Weight: ");
        weight = keyboard.nextInt();
        System.out.print("Height: ");
        height = keyboard.nextDouble();

        double imc = weight / (height * height);
        System.out.printf("Imc: %.2f", imc);
    }
}