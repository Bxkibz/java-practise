import java.util.Scanner;

public class BasicOperationCalculator  {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // User to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // User to enter an operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // User to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Variable to store the result of the operation
        double result = 0;
        boolean validOperation = true;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter one of +, -, *, /.");
                validOperation = false;
                break;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.println("The result of " + number1 + " " + operation + " " + number2 + " is: " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
