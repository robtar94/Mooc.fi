
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        int greatest = list.get(0); // setting up the first element in the list as greatest.
        
        for (int i = 0; i < list.size(); i++) { // iterating over a list.
            
            int number = list.get(i);
            
            if(greatest > number) {
                
               number = greatest;
            } else {
                greatest = number;
            }
        }
        
         System.out.println("The greatest number: " + greatest);
        
    }
}
