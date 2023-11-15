import java.time.*;
import java.util.Scanner;
    public class DeliveryDate{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            LocalDate orderdate;
            int mo;
            int day;
            int year;
            final int WEEKS_FOR_DELIVERY = 2;
            System.out.print("Enter order month ");
            mo = input.nextInt();
            System.out.println("Enter order day ");
            day = input.nextInt();
            System.out.println("Enter order year ");
            year = input.nextInt();
            orderdate= LocalDate.of(year, mo, day);
            System.out.println("Order date is " + orderdate);
            System.out.println("Delivery date is "+ orderdate.plusWeeks(WEEKS_FOR_DELIVERY));
        }
    }