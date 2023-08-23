package Exercises.BasicJavaPrograms;

import java.sql.Array;
import java.util.Scanner;

public class OutputAllFactorsOfANumber {
    public static void main(String[] args) {
        int num = IsValidInput();
        System.out.println("The factors of " + num + " are:");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(num);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
