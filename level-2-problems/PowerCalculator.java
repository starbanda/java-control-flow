import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the base number and power from the user
        System.out.print("Enter a positive integer as the base: ");
        int number = sc.nextInt();
        System.out.print("Enter a positive integer as the power: ");
        int power = sc.nextInt();

        // Check if both inputs are positive integers
        if (number < 1 || power < 1) {
            System.out.println("Both base and power must be positive integers.");
            return;
        }

        // Calculate the power of the number
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}

