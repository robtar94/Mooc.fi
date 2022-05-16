
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        
        int greatest = 0;
        
        while (true) {
            
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                
                break;
            }
            
            
            String[] parts = name.split(",");
            
            for (int i = 0; i < parts.length;i++) {
                
                age =  Integer.valueOf(parts[i]);
                
                
            }
            
             
             }
        
                if (age > greatest) {
                    
                    System.out.println("Age of the oldest: " + age);
                } else if (age < greatest) {
                    
                    System.out.println("Age of the oldest: " + greatest);
                } else if (age == greatest){
                    
                    System.out.println("Age of the oldest: " + age);
                }
        }


    }

