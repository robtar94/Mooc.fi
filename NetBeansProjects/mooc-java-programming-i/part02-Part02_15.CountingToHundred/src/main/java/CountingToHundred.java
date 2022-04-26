
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = 100;

        int num = Integer.valueOf(scanner.nextLine());
        int i = 0;

        for(i = num; i<=end;i++) {

            System.out.println(i);
        }

    }
}
