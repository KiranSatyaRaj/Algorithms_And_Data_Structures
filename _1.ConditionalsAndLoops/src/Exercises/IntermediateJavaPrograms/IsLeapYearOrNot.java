package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class IsLeapYearOrNot {
    public static void main(String[] args) {
        int year = IsValidInput();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
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
                    System.out.println("Enter value greater than 0: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.println("Enter value greater than 0: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
