import java.util.Scanner;
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            
            int input = Integer.valueOf(scanner.nextLine());
           
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }
          printNumbersInRange(numbers, 1,2); 
    }
    
public static void printNumbersInRange(ArrayList <Integer> numbers, int lowerLimit, int upperLimit) {
    
    System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
    
    for (int number : numbers) {
        
        if(number >= lowerLimit && number <= upperLimit) {
            
            System.out.println(number);
        }
    }
    
}
    
}
