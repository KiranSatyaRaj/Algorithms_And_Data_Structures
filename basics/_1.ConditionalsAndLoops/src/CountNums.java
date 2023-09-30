public class CountNums {
    public static void main(String[] args) {
        int n = 5454614;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 4) {
                count++;
            }
            n = n /10;
        }

        System.out.println(count);
    }
}
