package Exercises.BasicJavaPrograms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        System.out.println("Input side a");
        int a = IsValidInput();
        System.out.println("Input side b");
        int b = IsValidInput();
        System.out.println("Input side c");
        int c = IsValidInput();

        int[] sides = SumOfTwoSidesGreaterThanOtherSide(a, b, c);
        int perimeter = sides[0] + sides[1] + sides[2];
        System.out.println("Perimeter of Triangle with sides(" + sides[0] + ", " + sides[1] + ", " + sides[2] + ") is: " + perimeter);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value > 0) {
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

    static int[] SumOfTwoSidesGreaterThanOtherSide(int side1, int side2, int side3) {
        while (side1 + side2 < side3) {
            System.out.println("Invalid Input. Please Greater Values for a and b again");
            side1 = IsValidInput();
            side2 = IsValidInput();
        }

        while (side2 + side3 < side1) {
            System.out.println("Invalid Input. Please Greater Values for b and c again");
            side2 = IsValidInput();
            side3 = IsValidInput();
        }

        while (side1 + side3 < side2) {
            System.out.println("Invalid Input. Please Greater Values for a and c again");
            side1 = IsValidInput();
            side3 = IsValidInput();
        }
        int[] sides = new int[3];
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;
        return sides;
    }
}
