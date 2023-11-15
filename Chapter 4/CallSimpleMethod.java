public class CallSimpleMethod
{
    public static void main(String[] args)
    {
      double doubleValue = 45.67; 
      int intValue = 17; 
      simpleMethod(doubleValue); 
      simpleMethod(intValue); //-------------------------------------------
    }                                                                     //
    public static void simpleMethod(double d){                            //
                                                                          //The call with an int argument uses the method that is a better match when it is available.

        System.out.println("Method receives double parameter");         //
    }                                                                     //
    public static void simpleMethod(int d){  //-----------------------------
        System.out.println("Method recieves integer parameter ");
    }
}