//Open a new text file to create a short application that demonstrates the constructors at work. 
//The application declares three CarInsurancePolicy objects using a different constructor version each time. Type the following code:

public class CreatePolicies{
    public static void main(String[] args) {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789,12, "Newcastle");
    
  //Display each object, and add closing curly braces for the method and the class:
        first.display(); 
        second.display(); 
        third.display();
    }
}