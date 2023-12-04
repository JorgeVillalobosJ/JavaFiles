public class ArrayMethodDemo {

    public static void main(String[] args) {
        int[] array1 = {3, 7, 12, 5, 9, 4, 6, 8, 10, 2};
        int[] array2 = {7, 14, 6, 9, 11}; 

        displayIntegers(array1);
        displayIntegersReverse(array1);
        displaySum(array1);
        displayValuesLessThan(array1, 8); 
        displayValuesHigherThanAverage(array1);

        displayCommonValues(array1, array2);
    }

    public static void displayIntegers(int[] arr) {
        System.out.println("All integers in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void displayIntegersReverse(int[] arr) {
        System.out.println("All integers in reverse order:");
        for (int x = arr.length - 1; x >= 0; x--) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }
    public static void displaySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }
    public static void displayValuesLessThan(int[] arr, int limit) {
        System.out.println("Values less than " + limit + ":");
        for (int num : arr) {
            if (num < limit) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

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
    public static void displayCommonValues(int[] arr1, int[] arr2) {
        System.out.println("Common values in both arrays:");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                }
            }
        }   
         System.out.println());
    }
}