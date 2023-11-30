import java.util.Scanner;

public class TestAutomobile {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        Automobile carOne = new Automobile(4886, "Kia", "Optima", "Silver", 2012, 52608060, 30);
        Automobile carTwo = new Automobile(4560, "Nissan", "Sentra", "Red", 2018, 23134589, 45);

        carOne.displayAutomobile();
        carTwo.displayAutomobile();
        
        System.out.println("");
        carOne.accelerate(21);
        carOne.accelerate(21.5);    
        carOne.brake(21);
        carOne.brake(21.5);
    }
}
