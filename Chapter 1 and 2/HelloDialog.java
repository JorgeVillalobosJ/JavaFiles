// Filename Hola2.java
// Written by <Jorge Villalobos>
// Written on <10/25/2023

import javax.swing.JOptionPane; 
public class HelloDialog {
    public static void main(String[] args) {
     String result; 
      result = JOptionPane.showInputDialog(null, "What is your name?"); 
      JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

      // KNOW THE DIFFERENCE BETWEEN showMessageDialog AND showInputDialog!!

      JOptionPane.showInputDialog(null, 
      "What is your area code?", 
      "Area code information", 
      JOptionPane.QUESTION_MESSAGE);
}
}



