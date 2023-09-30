package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class TakeInputOfIntUntil0 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                sum += value;
                if (value == 0) {
                    break;
                } else {
                    System.out.print("Enter an integer value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter an integer value: ");
                input = new Scanner(System.in);
            }
        }

        System.out.println("Sum of Integers entered is: " + sum);
    }
}
