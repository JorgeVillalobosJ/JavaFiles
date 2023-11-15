//Many programmers would recommend that you do not declare variables with the same name in the same method EVEN 
//if doing so is legal because the variables exist in separate blocks. 
//You should follow the recommendations of your instructor 

public static void twoDeclarations()
{
    {//This variable will go out of scope at the next closing curly brace.
        int someVar = 7; 
        System.out.println(someVar);
    }

    {   //Don’t declare blocks for no reason. A new block starts here only to demonstrate scope.
    //This variable is totally different from the one in the previous block even though their identifiers are the same.
    int someVar = 845; 
    System.out.println(someVar);
    }


