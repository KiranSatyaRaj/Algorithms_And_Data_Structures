package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        System.out.println("Input Base");
        float base = IsValidInput();
        System.out.println();
        System.out.println("Input Height");
        float height = IsValidInput();

        float Area = base * height;
        System.out.println("Area of paralellogram is: " + Area);
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
