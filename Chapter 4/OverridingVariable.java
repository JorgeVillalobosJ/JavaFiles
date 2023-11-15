public class OverridingVariable{
    public static void main(String[] args)
    {
        //aNumber is declared in main()
        int aNumber = 10;
        System.out.println("In main(), aNumber is " + aNumber);   

        //Whenever aNumber is used in main(), it retains its value of 10.
        firstMethod();
        System.out.println("Back in main(), aNumber is " + aNumber);
        secondMethod(aNumber);
        System.out.println("Back in main () again, aNumber is " + aNumber);
    }
        public static void firstMethod()
    {         
     //This aNumber resides at a different memory address from the one in main(). It is declared locally in this method
        int aNumber = 77;
        System.out.println("In firstMethod(), aNumber is " + aNumber);
    }
    public static void secondMethod(int aNumber)  //This aNumber also resides at a different memory address from the one in main(). It is declared locally in this method
    {
        System.out.println("In secondMethod(), at first " + "aNumber is " + aNumber);
        aNumber = 862;
        System.out.println("In secondMethod(), after an assignment" + "aNumber is " + aNumber);
    }
}