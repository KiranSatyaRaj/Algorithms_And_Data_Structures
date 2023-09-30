package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Input Length");
        float length = IsValidInput();
        System.out.println("Input Breadth");
        float breadth = IsValidInput();

        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }

    public static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
                if (value >= 0){
                    break;
                } else {
                    System.out.print("Enter a positive value");
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
