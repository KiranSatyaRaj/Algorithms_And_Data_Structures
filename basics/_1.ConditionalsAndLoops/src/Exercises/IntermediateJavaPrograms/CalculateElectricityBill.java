package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        System.out.println("Input Units");
        int units = IsValidInput();
        int temp = units;
        int electricityBill = 0;
        if (units >= 300) {
            electricityBill = ((temp - 300) * 25) + (100 * 20) + (100 * 15) + (10 * 100);
        } else if (units >= 200 && units < 300) {
            electricityBill = ((temp - 200) * 20) + (100 * 15) + (10 * 100);
        } else if (units >= 100 && units < 200) {
            electricityBill = ((temp - 100) * 15) + (10 * 100);
        } else {
            electricityBill = 10 * units;
        }

        System.out.println("Electricity Bill in rupees: " + electricityBill);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = 1;
        while (true) {
            if (input.hasNextInt()) {
                units = input.nextInt();
                if (units > 0) {
                    break;
                } else {
                    System.out.print("Please enter a value greater than zero: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter units: ");
                input = new Scanner(System.in);
            }
        }
        return units;
    }
}
