package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        float perimeter = 3 * IsValidInput();
        System.out.println("Perimeter of Equilateral Triangle is: " + perimeter);
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = 0;
        while (true) {
            if (input.hasNextFloat()) {
                side = input.nextFloat();
                if (side >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter side: ");
                input = new Scanner(System.in);
            }
        }
        return side;
    }
}
