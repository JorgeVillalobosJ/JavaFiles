//Create a class named Billing that includes four overloaded computeBill() methods for a photo book store.
// - When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8.5% tax, and return the total due.
// - When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. Multiply the two values, add 8.5% tax and return the total due.
// - Three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. Multiply the quantity and price, reduce the result by the coupon value, and then add 8.5% tax and return the total due
// - four parameters, they represent the price of a photo book, the quantity ordered, a coupon value, and a weekly discount. Multiply the quantity and price, reduce the result by the coupon value plus the weekly discount, and then add 8.5% tax and return the total due.

public class Billing{


   // Method 1: price of one photo book ordered. Add 8.5% tax, and return the total due.(DIVIDE 100 by 8.5)
    public static double computeBill(double Price) {
        double taxRate = 0.085; //(DIVIDE 100 by 8.5)
        return Price + (Price * taxRate);
    }

    // Method 2: total due with tax for multiple photo books
    public static double computeBill(double Price, int quantity) {
        double taxRate = 0.085; 
        return (Price * quantity + taxRate);
    }

    // Method 3: total due with tax with coupon
    public static double computeBill(double Price, int quantity, double couponValue) {
        double taxRate = 0.085; 
        double totalPrice = (Price * quantity) - couponValue;
        return totalPrice + (totalPrice * taxRate);
    }

    // Method 4: total due with tax, with a coupon and a weekly discount
    public static double computeBill(double Price, int quantity, double couponValue, double weeklyDiscount) {
        double taxRate = 0.085; 
        double totalPrice = (Price * quantity) - (couponValue + weeklyDiscount);
        return totalPrice + (totalPrice * taxRate);
    }

    public static void main(String[] args) {
        // Testing all four overloaded methods
        System.out.println("Method 1: $" + computeBill(20));
        System.out.println("Method 2: $" + computeBill(15.0, 3));
        System.out.println("Method 3: $" + computeBill(25.0, 2, 5.0));
        System.out.println("Method 4: $" + computeBill(30.0, 4, 8.0, 2.0));
    }
}