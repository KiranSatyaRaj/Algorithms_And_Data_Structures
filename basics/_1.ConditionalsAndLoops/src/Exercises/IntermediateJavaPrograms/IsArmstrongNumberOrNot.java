package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class IsArmstrongNumberOrNot {
    public static void main(String[] args) {
        int number = IsValidInput();
        double armstrongSum = 0;
        int temp = number;
        int count = 1;
        while (temp > 10) {
            temp = temp / 10;
            count++;
        }

        temp = number;

        while (true) {
            if (temp < 10) {
                armstrongSum += Math.pow(temp, count);
                break;
            }
            armstrongSum += Math.pow(temp % 10, count);
            temp = temp / 10;
        }

        if (armstrongSum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }

    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = 0;
        while (true) {
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter a number: ");
                input = new Scanner(System.in);
            }
        }
        return number;
    }
}
