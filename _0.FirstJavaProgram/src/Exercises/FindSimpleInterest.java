package Exercises;

import java.util.Scanner;

public class FindSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principle amount: ");
        while (!input.hasNextInt()) {
            System.out.print("Enter Principle amount: ");
            input = new Scanner(System.in);
        }
        int principle = input.nextInt();

        System.out.print("Enter Time: ");
        while (!input.hasNextInt()) {
            System.out.print("Enter Time: ");
            input = new Scanner(System.in);
        }
        int time = input.nextInt();

        System.out.print("Enter Rate of Interest: ");
        while (!input.hasNextInt()) {
            System.out.print("Enter Rate of Interest: ");
            input = new Scanner(System.in);
        }
        int rate = input.nextInt();

        float SimpleInterest = principle * time * rate / 100;
        System.out.print("Simple Interest is: " + SimpleInterest);
    }
}
