
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int fst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int trd = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (double) (fst + sec + trd)/3);

    }
}
