import java.util.Scanner; // Required for reading user input

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user for a count
        System.out.print("How many times would you like to be greeted? ");
        int count = scanner.nextInt();

        System.out.println("\n--- Results ---");

        // Conditional statement check
        if (count <= 0) {
            System.out.println("Hello, " + name + "! You chose not to be greeted.");
        } else {
            // For loop to repeat the greeting based on user input
            for (int i = 1; i <= count; i++) {
                System.out.println(i + ". Hello, " + name + "!");
            }
        }

        // Close the scanner resource to avoid memory leaks
        scanner.close();
    }
}
