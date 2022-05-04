
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        
        ArrayList <Integer> list = new ArrayList<>(); // definition of list.
        
        while (true) { // loop used to add elements to a list.
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 9999) {
                
                break;
            }
            
            list.add(input);
        }
        
        int smallest = list.get(0); // setting up the first element as the smallest one.
        
        for (int i = 0; i < list.size(); i++) {
            
            int value = list.get(i); // this is holding the current value on the list.
            
            
            if (smallest < value) { // this condition literally does the swapping.
                
                value = smallest;
            } else {
                smallest = value;
            }
            
              System.out.println("Smallest number: " + smallest);
              System.out.println("Found at index " + i);
        }
        
      
        
    }
}
