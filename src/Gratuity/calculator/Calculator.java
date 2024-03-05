package Gratuity.calculator;

import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for basic salary and experience
        System.out.print("Enter your last drawn basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter your years of experience: ");
        double experience = scanner.nextDouble();

        // Calculate gratuity (15% of basic salary per year of experience, capped at 20 lakhs)
        double gratuity = Math.min(basicSalary * 0.15 * experience, 2000000);

        // Display the calculated gratuity
        System.out.println("Your gratuity amount is: ₹" + gratuity);

        scanner.close();
    }
}
