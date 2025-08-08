package Gio;

import java.util.Scanner;

public class Gio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();

        // Show menu
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform operation based on user's choice
        switch (choice) {
            case 1:
                System.out.printf("Result: %.2f + %.2f = %.2f%n", x, y, x + y);
                break;
            case 2:
                System.out.printf("Result: %.2f - %.2f = %.2f%n", x, y, x - y);
                break;
            case 3:
                System.out.printf("Result: %.2f * %.2f = %.2f%n", x, y, x * y);
                break;
            case 4:
                if (y != 0) {
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", x, y, x / y);
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
        }

        scanner.close();
    }

		


}
