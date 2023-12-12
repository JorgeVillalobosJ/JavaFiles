//Create an application containing an array that stores 10 integers. The application should call five methods that in turn 
//(1) display all the integers, (2) display all the integers in reverse order, (3) display the sum of the integers, 
//(4) display all values less than a limiting argument, and (5) display all values that are higher than the calculated average value. 
//Then, create another array that store 5 integers. Pass the two arrays to a method that will display the integer value(s), 
//if any, that appear in both arrays (note that the two arrays can have no stored values in common). Save the file as ArrayMethodDemo.java.
public class ArrayMethodDemos {

    public static void main(String[] args) {
        int[] array1 = {3, 7, 12, 5, 9, 4, 6, 8, 10, 2}; // Array with 10 integers
        int[] array2 = {7, 14, 6, 9, 11}; // Another array with 5 integers

        displayIntegers(array1);
        displayIntegersReverse(array1);
        displaySum(array1);
        displayValuesLessThan(array1, 8); // Example limiting argument
        displayValuesHigherThanAverage(array1);

        displayCommonValues(array1, array2);
    }

    // Method to display all integers in the array
    public static void displayIntegers(int[] arr) {
        System.out.println("All integers in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display all integers in reverse order
    public static void displayIntegersReverse(int[] arr) {
        System.out.println("All integers in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to display the sum of integers in the array
    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }

    // Method to display values less than a limiting argument
    public static void displayValuesLessThan(int[] arr, int limit) {
        System.out.println("Values less than " + limit + ":");
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to display values higher than the calculated average value
    public static void displayValuesHigherThanAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;

        System.out.println("Values higher than the average (" + average + "):");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to display common values in both arrays
    public static void displayCommonValues(int[] arr1, int[] arr2) {
        System.out.println("Common values in both arrays:");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                }
            }
        }
        System.out.println();
    }
}