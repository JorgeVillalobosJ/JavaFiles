// Filename VillalobosModule1.java
// Written by <Jorge Villalobos>
// Written on <10/25/2023


import java.util.Scanner;
public class VillalobosModule1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder");
        double length = scanner.nextDouble();

        // Calculate the bottom area, volume, and surface area
        double bottomArea = radius * radius * 3.14;
        double volume = bottomArea * length;
        double surfaceArea = (2 * radius * 3.14 * length) + (2 * bottomArea);

        // Display the results with two decimal places
        System.out.println("Radius " + radius);
        System.out.printf("Length " + length);
        System.out.printf("\nBottom Area " + bottomArea);
        System.out.printf("Volume " + volume);
        System.out.printf("Surface Area ", + surfaceArea);

   }
}