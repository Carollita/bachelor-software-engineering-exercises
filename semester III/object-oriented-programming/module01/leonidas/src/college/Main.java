package college;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Guess how many soldiers leonidas spartans will face. What's your guess? ");

        int guess = keyboard.nextInt();
        int answer = 10000;
        String msg;

        while(guess != answer) {
            msg = guess > answer ? "it is a smaller amount..." : "it is a larger amount...";
//            if(guess > answer){
//                System.out.println("it is a smaller amount...");
//            } else {
//                System.out.println("it is a larger amount...");
//            }
            System.out.print("Enter another guess: ");
            guess = keyboard.nextInt();
        }

        System.out.println("You´re correct!!!");
    }
}