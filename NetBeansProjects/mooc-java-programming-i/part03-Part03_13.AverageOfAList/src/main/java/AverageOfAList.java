
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int sum = 0;
        double avg = 0;
        int count = 0;
        
        ArrayList<Integer> list = new ArrayList<>(); // list definition
        
        while (true) { // adding to list
            
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }
            
            list.add(number);
            count+=1;
        }
        
        for(int i = 0; i < list.size(); i++) {
            
            int num = list.get(i);
            
            sum +=num; // calculates sum of numbers
            
            avg  = ( (double) sum/count); // calculates average.
        }
        
        System.out.println("Average: " + avg);
    }
}
