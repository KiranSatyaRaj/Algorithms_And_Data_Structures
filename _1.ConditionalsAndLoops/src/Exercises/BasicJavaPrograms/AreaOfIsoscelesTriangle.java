package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base of the triangle: ");
        double base = 0;
        while (true) {
            if (input.hasNextDouble()) {
                base = input.nextDouble();
                if (base >= 0) {
                    break;
                } else {
                    System.out.print("Please Enter positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter base of the triangle: ");
                input = new Scanner(System.in);
            }
        }

        System.out.print("Enter length of the two equal sides: ");
        double equalSide = 0;
        while (true) {
            if (input.hasNextDouble()) {
                equalSide = input.nextDouble();
                double isEqualSideGreaterThanBase = 4 * Math.pow(equalSide, 2) - Math.pow(base, 2);
                if (equalSide >= 0 && isEqualSideGreaterThanBase >= 0) {
                    break;
                } else {
                    System.out.print("Please Enter positive value or Enter Greater value of side: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter length of the two equal sides: ");
                input = new Scanner(System.in);
            }
        }

        double Area = (base * Math.sqrt(Math.pow(equalSide, 2) - (Math.pow(base, 2) / 4))) / 2;
        System.out.println("Area of isosceles triangle is: " + Area);

    }
}
