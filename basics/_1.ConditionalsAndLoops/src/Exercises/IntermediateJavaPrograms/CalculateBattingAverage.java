package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        System.out.println("Input batsman total runs");
        float totalRuns = IsValidInput();
        System.out.println("Input total matches batsman played");
        float totalMatches = IsValidInput();
        System.out.println("Input total innings batsman remained not out");
        float notOutInnings = IsValidInput();
        float noOfDismissals = totalMatches - notOutInnings;

        if (noOfDismissals == 0) {
            System.out.println("NA");
        } else {
            float battingAverage = totalRuns / noOfDismissals;
            System.out.println("Batsman average is: " + battingAverage);
        }

    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;

        while (true) {
            if (input.hasNextFloat()) {
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
