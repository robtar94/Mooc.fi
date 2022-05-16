
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String sentence = scanner.nextLine();
            
            if (sentence.equals("")) {
                
                break;
            }
            
            String[] parts = sentence.split(" ");
            
            
                
            System.out.println(parts[parts.length-1]);
                
            
        }


    }
}
