// you can compile it, but you cannot execute the class because it does not contain a main() method.
public class Employee{

    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    //EMP variables that contains data. declare.
    //Methods will go here

    public int getEmpNum()
    {
        return empNum;
    }
    public void setEmpNum(int emp)
    {
        empNum = emp;
    }
    public String getEmpLastName()
    {
        return empLastName;
    }
    public void setEmpLastName(String name)
    {
        empLastName = name;
    }
    public String getEmpFirstName()
    {
        return empFirstName;
    }
    public void setEmpFirstName(String Villalobos)
    {
        empFirstName = Villalobos;
    }
    public double getEmpSalary()
    {
        return empSalary;
    }
    public void setEmpSalary(double sal)
    {
        empSalary = sal;
    }
}