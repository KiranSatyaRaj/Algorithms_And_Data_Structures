package Exercises.BasicJavaPrograms;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        System.out.println("Input Base");
        float base = IsValidInput();
        System.out.println("Input Height");
        float height = IsValidInput();
        System.out.println("Input Length");
        float length = IsValidInput();

        float volume = (base * height * length) / 3;
        System.out.println("Volume of Pyramid is: " + volume);
    }

    static float IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        float value = 0;
        while (true) {
            if (input.hasNextFloat()) {
                value = input.nextFloat();
                if (value >= 0) {
                    break;
                } else {
                    System.out.print("Enter a positive value: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter value: ");
                input = new Scanner(System.in);
            }
        }
        return value;
    }
}
