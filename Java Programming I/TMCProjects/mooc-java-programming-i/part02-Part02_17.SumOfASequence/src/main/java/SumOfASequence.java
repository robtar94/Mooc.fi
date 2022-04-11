
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("Last number? ");
        int n = Integer.valueOf(scanner.nextLine());

        for(int i = 1; i <= n; i++) {
            result+=i;
        }
        System.out.println(result);

    }
}
