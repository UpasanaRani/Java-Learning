import java.util.Scanner;

public class checkage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();// age>18 and 100>age
        if (age >= 18 && age <= 100) {
            System.out.println("Your age is valid to give vote:" + age);
        } else {
            System.out.println("Your age is not valid to give vote.");
        }

    }

}
