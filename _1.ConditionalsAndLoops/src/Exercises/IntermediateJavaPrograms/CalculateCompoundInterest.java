package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void main(String[] args) {
        System.out.println("Input Principal Amount");
        float principalAmount = IsValidInput();
        System.out.println("Input Increase Rate");
        float rate = IsValidInput();
        System.out.println("Input Time");
        float time = IsValidInput();

        double compoundInterest = principalAmount * Math.pow(1 + (rate / 100), time);
        System.out.println("Compound Interest Amount is: " + compoundInterest);
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
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
