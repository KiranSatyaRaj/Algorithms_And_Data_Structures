import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*

            Syntax of for loop

            for (initialization; condition; increment/decrement) {
                // body
            }
         */

        // Q: Print numbers from 1 to 5

//        for (int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }
        
        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
//            // System.out.print(num + " ");
//            System.out.println("Hello World!");
//        }

        // While loop
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        int num = 1;
        while (num <= n) {
           // System.out.println(num);
            num++;
        }

        // do while
        /*

            do {
                // body
            } while(condition);

         */

        int a = 1;
        do {
            System.out.println("Hello World");
        } while (a != 1);
    }
}
