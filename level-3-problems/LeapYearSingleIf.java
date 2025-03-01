import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year as input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for leap year using a single if condition with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
