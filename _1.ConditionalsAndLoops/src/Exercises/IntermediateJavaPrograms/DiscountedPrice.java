package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        System.out.println("Hello Customer, You can now Avail a discount of 40% on every product you buy. Happy Shopping!");
        Scanner input = new Scanner(System.in);
        float totalPrice = 0;
        float value = 0;

        while (true) {
            System.out.print("Enter value of the product: ");
            if (input.hasNextFloat()) {
                float temp = input.nextFloat();
                if (temp >= 0) {
                    value = temp;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else if (input.next().equals("x")) {
                break;
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value of the product: ");
                input = new Scanner(System.in);
            }

            float discountedValue = value - ((40 * value) / 100);
            totalPrice += discountedValue;
            System.out.println("Your discounted price is: " + discountedValue);
        }

        System.out.println("Total Price is: " + totalPrice);

    }

}
