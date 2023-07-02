package college;

public class For {
    public static void main(String[] args) {
        System.out.println("college.Print the numbers 0 to 10:");
        for (int i = 0; i < 11; i++) {
            System.out.print(i);
            // 012345678910
        }

        System.out.println("\ncollege.Print even values between 0 and 10:");
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.print(i);
            // 0246810
        }
    }
}
