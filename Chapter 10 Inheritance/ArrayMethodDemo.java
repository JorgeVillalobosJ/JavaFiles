public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] array1 = {2, 5, 8, 10, 15, 20, 25, 30, 35, 40};
        int[] array2 = {3, 9, 12, 15, 18};

        // five methods for array1
        displayIntegers(array1);
        displayIntegersReverse(array1);
        displaySum(array1);
        displayValuesLessThan(array1, 25);
        displayValuesHigherThanAverage(array1);

        // method to display common values between array1 and array2
        displayCommonValues(array1, array2);
    }

    // Method to display all integers in the array
    public static void displayIntegers(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display all integers in reverse order
    public static void displayIntegersReverse(int[] arr) {
        for (int x = arr.length - 1; x >= 0; x--) {
            System.out.print(arr[x] + " ");
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

    // Method to display values less than argument
    public static void displayValuesLessThan(int[] arr, int limit) {
        System.out.print("Values less than " + limit + ": ");
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to display values higher than the calculated average
    public static void displayValuesHigherThanAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;

        System.out.print("Values higher than average (" + average + "): ");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Method to display common values in two arrays
    public static void displayCommonValues(int[] arr1, int[] arr2) {
        System.out.print("Common values: ");
        

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                }
            }
        }
    }
}