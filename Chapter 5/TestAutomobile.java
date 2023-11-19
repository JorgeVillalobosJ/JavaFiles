public class TestAutomobile {
    public static void main(String[] args) {
         Automobile Car1 = new Automobile(1125, "KIA", "Optima", "Red", 2012, "2295260806", 30);
         Automobile Car2 = new Automobile(5678, "Honda", "Accord", "Blue", 2018, "11251994", 25);
         System.out.println("Car 1 Speed: " + Car1.getSpeed()); 
            Car1.Accelerate();
        System.out.println("Car 1 Speed after Accelerate(): " + Car1.getSpeed());
            Car1.Accelerate(5);
        System.out.println("Car 1 Speed after Accelerate(5): " + Car1.getSpeed()); 
    
        System.out.println("Car 2 Speed: " + Car2.getSpeed()); 
            Car2.Brake();
        System.out.println("Car 2 Speed after Brake(): " + Car2.getSpeed()); 
            Car2.Accelerate(10);
        System.out.println("Car 2 Speed after Accelerate(10): " + Car2.getSpeed()); 
        }
    }

