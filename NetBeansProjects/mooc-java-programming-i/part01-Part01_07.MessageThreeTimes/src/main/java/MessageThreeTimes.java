
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String msg = scanner.nextLine();
        for(int i = 0; i <= 2; i++) {
            System.out.println(msg);
        }

    }
}
