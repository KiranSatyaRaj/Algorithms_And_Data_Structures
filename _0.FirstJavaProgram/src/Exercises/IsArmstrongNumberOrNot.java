package Exercises;

import java.util.Scanner;

public class IsArmstrongNumberOrNot {
    public static void main(String[] args) {
        // System.out.println(String.valueOf(num).length());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        int temp = num;
        int numSum = 0;
        int numLength = String.valueOf(num).length();
        while (true) {
            if (num < 10) {
                numSum += Math.pow(num, numLength);
                break;
            }
            int remainder = num % 10;
            numSum += Math.pow(remainder, numLength);
            num -= remainder;
            num = num / 10;
        }

        if (temp == numSum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
