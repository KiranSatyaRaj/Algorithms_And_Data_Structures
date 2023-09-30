package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class TakeInputAndPrintLargestSum {
    public static void main(String[] args) {
        int largestNum = 0;
        int value = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value > largestNum) {
                    largestNum = value;
                    System.out.print("Enter an integer value: ");
                } else if (value == 0){
                    break;
                } else {
                    System.out.print("Enter an integer value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter an integer value: ");
                input = new Scanner(System.in);
            }
        }

        System.out.println("The largest number is: " + largestNum);
    }
}
