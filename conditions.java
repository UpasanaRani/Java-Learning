public class conditions {
    public static void main(String[] args) {
        // simple if-else
        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");

        } else {
            System.out.println("Minor");
        }

        // else-if ladder

        int marks = 85;
        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 75) {
            System.out.println("A");

        } else if (marks >= 60) {
            System.out.println("B");

        } else {
            System.out.println("C");
        }

        // nested if(if inside another if)
        int ageof = 20;
        String nationality = "Indian";
        if (nationality.equals("Indian")) {
            System.out.println("Eligible to vote");

        } else {
            System.out.println("Not eligible");

        }
        // switch-case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // using string
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid");
        }

    }

}
