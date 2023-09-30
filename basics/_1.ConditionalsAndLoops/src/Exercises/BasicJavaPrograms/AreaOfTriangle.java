package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        float base = 0;
        float height = 0;

        while (true) {
            if (input.hasNextFloat() && input.nextFloat() >= 0) {
                base = input.nextFloat();
                height = input.nextFloat();
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter base and height: ");
                input = new Scanner(System.in);
            }

        }

        double Area = (base * height) / 2;
        System.out.println(Area);
    }
}
