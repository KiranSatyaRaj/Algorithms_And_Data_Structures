package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class FindHCFAndLCMOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = IsValidInput();
        int num2 = IsValidInput();
        int hcf = 0;
        int lowestNum = 0;
        if (num1 < num2) {
            lowestNum = num1;
        } else {
            lowestNum = num2;
        }
        for (int i = 1; i < lowestNum / 2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF and LCM of numbers " + num1 + " and " + num2 + " are: " + hcf + " " + lcm);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int val = 0;
        while (true) {
            if (input.hasNextInt()) {
                val = input.nextInt();
                if (val > 0) {
                    break;
                } else {
                    System.out.print("Enter a value greater than 0: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter a number: ");
                input = new Scanner(System.in);
            }
        }
        return val;
    }
}
