package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class IsPerfectNumberOrNot {
    public static void main(String[] args) {
        int value = IsValidInput();
        int divisorSum = 0;
        for (int i = 1; i <= value / 2; i++) {
            if (value % i == 0) {
                divisorSum += i;
            }
        }

        if (divisorSum == value) {
            System.out.println(value + " is a perfect number");
        } else {
            System.out.println(value + " is not a perfect number");
        }
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value greater than 0: ");
        int value;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value > 0) {
                    break;
                } else {
                    System.out.print("Enter value greater than 0: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value greater than zero: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
