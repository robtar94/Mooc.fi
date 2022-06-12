
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0;
        int age = 0;
        
        while (true) {
            
            String sentence = scanner.nextLine(); // reads a string
            
            if (sentence.equals("")) {
                
                break; // breaks when empty line is entered.
                
                
                }
            
            String parts[] = sentence.split(","); // takes every word seperately.
            
             age = Integer.valueOf(parts[1]); // gets age as integer type; eventually parse int
            
            if (age > max) {
                max = age;
            } else {
                
                age = max;
            }
        
            
        }
        
        System.out.println("Age of the oldest: " + age);
        
        
        
    }
}

