import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for weight (in kg) and height (in cm)
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double height = sc.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Display the BMI value
        System.out.println("Your BMI is: " + bmi);

        // Classify the BMI and print the corresponding weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
