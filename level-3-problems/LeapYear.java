import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year as input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is valid (>= 1582)
        if (year < 1582) {
            System.out.println("The year is not valid. Please enter a year >= 1582.");
        } else {
            // Part 1: Using multiple if-else statements
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }

            // Part 2: Using a single if statement with logical operators
            if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year.");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
