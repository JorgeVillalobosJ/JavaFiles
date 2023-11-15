import java.util.Scanner; 
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.*; // (wildcard) An alternative to importing a class is to import an entire package of classes. 
//The Java wildcard works only with specific packages such as import java.util.*; or import java.time.*;. 
//Also, note that the asterisk in an import statement imports all of the classes in a package, but not other packages that are within the imported package


LocalDate today = LocalDate.now(); 
LocalDate graduationDate = LocalDate.of(2020, 5, 29);
//These statements use the static methods now() and of(), respectively. You can tell the methods are static because they are used with the class name and without an object