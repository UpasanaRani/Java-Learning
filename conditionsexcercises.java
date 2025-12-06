import java.util.Scanner;

public class conditionsexcercises {
    public static void main(String[] args) {
        // write a program to check if the number is even or odd.
        // int num = 6;
        // if (num % 2 == 0) {
        // System.out.print("number is even.");

        // } else {
        // System.out.print("number is odd.");
        // }

        // take marks as input and print:
        // int marks = 98;
        // if (marks >= 100) {
        // System.out.println("grade:A+");

        // } else if (marks >= 89) {
        // System.out.println("grade:A");
        // } else if (marks >= 74) {
        // System.out.println("grade:B");
        // } else if (marks >= 59) {
        // System.out.println("grade:C");
        // } else {
        // System.out.println("fail");
        // }

        // take a character input and check if its a vowel or consonant.
        Scanner sc = new Scanner(System.in);
        // char ch = sc.next().charAt(0);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch ==
        // 'A' || ch == 'E' || ch == 'I'
        // || ch == 'O' || ch == 'U') {
        // System.out.println("its a vowel.");
        // } else {
        // System.out.println("its a consonant.");
        // }

        /*
         * System.out.println("enter month number which you want to print:");
         * int monthnum = sc.nextInt();
         * switch (monthnum) {
         * case 1:
         * System.out.println("january");
         * break;
         * case 2:
         * System.out.println("february");
         * break;
         * case 3:
         * System.out.println("march");
         * break;
         * case 4:
         * System.out.println("april");
         * break;
         * case 5:
         * System.out.println("may");
         * break;
         * case 6:
         * System.out.println("june");
         * break;
         * case 7:
         * System.out.println("july");
         * break;
         * case 8:
         * System.out.println("august");
         * break;
         * case 9:
         * System.out.println("september");
         * break;
         * case 10:
         * System.out.println("october");
         * break;
         * case 11:
         * System.out.println("november");
         * break;
         * case 12:
         * System.out.println("december");
         * break;
         * default:
         * System.out.println("invalid input.");
         * }/*
         */

        int age = sc.nextInt();
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

    }
}
