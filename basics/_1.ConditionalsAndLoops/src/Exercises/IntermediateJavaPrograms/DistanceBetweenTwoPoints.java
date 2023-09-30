package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        System.out.println("Input x1 co-ordinate");
        int x1 = IsValidInput();
        System.out.println("Input y1 co-ordinate");
        int y1 = IsValidInput();
        System.out.println("Input x2 co-ordinate");
        int x2 = IsValidInput();
        System.out.println("Input y2 co-ordinate");
        int y2 = IsValidInput();

        double distanceBetweenX1AndX2 = Math.pow(x2 - x1, 2);
        double distanceBetweenY1AndY2 = Math.pow(y2 - y1, 2);
        double distanceBetweenTwoPoints = Math.sqrt(distanceBetweenX1AndX2 + distanceBetweenY1AndY2);

        System.out.println("Distance between the point (" + x1 + ", " + y1 + ") and the point (" + x2 + ", " + y2 + ") is: " + distanceBetweenTwoPoints);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of the co-ordinate: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value of the co-ordinate: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
