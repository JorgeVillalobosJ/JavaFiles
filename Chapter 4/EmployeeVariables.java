public class EmployeeVariables
{
    private int empNum; 
    private double empPayRate; 
    public void setValues() 

    {
       //This method uses the class fields.
        empNum = 111; 
        empPayRate = 22.22;
    } 
    public void methodThatUsesInstanceAttributes()
    {
    System.out.println("Employee number is " + empNum); //This method also uses the class fields
    System.out.println("Pay rate is " + empPayRate);
    } 
    public void methodThatUsesLocalVariables()
    {
    int empNum = 33333; 
    double empPayRate = 555.55; 
    System.out.println("Employee number is " + empNum); //This method uses the locally declared variables that happen to have the same names as the class fields.
    System.out.println("Pay rate is " + empPayRate);
    }
}
