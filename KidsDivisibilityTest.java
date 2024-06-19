import java.util.Scanner;

public class KidsDivisibilityTest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check and display divisibility rules
        for (int data = 1; data <= 9; data++) {
            if (isDivisible(number,data)) {
                System.out.println("The number " + number + " is divisible by " + data+ ".");
                if (data == 2) {
                    System.out.println("Reason is because its an even number.");
                }
                if (data == 3) {
                    System.out.println("reason is because sum of its digits is divisible by 3.");
                }
                if (data == 5) {
                    if (number % 10 == 0) {
                        System.out.println("Reason is because it ends with a 0.");
                    } else if (number % 10 == 5) {
                        System.out.println("Reason is because it ends with a 5.");
                    }
                }
                if (data == 9) {
                    System.out.println("Reason is because the sum of its digits is divisible by 9.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }

    // How sto check divisibility
    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
