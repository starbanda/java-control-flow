import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare two double variables for input values and a String variable for operator
        double first, second, result;
        String op;

        // Get input values from the user
        System.out.print("Enter first number: ");
        first = sc.nextDouble();
        System.out.print("Enter second number: ");
        second = sc.nextDouble();
        sc.nextLine();  // Consume newline character
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.nextLine();

        // Use switch...case to perform the required operation
        switch(op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

    }
}
