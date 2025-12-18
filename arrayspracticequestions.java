public class arrayspracticequestions {
    public static void main() {
        // problem 1
        // print all elements of the array
        // float arr[] = { 10.23f, 20.45f, 30.89f, 40.56f, 50.78f };

        // //this is for each loop which goes through evrery element of an array without
        // indexes
        // for (float element : arr) {

        // System.out.println(element);
        // }

        // problem 2
        // find sum of elements
        // int arr[] = { 2, 3, 4, 5 };
        // int sum = 0;
        // for (int x : arr) {
        // sum += x;

        // }
        // System.out.println(sum);

        // problem 3
        // average of elements
        // int arr[] = { 2, 3, 4, 5 };
        // int sum = 0;
        // for (int x : arr) {
        // sum += x;
        // }
        // double average = (double) sum / arr.length;
        // System.out.println("average:" + average);

        // problem 4
        // find maximum element
        // int arr[] = { 2, 3, 4, 5 };
        // int max = arr[0];
        // for (int x : arr) {
        // if (x > max) {
        // max = x;
        // }
        // }
        // System.out.println("maximum number is:" + max);

        // problem 5
        // find minimum element
        int arr[] = { -2, 54, -97, 200 };
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);

    }

}
