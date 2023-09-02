package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        float totalSales = IsValidInput();
        float commissionPercentage = 30;
        float commissionValue = totalSales * (commissionPercentage / 100);

        System.out.println("Commission value is: " + commissionValue);
        System.out.println(Math.pow(-3, -1));
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total sales: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter total sales: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
