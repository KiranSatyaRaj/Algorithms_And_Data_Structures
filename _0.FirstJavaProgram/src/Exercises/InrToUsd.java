package Exercises;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        float inrInUsd = 0.012f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        float rupees = input.nextFloat();

        System.out.println((int) rupees + " inr to usd is " + rupees * inrInUsd);
    }
}
