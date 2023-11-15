public class TestEmployeeMethods {
public static void main(String[] args) 
{
    EmployeeVariables aWorker = new EmployeeVariables(); 
    aWorker.setValues(); 
    aWorker.methodThatUsesInstanceAttributes(); 
    aWorker.methodThatUsesLocalVariables();
}
}
