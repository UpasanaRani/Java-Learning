import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // print numbers from 1 to 50

        // for (int i = 1; i <= 50; i++) {
        // System.out.println(i);

        // }

        // print even numbers from 1 to 100.
        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);

        // }
        // }

        // take a number n from user and print table of n.
        Scanner sc = new Scanner(System.in);
        // System.out.println("n:");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("Multiplication table of" + n + " : " + (n * i));
        // }

        // find sum of numbers from 1 to n.
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println("Sum =" + sum);

        // Reserve a number using loop.
        // Input: 1234
        // Output: 4321

        System.out.print("Enter number:");
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            // int digit = n % 10;// get last digit
            rev = rev * 10 + n % 10;// build reverse
            n = n / 10;// remove last digit
        }
        System.out.println("Reserved number=" + rev);
    }
}
