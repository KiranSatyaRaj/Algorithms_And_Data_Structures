package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num = 0;
        System.out.println("Enter x to end the program");

        while (true) {
            System.out.print("Enter a number: ");
            if (input.hasNextInt()) {
                num = input.nextInt();
                if (num >= 0) {
                    sum += num;
                    count++;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else if (input.next().equals("x")) {
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter a number: ");
                input = new Scanner(System.in);
            }
        }

        if (sum > 0) {
            System.out.println("The average is: " + (sum / count));
        }
    }
}
