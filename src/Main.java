import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- SIMPLE CALCULATOR ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between 1 and 5.");
                continue;
            }

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid option.");
                continue;
            }

            System.out.print("Enter first number: ");
            String firstInput = scanner.nextLine();

            System.out.print("Enter second number: ");
            String secondInput = scanner.nextLine();

            double num1;
            double num2;

            try {
                num1 = Double.parseDouble(firstInput);
                num2 = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
                continue;
            }

            double result;

            if (choice == 1) {
                result = num1 + num2;
                System.out.println("Result: " + result);

            } else if (choice == 2) {
                result = num1 - num2;
                System.out.println("Result: " + result);

            } else if (choice == 3) {
                result = num1 * num2;
                System.out.println("Result: " + result);

            } else {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    continue;
                }

                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }
}