
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name1 = "alex";
        String password1 = "sunshine";
        String name2 = "emma";
        String password2 = "haskell";
               
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        if (user.equals(name1) && pass.equals(password1)) {
            
            System.out.println("You have succesfully logged in!");
        } else if (user.equals(name1) || pass.equals(password1)) {
            
            System.out.println("Incorrect username or password!");
            
        } else if (user.equals(name2) && pass.equals(password2)) {
            
          System.out.println("You have succesfully logged in!");  
            
        } else {
            
            System.out.println("Incorrect username or password!");
        }
    

    }
}
