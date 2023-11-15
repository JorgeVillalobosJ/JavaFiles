public class DemoOverload{
    //Method
    public static void main(String[] args){

        // 3 integer variables
        int month = 6, day = 24, year = 2019; 
        // 3 Calls
        displayDate(month);
        displayDate(month, day); 
        displayDate(month, day, year);
    }
        // New method that requires one parameter to represent the month and uses default values for the day and year
        public static void displayDate(int mm){
            System.out.println("Event date " + mm + "/1/2023");
        }

        // Another new method that requires two parameters to represent the month and day and uses a default value for the year:
        public static void displayDate(int mm, int dd){
            System.out.println("Event date " + mm + "/" + dd + "/2023");
        }
        public static void displayDate(int mm, int dd, int yy){
            System.out.println("Event date " + mm + "/" + dd + "/" + yy);
        }
    
}

