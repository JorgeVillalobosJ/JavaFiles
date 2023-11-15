                                             //int used to be more whole number
public static void calculateInterest(double bal, int rate){
//If an application calls the method calculateInterest() using two double arguments use int rate and rateAsPercent
    double interest, rateAsPercent; 

    //the whole number rate figure is correctly divided by 100.0 before it is used to determine the interest earned.
    //rateAsPercent is calculated by dividing by 100.0 and not by 100. If two integers are divided, the result is a truncated integer; 
    //dividing by a double 100.0 causes the result to be a double. Alternatively,you could use an explicit cast such as rateAsPercent = (double)rate / 100.
    rateAsPercent = rate / 100.0; 
    interest = bal * rateAsPercent; 
    System.out.println("Simple interest on $" + bal + "at " +rate + "% rate is "+ interest);  
}