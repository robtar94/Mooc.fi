
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int first, last = 0;

        System.out.print("First number? ");
        first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        last = Integer.valueOf(scanner.nextLine());

        for (int i = first; i <= last; i++) {

            result = result + i;
        }

        System.out.println(result);

    }
}
