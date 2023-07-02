package college;

public class WhileAndDoWhile {
    public static void main(String[] args) {
        //* WHILE - The while loop loops through a block of code as long as a specified condition is true:
        System.out.println("While:");

        int i = 0;
        while (i < 5) {
            System.out.print(i);
            i++;
            // 01234
        }

        System.out.println("\nDo While:");
        //* DO WHILE - This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
        int j = 0;
        do {
            System.out.print(j);
            j++;
        }
        while (j < 5);
        // 01234
    }
}
