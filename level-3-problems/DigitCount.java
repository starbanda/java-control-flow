import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the count to 0
        int count = 0;

        // Handle case for negative numbers
        number = Math.abs(number);

        // Loop to count digits until the number becomes 0
        while (number != 0) {
            // Remove the last digit of the number
            number /= 10;

            // Increase the count by 1 for each digit
            count++;
        }

        // If the number was 0, set count to 1 since 0 has 1 digit
        if (count == 0) {
            count = 1;
        }

        // Display the count of digits
        System.out.println("The number has " + count + " digits.");
    }
}
