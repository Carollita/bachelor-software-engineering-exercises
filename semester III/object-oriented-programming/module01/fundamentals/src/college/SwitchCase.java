package college;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Do you want ice-cream? (yes / no / idk)");
        Scanner keyboard = new Scanner(System.in);

        String decision =  keyboard.next();

        switch (decision) {
            case "yes" -> System.out.println("I will buy for u an ice-cream!");
            case "no" -> System.out.println("Are you okay?");
            default -> System.out.println("You need to decide... But I know the answer will probably be yes...");

//        switch(decision) {
//            case "Yes":
//                System.out.println(""I will buy for u an ice-cream!");
//                break;
//            case "No":
//                System.out.println("Are you okay?");
//                break;
//            default:
//                System.out.println("You need to decide... But I know the answer will probably be yes...");
        }

    }
}
