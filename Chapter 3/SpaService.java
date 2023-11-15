public class SpaService{

    
    //private fields. Varibles only ava. to this class.
    private String serviceDescription;
    private double price;

    // Default constructor
    public SpaService(){
        serviceDescription = "XXX";
        price = 0;
    }

    //Get and Set Methods... () are Parameters
    public String getServiceDescription() {
        return serviceDescription;
    }
    // void = not Returning anything.
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double servicePrice){
        price = servicePrice;
    } 
}