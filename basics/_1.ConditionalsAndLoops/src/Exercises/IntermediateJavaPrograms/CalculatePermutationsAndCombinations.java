package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class CalculatePermutationsAndCombinations {
    public static void main(String[] args) {
        System.out.println("Input n");
        int n = IsValidInput();
        System.out.println("Input r");
        int r = IsValidInput();
        int nMinusR = n - r;

        int noOfPermutations = factorial(n) / factorial(nMinusR);
        int noOfCombinations = factorial(n) / (factorial(r) * factorial(nMinusR));

        System.out.println("No of Permutations are: " + noOfPermutations);
        System.out.println("No of combinations are: " + noOfCombinations);
    }

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int value = 1;
        for (int i = 1; i <= num; i++) {
            value *= i;
        }
        return value;
    }

    static int IsValidInput() {
        Scanner input = new Scanner( System.in);
        System.out.print("Enter value: ");
        int value = 0;
        while (true) {
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a postive value");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value: ");
                input = new Scanner(System.in);
            }
        }
        return  value;
    }
}
