//n int firstNumber; int secondNumber; int sum; int difference; int average;
import java.util.Scanner;
public class ArithmeticDemo{
    public static void main(String[] args) {
        {
            //n Change all the variables’ data types to double or viceversa Int() method to Double(). or char
            double firstNumber; 
            double secondNumber; 
            double sum; 
            double difference; 
            double average;

            //n Also declare a Scanner object so that keyboard input can be accepted
                Scanner input = new Scanner(System.in);

                //n Prompt the user for and accept the two integers. nextInt() or nextDouble().
                System.out.print("Please enter a double >> ");
                firstNumber = input.nextDouble();
                System.out.print("Please enter another double >> ");
                secondNumber = input.nextDouble();

                //n Add statements to perform the necessary arithmetic operations: Don’t forget that when a String and a numeric value are concatenated, the resulting expression is a string. For example, “X” + 2 + 4 results in “X24”, not “X6”. If you want the result to be “X6”, you can use the expression “X” + (2 + 4
                sum = firstNumber + secondNumber;
                difference = firstNumber - secondNumber;
                //nchange the data type for the average variable from int to double by adding(double)in front of sum OR using 2.0!!!
                average = sum / 2.0;

                //nDisplay the three calculated values:
                System.out.println(firstNumber + " + " +
                    secondNumber + " is " + sum);
                System.out.println(firstNumber + " - " + 
                    secondNumber + " is " + difference);
                System.out.println("The average of " + firstNumber + " and " 
                + secondNumber + " is " + average);
        }
    }
}
