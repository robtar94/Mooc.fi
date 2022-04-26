
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String fst = scan.nextLine();
        System.out.println("Enter the second string:");
        String sec = scan.nextLine();
        if(fst.equals(sec)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }


    }
}
