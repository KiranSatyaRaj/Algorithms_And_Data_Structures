package Exercises;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);

        while (!input.hasNextInt()) {
            System.out.print("Enter Integer Value: ");
            input = new Scanner(System.in);
        }

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
