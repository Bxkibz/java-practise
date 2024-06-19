import java.util.Scanner;

public class UserDetailsInfo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Provide first name
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Provide current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Count letters in first name
        int surnameLength = surname.length();

        // Finf if age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Show results
        System.out.println("The number of characters is:" + surnameLength);
        System.out.println("Your current age is: " + ageType + " number.");

        // Close the scanner
        scanner.close();
    }
}
