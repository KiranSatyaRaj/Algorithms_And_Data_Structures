package Exercises.IntermediateJavaPrograms;
import java.util.Scanner;

public class CalculateSumOfNegativePositiveNumbersUntil0 {
    public static void main(String[] args) {
        int[] nums = IsValidInput();
        System.out.println("Sum of negative numbers is: " + nums[0]);
        System.out.println("Sum of positive even numbers is: " + nums[1]);
        System.out.println("Sum of positive odd numbers is: " + nums[2]);
    }

    static int[] IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int[] nums = new int[3];
        int val;
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
    while (true) {
            if (input.hasNextInt()) {
                val = input.nextInt();
                if (val < 0) {
                    negativeSum += val;
                    System.out.print("Enter an integer: ");
                } else if (val > 0 && val % 2 == 0) {
                    positiveEvenSum += val;
                    System.out.print("Enter an integer: ");
                } else if (val > 0 && val % 2 != 0) {
                    positiveOddSum += val;
                    System.out.print("Enter an integer: ");
                } else{
                    break;
                }
            }
            else {
                System.out.println("Invalid Input");
                System.out.print("Enter an integer: ");
                input = new Scanner(System.in);
            }
        }
    nums[0] = negativeSum;
    nums[1] = positiveEvenSum;
    nums[2] = positiveOddSum;
    return nums;
    }
}
