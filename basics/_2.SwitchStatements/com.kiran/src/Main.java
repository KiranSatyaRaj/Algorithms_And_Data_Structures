import java.util.Scanner;
import java.util.SimpleTimeZone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // both a and b are pointing to the same hello object
        // memory location of string object a and b is the same
//        String a = "hello";
//        String b = "hello";

        // we can use a better syntax instead of multiple if or if-else-if-else statements
//        if (fruit.equals("mango")) {
//            System.out.println("King of fruits");
//        }
//
//        if (fruit.equals("apple")) {
//            System.out.println("a sweet red fruit");
//        }

        // Switch statements
        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                // without break then all case are executed right from condition which is true
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");

        }

        // Enhanced switch statement
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits"); // no break condition required but this has it internally
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        // Enhanced switch
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//        }
    }
}