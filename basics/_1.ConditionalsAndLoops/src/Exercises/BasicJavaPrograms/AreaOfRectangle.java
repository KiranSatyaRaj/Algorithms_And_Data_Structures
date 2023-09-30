package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = 0;
        while (true) {
            if (input.hasNextDouble() && input.nextDouble() >= 0) {
                length = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter length: ");
                input = new Scanner(System.in);
            }
        }
        System.out.println();
        System.out.print("Enter breadth: ");
        double breadth = 0;
        while (true) {
            if (input.hasNextDouble() && input.nextDouble() >= 0) {
                breadth = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter breadth: ");
                input = new Scanner(System.in);
            }
        }
        double Area = length * breadth;
        System.out.println("Area: " + Area);
    }
}
