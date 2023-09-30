package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class TotalAndCurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        System.out.println("Input Radius");
        float radius = IsValidInput();
        System.out.println("Input Height");
        float height = IsValidInput();

        double curvedSurfaceArea = 2 * Math.PI * radius * height;
        double totalSurfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("Total Surface Area and Curved Surface Area of Cylinder are: " + totalSurfaceArea + " " + curvedSurfaceArea);
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value: ");
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
