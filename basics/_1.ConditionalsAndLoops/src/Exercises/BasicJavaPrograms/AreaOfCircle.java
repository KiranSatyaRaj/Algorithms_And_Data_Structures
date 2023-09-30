package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = 0;

       while (true) {
           if (input.hasNextFloat() && input.nextFloat() >= 0) {
               radius = input.nextFloat();
               break;
           } else {
               System.out.println("Invalid Input");
               System.out.print("Enter radius: ");
               input = new Scanner(System.in);
           }
       }

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle with radius " + radius + " is " + area);
    }
}
