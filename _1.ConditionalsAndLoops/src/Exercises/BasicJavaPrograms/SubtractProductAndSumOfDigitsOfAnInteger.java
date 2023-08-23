package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class SubtractProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int num = IsValidInput();
        int product = 1;
        int sum = 0;
        int temp = num;

        while (num >= 10) {
            product *= num % 10;
            sum += num % 10;
            num /= 10;
        }

        product *= num;
        sum += num;

        System.out.println("The result of subtracting product and sum of digits of Integer " + temp + " is: " + (product - sum));
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 1 && value <= Math.pow(10, 5)) {
                    break;
                } else {
                    System.out.print("Enter a value between " + 1 + " and " + Math.pow(10, 5) + " : ");
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
