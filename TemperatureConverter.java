import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***TEMPERATURE CONVERTER***");

        int choice;

        // Display the menu and loop until the user enters a valid choice
        do {
            System.out.println("\n1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.print("Choose an option (1 or 2): ");
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }

        } while (choice != 1 && choice != 2);

        // Perform the conversion based on the user's choice
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsiusInput = scanner.nextDouble();
                if (celsiusInput < -273.15) {
                    System.out.println("Temperature below absolute zero is not possible.");
                } else {
                    double fahrenheitOutput = (celsiusInput * 9/5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);
                }
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                if (fahrenheitInput < -459.67) {
                    System.out.println("Temperature below absolute zero is not possible.");
                } else {
                    double celsiusOutput = (fahrenheitInput - 32) * 5/9;
                    System.out.println("Temperature in Celsius: " + celsiusOutput);
                }
                break;
        }
        scanner.close();
    }
} 