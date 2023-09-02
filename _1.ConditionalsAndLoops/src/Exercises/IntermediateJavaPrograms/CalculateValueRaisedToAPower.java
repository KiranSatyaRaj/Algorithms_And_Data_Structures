package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculateValueRaisedToAPower {
    public static void main(String[] args) {
        System.out.println("Input number");
        int num = IsValidInput();
        System.out.println("Input power");
        int power = IsValidInput();
        double numberRaisedToPower = 1;
        if (power < 0) {
            int temp = power * -1;
            power = power + (temp * 2);
            numberRaisedToPower = 1 / loop(num, power);
            System.out.println("The number " + num + " to power " + power + " is: " + numberRaisedToPower);
        } else {
            numberRaisedToPower = loop(num, power);
            System.out.println("The number " + num + " to power " + power + " is: " + (int)numberRaisedToPower);
        }

    }

    static float loop(int num, int power) {
        for (int i = 1; i < power ; i++) {
            num *= num;
        }
        return num;
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
