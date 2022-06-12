
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int years = 0;
        int count = 0;
        double avg = 0;
        String name;
        String longest;
        
        while (true) {
            
             String input = scanner.nextLine();
            
            if(input.equals("")) {
                
                break;
            }
        
       
        
        String parts[] = input.split(",");
        
        years += Integer.valueOf(parts[1]); // sum of birth years
        count+=1; // adds one to birth count
        
        avg = ((double) years/count);
        
        name = parts[0];
        
        
        
        
        }
        System.out.println("Average: " + avg);
        
        


    }
}
