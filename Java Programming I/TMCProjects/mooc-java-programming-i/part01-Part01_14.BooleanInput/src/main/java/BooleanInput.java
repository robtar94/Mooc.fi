
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        boolean sth = Boolean.valueOf(scanner.nextLine());
        System.out.print("True or false? ");
        System.out.println(sth);

    }
}
