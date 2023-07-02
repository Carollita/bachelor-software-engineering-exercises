package college;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Age: ");
        int age = keyboard.nextInt();

        if(age < 15){
            System.out.println("Go home! You are just a child.");
        } else if (age <= 17){
            System.out.println("Go home! You will only be able to enter in a few years.");
        } else {
            System.out.println("You may come in!");
        }
    }
}
