package Exercises.IntermediateJavaPrograms;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        String word = IsValidInput();
        String reverseString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString += (word.toLowerCase().charAt(i));
        }

        System.out.println(reverseString);
    }

    static String IsValidInput() {
        Scanner input = new Scanner(System.in);
        String word = "";

        while (true) {
            System.out.print("Enter a string: ");
            if (input.hasNext()) {
             word = input.next();
             break;
            }
        }
        return word;
    }
}
