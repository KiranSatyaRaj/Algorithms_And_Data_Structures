package Exercises;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci series: ");
        int num = input.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        int fibonacciSum = 0;

        for (int i = 1; i < num + 1; i++) {
            if (i == 1) {
                System.out.println(0);
            } else if (i == 2) {
                System.out.println(1);
            } else {
                fibonacciSum = temp1 + temp2;
                System.out.println(fibonacciSum);
                temp1 = temp2;
                temp2 = fibonacciSum;
            }
        }
    }
}
