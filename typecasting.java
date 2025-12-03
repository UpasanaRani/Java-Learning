public class typecasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);// automatically converted

        double x = 10.55;
        int y = (int) x;
        System.out.println(y);// forcefully converted

        // convert an int to double and a double to int.
        int num = 63;
        double num2 = num;
        System.out.println(num2);

        // double to int
        double var = 63.45;
        int var2 = (int) var;
        System.out.println(var2);

        int digit = 130;
        byte result = (byte) digit;
        System.out.println(result);

    }
}
