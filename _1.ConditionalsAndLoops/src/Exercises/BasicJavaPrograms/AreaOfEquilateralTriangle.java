package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the side: ");
        double side = 0;
        while (true) {
            if (input.hasNextDouble() && input.nextDouble() >= 0) {
                side = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter length of the side: ");
                input = new Scanner(System.in);
            }
        }

        double Area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("Area of equilateral triangle: " + Area);
    }
}
