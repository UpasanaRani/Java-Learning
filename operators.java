public class operators {
    public static void main(String[] args) {
        // arithmetic operators
        int a = 10, b = 3;
        System.out.println(a + b);// 13
        System.out.println(a - b);// 7
        System.out.println(a * b);// 30
        System.out.println(a / b);// 3
        System.out.println(a % b);// 1

        // Assignment operators
        int x = 10;
        x += 5;// x=15
        x *= 2;// x=30

        // Relational(Comparison) Operators
        int c = 5, d = 1;
        System.out.println(a < b);// true
        System.out.println(a == b);// false

        // Logical operators
        int age = 20;
        System.out.println(age > 18 && age < 30);// true
        System.out.println(age > 25 || age == 20);// true
        System.out.println(!(age > 18));// false

        // increment and decrement operators
        int inc = 5;
        System.out.println(++inc);// 6(first increment then use)

        System.out.println(inc++);// 6(first use then increment)

        System.out.println(a);

        int nxtnum = 5;
        if (nxtnum > 10 && ++nxtnum > 0) {
            System.out.println(a);// 5 (second condition not checked)
        }

    }
}
