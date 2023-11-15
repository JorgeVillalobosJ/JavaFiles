//nThe calculateGross() method’s parameter is a double, so you call it using any argument that can be promoted to a double. 
In other words, it can accept a variable, constant, or expression that is a double, float, long, int, short, or byte. 
For example, all of the following method calls are valid:
•	calculateGross(10);—This call uses an unnamed int constant that is promoted to a double.
•	calculateGross(28.5);—This call uses an unnamed double constant.
•   calculateGross(7.5 * 5);—This call uses an arithmetic expression.
•	calculateGross(STANDARD_WORK_WEEK);—This call uses a named constant that might be a double, float, long, int, short, or byte.
•	calculateGross(myHours);—This call uses a variable that might be a double, float, long, int, short, or byte.
•	calculateGross(getGross());—This call assumes that the getGross() method returns a double, float, long, int, short, or byte. 

public class DemoGrossPay {
    public static void main(String[] args) {
    double hours = 25; 
    double yourHoursWorked = 37.5; 
    //nThe calculateGross() method is called three times using three different arguments.
    calculateGross(10); 
    calculateGross(hours); 
    calculateGross(yourHoursWorked);
    }

    public static void calculateGross(double hours) {
  
        final double STD_RATE = 13.75; 
        double gross; 
        gross = hours * STD_RATE; 
        System.out.println(hours + “ hours at $” +
            STD_RATE + “ per hour is $” + gross);
    //n Each time the method is called, the parameter hours receives a copy of the value that was passed.

  
    }
    }
    
