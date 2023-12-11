import java.util.*; 
public class UseParty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //data fields
        int guests; 
        Party aParty = new Party(); 

        // user input
        System.out.print("Enter number of guests for the party >> "); 
        guests = input.nextInt(); 
        aParty.setGuests(guests);
        
        // display output
        System.out.println("The party has " + aParty.getGuests() + "bitches that will suck you up upon entrance");
    
        aParty.displayInvitation();

    }
}      
    
