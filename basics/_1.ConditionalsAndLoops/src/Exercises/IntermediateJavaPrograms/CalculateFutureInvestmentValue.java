package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        System.out.println("Input Present Value");
        double presentValue = IsValidInput();
        System.out.println("Input Interest Rate");
        double interestRate = IsValidInput();
        System.out.println("Enter Time period in years");
        double timePeriod = IsValidInput();

        double futureInvestmentValue = presentValue * Math.pow(1 + (interestRate / 100), timePeriod);
        System.out.println("Your Future Investment Value is: " + futureInvestmentValue);
    }

    static double IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        double value = 0;
        while (true) {
            if (input.hasNextDouble()) {
                value = input.nextDouble();
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
