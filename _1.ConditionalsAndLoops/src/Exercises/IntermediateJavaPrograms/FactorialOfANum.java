package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class FactorialOfANum {
    public static void main(String[] args) {
        long factorialNum = 1;
        System.out.println("Input Number");
        int num = IsValidInput();

        for (int i = 1; i <= num; i++) {
            factorialNum *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorialNum);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive integer value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter a positive integer value: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
