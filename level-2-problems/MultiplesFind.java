import java.util.Scanner;

public class MultiplesFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a positive integer less than 100: ");
        int n = sc.nextInt();

        // Check if the number is a positive integer and less than 100
        if (n < 1 || n >= 100) {
            System.out.println(n + " is not a valid positive integer less than 100.");
            return;
        }

        // Find and print all multiples of the number below 100
        System.out.println("Multiples of " + n + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}

