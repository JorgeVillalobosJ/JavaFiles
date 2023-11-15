public class Student {
    private int stuNum; 
    private double gpa;
    Student(int num, double avg) {
        stuNum = num; 
        gpa = avg;
    } 
    
    Student(double avg) {
        this(999, avg); 
    } 
    Student(int num) {
        this(num, 0.0); 
    } 
    Student (){
        this(999,0.0); 
 }
}
