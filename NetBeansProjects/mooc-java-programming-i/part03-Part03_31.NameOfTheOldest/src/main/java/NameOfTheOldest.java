
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldest = "";
        int max = 0;
        int age = 0;
        
        while (true) {
            
            String sentence = scanner.nextLine();
            
            if (sentence.equals("")) {
                
                break;
            }
            
            String parts[] = sentence.split(",");
            
             age = Integer.parseInt(parts[1]);
              String name = parts[0];
             
             if (age > max) {
                
                max = age;
                 
                 oldest = name;
             
            
        }
        
        System.out.println("Name of the oldest: " + oldest);
        
        
        
        
        
        


    }
    }
}
