package college;

public class Arrays {
    public static void main(String[] args) {
        System.out.println();

        int[] numbers = {1,9,32,8,18};
        // int numbers[] = {1,9,32,8,18};
        numbers[0] = 12;
        // 12,9,32,8,18
        System.out.println(numbers[0] + " and " + numbers[1]);

        int[] birthday_days = new int[200];
        birthday_days[60] = 29;
        System.out.println(birthday_days[12]); // 0
        System.out.println(birthday_days[60]); // 29
    }
}
