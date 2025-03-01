import java.util.Scanner;

public class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the base number and power from the user
        System.out.print("Enter a positive integer as the base: ");
        int number = sc.nextInt();
        System.out.print("Enter a positive integer as the power: ");
        int power = sc.nextInt();

        // Check if both inputs are positive integers
        if (number < 1 || power < 0) {
            System.out.println("Both base and power must be positive integers.");
            return;
        }

        // Calculate the power of the number using while loop
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}

