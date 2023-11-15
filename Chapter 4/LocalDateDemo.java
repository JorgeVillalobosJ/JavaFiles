import java.time.*;
public class LocalDateDemo{
    public static void main(String[] args){
        LocalDate Date = LocalDate.now();
        LocalDate graduationDate = LocalDate.of(2018, 5, 29);
        System.out.println("Today is " + Date);
        System.out.println("Graduation is " + graduationDate);
        System.out.println("Graduation will be on day " + graduationDate.getDayOfMonth() + " in month " + graduationDate.getMonthValue());
    }
}   