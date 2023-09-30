package Exercises.IntermediateJavaPrograms;

import java.sql.Array;
import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        int noOfSubjects = IsValidInput();
        float[] marks = marks(noOfSubjects);
        float[] cgpaPoints = new float[marks.length];
        float cgpaSum = 0;

        for (int i = 0; i < marks.length; i++) {
            cgpaPoints[i] = marks[i] / 10;
            cgpaSum += cgpaPoints[i];
        }

        float cgpa = (cgpaSum / cgpaPoints.length);

        System.out.println("CGPA is: " + cgpa);
    }

    static int IsValidInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of subjects: ");
        int subjects = 0;
        while (true) {
            if (input.hasNextInt()) {
                subjects = input.nextInt();
                if (subjects > 0) {
                    break;
                } else {
                    System.out.print("Enter a value greater than zero: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter no of Subjects: ");
                input = new Scanner(System.in);
            }
        }
        return subjects;
    }
    static float[] marks(int noOfSubjects) {
        System.out.println("Start Entering marks");
        Scanner input = new Scanner(System.in);
        float[] values = new float[noOfSubjects];
        int count = 0;
        while (count < noOfSubjects) {
            System.out.print("Enter value: ");
            if (input.hasNextInt()) {
                values[count] = input.nextInt();
                if (values[count] >= 10) {
                    count++;
                } else {
                    System.out.print("Enter a value greater than 10: ");
                }
            } else {
                System.out.println("Invalid Input");
                System.out.print("Enter marks");
                input = new Scanner(System.in);
            }
        }
        return values;
    }
}
