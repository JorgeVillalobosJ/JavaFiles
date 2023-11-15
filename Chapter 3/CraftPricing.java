// Filename CraftPricing.java
// Written by <Jorge Villalobos>
// Written on <11/04/2023


import java.util.Scanner;
public class CraftPricing{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // User input product info.
        System.out.print(" Enter product name: ");
        String productName = input.nextLine();

        // cost of materials
        System.out.print(" Enter cost of materials for " + productName + " $ ");
        double costOfMaterials = input.nextDouble();

        // Number of hours worked.
        System.out.print("Enter the number of hours of work required: ");
        double hoursOfWork = input.nextDouble();
    
    // Calculating retail price with the discount and shipping cost
       double retailPrice = 0.75 * costOfMaterials + (14 * hoursOfWork) + 6;
   
    // product name and retail price
       System.out.println("Product: " + productName);
        System.out.println("Retail Price: $" + retailPrice);

     // Close scanner
        input.close();
    }
}
