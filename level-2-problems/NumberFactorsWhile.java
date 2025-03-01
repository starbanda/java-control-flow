import java.util.Scanner;

public class NumberFactorsWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number < 1) {
            System.out.println(number + " is not a positive integer.");
            return;
        }

        // Find and print the factors of the number using a while loop
        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

