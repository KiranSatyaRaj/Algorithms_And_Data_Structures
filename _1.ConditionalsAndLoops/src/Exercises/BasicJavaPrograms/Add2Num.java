package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class Add2Num {
    public static void main(String[] args) {
        float num1 = IsValidInput();
        float num2 = IsValidInput();

        System.out.println("Sum of the given two numbers is: " + (num1 + num2));
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
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
