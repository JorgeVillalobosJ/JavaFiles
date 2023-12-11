import java.util.*; 
public class UseDinnerParty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //data fields
        int guests; 
        int choice;
        Party aParty = new Party(); 
        DinnerParty aDinnerParty = new DinnerParty();

        // user input
        System.out.print("Enter number of guests for the party >> "); 
        guests = input.nextInt(); 
        aParty.setGuests(guests);
        
        // display output
        System.out.println("The party has " + aParty.getGuests() + "bitches that will suck you up upon entrance");
        aParty.displayInvitation();
        
        //inherited method
        System.out.print("Enter number of guests for the dinner party>> ");
        guests = input.nextInt();
        aDinnerParty.setGuests(guests);

        // promting donner choice
        System.out.print ("Enter the menu option -- 1 for anal or 2 for DP >> ");
        choice = input.nextInt(); 
        aDinnerParty.setDinnerChoice(choice); 
            System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests"); 
            System.out.println("Menu option " + aDinnerParty.getDinnerChoice () + " will be served");
    }
}      
    
