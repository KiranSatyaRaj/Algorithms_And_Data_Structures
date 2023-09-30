package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        System.out.println("Input Num");
        int num = IsValidInput();

        int a = 0;
        int b = 1;

        if (num == 0 || num == 1) {
            System.out.println("Fibonacci sum is: " + 0);
        }

        if (num == 2) {
            System.out.println("Fibonacci sum is: " + 1);
        }

        for (int i = 3; i <= num; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println("Fibonacci sum is: " + b);
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
