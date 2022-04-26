
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int fst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (fst + sec));

    }
}
