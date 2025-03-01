import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum to 0
        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of digits of the number
        while (number > 0) {
            sum += number % 10;  // Add the last digit to sum
            number = number / 10;  // Remove the last digit from the number
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
    }
}
