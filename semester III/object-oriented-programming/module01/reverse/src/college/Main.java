package college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] bingo = {29, 15, 25, 19, 10, 13};
        // System.out.println(bingo); [I@4c873330

        //!Wrong ArrayList<int> bingo = new ArrayList<int>();
        ArrayList<Integer> bingo = new ArrayList<Integer>();
        // ArrayList cannot hold primitive data types such as int, double, char, and long. It has to be a class.

        ArrayList<String> nameList = new ArrayList<String>();
        System.out.print("Quantity: ");
        int qty = scanner.nextInt();
        String name;

        for(int i=0; i < qty;i++){
            System.out.print("Name: ");
            name = scanner.next();
            nameList.add(name);
        }

        // for(int i=nameList.size()-1; i>=0; i--) {
        // System.out.println(nameList.get(i));
        // }

        Collections.reverse(nameList);
        System.out.println(nameList);
    }
}