package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        System.out.println("Input Radius");
        float radius = IsValidInput();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle is: " + perimeter);
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = 0;
        while (true) {
            if (input.hasNextFloat()) {
                radius = input.nextFloat();
                if (radius >= 0) {
                    break;
                } else {
                    System.out.print("Enter positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter radius: ");
                input = new Scanner(System.in);
            }
        }
        return radius;
    }
}
