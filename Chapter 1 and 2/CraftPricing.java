//Caitlyn's Crafty Creations computes a retail price for each product as the cost of materials 
//plus $14 multiplied by the number of hours of work required to create the product, 
//plus $6 shipping and handling. Caitlyn’s Crafty Creations is having a semi-annual sale now, 
//and everything is 25% off before shipping and handling:
//Retail price = 0.75 * (cost of materials + (14 * hours of work)) + 6


import java.util.Scanner;

public class CraftPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for product information
        System.out.print("Enter the name of the product: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the cost of materials before discount: $");
        double costOfMaterials = scanner.nextDouble();

        System.out.print("Enter the number of hours of work required: ");
        double hoursOfWork = scanner.nextDouble();

        // Calculate the retail price
        double retailPrice = calculateRetailPrice(costOfMaterials, hoursOfWork);

        // Display the product name and retail price
        System.out.println("Product: " + productName);
        System.out.println("Retail Price: $" + retailPrice);

        // Close the scanner
        scanner.close();
    }

    public static double calculateRetailPrice(double costOfMaterials, double hoursOfWork) {
    
        // Calculate the retail price with the discount and shipping cost
        double retailPrice = 0.75 * (costOfMaterials + (14 * hoursOfWork)) + 6;
        return retailPrice;
    }
}