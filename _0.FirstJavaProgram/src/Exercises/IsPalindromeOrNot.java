package Exercises;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Scanner;

public class IsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next().toLowerCase();
        String firstHalf = word;
        String secondHalf = word;
        int wordLength = word.length();
        if (word.length() % 2 == 0) {
            firstHalf = word.substring(0, wordLength / 2);
            secondHalf = word.substring(wordLength / 2, wordLength);
        } else {
            firstHalf = word.substring(0, wordLength / 2 + 1);
            secondHalf = word.substring(wordLength / 2, wordLength);
        }

        String temp = "";

        for (int i = firstHalf.length() - 1; i >= 0; i--) {
            temp += firstHalf.charAt(i);
        }

        if (temp.equals(secondHalf)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
