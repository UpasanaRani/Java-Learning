import java.util.Scanner;

public class takinguserinputexcercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take two integers from user and print their sum.
        // int a = 56;
        // int b = 58;
        // System.out.print("sum:" + (a + b));

        // take name,age,and city,as input and print in this format.
        // System.out.println("ENTER NAME:");
        // String name = sc.next();
        // System.out.println("ENTER AGE:");
        // int age = sc.nextInt();
        // System.out.println("ENTER CITY:");
        // String city = sc.next();
        // System.out.print("Hello " + name + ", you are " + age + " years old and you
        // live in " + city + ".");

        // TAke three decimal numbers and print their average.
        // double num1 = sc.nextDouble();
        // double num2 = sc.nextDouble();
        // double num3 = sc.nextDouble();
        // System.out.println("AVERAGE:" + (num1 + num2 + num3 / 3));
        // }

        // take a full sentence as input and print it.
        System.out.print("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("your sentence:" + sentence);

    }
}
