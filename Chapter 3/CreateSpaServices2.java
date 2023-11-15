import java.util.Scanner;
    public class CreateSpaServices2{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            SpaService firstService = new SpaService();
            SpaService secondService = new SpaService();

            firstService = getData(firstService); 
            secondService = getData(secondService);
        
        public static SpaService getData(SpaService service) 
            String service; 
            double price; 
            Scanner keyboard = new Scanner (System.in);
            System.out.print("Enter service >> "); 
            service = keyboard.nextLine(); 
            System.out.print("Enter price >> "); 
            price = keyboard.nextDouble(); 
            keyboard.nextLine();

            
        }
        }
