import java.util.Scanner;

public class AverageMarks{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // This is an array that shows marks for the five units
        double[] marks = new double[5];
        double sum = 0.0;

        // Provide marks for each unit
        System.out.println("Enter the marks for the five units:");
        for (int data = 0; data < 5; data++) {
            System.out.print("Unit " + (data + 1) + ": ");
            marks[data] = scanner.nextDouble();
            sum += marks[data];  // Sum the marks
        }
        
        // Find average
        double average = sum / 5;

        // Display the average with two decimal places
        System.out.printf("The average mark is: %.2f%n", average);
        
        // Close the scanner
        scanner.close();
    }
}
