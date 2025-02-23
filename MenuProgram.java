import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop until the user chooses to exit
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            
            // Check if input is an integer
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                // Handle user's choice
                if (choice == 3) {
                    System.out.println("Exiting program. Goodbye!");
                    break; // Exit loop
                }
                
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Consume invalid input
            }
        }

        scanner.close(); // Close scanner
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Method to display a greeting message
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if an entered number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Check if input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume invalid input
        }
    }
}
