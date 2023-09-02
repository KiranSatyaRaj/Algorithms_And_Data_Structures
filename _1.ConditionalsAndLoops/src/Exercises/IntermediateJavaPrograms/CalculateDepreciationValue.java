package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateDepreciationValue {
    public static void main(String[] args) {
        System.out.println("Input initial value");
        int initial = IsValidInput();
        System.out.println("Input Rate");
        float rate = IsValidInput();
        System.out.println("Input Time");
        int time = IsValidInput();

        double depreciationValue = initial * Math.pow(1 - (rate / 100), time);
        System.out.println("The depreciated value is: " + depreciationValue);
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
                    System.out.print("Enter a positive value: ");
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
