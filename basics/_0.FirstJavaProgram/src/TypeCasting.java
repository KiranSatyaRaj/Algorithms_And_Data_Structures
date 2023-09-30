import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
//        int num = (int)32.9253f;
//        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) a; // 257 % 256 = 1

//        byte a = 30;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;

//        int number = 'a';
//        System.out.println("नमस्ते");

//        System.out.println(3 * 4.521411f);

        byte b = 42;
        byte c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 4.524f;
        double d = 242.13424342;
        double result = (f * b) * (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));

        System.out.println(result);
    }
}
