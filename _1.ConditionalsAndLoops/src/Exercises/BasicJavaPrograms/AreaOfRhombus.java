package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.println("Input diagonal 1");
        float diagonal1 = IsValidInput();
        System.out.println();
        System.out.println("Input diagonal 2");
        float diagonal2 = IsValidInput();

        float Area = (diagonal1 * diagonal2) / 2;
        System.out.println("Area of Rhombus is: " + Area);
    }

    static float IsValidInput () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter positive value: ");
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
