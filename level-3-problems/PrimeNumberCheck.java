import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number to check
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Assume the number is prime initially
        boolean isPrime = true;

        // Check for prime number if the number is greater than 1
        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to the square root of the number
            for (int i = 2; i <= num / 2; i++) {
                // If the number is divisible by any number between 2 and num/2, it is not prime
                if (num % i == 0) {
                    isPrime = false; // Number is not prime
                    break; // Exit the loop as we found a divisor
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
