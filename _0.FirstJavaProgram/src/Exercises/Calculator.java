package Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        System.out.print("Enter another number: ");
        input = new Scanner(System.in);
        int num2 = input.nextInt();

        System.out.print("Choose and Enter an operator from the following (+, -, *, /): ");
        input = new Scanner(System.in);
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }
    }
}
