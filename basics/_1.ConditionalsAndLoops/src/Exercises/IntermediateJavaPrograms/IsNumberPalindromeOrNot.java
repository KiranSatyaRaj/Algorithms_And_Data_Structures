package Exercises.IntermediateJavaPrograms;

import Exercises.BasicJavaPrograms.PerimeterOfRectangle;

import java.util.Scanner;

public class IsNumberPalindromeOrNot {
    public static void main(String[] args) {
        int num = IsValidInput();
        int temp = num;
        int palindromeNum = 0;

        while (true) {
            if (temp < 10) {
                palindromeNum = palindromeNum * 10 + temp;
                break;
            }
            int rem = temp % 10;
            temp = temp / 10;
            palindromeNum = palindromeNum * 10 + rem;
        }

        if (palindromeNum == num) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 0;
        while (true) {
            if (input.hasNextInt()) {
                num = input.nextInt();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter a number: ");
                input = new Scanner(System.in);
            }
        }
        return num;
    }
}
