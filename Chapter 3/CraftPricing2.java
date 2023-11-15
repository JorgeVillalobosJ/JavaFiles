import java.util.Scanner;

public class CraftPricing2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the name of the product
        System.out.print("Enter the name of the product: ");
        String productName = scanner.nextLine();

        // Prompt the user for the cost of materials
        System.out.print("Enter the cost of materials for " + productName + ": $");
        double costOfMaterials = scanner.nextDouble();

        // Prompt the user for the number of hours of work required
        System.out.print("Enter the number of hours of work required for " + productName + ": ");
        double hoursOfWork = scanner.nextDouble();

        // Calculate the retail price with the discount and shipping
        double retailPrice = 0.75 * (costOfMaterials + (14 * hoursOfWork)) + 6;

        // Display the discounted retail price
        System.out.println("The discounted retail price for " + productName + " is: $" + retailPrice);

        // Close the scanner
        scanner.close();
    }
}