import java.util.Scanner;
    public class CreateSpaServices{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        
            // creating variables
            String service;
            double price;

            // creating objects
            SpaService firstService = new SpaService();
            SpaService secondService = new SpaService();

            //first service methods
            System.out.print("Enter service >> ");
            service = input.nextLine();
            System.out.print("Enter price >> ");
            price = input.nextDouble();

            firstService.setServiceDescription(service);
            firstService.setPrice(price);

            // second service methods : By commenting out these lines, you change the program so that the user does not enter values for the secondService object. 
            // instead, the values assigned by the constructor are the final values for the object.

             input.nextLine();
             System.out.println("Enter service>> ");
             service = input.nextLine();
             System.out.print("Enter price >> ");
             price = input.nextDouble();
            
             secondService.setServiceDescription(service);
             secondService.setPrice(price);

            System.out.println("Second service details:");
                System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

            System.out.println("Second service details:");
                System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

            // scanner close
            input.close();
            
        }
    }