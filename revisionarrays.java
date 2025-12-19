import java.util.Scanner;

public class revisionarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // // int n = sc.nextInt();
        // // size entered by the user
        // // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter " + n + " elements:" + " ");
        // arr[i] = sc.nextInt();

        // }
        // System.out.print("The number of elements are: " + " ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // sum of all array elements.
        // int arr[] = { 23, 45, 56, 78 };
        // int sum = 0;
        // for (int x : arr) {
        // sum += x;

        // }
        // System.out.println(sum);

        // count how many even numbers are present

        int arr[] = { 45, 78, 90, 56 };
        int evencount = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                evencount++;
            }
            // System.out.println(evencount);

        }
        System.out.println("even count" + evencount);

    }
}
